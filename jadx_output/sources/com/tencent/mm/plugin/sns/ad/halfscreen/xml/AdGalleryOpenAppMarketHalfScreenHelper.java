package com.tencent.mm.plugin.sns.ad.halfscreen.xml;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/halfscreen/xml/AdGalleryOpenAppMarketHalfScreenHelper;", "Lcom/tencent/mm/plugin/sns/ad/halfscreen/AdGalleryOpenAppHalfScreenHelper;", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "k44/a", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AdGalleryOpenAppMarketHalfScreenHelper extends com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f162688w;

    /* renamed from: x, reason: collision with root package name */
    public k44.a f162689x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f162690y;

    public AdGalleryOpenAppMarketHalfScreenHelper(android.content.Context context) {
        super(context);
        this.f162688w = "AdGalleryOpenAppMarketHalfScreenHelper";
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper, com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper
    public java.lang.String i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
        return this.f162688w;
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper
    public void l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initOpenAppBtnClick", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
        android.widget.Button h17 = h();
        if (h17 != null) {
            h17.setOnClickListener(new k44.d(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initOpenAppBtnClick", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper
    public void m(h44.c adOpenAppParams) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initParamsAndReport", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
        kotlin.jvm.internal.o.g(adOpenAppParams, "adOpenAppParams");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMAdOpenAppParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        this.f162686m = adOpenAppParams;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMAdOpenAppParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        h44.c d17 = d();
        i64.p0 d18 = d17 != null ? d17.d() : null;
        if (d18 != null) {
            d18.f289280j = 106;
        }
        i64.p0 d19 = adOpenAppParams.d();
        java.lang.String str = d19 != null ? d19.f289272b : null;
        i64.p0 d27 = adOpenAppParams.d();
        java.lang.String str2 = d27 != null ? d27.f289273c : null;
        i64.p0 d28 = adOpenAppParams.d();
        java.lang.String str3 = d28 != null ? d28.f289277g : null;
        i64.p0 d29 = adOpenAppParams.d();
        java.lang.String str4 = d29 != null ? d29.f289278h : null;
        i64.p0 d37 = adOpenAppParams.d();
        ca4.d dVar = new ca4.d(str, str2, str3, str4, d37 != null ? d37.f289279i : null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdConversionOnlineParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        this.f162687n = dVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdConversionOnlineParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        ca4.d b17 = b();
        if (b17 != null) {
            b17.c(106);
        }
        l44.z.g(b(), 1);
        l44.z.d(b());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initParamsAndReport", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper, com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper
    public void n() {
        java.lang.String str;
        k44.i c17;
        java.lang.String str2;
        k44.i c18;
        k44.i c19;
        android.widget.Button h17;
        k44.i c27;
        k44.i c28;
        k44.i c29;
        k44.i c37;
        k44.i c38;
        k44.i c39;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
        h44.c d17 = d();
        java.util.List list = null;
        java.lang.String a17 = (d17 == null || (c39 = d17.c()) == null) ? null : c39.a();
        if (!(a17 == null || a17.length() == 0)) {
            h44.c d18 = d();
            a84.z.c((d18 == null || (c38 = d18.c()) == null) ? null : c38.a(), e());
        }
        h44.c d19 = d();
        java.lang.String b17 = (d19 == null || (c37 = d19.c()) == null) ? null : c37.b();
        if (!(b17 == null || b17.length() == 0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAppName", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
            android.widget.TextView textView = this.f162683g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAppName", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
            if (textView != null) {
                h44.c d27 = d();
                textView.setText((d27 == null || (c29 = d27.c()) == null) ? null : c29.b());
            }
        }
        h44.c d28 = d();
        java.lang.String c47 = (d28 == null || (c28 = d28.c()) == null) ? null : c28.c();
        if (!(c47 == null || c47.length() == 0) && (h17 = h()) != null) {
            h44.c d29 = d();
            h17.setText((d29 == null || (c27 = d29.c()) == null) ? null : c27.c());
        }
        h44.c d37 = d();
        if (d37 == null || (c19 = d37.c()) == null) {
            str = null;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppDesc", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
            str = c19.f304102f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppDesc", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
        }
        if (!(str == null || str.length() == 0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAppDesc", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
            android.widget.TextView textView2 = this.f162665q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAppDesc", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
            if (textView2 != null) {
                h44.c d38 = d();
                if (d38 == null || (c18 = d38.c()) == null) {
                    str2 = null;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppDesc", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
                    str2 = c18.f304102f;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppDesc", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
                }
                textView2.setText(str2);
            }
        }
        h44.c d39 = d();
        if (d39 != null && (c17 = d39.c()) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppImageList", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
            java.util.List list2 = c17.f304103g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppImageList", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
            list = list2;
        }
        s(list);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper
    public int p() {
        int i17;
        k44.i c17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExpandClickArea", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
        h44.c d17 = d();
        if (d17 == null || (c17 = d17.c()) == null) {
            i17 = 0;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExpandClickArea", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
            i17 = c17.f304100d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpandClickArea", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpandClickArea", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
        return i17;
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper
    public int q() {
        int i17;
        k44.i c17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getForbidTapBgToClose", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
        h44.c d17 = d();
        if (d17 == null || (c17 = d17.c()) == null) {
            i17 = 0;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getForbidTapBgToClose", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
            i17 = c17.f304101e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getForbidTapBgToClose", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getForbidTapBgToClose", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
        return i17;
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper
    public void r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initExpandAreaClick", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMExpandClickAreaTop", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        android.widget.FrameLayout frameLayout = this.f162668t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMExpandClickAreaTop", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new k44.b(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMExpandClickAreaBottom", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        android.widget.FrameLayout frameLayout2 = this.f162669u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMExpandClickAreaBottom", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        if (frameLayout2 != null) {
            frameLayout2.setOnClickListener(new k44.c(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initExpandAreaClick", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper
    public void t() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnBottomSheetDismissListener", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f162664p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        if (k0Var != null) {
            k0Var.p(new k44.e(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnBottomSheetDismissListener", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
    }
}
