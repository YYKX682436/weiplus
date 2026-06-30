package iy2;

/* loaded from: classes13.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl f295902d;

    public n(com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl finderLiveVoiceInputLayoutImpl) {
        this.f295902d = finderLiveVoiceInputLayoutImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl.G;
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl finderLiveVoiceInputLayoutImpl = this.f295902d;
        finderLiveVoiceInputLayoutImpl.getClass();
        com.tencent.mm.sdk.platformtools.u3.i(new iy2.q(finderLiveVoiceInputLayoutImpl), 100L);
        iy2.b bVar = finderLiveVoiceInputLayoutImpl.C;
        if (bVar != null) {
            bVar.b();
        }
    }
}
