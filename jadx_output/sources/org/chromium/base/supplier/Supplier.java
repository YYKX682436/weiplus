package org.chromium.base.supplier;

/* loaded from: classes13.dex */
public interface Supplier<T> {

    /* renamed from: org.chromium.base.supplier.Supplier$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ boolean $assertionsDisabled = false;
    }

    static {
        boolean z17 = org.chromium.base.supplier.Supplier.AnonymousClass1.$assertionsDisabled;
    }

    T get();

    default boolean hasValue() {
        T t17 = get();
        if (org.chromium.base.supplier.Supplier.AnonymousClass1.$assertionsDisabled || t17 == get()) {
            return t17 != null;
        }
        throw new java.lang.AssertionError("Value provided by #get() must not change.");
    }
}
