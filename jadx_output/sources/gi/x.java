package gi;

/* loaded from: classes12.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f272219d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gi.v f272220e;

    public x(gi.v vVar) {
        this.f272220e = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f272220e.f272184b) {
            gi.v vVar = this.f272220e;
            if (!vVar.f272185c) {
                gi.q0 q0Var = vVar.f272188f;
                if (q0Var == null) {
                    this.f272219d = 0;
                } else {
                    rh.c1 c1Var = q0Var.f272086b;
                    if (c1Var != null) {
                        c1Var.f395327i.putInt("poll_count", this.f272219d);
                    }
                    this.f272220e.f272188f.a();
                    this.f272220e.f272188f = null;
                    lh.l0.f318610g.h();
                }
                gi.v vVar2 = this.f272220e;
                if (!vVar2.f272185c && gi.d.f272011s) {
                    this.f272219d++;
                    gi.q0 q0Var2 = new gi.q0("ExplicitFgPoll");
                    vVar2.f272188f = q0Var2;
                    q0Var2.b();
                    vVar2.f272197o.f354296h.f363337f.postDelayed(this, 600000L);
                }
            }
        }
    }
}
