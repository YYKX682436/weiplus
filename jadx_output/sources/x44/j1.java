package x44;

/* loaded from: classes4.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w44.b f451838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451839e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f451840f;

    public j1(w44.b bVar, java.lang.String str, long j17) {
        this.f451838d = bVar;
        this.f451839e = str;
        this.f451840f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenWebView$doAction$2");
        w44.b bVar = this.f451838d;
        a84.a0.c(bVar.a(), this.f451839e, bVar.b(), bVar.b().l(), this.f451840f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenWebView$doAction$2");
    }
}
