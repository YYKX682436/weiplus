package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class y8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f120424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e9 f120425e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(com.tencent.mm.plugin.finder.live.widget.e9 e9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f120425e = e9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.y8(this.f120425e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.y8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f120424d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.f120424d = 1;
        com.tencent.mm.plugin.finder.live.widget.e9 e9Var = this.f120425e;
        e9Var.getClass();
        oz5.n nVar = new oz5.n(pz5.f.b(this));
        com.tencent.mars.xlog.Log.i("FinderLiveChargeIncreaseDurationWidget", "modifyChargeFreeTimeDuration " + cm2.a.f43328a.s(e9Var.a()));
        r45.b12 b12Var = new r45.b12();
        b12Var.set(0, e9Var.a());
        gk2.e eVar = e9Var.f118238b;
        long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0);
        long j18 = ((mm2.e1) eVar.a(mm2.e1.class)).f328983m;
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 12);
        hx0Var.set(1, com.tencent.mm.protobuf.g.b(b12Var.toByteArray()));
        ek2.r1 r1Var = new ek2.r1(j17, j18, 1, hx0Var);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r1Var.t(context, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f9y), 500L);
        pq5.g l17 = r1Var.l();
        l17.K(new com.tencent.mm.plugin.finder.live.widget.u8(nVar, e9Var));
        android.content.Context context2 = e9Var.f118237a;
        com.tencent.mm.ui.MMActivity mMActivity = context2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context2 : null;
        if (mMActivity != null) {
            l17.f(mMActivity);
        }
        java.lang.Object a17 = nVar.a();
        return a17 == aVar ? aVar : a17;
    }
}
