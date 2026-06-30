package wt3;

/* loaded from: classes10.dex */
public final class z0 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt3.c1 f449526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f449527e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk4.a f449528f;

    public z0(wt3.c1 c1Var, yz5.p pVar, dk4.a aVar) {
        this.f449526d = c1Var;
        this.f449527e = pVar;
        this.f449528f = aVar;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        wt3.c1.a(this.f449526d);
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryAudioManager", "[cacheAudio] onProgress, mediaId:" + str + ", offset:" + j17 + ", total:" + j18);
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        wt3.c1.a(this.f449526d);
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryAudioManager", "[cacheAudio] onFinish, mediaId:" + str + ", ret:" + i17);
        yz5.p pVar = this.f449527e;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.valueOf(i17 == 0), this.f449528f.f234483t);
        }
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
        wt3.c1.a(this.f449526d);
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryAudioManager", "[cacheAudio] onDataAvailable, mediaId:" + str + ", offset:" + j17 + ", length:" + j18);
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
        wt3.c1.a(this.f449526d);
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryAudioManager", "[cacheAudio] onM3U8Ready, mediaId:" + str);
    }

    @Override // dn.n
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        wt3.c1.a(this.f449526d);
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryAudioManager", "[cacheAudio] onMoovReady, mediaId:" + str + ", offset:" + j17 + ", length:" + j18);
    }
}
