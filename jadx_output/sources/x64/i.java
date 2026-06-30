package x64;

/* loaded from: classes4.dex */
public final class i implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f452296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x64.j f452297b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452298c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f452300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f452301f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f452302g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f452303h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452304i;

    public i(com.tencent.mm.ui.widget.dialog.u3 u3Var, x64.j jVar, java.lang.String str, java.lang.String str2, android.content.Context context, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, java.lang.String str3) {
        this.f452296a = u3Var;
        this.f452297b = jVar;
        this.f452298c = str;
        this.f452299d = str2;
        this.f452300e = context;
        this.f452301f = i17;
        this.f452302g = snsInfo;
        this.f452303h = adClickActionInfo;
        this.f452304i = str3;
    }

    @Override // d44.b
    public void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        java.lang.String str2;
        java.lang.String str3;
        int i19;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2$doNoticeLogic$1");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f452296a;
        if (u3Var != null && u3Var.isShowing()) {
            u3Var.dismiss();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        this.f452297b.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("outSnsId is ");
        sb6.append(this.f452298c);
        sb6.append(", snsId is ");
        sb6.append(str);
        sb6.append(", finderUsername is ");
        java.lang.String finderUsername = this.f452299d;
        sb6.append(finderUsername);
        sb6.append(", actionType is ");
        sb6.append(i17);
        sb6.append(", errorCode is ");
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("AdFinderLiveNoticeClick2", sb6.toString());
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f452302g;
        android.content.Context context = this.f452300e;
        if (i18 == 0) {
            com.tencent.mm.plugin.sns.ad.widget.living.i0.g(str, 513);
            com.tencent.mm.plugin.sns.ad.widget.living.b bVar = new com.tencent.mm.plugin.sns.ad.widget.living.b(context);
            int i27 = this.f452301f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
            if (str == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
            } else {
                com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.f452303h;
                if (adClickActionInfo == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                } else if (snsInfo == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                } else {
                    bVar.f163686i = adClickActionInfo;
                    bVar.f163685h = snsInfo;
                    bVar.f163687m = i27;
                    bVar.f163688n = str;
                    if (i27 == 0) {
                        str2 = "onResult";
                        str3 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2$doNoticeLogic$1";
                        i19 = 1;
                    } else {
                        str2 = "onResult";
                        str3 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2$doNoticeLogic$1";
                        i19 = 2;
                    }
                    bVar.f163693s = new com.tencent.mm.modelsns.SnsAdClick(i27, i19, snsInfo.field_snsId, 41, 41);
                    com.tencent.mm.ui.widget.dialog.k0 k0Var = bVar.f163683f;
                    java.lang.String str4 = bVar.f163682e;
                    boolean z18 = false;
                    if (k0Var == null) {
                        com.tencent.mars.xlog.Log.i(str4, "init finder notice success bottomSheet");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initContentView", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                        android.content.Context context2 = bVar.f163681d;
                        android.view.View inflate = android.view.LayoutInflater.from(context2).inflate(com.tencent.mm.R.layout.cqt, (android.view.ViewGroup) null);
                        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
                        bVar.f163684g = inflate;
                        bVar.f163689o = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kfl);
                        bVar.f163690p = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484898fv1);
                        bVar.f163691q = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.osy);
                        bVar.f163692r = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.d2m);
                        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.bys);
                        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                        findViewById.setOnClickListener(bVar);
                        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.kfg);
                        if (button != null) {
                            button.setOnClickListener(bVar);
                        }
                        android.widget.TextView textView = bVar.f163689o;
                        com.tencent.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
                        android.widget.TextView textView2 = bVar.f163690p;
                        com.tencent.mm.ui.bk.r0(textView2 != null ? textView2.getPaint() : null, 0.8f);
                        android.widget.TextView textView3 = bVar.f163691q;
                        com.tencent.mm.ui.bk.r0(textView3 != null ? textView3.getPaint() : null, 0.8f);
                        android.widget.TextView textView4 = bVar.f163692r;
                        com.tencent.mm.ui.bk.r0(textView4 != null ? textView4.getPaint() : null, 0.8f);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initContentView", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                        z17 = true;
                        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0(context2, true, 0);
                        bVar.f163683f = k0Var2;
                        k0Var2.s(bVar.f163684g, true);
                        com.tencent.mm.ui.widget.dialog.k0 k0Var3 = bVar.f163683f;
                        if (k0Var3 != null) {
                            k0Var3.e(true);
                        }
                        com.tencent.mm.ui.widget.dialog.k0 k0Var4 = bVar.f163683f;
                        if (k0Var4 != null) {
                            k0Var4.V1 = true;
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshView", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                        android.widget.TextView textView5 = bVar.f163690p;
                        if (textView5 != null) {
                            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo2 = bVar.f163686i;
                            textView5.setText(adClickActionInfo2 != null ? adClickActionInfo2.f162570a0 : null);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                    } else {
                        z17 = true;
                    }
                    com.tencent.mm.ui.widget.dialog.k0 k0Var5 = bVar.f163683f;
                    if (k0Var5 != null && !k0Var5.i()) {
                        z18 = z17;
                    }
                    if (z18) {
                        com.tencent.mars.xlog.Log.i(str4, "show finder notice success bottomSheet, snsId is " + bVar.f163688n + ", mSource is " + bVar.f163687m);
                        com.tencent.mm.ui.widget.dialog.k0 k0Var6 = bVar.f163683f;
                        if (k0Var6 != null) {
                            k0Var6.v();
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.widget.living.AdFinderNoticeSuccessHalfScreenWidget");
                }
            }
            str2 = "onResult";
            str3 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2$doNoticeLogic$1";
        } else {
            str2 = "onResult";
            str3 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2$doNoticeLogic$1";
            d44.h.b(context, i18);
        }
        kotlin.jvm.internal.o.f(finderUsername, "$finderUsername");
        java.lang.String finderLiveNoticeId = this.f452304i;
        kotlin.jvm.internal.o.f(finderLiveNoticeId, "$finderLiveNoticeId");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$reportResultData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportResultData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        java.lang.String str5 = snsInfo.getAdXml().adExtInfo;
        java.lang.String str6 = snsInfo.getAdInfo(this.f452301f).uxInfo;
        d44.a aVar = new d44.a();
        aVar.c(str, str6, str5, finderUsername, finderLiveNoticeId, i18, 3);
        a84.t0.a(aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportResultData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$reportResultData", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str3);
    }
}
