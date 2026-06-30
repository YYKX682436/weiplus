package rp4;

/* loaded from: classes10.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final rp4.y f398709a = new rp4.y();

    public final void a(java.lang.String videoPath, java.lang.String thumbPath, int i17) {
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        if (com.tencent.mm.vfs.w6.j(thumbPath)) {
            com.tencent.mm.vfs.w6.h(thumbPath);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemuxFileUtil", "");
        android.graphics.Bitmap p17 = ai3.d.p(videoPath);
        if (p17 != null) {
            com.tencent.mm.sdk.platformtools.x.D0(dw3.c0.f244182a.f(p17, i17), 60, android.graphics.Bitmap.CompressFormat.JPEG, thumbPath, true);
        }
    }

    public final void b(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.sight.base.SightVideoJNI.optimizeMP4VFS(path);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemuxFileUtil", "time cost: " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }
}
