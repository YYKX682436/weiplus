package kv4;

/* loaded from: classes12.dex */
public final class n implements jv4.j {

    /* renamed from: a, reason: collision with root package name */
    public final mv4.e f312716a;

    /* renamed from: b, reason: collision with root package name */
    public final kv4.m f312717b;

    public n(mv4.e data, kv4.m delegate) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f312716a = data;
        this.f312717b = delegate;
    }

    @Override // jv4.j
    public int a() {
        mv4.e eVar = this.f312716a;
        if (!((rv4.h) eVar).j()) {
            return 0;
        }
        if (((rv4.h) eVar).f400482k) {
            return 2;
        }
        return (((rv4.h) eVar).f400484m ? ((java.util.ArrayList) getItems()).size() : java.lang.Math.min(((java.util.ArrayList) getItems()).size(), ((rv4.h) eVar).f400480i / 2)) + 1;
    }

    @Override // jv4.j
    public java.util.List getItems() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        mv4.e eVar = this.f312716a;
        boolean j17 = ((rv4.h) eVar).j();
        kv4.m mVar = this.f312717b;
        if (j17) {
            arrayList.add(new lv4.m(mVar, eVar));
        }
        if (((rv4.h) eVar).f400482k) {
            arrayList.add(new lv4.c());
            return arrayList;
        }
        int i17 = 0;
        for (java.lang.Object obj : kz5.n0.N(((rv4.h) eVar).f400478g, 2)) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            arrayList.add(new kv4.r(i17, eVar, (java.util.List) obj, mVar));
            i17 = i18;
        }
        return arrayList;
    }
}
