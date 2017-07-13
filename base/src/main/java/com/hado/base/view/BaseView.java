package com.hado.base.view;

public interface BaseView {
    void showLoading();

    void hideLoading();

    void showError(String message);

    void showError(int message);

    void showToast(String message);

    void showToast(int message);

    void hideKeyboard();
}
