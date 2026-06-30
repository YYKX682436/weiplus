package ds0;

/* loaded from: classes10.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds0.d0 f242835d;

    public z(ds0.d0 d0Var) {
        this.f242835d = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fs0.f fVar = this.f242835d.f242796f;
        if (fVar != null) {
            fVar.d();
        }
    }
}
