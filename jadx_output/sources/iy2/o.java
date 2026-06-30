package iy2;

/* loaded from: classes13.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl f295903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f295904e;

    public o(com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl finderLiveVoiceInputLayoutImpl, boolean z17) {
        this.f295903d = finderLiveVoiceInputLayoutImpl;
        this.f295904e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iy2.b bVar = this.f295903d.C;
        if (bVar != null) {
            if (!this.f295904e) {
                bVar.f295880s = 3;
            }
            bVar.f295878q = true;
            bVar.invalidateSelf();
        }
    }
}
