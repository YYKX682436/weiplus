package ql2;

/* loaded from: classes10.dex */
public final class p implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ql2.r f364537d;

    public p(ql2.r rVar) {
        this.f364537d = rVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = this.f364537d.f364546i;
        if (tXLivePlayer != null) {
            tXLivePlayer.setMute(true);
        }
    }

    @Override // f25.f
    public void onResume() {
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = this.f364537d.f364546i;
        if (tXLivePlayer != null) {
            tXLivePlayer.setMute(false);
        }
    }

    @Override // f25.f
    public void onStop() {
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = this.f364537d.f364546i;
        if (tXLivePlayer != null) {
            tXLivePlayer.setMute(true);
        }
    }
}
