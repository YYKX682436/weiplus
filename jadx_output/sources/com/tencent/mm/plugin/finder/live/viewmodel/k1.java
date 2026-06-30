package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.l1 f117174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f117175f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.plugin.finder.live.viewmodel.l1 l1Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117174e = l1Var;
        this.f117175f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.k1(this.f117174e, this.f117175f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.viewmodel.k1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f117173d;
        com.tencent.mm.plugin.finder.live.viewmodel.l1 l1Var = this.f117174e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g92.b bVar = g92.b.f269769e;
            int i18 = l1Var.f117210g;
            this.f117173d = 1;
            if (bVar.x1(i18, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            ((kotlin.Result) obj).getValue();
        }
        m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
        boolean z17 = I1 != null && I1.v0();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveVerifyUIC", "prepare() checkAccountMaster failed");
            zl2.q4.f473933a.Q();
            com.tencent.mm.plugin.finder.assist.d9 d9Var = l1Var.f117207d;
            if (d9Var != null) {
                d9Var.b();
            }
            l1Var.getActivity().finish();
            return f0Var;
        }
        com.tencent.mm.plugin.finder.assist.d9 d9Var2 = l1Var.f117207d;
        if (d9Var2 != null) {
            d9Var2.b();
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22385, new java.lang.Integer(5), new java.lang.Long(java.lang.System.currentTimeMillis()));
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        yl2.g1 g1Var = l1Var.f117208e;
        zy2.zb.qd(zbVar, 3, g1Var.f463009b, g1Var.f463010c, null, 8, null);
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        i95.m c18 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        c61.yb.l3((c61.yb) c18, l1Var.getActivity(), this.f117175f, new com.tencent.mm.plugin.finder.live.viewmodel.h1(c0Var, l1Var), com.tencent.mm.plugin.finder.live.viewmodel.i1.f117136d, new com.tencent.mm.plugin.finder.live.viewmodel.j1(c0Var, l1Var), false, 32, null);
        return f0Var;
    }
}
