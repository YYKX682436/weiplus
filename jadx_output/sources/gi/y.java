package gi;

/* loaded from: classes12.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gi.v f272223d;

    public y(gi.v vVar) {
        this.f272223d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f272223d.f272184b) {
            gi.v vVar = this.f272223d;
            if (vVar.f272185c) {
                gi.q0 q0Var = new gi.q0("ExplicitBg");
                vVar.f272187e = q0Var;
                q0Var.b();
            }
        }
    }
}
