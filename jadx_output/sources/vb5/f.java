package vb5;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f434839d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f434840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vb5.l f434841f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.q f434842g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f434843h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tipsbar.e f434844i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f434845m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vb5.l lVar, yb5.q qVar, long j17, com.tencent.mm.ui.tipsbar.e eVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f434841f = lVar;
        this.f434842g = qVar;
        this.f434843h = j17;
        this.f434844i = eVar;
        this.f434845m = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        vb5.f fVar = new vb5.f(this.f434841f, this.f434842g, this.f434843h, this.f434844i, this.f434845m, continuation);
        fVar.f434840e = obj;
        return fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vb5.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f434839d;
        int i18 = 0;
        yb5.q talkerInfo = this.f434842g;
        vb5.l lVar = this.f434841f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f434840e;
            new java.lang.Long(java.lang.System.currentTimeMillis() - lVar.f434860i);
            java.util.ArrayList arrayList = lVar.f434859h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size() + 2);
            java.util.Iterator it = arrayList.iterator();
            int i19 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                arrayList2.add(kotlinx.coroutines.l.b(y0Var, null, null, new vb5.b((yj5.a) next, lVar, talkerInfo, null), 3, null));
                i19 = i27;
            }
            this.f434839d = 1;
            a17 = kotlinx.coroutines.h.a(arrayList2, this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            a17 = obj;
        }
        java.util.List<java.util.List> list = (java.util.List) a17;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(list.size() + 2);
        for (java.util.List list2 : list) {
            if (list2 != null && (!list2.isEmpty())) {
                arrayList3.addAll(list2);
            }
        }
        lVar.getClass();
        kz5.g0.t(arrayList3, vb5.j.f434851d);
        kotlin.jvm.internal.o.f(talkerInfo, "$talkerInfo");
        java.util.Map m17 = kz5.c1.m(kz5.b1.e(new jz5.l("group_bar_list_length", java.lang.Integer.valueOf(arrayList3.size()))), com.tencent.mm.ui.tipsbar.s.a(talkerInfo));
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            java.lang.Object next2 = it6.next();
            int i28 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            xj5.a aVar2 = (xj5.a) next2;
            aVar2.f454896d = i18;
            aVar2.f454898f = m17;
            i18 = i28;
        }
        androidx.recyclerview.widget.c0 a18 = androidx.recyclerview.widget.h0.a(new xj5.k(lVar.f434863o, arrayList3), true);
        a18.a(new vb5.h(lVar, arrayList3, lVar.f434863o));
        java.lang.Object clone = arrayList3.clone();
        kotlin.jvm.internal.o.e(clone, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.ui.tipsbar.data.BaseTipsBarData<*>>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.ui.tipsbar.data.BaseTipsBarData<*>> }");
        lVar.f434863o = (java.util.ArrayList) clone;
        vb5.e eVar = new vb5.e(this.f434841f, this.f434843h, arrayList3, this.f434844i, a18, this.f434845m);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        vb5.c cVar = new vb5.c(eVar, null);
        this.f434839d = 2;
        if (kotlinx.coroutines.l.g(g3Var, cVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
