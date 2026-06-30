package iy2;

/* loaded from: classes13.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl f295900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f295901e;

    public m(com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl finderLiveVoiceInputLayoutImpl, int i17) {
        this.f295900d = finderLiveVoiceInputLayoutImpl;
        this.f295901e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iy2.b bVar = this.f295900d.C;
        if (bVar != null) {
            bVar.f295878q = this.f295901e < 28;
            bVar.invalidateSelf();
        }
    }
}
