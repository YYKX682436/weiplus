package pv3;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final pv3.n f358619a = new pv3.n();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f358620b = new java.util.concurrent.ConcurrentHashMap();

    public final void a(com.tencent.mm.plugin.vlog.model.i0 scene, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(audioCacheInfo, "audioCacheInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicPlayFirstFrameEventManager", "publishEvent " + scene + ' ' + audioCacheInfo);
        iv3.c cVar = (iv3.c) f358620b.get(scene);
        if (cVar != null) {
            ((nv3.l) ((jz5.n) ((no4.c) cVar).f338777h).getValue()).a(audioCacheInfo.f155711e);
        }
    }
}
