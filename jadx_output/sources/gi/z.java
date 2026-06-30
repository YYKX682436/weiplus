package gi;

/* loaded from: classes12.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f272229d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gi.v f272230e;

    public z(gi.v vVar) {
        this.f272230e = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f272230e.f272184b) {
            gi.v vVar = this.f272230e;
            if (vVar.f272185c) {
                gi.q0 q0Var = vVar.f272189g;
                if (q0Var == null) {
                    this.f272229d = 0;
                } else {
                    rh.c1 c1Var = q0Var.f272086b;
                    if (c1Var != null) {
                        c1Var.f395327i.putInt("poll_count", this.f272229d);
                    }
                    this.f272230e.f272189g.a();
                    this.f272230e.f272189g = null;
                    lh.l0.f318610g.h();
                }
                gi.v vVar2 = this.f272230e;
                if (vVar2.f272185c && gi.d.f272012t) {
                    this.f272229d++;
                    gi.q0 q0Var2 = new gi.q0("ExplicitBgPoll");
                    vVar2.f272189g = q0Var2;
                    q0Var2.b();
                    vVar2.f272197o.f354296h.f363337f.postDelayed(this, 1800000L);
                }
            }
        }
    }
}
