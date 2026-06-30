package w6;

/* loaded from: classes13.dex */
public class d1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f443086a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f443087b = new android.os.Handler(android.os.Looper.getMainLooper(), new w6.c1());

    public synchronized void a(w6.z0 z0Var) {
        if (this.f443086a) {
            this.f443087b.obtainMessage(1, z0Var).sendToTarget();
        } else {
            this.f443086a = true;
            z0Var.recycle();
            this.f443086a = false;
        }
    }
}
