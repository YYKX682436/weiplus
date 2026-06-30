package jv4;

/* loaded from: classes12.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final jv4.h f302241a;

    public k(jv4.h adapter) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        this.f302241a = adapter;
    }

    public final java.util.List a() {
        java.util.List<jv4.j> b17 = this.f302241a.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (jv4.j jVar : b17) {
            kz5.h0.u(arrayList, kz5.n0.K0(jVar.getItems(), jVar.a()));
        }
        return arrayList;
    }
}
