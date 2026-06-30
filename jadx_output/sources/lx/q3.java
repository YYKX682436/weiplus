package lx;

/* loaded from: classes11.dex */
public final class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin f321923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderLiveSwitchEvent f321924e;

    public q3(com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin, com.tencent.mm.autogen.events.FinderLiveSwitchEvent finderLiveSwitchEvent) {
        this.f321923d = flutterBizPlugin;
        this.f321924e = finderLiveSwitchEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = this.f321923d.f65254e;
        if (bizBaseCallbackApi != null) {
            java.lang.String liveId = this.f321924e.f54299g.f6442b;
            kotlin.jvm.internal.o.f(liveId, "liveId");
            bizBaseCallbackApi.onFinderLiveStatusChange(liveId, lx.p3.f321904d);
        }
    }
}
