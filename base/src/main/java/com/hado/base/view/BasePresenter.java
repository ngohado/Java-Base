package com.hado.base.view;


import io.reactivex.disposables.CompositeDisposable;

public abstract class BasePresenter<V extends BaseView, D> {

    protected D dataManager;

    protected CompositeDisposable compositeDisposable = new CompositeDisposable();

    public BasePresenter(D dataManager) {
        this.dataManager = dataManager;
    }

    private V baseView;

    public void onAttach(V view) {
        this.baseView = view;
    }

    public void onDetach() {
        compositeDisposable.clear();
        baseView = null;
    }

    public V getView() {
        return baseView;
    }
}
