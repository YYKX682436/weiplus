package me5;

/* loaded from: classes4.dex */
public class i implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f325964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f325965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ me5.j f325966f;

    public i(me5.j jVar, com.tencent.mm.ui.widget.dialog.k0 k0Var, android.content.Context context) {
        this.f325966f = jVar;
        this.f325964d = k0Var;
        this.f325965e = context;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        this.f325964d.u();
        int itemId = menuItem.getItemId();
        me5.j jVar = this.f325966f;
        if (itemId == 100) {
            me5.n nVar = jVar.f325976q;
            java.lang.String str = jVar.f325970h;
            nVar.getClass();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(str);
            nVar.d(-1L, linkedList, 0);
            return;
        }
        if (itemId != 101) {
            return;
        }
        me5.n nVar2 = jVar.f325976q;
        java.lang.String str2 = jVar.f325971i;
        java.lang.String str3 = jVar.f325969g;
        java.lang.String str4 = jVar.f325972m;
        nVar2.getClass();
        android.content.Context context = this.f325965e;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        k0Var.r(com.tencent.mm.sdk.platformtools.t8.z1(context.getString(com.tencent.mm.R.string.ayd, str3), new java.lang.Object[0]), 17, i65.a.b(context, 14), null);
        k0Var.f211872n = new me5.k(nVar2, context);
        k0Var.f211881s = new me5.m(nVar2, str2, str4, context, k0Var);
        k0Var.v();
    }
}
