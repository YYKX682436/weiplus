package l44;

/* loaded from: classes4.dex */
public final class m3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f316255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s34.p1 f316256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f316257f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f316258g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316259h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316260i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316261m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f316262n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316263o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(s34.p1 p1Var, com.tencent.mm.ui.MMActivity mMActivity, kotlin.jvm.internal.h0 h0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f316256e = p1Var;
        this.f316257f = mMActivity;
        this.f316258g = h0Var;
        this.f316259h = str;
        this.f316260i = str2;
        this.f316261m = str3;
        this.f316262n = i17;
        this.f316263o = str4;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
        l44.m3 m3Var = new l44.m3(this.f316256e, this.f316257f, this.f316258g, this.f316259h, this.f316260i, this.f316261m, this.f316262n, this.f316263o, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
        return m3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
        java.lang.Object invokeSuspend = ((l44.m3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object j17;
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f316255d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            l44.p3 p3Var = l44.p3.f316299a;
            java.lang.String a17 = this.f316256e.a();
            if (a17 == null) {
                a17 = "";
            }
            this.f316255d = 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadImgWithPath", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            a84.m.d(a17, new l44.k3(a17, rVar));
            j17 = rVar.j();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImgWithPath", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
            if (j17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            j17 = obj;
        }
        java.lang.String str = (java.lang.String) j17;
        boolean z17 = str == null || r26.n0.N(str);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            l44.p3.f316299a.c();
            com.tencent.mars.xlog.Log.e("AdQrClickHelper", "downloadImgWithPath is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
            return f0Var;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.MMActivity mMActivity = this.f316257f;
        boolean isFinishing = mMActivity.isFinishing();
        kotlin.jvm.internal.h0 h0Var = this.f316258g;
        if (!isFinishing) {
            h0Var.f310123d = l54.a.h(mMActivity, com.tencent.mm.R.string.j7v, null);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var2 = (com.tencent.mm.ui.widget.dialog.u3) h0Var.f310123d;
        if (!(u3Var2 != null && u3Var2.isShowing()) && (u3Var = (com.tencent.mm.ui.widget.dialog.u3) h0Var.f310123d) != null) {
            u3Var.show();
        }
        ((jd0.u1) ((kd0.h2) i95.n0.c(kd0.h2.class))).getClass();
        zs5.u0 u0Var = zs5.u0.f475485h;
        com.tencent.mm.ui.MMActivity mMActivity2 = this.f316257f;
        u0Var.a(mMActivity2, currentTimeMillis, str, new l44.l3(this.f316259h, this.f316260i, this.f316261m, this.f316262n, this.f316256e, this.f316263o, this.f316258g, mMActivity2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$1");
        return f0Var;
    }
}
