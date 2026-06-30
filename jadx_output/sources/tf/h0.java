package tf;

/* loaded from: classes7.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tf.j0 f418816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tf.k0 f418817e;

    public h0(tf.k0 k0Var, tf.j0 j0Var) {
        this.f418817e = k0Var;
        this.f418816d = j0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f418816d.f418830a.onFrameAvailable(this.f418817e.f418834a);
    }
}
