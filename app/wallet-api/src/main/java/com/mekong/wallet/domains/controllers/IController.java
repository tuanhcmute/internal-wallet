package com.mekong.wallet.domains.controllers;

import java.util.List;

public interface IController<T> {
    T create(T storageModel);

    List<T> bulkCreate(List<T> storageModel);

    T retrieve(String attribute);

    List<T> retrieveAll();

    T update(String attribute, T storageModel);

    T delete(String attribute);
}
