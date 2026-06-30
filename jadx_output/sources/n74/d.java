package n74;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.String f335323s;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f335324a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f335325b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f335326c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f335327d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f335328e;

    /* renamed from: f, reason: collision with root package name */
    public s34.y f335329f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.model.t f335330g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$FollowUserEventListener f335331h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f335332i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.Button f335333j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.ImageView f335334k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f335335l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f335336m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f335337n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f335338o;

    /* renamed from: p, reason: collision with root package name */
    public final w64.k f335339p;

    /* renamed from: q, reason: collision with root package name */
    public final int f335340q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f335341r;

    public d(android.content.Context context, int i17, w64.k kVar) {
        this.f335324a = context;
        this.f335340q = i17;
        this.f335339p = kVar;
    }

    public static java.lang.String a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        if (f335323s == null) {
            f335323s = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        if (f335323s == null) {
            f335323s = "";
        }
        if (i17 <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            return "0";
        }
        if (i17 <= 999) {
            java.lang.String valueOf = java.lang.String.valueOf(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            return valueOf;
        }
        if (!f335323s.equals("zh_CN") && !f335323s.equals("zh_HK") && !f335323s.equals("zh_TW")) {
            if (i17 <= 999000) {
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493226jd5, java.lang.Double.valueOf(((i17 * 1.0f) / 1000.0f) - 0.05d));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
                return string;
            }
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jd7, 999);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            return string2;
        }
        if (i17 <= 9999) {
            java.lang.String valueOf2 = java.lang.String.valueOf(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            return valueOf2;
        }
        if (i17 <= 990000) {
            java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493225jd4, java.lang.Double.valueOf(((i17 * 1.0f) / 10000.0f) - 0.05d));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            return string3;
        }
        java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jd6, 99);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("formatNumber", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        return string4;
    }

    public java.lang.String b() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderUserName", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        s34.y yVar = this.f335329f;
        if (yVar == null || (str = yVar.f402829a) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderUserName", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            return "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderUserName", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        return str;
    }

    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideProgressDlg", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f335326c;
        if (u3Var != null && u3Var.isShowing()) {
            this.f335326c.dismiss();
            com.tencent.mars.xlog.Log.i("ActionBtnFollowFinderHelper", "hideProgressDlg");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideProgressDlg", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
    }

    public void d(s34.y yVar, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f335325b;
        android.content.Context context = this.f335324a;
        if (k0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initContentView", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bj_, (android.view.ViewGroup) null);
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.close_icon);
            this.f335333j = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.gac);
            this.f335334k = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a9m);
            this.f335335l = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kbf);
            this.f335336m = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484050cu2);
            this.f335337n = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485032gb0);
            this.f335338o = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.dzz);
            this.f335332i = inflate;
            findViewById.setOnClickListener(new n74.a(this));
            this.f335333j.setOnClickListener(new n74.b(this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initContentView", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0(context, true, 0);
            this.f335325b = k0Var2;
            k0Var2.s(this.f335332i, true);
            com.tencent.mm.ui.widget.dialog.k0 k0Var3 = this.f335325b;
            k0Var3.V1 = true;
            k0Var3.e(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        this.f335335l.setText(yVar.f402831c);
        this.f335336m.setText(yVar.f402832d);
        if (this.f335340q == 1000) {
            this.f335333j.setText(com.tencent.mm.sdk.platformtools.t8.K0(this.f335341r) ? "关注视频号" : this.f335341r);
        }
        if (i17 > 0) {
            this.f335337n.setText(context.getResources().getString(com.tencent.mm.R.string.j76, a(i17)));
            this.f335337n.setVisibility(0);
        } else {
            this.f335337n.setVisibility(8);
        }
        if (i18 > 0) {
            this.f335338o.setText(context.getResources().getString(com.tencent.mm.R.string.f493177j75, a(i18)));
            this.f335338o.setVisibility(0);
        } else {
            this.f335338o.setVisibility(8);
        }
        a84.z.c(yVar.f402830b, this.f335334k);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        if (!this.f335325b.i()) {
            this.f335325b.v();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
    }
}
