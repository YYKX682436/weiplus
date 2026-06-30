package x64;

/* loaded from: classes4.dex */
public final class h implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x64.j f452286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f452288c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f452289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452291f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f452292g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v64.d f452293h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f452294i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f452295j;

    public h(x64.j jVar, java.lang.String str, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, java.lang.String str2, java.lang.String str3, int i18, v64.d dVar, android.content.Context context, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        this.f452286a = jVar;
        this.f452287b = str;
        this.f452288c = snsInfo;
        this.f452289d = i17;
        this.f452290e = str2;
        this.f452291f = str3;
        this.f452292g = i18;
        this.f452293h = dVar;
        this.f452294i = context;
        this.f452295j = adClickActionInfo;
    }

    @Override // d44.b
    public final void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        com.tencent.mm.modelsns.SnsAdClick snsAdClick;
        com.tencent.mm.ui.widget.dialog.u3 u3Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2$doClick$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        x64.j jVar = this.f452286a;
        jVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
        com.tencent.mars.xlog.Log.i("AdFinderLiveNoticeClick2", "requestLivingNoticeState callback, errorCode is  " + i18 + ", snsId is " + str + ", livingStatus is " + obj);
        if (i18 == 0) {
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            com.tencent.mm.plugin.sns.ad.widget.living.i0.g(str, num != null ? num.intValue() : 0);
            int i19 = this.f452289d;
            android.content.Context context = this.f452294i;
            kotlin.jvm.internal.o.f(context, "$context");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doFinderJumpLogic", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doFinderJumpLogic", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
            java.lang.String str4 = this.f452287b;
            int c17 = com.tencent.mm.plugin.sns.ad.widget.living.i0.c(str4, 1);
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f452288c;
            java.lang.String str5 = snsInfo.getAdInfo(i19).uxInfo;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finderLivingNoticeStatus is ");
            sb6.append(c17);
            sb6.append(", finderUsername is ");
            java.lang.String str6 = this.f452290e;
            sb6.append(str6);
            sb6.append(", finderLiveNoticeId is ");
            sb6.append(this.f452291f);
            sb6.append(", snsIdStr is ");
            sb6.append(str4);
            sb6.append(", scene is ");
            int i27 = this.f452292g;
            sb6.append(i27);
            sb6.append(", uxInfo is ");
            sb6.append(str5);
            com.tencent.mars.xlog.Log.i("AdFinderLiveNoticeClick2", sb6.toString());
            v64.d dVar = this.f452293h;
            if (dVar != null) {
                u3Var = null;
                snsAdClick = (com.tencent.mm.modelsns.SnsAdClick) dVar.a("snsAdClick", null);
            } else {
                u3Var = null;
                snsAdClick = null;
            }
            if (c17 == 513) {
                a84.u0.a(snsAdClick, 41);
                ca4.z0.x0(snsAdClick);
                l44.s4.h(context, str6, str5, str4, i27);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFinderJumpLogic", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
            } else {
                a84.u0.a(snsAdClick, 43);
                p52.h.f352016a.f(l44.s4.m(str5, str4, i27), str6);
                com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.f452295j;
                if (adClickActionInfo == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFinderJumpLogic", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
                } else {
                    ca4.z0.x0(snsAdClick);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doNoticeLogic", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showProgressDlg", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
                    if (context instanceof android.app.Activity) {
                        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, "", context.getString(com.tencent.mm.R.string.gga), true, true, null);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showProgressDlg", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
                        u3Var2 = Q;
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showProgressDlg", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
                        u3Var2 = u3Var;
                    }
                    java.lang.String T = ca4.z0.T(snsInfo);
                    java.lang.String str7 = adClickActionInfo.finderUsername;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str7 == null) {
                        str7 = "";
                    }
                    java.lang.String str8 = adClickActionInfo.X;
                    java.lang.String str9 = str8 == null ? "" : str8;
                    d44.h.f(T, str7, str9, new x64.i(u3Var2, jVar, T, str7, context, i19, snsInfo, adClickActionInfo, str9));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doNoticeLogic", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFinderJumpLogic", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doFinderJumpLogic", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2");
            str2 = "onResult";
            str3 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2$doClick$1";
        } else {
            str2 = "onResult";
            str3 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveNoticeClick2$doClick$1";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str3);
    }
}
