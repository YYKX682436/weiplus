package lz5;

/* loaded from: classes14.dex */
public abstract class a extends kz5.n {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry element = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.o.g(element, "element");
        return ((lz5.n) this).f322418d.f(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry element = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.o.g(element, "element");
        lz5.m mVar = ((lz5.n) this).f322418d;
        mVar.getClass();
        mVar.c();
        int h17 = mVar.h(element.getKey());
        if (h17 < 0) {
            return false;
        }
        java.lang.Object[] objArr = mVar.f322406e;
        kotlin.jvm.internal.o.d(objArr);
        if (!kotlin.jvm.internal.o.b(objArr[h17], element.getValue())) {
            return false;
        }
        mVar.l(h17);
        return true;
    }
}
