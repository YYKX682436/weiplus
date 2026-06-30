package uf5;

/* loaded from: classes4.dex */
public class o0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uf5.p0 f427279e;

    public o0(uf5.p0 p0Var, java.lang.String str) {
        this.f427279e = p0Var;
        this.f427278d = str;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", this.f427278d);
        intent.putExtra("view_mode", true);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.m(intent, this.f427279e.f427282d.getContext());
    }
}
