package o26;

/* loaded from: classes15.dex */
public abstract class a {
    public static final void a(java.util.Collection collection, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(collection, "<this>");
        if (obj != null) {
            collection.add(obj);
        }
    }

    public static final java.util.List b(java.util.ArrayList arrayList) {
        kotlin.jvm.internal.o.g(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return kz5.p0.f313996d;
        }
        if (size == 1) {
            return kz5.b0.c(kz5.n0.X(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
