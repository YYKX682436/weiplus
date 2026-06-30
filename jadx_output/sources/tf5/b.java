package tf5;

/* loaded from: classes11.dex */
public final class b extends ym3.a implements o75.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f418954d = jz5.h.b(tf5.a.f418952d);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f418955e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.mvvmlist.MvvmList f418956f;

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f418955e;
        int size = arrayList.size();
        int i17 = request.f463144b;
        if (i17 < size) {
            int size2 = arrayList.size();
            int i18 = request.f463145c + i17;
            if (size2 > i18) {
                dVar.f463148b = true;
            } else {
                i18 = arrayList.size();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (i17 < i18) {
                arrayList2.add(arrayList.get(i17));
                i17++;
            }
            for (com.tencent.mm.storage.z3 z3Var : g95.e.f269801a.f(arrayList2)) {
                if (((int) z3Var.E2) != 0) {
                    dVar.f463149c.add(new tf5.g(z3Var, 2, z3Var.W0()));
                }
            }
        }
        k0Var.e(dVar);
        return new kotlinx.coroutines.flow.r(k0Var);
    }

    public boolean d(tf5.g item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.storage.z3 z3Var = item.f418978d;
        if (!z3Var.r2() || z3Var.u2() || z3Var.o2() || z3Var.k2()) {
            return false;
        }
        java.lang.String d17 = z3Var.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        return !r26.n0.B(d17, "@", false);
    }

    public final void e(o75.c cVar) {
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList;
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList2;
        com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) cVar.f343590d;
        if (z3Var != null) {
            tf5.g gVar = new tf5.g(z3Var, 2, z3Var.W0());
            o75.b bVar = o75.b.f343581b;
            o75.b bVar2 = o75.b.f343582c;
            o75.b bVar3 = cVar.f343587a;
            if (kotlin.jvm.internal.o.b(bVar3, bVar2)) {
                if (!d(gVar) || (mvvmList2 = this.f418956f) == null) {
                    return;
                }
                com.tencent.mm.plugin.mvvmlist.MvvmList.q(mvvmList2, gVar, false, 2, null);
                return;
            }
            if (!kotlin.jvm.internal.o.b(bVar3, o75.b.f343583d)) {
                if (!kotlin.jvm.internal.o.b(bVar3, o75.b.f343584e) || (mvvmList = this.f418956f) == null) {
                    return;
                }
                mvvmList.u(gVar);
                return;
            }
            if (d(gVar)) {
                com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList3 = this.f418956f;
                if (mvvmList3 != null) {
                    mvvmList3.y(gVar, true);
                    return;
                }
                return;
            }
            com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList4 = this.f418956f;
            if (mvvmList4 != null) {
                mvvmList4.u(gVar);
            }
        }
    }

    @Override // ym3.f
    public int getPriority() {
        return 0;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        o75.c event = (o75.c) obj;
        kotlin.jvm.internal.o.g(event, "event");
        if (!kotlin.jvm.internal.o.b(event.f343587a, o75.b.f343585f)) {
            e(event);
            return;
        }
        java.util.HashMap hashMap = event.f343591e;
        if (hashMap != null) {
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                e((o75.c) ((java.util.Map.Entry) it.next()).getValue());
            }
        }
    }

    @Override // ym3.f
    public void onCreate() {
        java.util.ArrayList arrayList = this.f418955e;
        arrayList.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.tencent.mm.storage.ja m07 = ((com.tencent.mm.storage.ka) c01.d9.b().y()).m0("@t.qq.com");
        if (m07 != null) {
            arrayList2.add(m07.f195058b);
        }
        arrayList2.add("blogapp");
        arrayList2.add("tmessage");
        arrayList2.add("officialaccounts");
        arrayList2.add("helper_entry");
        arrayList2.addAll(((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ui());
        if (((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Ai("wxid_wi_1d142z0zdj03")) {
            arrayList2.add("wxid_wi_1d142z0zdj03");
        }
        boolean a17 = com.tencent.mm.contact.d.f64855g.a();
        g95.d dVar = g95.e.f269801a;
        p75.m c17 = dVar.g().c(a17 ? dm.e2.Y1.l(kz5.b0.c("0")) : dm.e2.P1.t("'%@%'"));
        p75.d dVar2 = dm.e2.P1;
        p75.m d17 = c17.c(dVar2.s(arrayList2)).d(dVar2.j("weixin"));
        p75.i0 g17 = dm.e2.N1.g(kz5.b0.c(dVar2));
        g17.f352656c = "MicroMsg.Mvvm.AddressDataSource";
        g17.f352657d = d17;
        g17.f352659f = dVar.h();
        java.util.Iterator it = g17.a().l(((jm0.l) ((jz5.n) this.f418954d).getValue()).Q4()).iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) it.next());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.AddressDataSource", "onCreate blockList=" + arrayList2 + " contactListSize=" + arrayList.size());
    }
}
