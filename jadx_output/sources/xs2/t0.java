package xs2;

/* loaded from: classes.dex */
public final class t0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.z12 f456381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f456382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f456383f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f456384g;

    public t0(r45.z12 z12Var, yz5.l lVar, gk2.e eVar, android.content.Context context) {
        this.f456381d = z12Var;
        this.f456382e = lVar;
        this.f456383f = eVar;
        this.f456384g = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        r45.z12 z12Var = this.f456381d;
        if (itemId != 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select msg:");
            r45.t12 t12Var = (r45.t12) z12Var.getCustom(0);
            sb6.append(t12Var != null ? t12Var.getString(0) : null);
            sb6.append('-');
            r45.t12 t12Var2 = (r45.t12) z12Var.getCustom(0);
            sb6.append(t12Var2 != null ? t12Var2.getString(2) : null);
            sb6.append(",but do nothing!");
            com.tencent.mars.xlog.Log.i("ReplayBulletPopupHelper", sb6.toString());
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("complain msg:");
        r45.t12 t12Var3 = (r45.t12) z12Var.getCustom(0);
        sb7.append(t12Var3 != null ? t12Var3.getString(0) : null);
        sb7.append('-');
        r45.t12 t12Var4 = (r45.t12) z12Var.getCustom(0);
        sb7.append(t12Var4 != null ? t12Var4.getString(2) : null);
        com.tencent.mars.xlog.Log.i("ReplayBulletPopupHelper", sb7.toString());
        r45.un1 un1Var = new r45.un1();
        un1Var.set(1, db2.t4.f228171a.a(10297));
        gk2.e eVar = this.f456383f;
        un1Var.set(2, java.lang.Long.valueOf(((ct2.j) eVar.a(ct2.j.class)).Q6()));
        un1Var.set(3, java.lang.Long.valueOf(((ct2.j) eVar.a(ct2.j.class)).O6()));
        un1Var.set(4, z12Var.getString(1));
        r45.t12 t12Var5 = (r45.t12) z12Var.getCustom(0);
        un1Var.set(5, java.lang.Long.valueOf(t12Var5 != null ? t12Var5.getLong(5) : 0L));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 10297;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivecomplainreplaymsg";
        lVar.f70664a = un1Var;
        lVar.f70665b = new r45.vn1();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        az2.j jVar = (az2.j) wi6;
        az2.j.u(jVar, this.f456384g, null, 0L, 6, null);
        pq5.g l17 = jVar.l();
        if (l17 != null) {
            android.content.Context context = this.f456384g;
            l17.K(new xs2.s0(context));
            if (context instanceof com.tencent.mm.ui.MMActivity) {
                l17.f((im5.b) context);
            }
        }
        this.f456382e.invoke(java.lang.Integer.valueOf(menuItem.getItemId()));
    }
}
