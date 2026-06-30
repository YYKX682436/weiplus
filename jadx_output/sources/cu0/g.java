package cu0;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final cu0.g f222315d = new cu0.g();

    public g() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = (com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        kotlin.jvm.internal.o.g(audioCacheInfo, "audioCacheInfo");
        if (!audioCacheInfo.g()) {
            return new jz5.l(0L, java.lang.Long.valueOf(longValue));
        }
        long h17 = e06.p.h(audioCacheInfo.c(), 0L, longValue);
        return new jz5.l(java.lang.Long.valueOf(h17), java.lang.Long.valueOf(e06.p.h(h17 + audioCacheInfo.b(), h17, longValue)));
    }
}
