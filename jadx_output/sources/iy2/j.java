package iy2;

/* loaded from: classes13.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl f295897d;

    public j(com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl finderLiveVoiceInputLayoutImpl) {
        this.f295897d = finderLiveVoiceInputLayoutImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iy2.b bVar = this.f295897d.C;
        if (bVar != null) {
            bVar.f295880s = 5;
            bVar.f295881t.cancel();
            bVar.invalidateSelf();
        }
    }
}
