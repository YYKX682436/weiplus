package dk2;

/* loaded from: classes.dex */
public final class aa implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f233195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f233196b;

    public aa(kotlin.jvm.internal.c0 c0Var, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f233195a = c0Var;
        this.f233196b = countDownLatch;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayDownloadManager", "saveVideoToAlbum success: " + srcPath + " -> " + destPath);
        this.f233195a.f310112d = true;
        this.f233196b.countDown();
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mars.xlog.Log.e("FinderLiveKTVReplayDownloadManager", "saveVideoToAlbum failed: ".concat(srcPath));
        this.f233195a.f310112d = false;
        this.f233196b.countDown();
    }
}
