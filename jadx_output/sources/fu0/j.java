package fu0;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fu0.l f266785d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(fu0.l lVar) {
        super(3);
        this.f266785d = lVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = (com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) obj;
        ((java.lang.Boolean) obj2).booleanValue();
        ((java.lang.Boolean) obj3).booleanValue();
        fu0.l lVar = this.f266785d;
        lVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMusicApply: music=");
        sb6.append(audioCacheInfo != null ? audioCacheInfo.f155723t : null);
        sb6.append(", cached=");
        sb6.append(audioCacheInfo != null ? java.lang.Boolean.valueOf(audioCacheInfo.f155716m) : null);
        com.tencent.mars.xlog.Log.i("MJCC.MusicPicking", sb6.toString());
        boolean z17 = false;
        if (audioCacheInfo == null) {
            com.tencent.mars.xlog.Log.i("MJCC.MusicPicking", "handleMusicApply: audioCacheInfo is null, return origin music");
            lVar.c(lVar.b(lVar.f266792f), false);
        } else {
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2 = lVar.f266792f;
            if (audioCacheInfo2 != null && kotlin.jvm.internal.o.b(audioCacheInfo2.C, audioCacheInfo.C) && kotlin.jvm.internal.o.b(audioCacheInfo2.f155723t, audioCacheInfo.f155723t) && kotlin.jvm.internal.o.b(audioCacheInfo2.f155714h, audioCacheInfo.f155714h)) {
                z17 = true;
            }
            lVar.c(lVar.b(audioCacheInfo), !z17);
        }
        return jz5.f0.f302826a;
    }
}
