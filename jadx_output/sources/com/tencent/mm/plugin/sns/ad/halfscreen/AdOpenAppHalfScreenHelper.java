package com.tencent.mm.plugin.sns.ad.halfscreen;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/halfscreen/AdOpenAppHalfScreenHelper;", "Lcom/tencent/mm/plugin/sns/ad/halfscreen/service/HalfScreenOpenAppHelper;", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AdOpenAppHalfScreenHelper extends com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f162671o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f162672p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView f162673q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView f162674r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f162675s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.FrameLayout f162676t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.FrameLayout f162677u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.FrameLayout f162678v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.FrameLayout f162679w;

    public AdOpenAppHalfScreenHelper(android.content.Context context) {
        super(context);
        this.f162671o = "AdOpenAppHalfScreenHelper";
    }

    public static final /* synthetic */ android.widget.FrameLayout p(com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper adOpenAppHalfScreenHelper) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMExpandClickAreaBottomBg$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        android.widget.FrameLayout frameLayout = adOpenAppHalfScreenHelper.f162679w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMExpandClickAreaBottomBg$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        return frameLayout;
    }

    public static final /* synthetic */ android.widget.FrameLayout q(com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper adOpenAppHalfScreenHelper) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMExpandClickAreaTopBg$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        android.widget.FrameLayout frameLayout = adOpenAppHalfScreenHelper.f162678v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMExpandClickAreaTopBg$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        return frameLayout;
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper
    public int c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        return com.tencent.mm.R.layout.f489167bj4;
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper
    public java.lang.String i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        return this.f162671o;
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper
    public void j() {
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f162672p;
        boolean z17 = false;
        if (k0Var2 != null && k0Var2.i()) {
            z17 = true;
        }
        if (z17 && (k0Var = this.f162672p) != null) {
            k0Var.u();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
    }

    @Override // com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper
    public void n() {
        java.lang.String str;
        k44.h b17;
        k44.h b18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        super.n();
        h44.c d17 = d();
        java.lang.String str2 = null;
        if (d17 == null || (b18 = d17.b()) == null) {
            str = null;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTips1", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
            str = b18.f304089d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTips1", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
        }
        h44.c d18 = d();
        if (d18 != null && (b17 = d18.b()) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTips2", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
            java.lang.String str3 = b17.f304090e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTips2", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
            str2 = str3;
        }
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w(i(), "tips1 is null or empty");
        } else {
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView = this.f162673q;
            if (adAppCompatTextView != null) {
                adAppCompatTextView.setText(str);
            }
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView2 = this.f162673q;
            if (adAppCompatTextView2 != null) {
                adAppCompatTextView2.setVisibility(0);
            }
        }
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.w(i(), "tips2 is null or empty");
        } else {
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView3 = this.f162674r;
            if (adAppCompatTextView3 != null) {
                adAppCompatTextView3.setText(str2);
            }
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView adAppCompatTextView4 = this.f162674r;
            if (adAppCompatTextView4 != null) {
                adAppCompatTextView4.setVisibility(0);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(h44.c r9) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper.r(h44.c):void");
    }
}
