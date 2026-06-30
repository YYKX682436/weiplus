package n3;

/* loaded from: classes14.dex */
public class b3 extends n3.a3 {

    /* renamed from: n, reason: collision with root package name */
    public e3.d f334324n;

    /* renamed from: o, reason: collision with root package name */
    public e3.d f334325o;

    /* renamed from: p, reason: collision with root package name */
    public e3.d f334326p;

    public b3(n3.g3 g3Var, android.view.WindowInsets windowInsets) {
        super(g3Var, windowInsets);
        this.f334324n = null;
        this.f334325o = null;
        this.f334326p = null;
    }

    @Override // n3.d3
    public e3.d i() {
        if (this.f334325o == null) {
            this.f334325o = e3.d.d(this.f334446c.getMandatorySystemGestureInsets());
        }
        return this.f334325o;
    }

    @Override // n3.d3
    public e3.d k() {
        if (this.f334324n == null) {
            this.f334324n = e3.d.d(this.f334446c.getSystemGestureInsets());
        }
        return this.f334324n;
    }

    @Override // n3.d3
    public e3.d m() {
        if (this.f334326p == null) {
            this.f334326p = e3.d.d(this.f334446c.getTappableElementInsets());
        }
        return this.f334326p;
    }

    @Override // n3.z2, n3.d3
    public void t(e3.d dVar) {
    }

    public b3(n3.g3 g3Var, n3.b3 b3Var) {
        super(g3Var, b3Var);
        this.f334324n = null;
        this.f334325o = null;
        this.f334326p = null;
    }
}
