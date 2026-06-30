package tf;

/* loaded from: classes7.dex */
public class i0 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final tf.k0 f418822a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f418823b;

    public i0(android.os.Handler handler, tf.k0 k0Var) {
        super(handler.getLooper());
        this.f418823b = handler;
        this.f418822a = k0Var;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        this.f418823b.handleMessage(message);
        tf.k0 k0Var = this.f418822a;
        synchronized (k0Var) {
            java.util.Iterator it = ((java.util.ArrayList) k0Var.f418835b).iterator();
            while (it.hasNext()) {
                tf.j0 j0Var = (tf.j0) it.next();
                android.os.Handler handler = j0Var.f418831b;
                if (handler == null) {
                    j0Var.f418830a.onFrameAvailable(k0Var.f418834a);
                } else {
                    handler.post(new tf.h0(k0Var, j0Var));
                }
            }
        }
    }
}
