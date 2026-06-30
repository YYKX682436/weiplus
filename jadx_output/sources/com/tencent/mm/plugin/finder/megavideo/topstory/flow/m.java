package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

/* loaded from: classes2.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f120951d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f120952e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f120953f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f120954g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f120955h;

    /* renamed from: i, reason: collision with root package name */
    public long f120956i;

    /* renamed from: m, reason: collision with root package name */
    public int f120957m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f120958n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fp0.r f120959o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.topstory.flow.u f120960p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r45.l03 f120961q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader f120962r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f120963s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(fp0.r rVar, com.tencent.mm.plugin.finder.megavideo.topstory.flow.u uVar, r45.l03 l03Var, com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f120959o = rVar;
        this.f120960p = uVar;
        this.f120961q = l03Var;
        this.f120962r = megaVideoFlowLoader;
        this.f120963s = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.m mVar = new com.tencent.mm.plugin.finder.megavideo.topstory.flow.m(this.f120959o, this.f120960p, this.f120961q, this.f120962r, this.f120963s, continuation);
        mVar.f120958n = obj;
        return mVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.megavideo.topstory.flow.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.u uVar;
        r45.l03 l03Var;
        long j17;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader;
        com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f120957m;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f120958n;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.u uVar2 = this.f120960p;
            r45.l03 l03Var2 = this.f120961q;
            kotlinx.coroutines.f1 b17 = kotlinx.coroutines.l.b(y0Var, p0Var, null, new com.tencent.mm.plugin.finder.megavideo.topstory.flow.l(uVar2, l03Var2, null), 2, null);
            arrayList = new java.util.ArrayList();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader2 = this.f120962r;
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
            this.f120958n = arrayList;
            this.f120951d = megaVideoFlowLoader2;
            this.f120952e = l03Var2;
            this.f120953f = uVar2;
            com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var2 = this.f120963s;
            this.f120954g = n0Var2;
            this.f120955h = arrayList;
            this.f120956i = currentTimeMillis;
            this.f120957m = 1;
            java.lang.Object k18 = ((kotlinx.coroutines.g1) b17).k(this);
            if (k18 == aVar) {
                return aVar;
            }
            uVar = uVar2;
            l03Var = l03Var2;
            obj = k18;
            j17 = currentTimeMillis;
            megaVideoFlowLoader = megaVideoFlowLoader2;
            n0Var = n0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f120956i;
            java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f120955h;
            com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var3 = (com.tencent.mm.plugin.finder.feed.model.internal.n0) this.f120954g;
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.u uVar3 = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.u) this.f120953f;
            r45.l03 l03Var3 = (r45.l03) this.f120952e;
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader3 = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader) this.f120951d;
            kotlin.ResultKt.throwOnFailure(obj);
            uVar = uVar3;
            l03Var = l03Var3;
            megaVideoFlowLoader = megaVideoFlowLoader3;
            n0Var = n0Var3;
            arrayList = arrayList2;
        }
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.c cVar = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.c) obj;
        arrayList.add(cVar);
        com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(uVar, arrayList, n0Var, false, 4, null);
        if (cVar.getErrType() == 0 && cVar.getErrCode() == 0) {
            com.tencent.mm.plugin.finder.extension.reddot.h3.f105549a.d("fetchInit", megaVideoFlowLoader.f120894q);
        }
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.u.b(uVar, j17, l03Var, cVar);
        int integer2 = cVar.f120906b.getInteger(4);
        megaVideoFlowLoader.f120892o = integer2 >= 1 ? integer2 : 1;
        megaVideoFlowLoader.f(null);
        this.f120959o.b(fp0.u.f265290f);
        return jz5.f0.f302826a;
    }
}
