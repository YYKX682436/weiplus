package ya2;

/* loaded from: classes.dex */
public final class o implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f460515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f460516e;

    public o(int i17, yz5.l lVar, android.content.Context context) {
        this.f460515d = lVar;
        this.f460516e = context;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            yz5.l lVar = this.f460515d;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.content.Context context = this.f460516e;
            kotlin.jvm.internal.o.g(context, "context");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_SELF_CONTINUE_WATCH_INT_SYNC, 0);
            hb2.e eVar = hb2.e.f280035e;
            ya2.m mVar = new ya2.m(context);
            eVar.getClass();
            r45.mh2 mh2Var = new r45.mh2();
            mh2Var.set(0, 2);
            hb2.w0.m(eVar, mh2Var, mVar, false, false, null, null, 60, null);
        }
    }
}
