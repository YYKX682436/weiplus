package i54;

/* loaded from: classes4.dex */
public final class x implements h54.h {
    public static final void b(i54.x xVar, h54.d dVar, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$backToJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
        xVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("backToJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
        if (z17) {
            dVar.a("ok", kz5.c1.l(new jz5.l("ret", 1)));
        } else {
            dVar.a("fail", kz5.c1.l(new jz5.l("ret", 2)));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("backToJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$backToJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
    }

    @Override // h54.h
    public void a(h54.d jsApiContext, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
        kotlin.jvm.internal.o.g(jsApiContext, "jsApiContext");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("scanUrl", "");
        int optInt = data.optInt("directJump", 0);
        data.optInt("syncQrImageDownload", 0);
        java.lang.String optString2 = data.optString("qrExtInfo", "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("qrExtInfo", optString2);
        bundle.putInt("qrIsDirectJump", optInt);
        android.content.Context c17 = jsApiContext.c();
        if (!(c17 instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e("SnsAdForm.ScanQR", "the context is not activity");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
            return;
        }
        ca4.b0 b0Var = new ca4.b0(c17, jsApiContext.e(), 2, bundle);
        java.lang.String l17 = za4.t0.l("adId", optString);
        if ((l17 == null || l17.length() == 0) || !com.tencent.mm.vfs.w6.j(l17)) {
            kotlin.jvm.internal.o.d(optString);
            i54.t tVar = new i54.t(this, jsApiContext, b0Var, optString, optInt);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("download", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
            za4.t0.d("adId", optString, new i54.w(optString, tVar));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("download", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
        } else {
            kotlin.jvm.internal.o.d(l17);
            kotlin.jvm.internal.o.d(optString);
            c(jsApiContext, b0Var, l17, optString, optInt == 1);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
    }

    public final void c(h54.d dVar, ca4.b0 b0Var, java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScan", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
        if (z17) {
            b0Var.k(str, str2, new i54.u(this, dVar));
        } else {
            b0Var.l(str, str2, new i54.v(this, dVar));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScan", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR");
    }
}
