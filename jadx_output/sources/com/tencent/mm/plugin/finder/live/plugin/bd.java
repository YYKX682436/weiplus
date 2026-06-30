package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f112011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f112012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f112013f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f112014g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ad f112015h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(long j17, long j18, java.lang.String str, com.tencent.mm.plugin.finder.live.plugin.ad adVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112012e = j17;
        this.f112013f = j18;
        this.f112014g = str;
        this.f112015h = adVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.bd(this.f112012e, this.f112013f, this.f112014g, this.f112015h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.bd) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f112011d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str = this.f112014g;
        com.tencent.mm.plugin.finder.live.plugin.ad adVar = this.f112015h;
        int i18 = adVar.A;
        this.f112011d = 1;
        oz5.n nVar = new oz5.n(pz5.f.b(this));
        com.tencent.mars.xlog.Log.i("FinderLiveChargePayPluginEx", "pay, giftId:null price:" + i18 + ",comboId:" + str + ",liveId:" + this.f112012e + ",objectId:" + this.f112013f);
        android.content.Context context = adVar.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        gk2.e buContext = adVar.S0();
        com.tencent.mm.plugin.finder.live.plugin.ed edVar = new com.tencent.mm.plugin.finder.live.plugin.ed(nVar, adVar);
        kotlin.jvm.internal.o.g(buContext, "buContext");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.A(fe1.l.CTRL_INDEX, 70);
        java.lang.String e17 = xy2.c.e(context);
        java.lang.String m17 = zl2.q4.f473933a.m();
        g0Var.d(22129, 1, m17, "", 1, 1, 0, "");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        pq5.g l17 = new ek2.i2(((mm2.e1) buContext.a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) buContext.a(mm2.e1.class)).f328983m, null, 1, e17, i18, m17, str, "", ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6(), ((mm2.e1) buContext.a(mm2.e1.class)).f328993w, 1, null, ((mm2.e1) buContext.a(mm2.e1.class)).f328985o, null, kz5.p0.f313996d, null, null, new dk2.f4(i18, edVar, m17, context, 7, null, 1, str)).l();
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            l17.f((im5.b) context);
        }
        java.lang.Object a17 = nVar.a();
        return a17 == aVar ? aVar : a17;
    }
}
