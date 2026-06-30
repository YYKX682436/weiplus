package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

/* loaded from: classes2.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f121000d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f121001e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f121002f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f121003g;

    /* renamed from: h, reason: collision with root package name */
    public long f121004h;

    /* renamed from: i, reason: collision with root package name */
    public int f121005i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f121006m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ fp0.r f121007n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.topstory.flow.u f121008o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r45.l03 f121009p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader f121010q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f121011r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(fp0.r rVar, com.tencent.mm.plugin.finder.megavideo.topstory.flow.u uVar, r45.l03 l03Var, com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f121007n = rVar;
        this.f121008o = uVar;
        this.f121009p = l03Var;
        this.f121010q = megaVideoFlowLoader;
        this.f121011r = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.s sVar = new com.tencent.mm.plugin.finder.megavideo.topstory.flow.s(this.f121007n, this.f121008o, this.f121009p, this.f121010q, this.f121011r, continuation);
        sVar.f121006m = obj;
        return sVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.megavideo.topstory.flow.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.u uVar;
        r45.l03 l03Var;
        java.util.ArrayList arrayList;
        long j17;
        com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f121005i;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f121006m;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.u uVar2 = this.f121008o;
            r45.l03 l03Var2 = this.f121009p;
            kotlinx.coroutines.f1 b17 = kotlinx.coroutines.l.b(y0Var, p0Var, null, new com.tencent.mm.plugin.finder.megavideo.topstory.flow.r(uVar2, l03Var2, null), 2, null);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.a1 a1Var = this.f121010q.f120886f;
            if (a1Var != null) {
                int integer = l03Var2.getInteger(5);
                ao2.a k17 = ((xn2.r) a1Var).f455571a.k();
                k17.getClass();
                qg3.w wVar = k17.f12543l;
                if (wVar != null) {
                    urgen.ur_54A4.UR_720C.UR_EA00(((qg3.x) wVar).getCppPointer(), "CgiMainFeedList", integer);
                }
            }
            this.f121006m = arrayList2;
            this.f121000d = l03Var2;
            this.f121001e = uVar2;
            com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var2 = this.f121011r;
            this.f121002f = n0Var2;
            this.f121003g = arrayList2;
            this.f121004h = currentTimeMillis;
            this.f121005i = 1;
            java.lang.Object k18 = ((kotlinx.coroutines.g1) b17).k(this);
            if (k18 == aVar) {
                return aVar;
            }
            uVar = uVar2;
            l03Var = l03Var2;
            obj = k18;
            arrayList = arrayList2;
            j17 = currentTimeMillis;
            n0Var = n0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f121004h;
            java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f121003g;
            com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var3 = (com.tencent.mm.plugin.finder.feed.model.internal.n0) this.f121002f;
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.u uVar3 = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.u) this.f121001e;
            r45.l03 l03Var3 = (r45.l03) this.f121000d;
            kotlin.ResultKt.throwOnFailure(obj);
            uVar = uVar3;
            l03Var = l03Var3;
            n0Var = n0Var3;
            arrayList = arrayList3;
        }
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.c cVar = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.c) obj;
        arrayList.add(cVar);
        com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(uVar, arrayList, n0Var, false, 4, null);
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.u.b(uVar, j17, l03Var, cVar);
        this.f121007n.b(fp0.u.f265290f);
        return jz5.f0.f302826a;
    }
}
