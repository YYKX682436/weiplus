package n;

/* loaded from: classes15.dex */
public class e extends n.b implements o.p {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f333367f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.appcompat.widget.ActionBarContextView f333368g;

    /* renamed from: h, reason: collision with root package name */
    public final n.a f333369h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.ref.WeakReference f333370i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f333371m;

    /* renamed from: n, reason: collision with root package name */
    public final o.r f333372n;

    public e(android.content.Context context, androidx.appcompat.widget.ActionBarContextView actionBarContextView, n.a aVar, boolean z17) {
        this.f333367f = context;
        this.f333368g = actionBarContextView;
        this.f333369h = aVar;
        o.r rVar = new o.r(actionBarContextView.getContext());
        rVar.f341791r = 1;
        this.f333372n = rVar;
        rVar.w(this);
    }

    @Override // n.b
    public void a() {
        if (this.f333371m) {
            return;
        }
        this.f333371m = true;
        this.f333368g.sendAccessibilityEvent(32);
        this.f333369h.d(this);
    }

    @Override // o.p
    public boolean b(o.r rVar, android.view.MenuItem menuItem) {
        return this.f333369h.b(this, menuItem);
    }

    @Override // n.b
    public android.view.View c() {
        java.lang.ref.WeakReference weakReference = this.f333370i;
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    @Override // o.p
    public void d(o.r rVar) {
        i();
        androidx.appcompat.widget.q qVar = this.f333368g.f9514g;
        if (qVar != null) {
            qVar.o();
        }
    }

    @Override // n.b
    public android.view.Menu e() {
        return this.f333372n;
    }

    @Override // n.b
    public android.view.MenuInflater f() {
        return new n.j(this.f333368g.getContext());
    }

    @Override // n.b
    public java.lang.CharSequence g() {
        return this.f333368g.getSubtitle();
    }

    @Override // n.b
    public java.lang.CharSequence h() {
        return this.f333368g.getTitle();
    }

    @Override // n.b
    public void i() {
        this.f333369h.c(this, this.f333372n);
    }

    @Override // n.b
    public boolean j() {
        return this.f333368g.f9313x;
    }

    @Override // n.b
    public void k(android.view.View view) {
        this.f333368g.setCustomView(view);
        this.f333370i = view != null ? new java.lang.ref.WeakReference(view) : null;
    }

    @Override // n.b
    public void l(int i17) {
        m(this.f333367f.getString(i17));
    }

    @Override // n.b
    public void m(java.lang.CharSequence charSequence) {
        this.f333368g.setSubtitle(charSequence);
    }

    @Override // n.b
    public void n(int i17) {
        o(this.f333367f.getString(i17));
    }

    @Override // n.b
    public void o(java.lang.CharSequence charSequence) {
        this.f333368g.setTitle(charSequence);
    }

    @Override // n.b
    public void p(boolean z17) {
        this.f333362e = z17;
        this.f333368g.setTitleOptional(z17);
    }
}
