package org.chromium.base.supplier;

/* loaded from: classes13.dex */
public interface ObservableSupplier<E> extends org.chromium.base.supplier.Supplier<E> {
    E addObserver(org.chromium.base.Callback<E> callback);

    void removeObserver(org.chromium.base.Callback<E> callback);
}
