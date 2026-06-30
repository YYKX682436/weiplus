package fn4;

/* loaded from: classes15.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f264553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn4.j0 f264554e;

    public i0(fn4.j0 j0Var, int i17) {
        this.f264554e = j0Var;
        this.f264553d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        fn4.k0 k0Var = this.f264554e.f264558d;
        pm4.s sVar = k0Var.f264568b;
        if (sVar != null) {
            sVar.z3(this.f264553d, k0Var.f264569c);
        }
    }
}
