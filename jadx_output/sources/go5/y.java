package go5;

/* loaded from: classes11.dex */
public final class y implements f25.f {
    @Override // f25.f
    public void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPAudioFocus", "onAudioFocusChange onPause");
        ((jp5.o) i95.n0.c(jp5.o.class)).W6(true);
    }

    @Override // f25.f
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPAudioFocus", "onAudioFocusChange onResume");
        if (j65.e.h()) {
            ((jp5.o) i95.n0.c(jp5.o.class)).W6(false);
        } else {
            ((jp5.o) i95.n0.c(jp5.o.class)).W6(j65.e.g());
        }
    }

    @Override // f25.f
    public void onStop() {
    }
}
