package iu3;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f295003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iu3.i f295004e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, iu3.i iVar) {
        super(2);
        this.f295003d = audioCacheInfo;
        this.f295004e = iVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj2).intValue();
        if (intValue == 0) {
            this.f295003d.f155716m = true;
        } else {
            com.tencent.mars.xlog.Log.w(this.f295004e.f295007b, "onPlayMusicError, ret:" + intValue);
            if (this.f295003d.f155729z) {
                com.tencent.mars.xlog.Log.w(this.f295004e.f295007b, "onPlayMusicError, try switch to video!");
                this.f295003d.f155729z = false;
                ((ku5.t0) ku5.t0.f312615d).B(new iu3.f(this.f295004e, this.f295003d));
            }
        }
        return jz5.f0.f302826a;
    }
}
