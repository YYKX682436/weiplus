package fa;

/* loaded from: classes15.dex */
public class h extends o.r {
    @Override // o.r, android.view.Menu
    public android.view.SubMenu addSubMenu(int i17, int i18, int i19, java.lang.CharSequence charSequence) {
        o.u uVar = (o.u) a(i17, i18, i19, charSequence);
        fa.v vVar = new fa.v(this.f341780d, this, uVar);
        uVar.f341818u = vVar;
        vVar.setHeaderTitle(uVar.f341808h);
        return vVar;
    }
}
