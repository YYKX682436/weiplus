package pa3;

/* loaded from: classes5.dex */
public final class u implements android.view.PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f353010a;

    public u(java.util.concurrent.CountDownLatch countDownLatch) {
        this.f353010a = countDownLatch;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i17) {
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnapShotUtilKt", "PixelCopy success");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnapShotUtilKt", "PixelCopy failed with error code " + i17);
        }
        this.f353010a.countDown();
    }
}
