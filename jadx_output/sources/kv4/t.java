package kv4;

/* loaded from: classes12.dex */
public final class t implements jv4.j {

    /* renamed from: a, reason: collision with root package name */
    public final rv4.p f312728a;

    /* renamed from: b, reason: collision with root package name */
    public final kv4.m f312729b;

    public t(rv4.p data, kv4.m delegate) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f312728a = data;
        this.f312729b = delegate;
        data.n(rv4.r.f400551d, 0, new kv4.s(this));
    }

    @Override // jv4.j
    public int a() {
        if (this.f312728a.h()) {
            return ((java.util.ArrayList) getItems()).size();
        }
        return 0;
    }

    @Override // jv4.j
    public java.util.List getItems() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        rv4.p pVar = this.f312728a;
        if (!pVar.h()) {
            return arrayList;
        }
        kv4.m mVar = this.f312729b;
        arrayList.add(new kv4.f0(pVar, mVar));
        int i17 = 0;
        for (java.lang.Object obj : kz5.n0.N(pVar.f400528c, 2)) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            arrayList.add(new kv4.b0(i17, mVar, (java.util.List) obj, pVar));
            i17 = i18;
        }
        return arrayList;
    }
}
