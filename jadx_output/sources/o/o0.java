package o;

/* loaded from: classes15.dex */
public class o0 extends o.r implements android.view.SubMenu {
    public final o.r F;
    public final o.u G;

    public o0(android.content.Context context, o.r rVar, o.u uVar) {
        super(context);
        this.F = rVar;
        this.G = uVar;
    }

    @Override // o.r
    public boolean d(o.u uVar) {
        return this.F.d(uVar);
    }

    @Override // o.r
    public boolean e(o.r rVar, android.view.MenuItem menuItem) {
        return super.e(rVar, menuItem) || this.F.e(rVar, menuItem);
    }

    @Override // o.r
    public boolean f(o.u uVar) {
        return this.F.f(uVar);
    }

    @Override // android.view.SubMenu
    public android.view.MenuItem getItem() {
        return this.G;
    }

    @Override // o.r
    public java.lang.String j() {
        o.u uVar = this.G;
        int i17 = uVar != null ? uVar.f341804d : 0;
        if (i17 == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i17;
    }

    @Override // o.r
    public o.r k() {
        return this.F.k();
    }

    @Override // o.r
    public boolean m() {
        return this.F.m();
    }

    @Override // o.r
    public boolean n() {
        return this.F.n();
    }

    @Override // o.r
    public boolean o() {
        return this.F.o();
    }

    @Override // o.r, android.view.Menu
    public void setGroupDividerEnabled(boolean z17) {
        this.F.setGroupDividerEnabled(z17);
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable drawable) {
        x(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(java.lang.CharSequence charSequence) {
        x(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderView(android.view.View view) {
        x(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(android.graphics.drawable.Drawable drawable) {
        this.G.setIcon(drawable);
        return this;
    }

    @Override // o.r, android.view.Menu
    public void setQwertyMode(boolean z17) {
        this.F.setQwertyMode(z17);
    }

    @Override // o.r
    public void w(o.p pVar) {
        this.F.w(pVar);
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(int i17) {
        x(0, null, i17, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(int i17) {
        x(i17, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(int i17) {
        this.G.setIcon(i17);
        return this;
    }
}
