package x64;

/* loaded from: classes4.dex */
public class f implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f452276d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f452277e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f452278f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f452279g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f452280h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f452281i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f452282m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f452283n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f452284o = null;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f452285p;

    public f(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f452276d = context;
        this.f452277e = snsInfo;
    }

    public static /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 a(x64.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = fVar.f452278f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        return k0Var;
    }

    public static /* synthetic */ android.content.Context b(x64.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        android.content.Context context = fVar.f452276d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        return context;
    }

    public void c(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendRequest", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        if (adClickActionInfo != null) {
            k64.p pVar = new k64.p(adClickActionInfo.R, adClickActionInfo.S, this.f452277e.getUxinfo(), "");
            gm0.j1.d().a(4743, this);
            gm0.j1.d().g(pVar);
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f452284o;
            if (u3Var == null) {
                android.content.Context context = this.f452276d;
                this.f452284o = db5.e1.Q(context, "", context.getString(com.tencent.mm.R.string.gga), true, true, null);
            } else if (!u3Var.isShowing()) {
                this.f452284o.show();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendRequest", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        try {
            ((ku5.t0) ku5.t0.f312615d).B(new x64.d(this));
            gm0.j1.d().q(4743, this);
            java.lang.String str2 = "";
            int i19 = -1;
            if (i17 == 0 && i18 == 0 && (m1Var instanceof k64.p)) {
                r45.eo3 eo3Var = (r45.eo3) ((k64.p) m1Var).I();
                if (eo3Var != null) {
                    i19 = eo3Var.f373620d;
                    java.lang.String str3 = eo3Var.f373621e;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str3 != null) {
                        str2 = str3;
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.w("SnsAd.AdCoupon", "the coupon errType is " + i17 + ", errCode is " + i18);
            }
            ((ku5.t0) ku5.t0.f312615d).B(new x64.e(this, i19, str2));
            a84.t0.a(new x64.a(this.f452277e, i19, str2, this.f452285p));
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
    }
}
