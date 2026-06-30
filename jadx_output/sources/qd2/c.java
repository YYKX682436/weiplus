package qd2;

/* loaded from: classes2.dex */
public final class c implements c50.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qd2.g f361708b;

    public c(java.lang.String str, qd2.g gVar) {
        this.f361707a = str;
        this.f361708b = gVar;
    }

    @Override // c50.z0
    public void a(long j17, int i17, java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("FinderAudioExtractor", "[onDownloadFinished] feedId:" + this.f361707a + " ret:" + i17 + " path:" + path + " isFileLegal:" + this.f361708b.b(path));
        qd2.g gVar = this.f361708b;
        boolean z17 = false;
        if (i17 != 0) {
            gVar.c(false);
            return;
        }
        gVar.getClass();
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String aj6 = ((qs2.q) ((w40.e) c17)).aj(j17);
        com.tencent.mars.xlog.Log.i("FinderAudioExtractor", "[extractAudioTrack] feedId:" + pm0.v.u(j17) + " destPath:" + aj6);
        if (gVar.b(aj6)) {
            gVar.f361733g = aj6;
            com.tencent.mars.xlog.Log.i("FinderAudioExtractor", "[extractAudioTrack] audio existed, length = " + ((((float) o35.a.g(aj6)) / 1024.0f) / 1024.0f) + 'M');
        } else {
            com.tencent.mars.xlog.Log.i("FinderAudioExtractor", "[extractAudioTrack] audio not exist, try extract");
            i95.m c18 = i95.n0.c(bg0.v.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            if (((b92.u2) ((bg0.v) c18)).Ri(path, aj6)) {
                com.tencent.mars.xlog.Log.i("FinderAudioExtractor", "[extractAudioTrack] audio length = " + ((((float) o35.a.g(aj6)) / 1024.0f) / 1024.0f) + 'M');
                i95.m c19 = i95.n0.c(qc0.e1.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                qc0.d1 a17 = com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker.f156451a.a(aj6);
                long j18 = a17 != null ? a17.f361366d : 0L;
                if (a17 == null || j18 == 0 || !gVar.b(aj6)) {
                    com.tencent.mars.xlog.Log.i("FinderAudioExtractor", "[extractAudioTrack] no audio track");
                } else {
                    gVar.f361733g = aj6;
                }
            }
        }
        gVar.f361730d = true;
        java.lang.String str = gVar.f361733g;
        if (str != null) {
            if (!(str.length() == 0)) {
                z17 = true;
            }
        }
        gVar.c(z17);
    }

    @Override // c50.z0
    public void b(long j17, long j18, long j19) {
    }
}
