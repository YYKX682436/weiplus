package tf;

/* loaded from: classes7.dex */
public class h implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.Future f418812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f418813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tf.k0 f418814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tf.j f418815g;

    public h(tf.j jVar, java.util.concurrent.Future future, java.lang.Runnable runnable, tf.k0 k0Var) {
        this.f418815g = jVar;
        this.f418812d = future;
        this.f418813e = runnable;
        this.f418814f = k0Var;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mars.xlog.Log.i(this.f418815g.f418826a, "scheduleAfterTransferToTask, onFrameAvailable");
        this.f418812d.cancel(false);
        this.f418813e.run();
        tf.k0 k0Var = this.f418814f;
        synchronized (k0Var) {
            ((java.util.ArrayList) k0Var.f418835b).remove(new tf.j0(this, null));
        }
    }
}
