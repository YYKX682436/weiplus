package ql2;

/* loaded from: classes10.dex */
public final class c0 implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ql2.d0 f364500d;

    public c0(ql2.d0 d0Var) {
        this.f364500d = d0Var;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = this.f364500d.f364506h;
        if (tXLivePlayer != null) {
            tXLivePlayer.setMute(true);
        }
    }

    @Override // f25.f
    public void onResume() {
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = this.f364500d.f364506h;
        if (tXLivePlayer != null) {
            tXLivePlayer.setMute(false);
        }
    }

    @Override // f25.f
    public void onStop() {
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = this.f364500d.f364506h;
        if (tXLivePlayer != null) {
            tXLivePlayer.setMute(true);
        }
    }
}
