package gf;

/* loaded from: classes7.dex */
public final class t1 implements android.view.Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f271175d;

    public t1(java.lang.Runnable runnable) {
        this.f271175d = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j17) {
        this.f271175d.run();
    }
}
