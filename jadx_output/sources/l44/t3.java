package l44;

/* loaded from: classes7.dex */
public class t3 implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f316362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f316363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f316364c;

    public t3(android.widget.ImageView imageView, boolean z17, boolean z18) {
        this.f316362a = imageView;
        this.f316363b = z17;
        this.f316364c = z18;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public void a(k91.v5 v5Var) {
        int i17;
        int i18;
        int i19;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetWeAppInfo", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper$1");
        if (v5Var == null) {
            com.tencent.mars.xlog.Log.e("AdWeAppHelper", "onGetWeAppInfo, info==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetWeAppInfo", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper$1");
            return;
        }
        k91.j5 u07 = v5Var.u0();
        if (u07 != null) {
            i18 = u07.f305642q;
            i19 = u07.f305643r;
            i17 = u07.f305644s;
            com.tencent.mars.xlog.Log.i("AdWeAppHelper", "onGetWeAppInfo, relievedBuyFlag=" + i18 + ", flagshipFlag=" + i19 + ", showFinancialLicenseFlag=" + i17);
        } else {
            com.tencent.mars.xlog.Log.e("AdWeAppHelper", "onGetWeAppInfo, wxaAppInfo==null");
            i17 = 0;
            i18 = 0;
            i19 = 0;
        }
        if (i19 > 0) {
            int i27 = i19 & 1;
            int i28 = (i19 >> 8) & 1;
            if (i27 == 1 && i28 == 1) {
                z17 = true;
                ((ku5.t0) ku5.t0.f312615d).B(new l44.s3(this, z17, ne.s.b(i18, 10), v5Var, ne.s.a(i17, 10)));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetWeAppInfo", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper$1");
            }
        }
        z17 = false;
        ((ku5.t0) ku5.t0.f312615d).B(new l44.s3(this, z17, ne.s.b(i18, 10), v5Var, ne.s.a(i17, 10)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetWeAppInfo", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper$1");
    }
}
