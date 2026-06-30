package kotlin.jvm.internal;

/* loaded from: classes7.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object[] f310122a = new java.lang.Object[0];

    public static final java.lang.Object[] a(java.util.Collection collection) {
        kotlin.jvm.internal.o.g(collection, "collection");
        int size = collection.size();
        java.lang.Object[] objArr = f310122a;
        if (size == 0) {
            return objArr;
        }
        java.util.Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[size];
        int i17 = 0;
        while (true) {
            int i18 = i17 + 1;
            objArr2[i17] = it.next();
            if (i18 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i19 = ((i18 * 3) + 1) >>> 1;
                if (i19 <= i18) {
                    i19 = 2147483645;
                    if (i18 >= 2147483645) {
                        throw new java.lang.OutOfMemoryError();
                    }
                }
                objArr2 = java.util.Arrays.copyOf(objArr2, i19);
                kotlin.jvm.internal.o.f(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, i18);
                kotlin.jvm.internal.o.f(copyOf, "copyOf(...)");
                return copyOf;
            }
            i17 = i18;
        }
    }

    public static final java.lang.Object[] b(java.util.Collection collection, java.lang.Object[] objArr) {
        java.lang.Object[] objArr2;
        kotlin.jvm.internal.o.g(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i17 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        java.util.Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), size);
            kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (java.lang.Object[]) newInstance;
        }
        while (true) {
            int i18 = i17 + 1;
            objArr2[i17] = it.next();
            if (i18 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i19 = ((i18 * 3) + 1) >>> 1;
                if (i19 <= i18) {
                    i19 = 2147483645;
                    if (i18 >= 2147483645) {
                        throw new java.lang.OutOfMemoryError();
                    }
                }
                objArr2 = java.util.Arrays.copyOf(objArr2, i19);
                kotlin.jvm.internal.o.f(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i18] = null;
                    return objArr;
                }
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, i18);
                kotlin.jvm.internal.o.f(copyOf, "copyOf(...)");
                return copyOf;
            }
            i17 = i18;
        }
    }
}
