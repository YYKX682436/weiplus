package qd4;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f361863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qd4.f f361864e;

    public e(qd4.f fVar, int i17) {
        this.f361864e = fVar;
        this.f361863d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2$1");
        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.V6(this.f361864e.f361865a).d(this.f361863d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2$1");
    }
}
