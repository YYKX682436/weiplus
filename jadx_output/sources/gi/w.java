package gi;

/* loaded from: classes12.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gi.v f272202d;

    public w(gi.v vVar) {
        this.f272202d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f272202d.f272184b) {
            gi.v vVar = this.f272202d;
            if (!vVar.f272185c) {
                gi.q0 q0Var = new gi.q0("ExplicitFg");
                vVar.f272186d = q0Var;
                q0Var.b();
            }
        }
    }
}
