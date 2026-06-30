package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

/* loaded from: classes2.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f120974d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f120975e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f120976f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f120977g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f120978h;

    /* renamed from: i, reason: collision with root package name */
    public long f120979i;

    /* renamed from: m, reason: collision with root package name */
    public int f120980m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f120981n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fp0.r f120982o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.topstory.flow.u f120983p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r45.l03 f120984q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader f120985r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f120986s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(fp0.r rVar, com.tencent.mm.plugin.finder.megavideo.topstory.flow.u uVar, r45.l03 l03Var, com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f120982o = rVar;
        this.f120983p = uVar;
        this.f120984q = l03Var;
        this.f120985r = megaVideoFlowLoader;
        this.f120986s = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.p pVar = new com.tencent.mm.plugin.finder.megavideo.topstory.flow.p(this.f120982o, this.f120983p, this.f120984q, this.f120985r, this.f120986s, continuation);
        pVar.f120981n = obj;
        return pVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.megavideo.topstory.flow.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.l03 l03Var;
        java.util.ArrayList arrayList;
        long j17;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader;
        com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.u uVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f120980m;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f120981n;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.u uVar2 = this.f120983p;
            r45.l03 l03Var2 = this.f120984q;
            kotlinx.coroutines.f1 b17 = kotlinx.coroutines.l.b(y0Var, p0Var, null, new com.tencent.mm.plugin.finder.megavideo.topstory.flow.o(uVar2, l03Var2, null), 2, null);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader2 = this.f120985r;
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.a1 a1Var = megaVideoFlowLoader2.f120886f;
            if (a1Var != null) {
                int integer = l03Var2.getInteger(5);
                ao2.a k17 = ((xn2.r) a1Var).f455571a.k();
                k17.getClass();
                qg3.w wVar = k17.f12543l;
                if (wVar != null) {
                    urgen.ur_54A4.UR_720C.UR_EA00(((qg3.x) wVar).getCppPointer(), "CgiMainFeedList", integer);
                }
            }
            this.f120981n = arrayList2;
            this.f120974d = megaVideoFlowLoader2;
            this.f120975e = l03Var2;
            this.f120976f = uVar2;
            com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var2 = this.f120986s;
            this.f120977g = n0Var2;
            this.f120978h = arrayList2;
            this.f120979i = currentTimeMillis;
            this.f120980m = 1;
            java.lang.Object k18 = ((kotlinx.coroutines.g1) b17).k(this);
            if (k18 == aVar) {
                return aVar;
            }
            l03Var = l03Var2;
            arrayList = arrayList2;
            j17 = currentTimeMillis;
            megaVideoFlowLoader = megaVideoFlowLoader2;
            n0Var = n0Var2;
            uVar = uVar2;
            obj = k18;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f120979i;
            java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f120978h;
            com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var3 = (com.tencent.mm.plugin.finder.feed.model.internal.n0) this.f120977g;
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.u uVar3 = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.u) this.f120976f;
            r45.l03 l03Var3 = (r45.l03) this.f120975e;
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader3 = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader) this.f120974d;
            kotlin.ResultKt.throwOnFailure(obj);
            uVar = uVar3;
            l03Var = l03Var3;
            megaVideoFlowLoader = megaVideoFlowLoader3;
            n0Var = n0Var3;
            arrayList = arrayList3;
        }
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.c cVar = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.c) obj;
        arrayList.add(cVar);
        com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(uVar, arrayList, n0Var, false, 4, null);
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.u.b(uVar, j17, l03Var, cVar);
        megaVideoFlowLoader.f120893p = false;
        this.f120982o.b(fp0.u.f265290f);
        return jz5.f0.f302826a;
    }
}
