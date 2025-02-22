package com.mekong.wallet.services.storages.storage_service;

import java.util.List;

public interface IStorageService<T> {
    T create(T domainModel);

    List<T> bulkCreate(List<T> domainModel);

    T retrieve(String attribute);

    List<T> retrieveAll();

    T update(String attribute, T domainModel);

    T delete(String attribute);
}
