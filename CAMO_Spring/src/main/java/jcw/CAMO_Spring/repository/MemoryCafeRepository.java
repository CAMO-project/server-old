package jcw.CAMO_Spring.repository;

import jcw.CAMO_Spring.domain.Cafe;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MemoryCafeRepository implements CafeRepository{
    static Map<Long, Cafe> cafeStore = new HashMap<>();
    static Long sequence = 10000L;

    @Override
    public Cafe save(Cafe cafe) {
        cafe.setCafeId(sequence++);
        cafeStore.put(cafe.getCafeId(), cafe);
        return cafeStore.get(cafe.getCafeId());
    }

    @Override
    public Optional<Cafe> findById(Long cafeId){
        return Optional.ofNullable(cafeStore.get(cafeId));
    }

    @Override
    public Optional<Cafe> findByName(String name) {
        return cafeStore.values().stream() //람다식 이용. 하나라도 찾으면 return. 끝까지 없으면 null return
                .filter(member -> member.getCafeName().equals(name))
                .findAny();
    }
}