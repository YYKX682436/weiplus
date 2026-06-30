package vu0;

/* loaded from: classes5.dex */
public final class l0 implements com.tencent.maas.utils.MJAudioPCMExtractor.OnProgress {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f440116a;

    public l0(yz5.l lVar) {
        this.f440116a = lVar;
    }

    @Override // com.tencent.maas.utils.MJAudioPCMExtractor.OnProgress
    public final void onProgress(float f17) {
        this.f440116a.invoke(java.lang.Float.valueOf(f17));
    }
}
