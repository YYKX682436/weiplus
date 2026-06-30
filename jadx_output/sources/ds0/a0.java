package ds0;

/* loaded from: classes10.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds0.d0 f242783d;

    public a0(ds0.d0 d0Var) {
        this.f242783d = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fs0.f fVar = this.f242783d.f242795e;
        if (fVar != null) {
            fVar.d();
        }
    }
}
