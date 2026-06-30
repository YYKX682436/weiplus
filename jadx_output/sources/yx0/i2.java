package yx0;

/* loaded from: classes5.dex */
public final class i2 implements android.view.PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f467374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f467375b;

    public i2(kotlin.jvm.internal.f0 f0Var, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f467374a = f0Var;
        this.f467375b = countDownLatch;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i17) {
        this.f467374a.f310116d = i17;
        this.f467375b.countDown();
    }
}
