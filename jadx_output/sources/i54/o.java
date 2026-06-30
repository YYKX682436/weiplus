package i54;

/* loaded from: classes4.dex */
public final class o implements h54.h {
    @Override // h54.h
    public void a(h54.d jsApiContext, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiQueryFinderFollowState");
        kotlin.jvm.internal.o.g(jsApiContext, "jsApiContext");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String b17 = jsApiContext.b();
        m54.l e17 = jsApiContext.e();
        if (e17 == null) {
            e17 = new m54.l();
        }
        b54.e.e(b17, data, new i54.n(jsApiContext), e17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiQueryFinderFollowState");
    }
}
