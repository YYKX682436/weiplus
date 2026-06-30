package me5;

/* loaded from: classes4.dex */
public class m implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f325980f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f325981g;

    public m(me5.n nVar, java.lang.String str, java.lang.String str2, android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f325978d = str;
        this.f325979e = str2;
        this.f325980f = context;
        this.f325981g = k0Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 101) {
            vg3.i3 i3Var = new vg3.i3();
            i3Var.f436712d = this.f325978d;
            i3Var.f436718m = this.f325979e;
            i3Var.f436720o = 2;
            vg3.k3 k3Var = (vg3.k3) i95.n0.c(vg3.k3.class);
            ((hn.s) k3Var).wi(this.f325980f, i3Var, new me5.l(this));
            this.f325981g.u();
        }
    }
}
