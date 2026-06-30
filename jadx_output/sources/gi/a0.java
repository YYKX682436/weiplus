package gi;

/* loaded from: classes12.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gi.v f271986d;

    public a0(gi.v vVar) {
        this.f271986d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "excessive cpu start");
        synchronized (this.f271986d.f272184b) {
            gi.v vVar = this.f271986d;
            if (vVar.f272185c) {
                gi.q0 q0Var = new gi.q0("ExcessiveCpu");
                vVar.f272190h = q0Var;
                q0Var.b();
                gi.v vVar2 = this.f271986d;
                vVar2.f272197o.f354296h.f363337f.postDelayed(vVar2.f272196n, 900000L);
            }
        }
    }
}
