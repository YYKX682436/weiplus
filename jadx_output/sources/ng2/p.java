package ng2;

/* loaded from: classes10.dex */
public final class p extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng2.s f336980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.view.LiveVideoView f336981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f336982f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f336983g;

    public p(ng2.s sVar, com.tencent.mm.live.core.view.LiveVideoView liveVideoView, yz5.l lVar, yz5.a aVar) {
        this.f336980d = sVar;
        this.f336981e = liveVideoView;
        this.f336982f = lVar;
        this.f336983g = aVar;
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
    }

    @Override // mn0.a, com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        super.onPlayEvent(i17, bundle);
        if (i17 == 2009) {
            com.tencent.mars.xlog.Log.i("AbsTXLivePlayListener", "switchInLiveRoom onPlayEvent PLAY_EVT_CHANGE_RESOLUTION");
            return;
        }
        if (i17 != 2033) {
            return;
        }
        com.tencent.mars.xlog.Log.i("AbsTXLivePlayListener", "switchInLiveRoom switch view success. #1");
        ng2.s sVar = this.f336980d;
        sVar.getClass();
        com.tencent.mm.live.core.view.LiveVideoView liveVideoView = this.f336981e;
        liveVideoView.post(new ng2.o(sVar, liveVideoView, this.f336982f, this.f336983g));
    }
}
