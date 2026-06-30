package ma5;

/* loaded from: classes15.dex */
public class j extends n.b implements o.p {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f325246f;

    /* renamed from: g, reason: collision with root package name */
    public final o.r f325247g;

    /* renamed from: h, reason: collision with root package name */
    public n.a f325248h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.ref.WeakReference f325249i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ma5.k f325250m;

    public j(ma5.k kVar, android.content.Context context, n.a aVar) {
        this.f325250m = kVar;
        this.f325246f = context;
        this.f325248h = aVar;
        o.r rVar = new o.r(context);
        rVar.f341791r = 1;
        this.f325247g = rVar;
        rVar.w(this);
    }

    @Override // n.b
    public void a() {
        ma5.k kVar = this.f325250m;
        if (kVar.f325261i != this) {
            return;
        }
        if ((kVar.f325268p || kVar.f325269q) ? false : true) {
            this.f325248h.d(this);
        } else {
            kVar.f325262j = this;
            kVar.f325263k = this.f325248h;
        }
        this.f325248h = null;
        kVar.N(false);
        androidx.appcompat.widget.ActionBarContextView actionBarContextView = kVar.f325258f;
        if (actionBarContextView.f9306q == null) {
            actionBarContextView.removeAllViews();
            actionBarContextView.f9307r = null;
            actionBarContextView.f9513f = null;
        }
        ((androidx.appcompat.widget.z2) kVar.f325257e).f9747a.sendAccessibilityEvent(32);
        kVar.f325261i = null;
    }

    @Override // o.p
    public boolean b(o.r rVar, android.view.MenuItem menuItem) {
        n.a aVar = this.f325248h;
        if (aVar != null) {
            return aVar.b(this, menuItem);
        }
        return false;
    }

    @Override // n.b
    public android.view.View c() {
        java.lang.ref.WeakReference weakReference = this.f325249i;
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    @Override // o.p
    public void d(o.r rVar) {
        if (this.f325248h == null) {
            return;
        }
        i();
        androidx.appcompat.widget.q qVar = this.f325250m.f325258f.f9514g;
        if (qVar != null) {
            qVar.o();
        }
    }

    @Override // n.b
    public android.view.Menu e() {
        return this.f325247g;
    }

    @Override // n.b
    public android.view.MenuInflater f() {
        return new n.j(this.f325246f);
    }

    @Override // n.b
    public java.lang.CharSequence g() {
        return this.f325250m.f325258f.getSubtitle();
    }

    @Override // n.b
    public java.lang.CharSequence h() {
        return this.f325250m.f325258f.getTitle();
    }

    @Override // n.b
    public void i() {
        if (this.f325250m.f325261i != this) {
            return;
        }
        o.r rVar = this.f325247g;
        rVar.z();
        try {
            this.f325248h.c(this, rVar);
        } finally {
            rVar.y();
        }
    }

    @Override // n.b
    public boolean j() {
        return this.f325250m.f325258f.f9313x;
    }

    @Override // n.b
    public void k(android.view.View view) {
        this.f325250m.f325258f.setCustomView(view);
        this.f325249i = new java.lang.ref.WeakReference(view);
    }

    @Override // n.b
    public void l(int i17) {
        m(this.f325250m.f325253a.getResources().getString(i17));
    }

    @Override // n.b
    public void m(java.lang.CharSequence charSequence) {
        this.f325250m.f325258f.setSubtitle(charSequence);
    }

    @Override // n.b
    public void n(int i17) {
        o(this.f325250m.f325253a.getResources().getString(i17));
    }

    @Override // n.b
    public void o(java.lang.CharSequence charSequence) {
        this.f325250m.f325258f.setTitle(charSequence);
    }

    @Override // n.b
    public void p(boolean z17) {
        this.f333362e = z17;
        this.f325250m.f325258f.setTitleOptional(z17);
    }
}
