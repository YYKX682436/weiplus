package org.chromium.base.supplier;

/* loaded from: classes13.dex */
public interface OneshotSupplier<T> extends org.chromium.base.supplier.Supplier<T> {
    T onAvailable(org.chromium.base.Callback<T> callback);
}
