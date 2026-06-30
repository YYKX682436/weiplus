package iy2;

/* loaded from: classes15.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iy2.t f295907d;

    public s(iy2.t tVar, int i17) {
        this.f295907d = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iy2.t tVar = this.f295907d;
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout finderLiveVoiceInputLayout = tVar.f295908a;
        if (finderLiveVoiceInputLayout != null) {
            if (finderLiveVoiceInputLayout != null) {
                finderLiveVoiceInputLayout.getCurrentState();
            }
            com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout finderLiveVoiceInputLayout2 = tVar.f295908a;
            if (finderLiveVoiceInputLayout2 != null) {
                finderLiveVoiceInputLayout2.a();
            }
        }
    }
}
