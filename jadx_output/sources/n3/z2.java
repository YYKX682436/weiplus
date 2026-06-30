package n3;

/* loaded from: classes14.dex */
public class z2 extends n3.y2 {

    /* renamed from: m, reason: collision with root package name */
    public e3.d f334457m;

    public z2(n3.g3 g3Var, android.view.WindowInsets windowInsets) {
        super(g3Var, windowInsets);
        this.f334457m = null;
    }

    @Override // n3.d3
    public n3.g3 b() {
        return n3.g3.i(this.f334446c.consumeStableInsets(), null);
    }

    @Override // n3.d3
    public n3.g3 c() {
        return n3.g3.i(this.f334446c.consumeSystemWindowInsets(), null);
    }

    @Override // n3.d3
    public final e3.d j() {
        if (this.f334457m == null) {
            android.view.WindowInsets windowInsets = this.f334446c;
            this.f334457m = e3.d.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f334457m;
    }

    @Override // n3.d3
    public boolean n() {
        return this.f334446c.isConsumed();
    }

    @Override // n3.d3
    public void t(e3.d dVar) {
        this.f334457m = dVar;
    }

    public z2(n3.g3 g3Var, n3.z2 z2Var) {
        super(g3Var, z2Var);
        this.f334457m = null;
        this.f334457m = z2Var.f334457m;
    }
}
