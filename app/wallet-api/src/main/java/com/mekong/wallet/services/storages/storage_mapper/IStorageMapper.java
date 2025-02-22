package com.mekong.wallet.services.storages.storage_mapper;

public interface IStorageMapper<X, Y> {
    Y toDomain(X dataModel);
    X toStorage(Y domainModel);
}
