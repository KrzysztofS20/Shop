package com.krzysztof.shop.shop.service;

import com.krzysztof.shop.shop.auxiliaryClasses.ModelForFormEditUserWithAddres;
import com.krzysztof.shop.shop.model.Address;
import com.krzysztof.shop.shop.model.Person;
import com.krzysztof.shop.shop.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final AddressRepository addressRepository;

    public List<Address> findAll(){
        return addressRepository.findAll();
    }

    public void save(Address address) {
        addressRepository.save(address);
    }

    public Address getById(Long id) {
        return addressRepository.findById(id).get();
    }

    public void delete(Long id) {
        addressRepository.deleteById(id);
    }

    public void update(Person person, ModelForFormEditUserWithAddres addres){
        Address address = person.getAddress();
        address.setCity(addres.getCity());
        address.setCountry(addres.getCountry());
        address.setPostcode(addres.getPostCode());
        address.setStreet(addres.getStreet());
        save(address);
    }
}
