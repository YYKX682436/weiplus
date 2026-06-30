package gi;

/* loaded from: classes12.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gi.v f271988d;

    public b0(gi.v vVar) {
        this.f271988d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        gi.q0 q0Var;
        com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "excessive cpu inspect");
        synchronized (this.f271988d.f272184b) {
            gi.v vVar = this.f271988d;
            if (vVar.f272185c && (q0Var = vVar.f272190h) != null) {
                q0Var.a();
            }
            this.f271988d.f272190h = null;
        }
    }
}
