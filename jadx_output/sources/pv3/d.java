package pv3;

/* loaded from: classes5.dex */
public final class d implements c50.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f358586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f358587b;

    public d(java.lang.String str, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        this.f358586a = str;
        this.f358587b = audioCacheInfo;
    }

    @Override // c50.z0
    public void a(long j17, int i17, java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        pv3.f fVar = pv3.f.f358589a;
        com.tencent.mars.xlog.Log.i("MusicCacheManager", "[onDownloadFinished] feedId:" + this.f358586a + " ret:" + i17 + " path:" + path + " isFileLegal:" + fVar.d(path));
        pv3.f.f358592d.remove(java.lang.Long.valueOf(j17));
        if (i17 == 0) {
            fVar.c(j17, path, this.f358587b);
        } else {
            fVar.e(false, new lv3.a(j17, "", 0L));
        }
    }

    @Override // c50.z0
    public void b(long j17, long j18, long j19) {
    }
}
