package i54;

/* loaded from: classes4.dex */
public final class e implements h54.h {
    @Override // h54.h
    public void a(h54.d jsApiContext, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiGetCanAutoFillData");
        kotlin.jvm.internal.o.g(jsApiContext, "jsApiContext");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String b17 = jsApiContext.b();
        com.tencent.mars.xlog.Log.i("SnsAdForm.GetAutoFill", "GetAutoFill is called!");
        eb4.s.a(b17, new i54.d(jsApiContext));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiGetCanAutoFillData");
    }
}
