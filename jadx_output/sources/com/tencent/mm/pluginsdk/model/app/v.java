package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes4.dex */
public class v implements ru5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f189095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f189096c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f189099f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.a5 f189100g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.e5 f189101h;

    public v(java.lang.String str, android.content.Context context, android.os.Bundle bundle, java.lang.String str2, java.lang.String str3, android.content.Intent intent, com.tencent.mm.pluginsdk.model.app.a5 a5Var, com.tencent.mm.pluginsdk.model.app.e5 e5Var) {
        this.f189094a = str;
        this.f189095b = context;
        this.f189096c = bundle;
        this.f189097d = str2;
        this.f189098e = str3;
        this.f189099f = intent;
        this.f189100g = a5Var;
        this.f189101h = e5Var;
    }

    @Override // ru5.a
    public java.lang.Object a(java.lang.Object obj) {
        xj.l lVar;
        ca4.c a17;
        java.lang.String str = this.f189094a;
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        android.content.Context context = this.f189095b;
        java.lang.String string = !isEmpty ? context.getString(com.tencent.mm.R.string.g_7, str) : context.getString(com.tencent.mm.R.string.g_6);
        java.lang.String g17 = com.tencent.mm.pluginsdk.model.app.w.g(this.f189096c);
        if (g17 != null) {
            ((ee0.c) ((fe0.k3) i95.n0.c(fe0.k3.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportLaunchApplicationShowDialog", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
            java.util.ArrayList arrayList = l44.z.f316428a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportLaunchApplicationShowDialog", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            try {
                com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", "reportLaunchApplicationShowDialog: adReportParams is ".concat(g17));
                a17 = l44.z.a("reportLaunchApplicationShowDialog", g17);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportLaunchApplicationShowDialog: exp is " + th6);
            }
            if (a17 == null) {
                com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", "reportLaunchApplicationShowDialog: adCommonData is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationShowDialog", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            } else {
                org.json.JSONObject jSONObject = a17.f39845b;
                org.json.JSONObject jSONObject2 = a17.f39846c;
                if (jSONObject != null && jSONObject2 != null) {
                    ca4.f fVar = new ca4.f();
                    fVar.o(a17.f39844a);
                    fVar.p(a17.f39847d);
                    fVar.n(a17.f39848e);
                    fVar.q(a17.f39849f);
                    fVar.d(g17);
                    if (jSONObject.has("wxad")) {
                        if (jSONObject2.optInt(ya.b.SOURCE) == 4) {
                            fVar.m(4001018);
                            fVar.k(1);
                            a84.t0.a(fVar.a());
                        } else if (jSONObject2.opt(ya.b.SOURCE) != null) {
                            fVar.m(4002007);
                            fVar.h(1);
                            fVar.i(1);
                            a84.t0.a(fVar.a());
                        }
                    } else if (jSONObject.has("xjad") && jSONObject2.opt(ya.b.SOURCE) != null) {
                        fVar.m(4002007);
                        fVar.h(3);
                        fVar.i(1);
                        a84.t0.a(fVar.a());
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationShowDialog", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                }
                com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", "reportLaunchApplicationShowDialog: sourceParams or sourceJsonObj is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationShowDialog", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationShowDialog", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        }
        com.tencent.mm.pluginsdk.model.app.w.B(this.f189097d);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(string);
        java.lang.String str2 = this.f189098e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = context.getString(com.tencent.mm.R.string.g_4);
        }
        u1Var.n(str2);
        u1Var.j(context.getString(com.tencent.mm.R.string.f490347sg));
        u1Var.l(new com.tencent.mm.pluginsdk.model.app.u(this));
        u1Var.i(new com.tencent.mm.pluginsdk.model.app.t(this));
        u1Var.q(false);
        com.tencent.mm.pluginsdk.model.app.e5 e5Var = this.f189101h;
        if (e5Var != null && (lVar = ((wj.c0) e5Var).f446382a) != null) {
            lVar.onJumpAppCheckExpose();
        }
        return java.lang.Boolean.TRUE;
    }
}
