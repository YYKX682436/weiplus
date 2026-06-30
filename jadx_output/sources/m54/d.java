package m54;

/* loaded from: classes4.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f324251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f324252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f324253f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f324254g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324255h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324256i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f324257m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324258n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f324259o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324260p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.l f324261q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.ui.MMActivity mMActivity, long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, android.os.Bundle bundle, java.lang.String str4, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f324252e = h0Var;
        this.f324253f = mMActivity;
        this.f324254g = j17;
        this.f324255h = str;
        this.f324256i = str2;
        this.f324257m = i17;
        this.f324258n = str3;
        this.f324259o = bundle;
        this.f324260p = str4;
        this.f324261q = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageSky$2");
        m54.d dVar = new m54.d(this.f324252e, this.f324253f, this.f324254g, this.f324255h, this.f324256i, this.f324257m, this.f324258n, this.f324259o, this.f324260p, this.f324261q, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageSky$2");
        return dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageSky$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageSky$2");
        java.lang.Object invokeSuspend = ((m54.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageSky$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageSky$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object c17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageSky$2");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f324251d;
        kotlin.jvm.internal.h0 h0Var = this.f324252e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("SnsAd.LandPageLauncher", "it is going to request the canvas data");
            com.tencent.mm.ui.MMActivity mMActivity = this.f324253f;
            com.tencent.mm.ui.widget.dialog.u3 c18 = com.tencent.mm.ui.widget.dialog.u3.c(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490468vx), false, 3, null);
            c18.show();
            h0Var.f310123d = c18;
            m54.j jVar = m54.j.f324282a;
            long j17 = this.f324254g;
            java.lang.String str = this.f324255h;
            java.lang.String str2 = this.f324256i;
            int i18 = this.f324257m;
            com.tencent.mm.ui.MMActivity mMActivity2 = this.f324253f;
            java.lang.String str3 = this.f324258n;
            this.f324251d = 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("suspendRequest", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
            c17 = kotlinx.coroutines.a4.c(15000L, new m54.i(j17, str, str2, i18, mMActivity2, str3, null), this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("suspendRequest", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
            if (c17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageSky$2");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageSky$2");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            c17 = obj;
        }
        jz5.l lVar = (jz5.l) c17;
        if (lVar == null) {
            lVar = new jz5.l(java.lang.Boolean.FALSE, m54.k.a("", ""));
        }
        ((java.lang.Boolean) lVar.f302833d).booleanValue();
        m54.y yVar = (m54.y) lVar.f302834e;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) h0Var.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.ui.MMActivity mMActivity3 = this.f324253f;
        android.os.Bundle bundle = this.f324259o;
        java.lang.String str4 = this.f324260p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$launchDynamicPageWithDefaultCall", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("launchDynamicPageWithDefaultCall", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
        try {
            if (m54.j.h(yVar)) {
                m54.f fVar = m54.f.f324265a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("launchDynamicPageReally$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
                fVar.c(mMActivity3, true, false, bundle, str4, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("launchDynamicPageReally$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
            } else {
                yz5.l lVar2 = this.f324261q;
                if (lVar2 != null) {
                    lVar2.invoke(yVar);
                }
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAd.LandPageLauncher", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("launchDynamicPageWithDefaultCall", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$launchDynamicPageWithDefaultCall", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageSky$2");
        return f0Var;
    }
}
