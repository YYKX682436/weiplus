package i54;

/* loaded from: classes4.dex */
public final class m implements h54.h {
    @Override // h54.h
    public void a(h54.d jsApiContext, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiOpenWheelPicker");
        kotlin.jvm.internal.o.g(jsApiContext, "jsApiContext");
        kotlin.jvm.internal.o.g(data, "data");
        android.content.Context c17 = jsApiContext.c();
        java.lang.String b17 = jsApiContext.b();
        if (c17 instanceof android.app.Activity) {
            fb4.e.a(c17, b17, data, new i54.l(jsApiContext));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiOpenWheelPicker");
        } else {
            jsApiContext.a("the context is invalid!", kz5.c1.l(new jz5.l("ret", -1)));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiOpenWheelPicker");
        }
    }
}
