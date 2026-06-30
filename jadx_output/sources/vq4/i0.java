package vq4;

/* loaded from: classes14.dex */
public final class i0 implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vq4.m0 f439315d;

    public i0(vq4.m0 m0Var) {
        this.f439315d = m0Var;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIP.VoIPAudioManager", "onAudioFocusChange onPause");
        this.f439315d.k(true);
    }

    @Override // f25.f
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIP.VoIPAudioManager", "onAudioFocusChange onResume " + j65.e.g() + j65.e.h());
        boolean h17 = j65.e.h();
        vq4.m0 m0Var = this.f439315d;
        if (h17) {
            m0Var.k(false);
        } else {
            m0Var.k(j65.e.g());
        }
    }

    @Override // f25.f
    public void onStop() {
    }
}
