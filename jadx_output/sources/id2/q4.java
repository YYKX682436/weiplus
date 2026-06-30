package id2;

/* loaded from: classes8.dex */
public final class q4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.s4 f290766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f290767e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f290768f;

    public q4(id2.s4 s4Var, android.app.Activity activity, yz5.l lVar) {
        this.f290766d = s4Var;
        this.f290767e = activity;
        this.f290768f = lVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
            id2.s4 s4Var = this.f290766d;
            java.lang.String str = s4Var.f290797e;
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            a4Var.b(str, b52.b.b(), "person_page_more_recent_switch_pop_close_clear", "");
            id2.s4.O6(s4Var, 5, new id2.p4(this.f290767e, this.f290768f));
        }
    }
}
