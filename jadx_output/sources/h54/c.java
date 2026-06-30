package h54;

/* loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h54.d f279080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f279082f;

    public c(h54.d dVar, java.lang.String str, java.util.Map map) {
        this.f279080d = dVar;
        this.f279081e = str;
        this.f279082f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext$callbackToJs$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$toJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        this.f279080d.f(this.f279081e, this.f279082f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$toJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext$callbackToJs$1");
    }
}
