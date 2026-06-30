package un0;

/* loaded from: classes13.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.core.trtc.screencast.LiveScreenCastForegroundService f429346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.live.core.core.trtc.screencast.LiveScreenCastForegroundService liveScreenCastForegroundService) {
        super(0);
        this.f429346d = liveScreenCastForegroundService;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("FinderLiveScreenCastForegroundService", "#onRecorderDisconnectedCallback");
        this.f429346d.stopSelf();
        return jz5.f0.f302826a;
    }
}
