package cu0;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cu0.x f222316d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(cu0.x xVar) {
        super(3);
        this.f222316d = xVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = (com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        long longValue2 = ((java.lang.Number) obj3).longValue();
        kotlin.jvm.internal.o.g(audioCacheInfo, "audioCacheInfo");
        com.tencent.mars.xlog.Log.i(this.f222316d.j(), "[onMusicClipChanged] musicId=" + audioCacheInfo.f155711e + " start=" + longValue + " duration=" + longValue2);
        java.lang.String a17 = audioCacheInfo.a();
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2 = this.f222316d.f222355e;
        if (kotlin.jvm.internal.o.b(a17, audioCacheInfo2 != null ? audioCacheInfo2.a() : null)) {
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo3 = this.f222316d.f222355e;
            if (audioCacheInfo3 != null) {
                audioCacheInfo3.G = java.lang.Long.valueOf(longValue);
                audioCacheInfo3.H = java.lang.Long.valueOf(longValue2);
            }
            ev0.t tVar = this.f222316d.f222353c;
            kotlinx.coroutines.l.d(tVar.f256878a, null, null, new ev0.o(longValue, longValue2 + longValue, tVar, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.i(this.f222316d.j(), "[onMusicClipChanged] item not currently selected, skip");
        }
        return jz5.f0.f302826a;
    }
}
