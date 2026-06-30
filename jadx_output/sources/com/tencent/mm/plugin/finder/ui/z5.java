package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class z5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.q21 f130079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderFansListUI f130080e;

    public z5(r45.q21 q21Var, com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI) {
        this.f130079d = q21Var;
        this.f130080e = finderFansListUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String string;
        if (menuItem.getItemId() != 1001 || (string = this.f130079d.getString(2)) == null) {
            return;
        }
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.report.o3.Mj((com.tencent.mm.plugin.finder.report.o3) c17, context, 8L, 3L, false, 0, 0, null, 120, null);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.tencent.mm.plugin.finder.ui.y5 y5Var = new com.tencent.mm.plugin.finder.ui.y5(this.f130080e);
        hb2.c cVar = hb2.c.f280027e;
        cVar.getClass();
        r45.lt2 lt2Var = new r45.lt2();
        lt2Var.set(0, string);
        hb2.w0.m(cVar, lt2Var, y5Var, false, false, null, null, 60, null);
    }
}
