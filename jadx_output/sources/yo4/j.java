package yo4;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final yo4.j f464238d = new yo4.j();

    public j() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        jz5.l lVar;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info = (com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        kotlin.jvm.internal.o.g(info, "info");
        if (info.g()) {
            long h17 = e06.p.h(info.c(), 0L, longValue);
            lVar = new jz5.l(java.lang.Long.valueOf(h17), java.lang.Long.valueOf(e06.p.h(info.b() + h17, h17, longValue)));
        } else {
            lVar = new jz5.l(0L, java.lang.Long.valueOf(longValue));
        }
        long longValue2 = ((java.lang.Number) lVar.f302833d).longValue();
        long longValue3 = ((java.lang.Number) lVar.f302834e).longValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.EditAddMusicPlugin", "[provideInitialClipRange] musicId=" + info.f155711e + " totalDurationMs=" + longValue + " hasTrim=" + info.g() + " return=[" + longValue2 + ", " + longValue3 + ']');
        return new jz5.l(java.lang.Long.valueOf(longValue2), java.lang.Long.valueOf(longValue3));
    }
}
