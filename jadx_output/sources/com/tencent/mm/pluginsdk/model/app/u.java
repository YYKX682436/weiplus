package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes4.dex */
public class u implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.v f189089a;

    public u(com.tencent.mm.pluginsdk.model.app.v vVar) {
        this.f189089a = vVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        boolean z18;
        ca4.c a17;
        com.tencent.mm.pluginsdk.model.app.v vVar = this.f189089a;
        java.lang.String g17 = com.tencent.mm.pluginsdk.model.app.w.g(vVar.f189096c);
        if (g17 != null) {
            ((ee0.c) ((fe0.k3) i95.n0.c(fe0.k3.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportLaunchApplicationConfirmDialogOk", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
            java.util.ArrayList arrayList = l44.z.f316428a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportLaunchApplicationConfirmDialogOk", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            try {
                com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", "reportLaunchApplicationConfirmDialogOk: adReportParams is ".concat(g17));
                a17 = l44.z.a("reportLaunchApplicationConfirmDialogOk", g17);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportLaunchApplicationConfirmDialogOk: exp is " + th6);
            }
            if (a17 == null) {
                com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", "reportLaunchApplicationConfirmDialogOk: adCommonData is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationConfirmDialogOk", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
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
                            fVar.m(4001002);
                            fVar.k(1);
                            a84.t0.a(fVar.a());
                        } else if (jSONObject2.opt(ya.b.SOURCE) != null) {
                            fVar.m(4002009);
                            fVar.h(1);
                            fVar.i(1);
                            a84.t0.a(fVar.a());
                        }
                    } else if (jSONObject.has("xjad") && jSONObject2.opt(ya.b.SOURCE) != null) {
                        fVar.m(4002009);
                        fVar.h(3);
                        fVar.i(1);
                        a84.t0.a(fVar.a());
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationConfirmDialogOk", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                }
                com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", "reportLaunchApplicationConfirmDialogOk: sourceParams or sourceJsonObj is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationConfirmDialogOk", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationConfirmDialogOk", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        }
        try {
            android.content.Context context = vVar.f189095b;
            android.content.Intent intent = vVar.f189099f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/pluginsdk/model/app/AppInfoLogic$7$2", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/pluginsdk/model/app/AppInfoLogic$7$2", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.tencent.mm.pluginsdk.model.app.w.y(vVar.f189096c);
            z18 = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", e17.getMessage());
            z18 = false;
        }
        com.tencent.mm.pluginsdk.model.app.w.a(vVar.f189096c, 0, 1, "", z18 ? 1 : 0, vVar.f189097d);
        com.tencent.mm.pluginsdk.model.app.w.A(vVar.f189097d, true);
        com.tencent.mm.pluginsdk.model.app.w.b(vVar.f189097d, true, vVar.f189099f);
        com.tencent.mm.pluginsdk.model.app.a5 a5Var = vVar.f189100g;
        if (a5Var != null) {
            a5Var.a(z18, false);
        }
    }
}
