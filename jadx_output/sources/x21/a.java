package x21;

/* loaded from: classes12.dex */
public final class a implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x21.c f451510d;

    public a(x21.c cVar) {
        this.f451510d = cVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MSP.AudioTrackAudioPlayer", "onPause: canDuck " + z17);
        if (z17) {
            return;
        }
        this.f451510d.f451512a.invoke();
    }

    @Override // f25.f
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MSP.AudioTrackAudioPlayer", "onResume: ");
        this.f451510d.a(false);
    }

    @Override // f25.f
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MSP.AudioTrackAudioPlayer", "onStop: ");
        this.f451510d.f451512a.invoke();
    }
}
