package vo4;

/* loaded from: classes10.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo4.x f438694d;

    public v(vo4.x xVar) {
        this.f438694d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vo4.u uVar;
        boolean c17;
        hs0.a aVar;
        fs0.g mVar;
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        vo4.x xVar = this.f438694d;
        sb6.append(xVar.hashCode());
        sb6.append(' ');
        com.tencent.mm.plugin.vlog.model.p0 p0Var = xVar.f438605d;
        sb6.append(p0Var.f175710c);
        sb6.append(" start do check crop rect");
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", sb6.toString());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        hs0.a aVar2 = new hs0.a(p0Var.f175710c);
        ls0.v vVar = new ls0.v(aVar2, false, 2, null);
        vo4.u uVar2 = new vo4.u(xVar, elapsedRealtime, aVar2);
        vVar.f320931c = uVar2;
        try {
            c17 = fp.h.c(23);
            aVar = vVar.f320929a;
        } catch (java.lang.Exception e17) {
            e = e17;
            uVar = uVar2;
        }
        try {
            if (c17) {
                android.media.MediaFormat mediaFormat = aVar.f284551e;
                if (mediaFormat != null) {
                    uVar = uVar2;
                    i17 = (int) mediaFormat.getLong("durationUs");
                } else {
                    uVar = uVar2;
                    i17 = 0;
                }
                if (i17 <= 0) {
                    android.media.MediaFormat mediaFormat2 = aVar.f284552f;
                    i17 = mediaFormat2 != null ? (int) mediaFormat2.getLong("durationUs") : 0;
                }
                mVar = new fs0.o(0L, i17 / 1000, vVar.f320929a, null, 0, false, new ls0.s(vVar));
            } else {
                uVar = uVar2;
                android.media.MediaFormat mediaFormat3 = aVar.f284551e;
                int i18 = mediaFormat3 != null ? (int) mediaFormat3.getLong("durationUs") : 0;
                if (i18 <= 0) {
                    android.media.MediaFormat mediaFormat4 = aVar.f284552f;
                    i18 = mediaFormat4 != null ? (int) mediaFormat4.getLong("durationUs") : 0;
                }
                mVar = new fs0.m(0L, i18 / 1000, vVar.f320929a, null, 0, false, new ls0.t(vVar));
            }
            vVar.f320930b = mVar;
        } catch (java.lang.Exception e18) {
            e = e18;
            com.tencent.mars.xlog.Log.printErrStackTrace(vVar.f320935g, e, "start check init decoder error", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxCheckCropRectFailed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 78L, 1L);
            uVar.invoke(null, vVar);
            vVar.f320936h = pm0.v.m("MediaCodecCheckVideoCropRect_decode", false, new ls0.u(vVar));
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", xVar.hashCode() + " checkCropRect finish cost " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
        vVar.f320936h = pm0.v.m("MediaCodecCheckVideoCropRect_decode", false, new ls0.u(vVar));
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", xVar.hashCode() + " checkCropRect finish cost " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
    }
}
