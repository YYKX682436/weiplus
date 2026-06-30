package dj0;

/* loaded from: classes14.dex */
public class u extends dj0.t {

    /* renamed from: o, reason: collision with root package name */
    public dj0.l f232881o;

    /* renamed from: p, reason: collision with root package name */
    public dj0.l f232882p;

    /* renamed from: q, reason: collision with root package name */
    public dj0.l f232883q;

    public u(dj0.x xVar, android.view.WindowInsets windowInsets) {
        super(xVar, windowInsets);
        this.f232881o = null;
        this.f232882p = null;
        this.f232883q = null;
    }

    @Override // dj0.w
    public dj0.l g() {
        if (this.f232882p == null) {
            this.f232882p = dj0.l.b(this.f232875c.getMandatorySystemGestureInsets());
        }
        return this.f232882p;
    }

    @Override // dj0.w
    public dj0.l i() {
        if (this.f232881o == null) {
            this.f232881o = dj0.l.b(this.f232875c.getSystemGestureInsets());
        }
        return this.f232881o;
    }

    @Override // dj0.w
    public dj0.l k() {
        if (this.f232883q == null) {
            this.f232883q = dj0.l.b(this.f232875c.getTappableElementInsets());
        }
        return this.f232883q;
    }

    @Override // dj0.s, dj0.w
    public void q(dj0.l lVar) {
    }

    public u(dj0.x xVar, dj0.u uVar) {
        super(xVar, uVar);
        this.f232881o = null;
        this.f232882p = null;
        this.f232883q = null;
    }
}
