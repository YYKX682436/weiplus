package x44;

/* loaded from: classes4.dex */
public final class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.span.q f451806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w44.b f451807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f451808f;

    public c3(com.tencent.mm.pluginsdk.ui.span.q qVar, w44.b bVar, java.util.List list) {
        this.f451806d = qVar;
        this.f451807e = bVar;
        this.f451808f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShowPhoneNumberMenu$doAction$3$1");
        ((ez.z0) this.f451806d).wi(this.f451807e.a(), this.f451808f, x44.b3.f451792d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShowPhoneNumberMenu$doAction$3$1");
    }
}
