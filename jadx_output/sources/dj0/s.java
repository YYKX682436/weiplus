package dj0;

/* loaded from: classes14.dex */
public class s extends dj0.r {

    /* renamed from: n, reason: collision with root package name */
    public dj0.l f232880n;

    public s(dj0.x xVar, android.view.WindowInsets windowInsets) {
        super(xVar, windowInsets);
        this.f232880n = null;
    }

    @Override // dj0.w
    public dj0.x b() {
        return new dj0.x(this.f232875c.consumeStableInsets());
    }

    @Override // dj0.w
    public dj0.x c() {
        return new dj0.x(this.f232875c.consumeSystemWindowInsets());
    }

    @Override // dj0.w
    public final dj0.l h() {
        if (this.f232880n == null) {
            android.view.WindowInsets windowInsets = this.f232875c;
            this.f232880n = dj0.l.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f232880n;
    }

    @Override // dj0.w
    public boolean l() {
        return this.f232875c.isConsumed();
    }

    @Override // dj0.w
    public void q(dj0.l lVar) {
        this.f232880n = lVar;
    }

    public s(dj0.x xVar, dj0.s sVar) {
        super(xVar, sVar);
        this.f232880n = null;
        this.f232880n = sVar.f232880n;
    }
}
