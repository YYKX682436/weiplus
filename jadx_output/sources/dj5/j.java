package dj5;

/* loaded from: classes.dex */
public final class j implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f233071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dj5.m f233072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.z f233073f;

    public j(java.util.HashMap hashMap, dj5.m mVar, wi5.z zVar) {
        this.f233071d = hashMap;
        this.f233072e = mVar;
        this.f233073f = zVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.List list;
        p13.v vVar = (p13.v) obj;
        java.lang.Integer num = new java.lang.Integer(0);
        java.util.HashMap hashMap = this.f233071d;
        hashMap.put(num, vVar);
        dj5.m mVar = this.f233072e;
        j75.f Q6 = mVar.Q6();
        if (Q6 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mm.storage.a3 a3Var = (com.tencent.mm.storage.a3) ((jz5.n) mVar.f233084h).getValue();
            if (a3Var != null) {
                java.util.List resultList = vVar.f351160e;
                kotlin.jvm.internal.o.f(resultList, "resultList");
                p13.y yVar = (p13.y) kz5.n0.a0(resultList, 0);
                if (yVar != null) {
                    yVar.f351203u = vVar.f351159d;
                } else {
                    yVar = null;
                }
                if (yVar != null && (list = yVar.f351196n) != null) {
                    java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                    int i17 = 0;
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        p13.l lVar = (p13.l) next;
                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(lVar.f351114e, true);
                        if (!n17.s2()) {
                            ui5.b bVar = new ui5.b(a3Var, lVar, vVar.f351159d, i17, 0, null, 48, null);
                            ri5.h hVar = ri5.j.I;
                            int i19 = ri5.j.W;
                            java.lang.String d17 = n17.d1();
                            kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                            arrayList.add(ui5.b.f428141g.b(mVar.getActivity(), hVar.a(d17, i19, 0), n17, i19, bVar));
                        }
                        i17 = i18;
                    }
                }
            }
            Q6.B3(new wi5.v(this.f233073f, hashMap, arrayList));
        }
        return jz5.f0.f302826a;
    }
}
