package n;

/* loaded from: classes15.dex */
public class g extends android.view.ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f333377a;

    /* renamed from: b, reason: collision with root package name */
    public final n.b f333378b;

    public g(android.content.Context context, n.b bVar) {
        this.f333377a = context;
        this.f333378b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f333378b.a();
    }

    @Override // android.view.ActionMode
    public android.view.View getCustomView() {
        return this.f333378b.c();
    }

    @Override // android.view.ActionMode
    public android.view.Menu getMenu() {
        return new o.j0(this.f333377a, (g3.a) this.f333378b.e());
    }

    @Override // android.view.ActionMode
    public android.view.MenuInflater getMenuInflater() {
        return this.f333378b.f();
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getSubtitle() {
        return this.f333378b.g();
    }

    @Override // android.view.ActionMode
    public java.lang.Object getTag() {
        return this.f333378b.f333361d;
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getTitle() {
        return this.f333378b.h();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f333378b.f333362e;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f333378b.i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f333378b.j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(android.view.View view) {
        this.f333378b.k(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(java.lang.CharSequence charSequence) {
        this.f333378b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(java.lang.Object obj) {
        this.f333378b.f333361d = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(java.lang.CharSequence charSequence) {
        this.f333378b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z17) {
        this.f333378b.p(z17);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i17) {
        this.f333378b.l(i17);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i17) {
        this.f333378b.n(i17);
    }
}
