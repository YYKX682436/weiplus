package vp;

/* loaded from: classes.dex */
public final class r0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final vp.r0 f438826d = new vp.r0();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        jz5.l lVar = (jz5.l) obj;
        jz5.l lVar2 = (jz5.l) obj2;
        return ((java.lang.Number) lVar.f302833d).longValue() != ((java.lang.Number) lVar2.f302833d).longValue() ? kotlin.jvm.internal.o.j(((java.lang.Number) lVar.f302833d).longValue(), ((java.lang.Number) lVar2.f302833d).longValue()) : kotlin.jvm.internal.o.j(((java.lang.Number) lVar2.f302834e).longValue(), ((java.lang.Number) lVar.f302834e).longValue());
    }
}
