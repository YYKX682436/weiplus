package kz5;

/* loaded from: classes2.dex */
public abstract class j0 extends kz5.i0 {
    public static final java.util.List I(java.lang.Iterable iterable, java.lang.Class klass) {
        kotlin.jvm.internal.o.g(iterable, "<this>");
        kotlin.jvm.internal.o.g(klass, "klass");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : iterable) {
            if (klass.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
