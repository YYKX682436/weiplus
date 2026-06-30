package i54;

/* loaded from: classes4.dex */
public final class k implements h54.h {
    @Override // h54.h
    public void a(h54.d jsApiContext, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiOpenFinderProfile");
        kotlin.jvm.internal.o.g(jsApiContext, "jsApiContext");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String b17 = jsApiContext.b();
        android.content.Context c17 = jsApiContext.c();
        m54.l e17 = jsApiContext.e();
        if (e17 == null) {
            e17 = new m54.l();
        }
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("SnsAdForm.OpenFinderProfile", "the context is null!!");
            jsApiContext.a("context is null!!!", kz5.c1.l(new jz5.l("ret", -2), new jz5.l("err_msg", "context is null")));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiOpenFinderProfile");
        } else {
            com.tencent.mars.xlog.Log.i("SnsAdForm.OpenFinderProfile", "the open finder profile called!!");
            b54.e.d(c17, b17, data, new i54.j(jsApiContext), e17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiOpenFinderProfile");
        }
    }
}
