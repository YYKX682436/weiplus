package ev0;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public ev0.b f256879b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f256880c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f256881d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Float f256883f;

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f256878a = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.J(1).plus(kotlinx.coroutines.t3.a(null, 1, null)));

    /* renamed from: e, reason: collision with root package name */
    public final ev0.i f256882e = new ev0.i(this);

    public static final void a(ev0.t tVar, java.lang.String str, int i17) {
        tVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MovieComposingMusicPlayer", "onAllComplete " + str + ' ' + i17);
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = tVar.f256880c;
        if (audioCacheInfo == null) {
            return;
        }
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MovieComposingMusicPlayer", "onAllComplete, ret:" + i17);
        } else {
            i95.m c17 = i95.n0.c(m40.k0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((c61.p7) ((m40.k0) c17)).fj(audioCacheInfo.f155715i);
            audioCacheInfo.f155716m = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(ev0.t r20, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r21, yz5.a r22) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ev0.t.b(ev0.t, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo, yz5.a):void");
    }

    public static kotlinx.coroutines.r2 c(ev0.t tVar, boolean z17, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        return kotlinx.coroutines.l.d(tVar.f256878a, null, null, new ev0.j(tVar, z17, aVar, null), 3, null);
    }

    public final kotlinx.coroutines.r2 d() {
        return kotlinx.coroutines.l.d(this.f256878a, null, null, new ev0.n(this, null), 3, null);
    }

    public final void e(float f17) {
        float e17 = e06.p.e(f17, 0.0f, 1.0f);
        com.tencent.mars.xlog.Log.i("MicroMsg.MovieComposingMusicPlayer", "setVolume " + e17);
        this.f256883f = java.lang.Float.valueOf(e17);
        ev0.b bVar = this.f256879b;
        if (bVar != null) {
            bVar.K(e17);
        }
    }
}
