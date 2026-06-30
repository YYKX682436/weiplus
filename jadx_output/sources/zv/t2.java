package zv;

/* loaded from: classes11.dex */
public final class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin f476111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderLiveSwitchEvent f476112e;

    public t2(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin, com.tencent.mm.autogen.events.FinderLiveSwitchEvent finderLiveSwitchEvent) {
        this.f476111d = flutterBrandEcsPlugin;
        this.f476112e = finderLiveSwitchEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = this.f476111d.f65190e;
        if (bizBaseCallbackApi != null) {
            java.lang.String liveId = this.f476112e.f54299g.f6442b;
            kotlin.jvm.internal.o.f(liveId, "liveId");
            bizBaseCallbackApi.onFinderLiveStatusChange(liveId, zv.s2.f476102d);
        }
    }
}
