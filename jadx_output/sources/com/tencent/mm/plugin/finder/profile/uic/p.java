package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class p implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.o0 f124099a;

    public p(com.tencent.mm.plugin.finder.profile.uic.o0 o0Var) {
        this.f124099a = o0Var;
    }

    @Override // db5.r4
    public final void a(android.view.View view, int i17, android.view.MenuItem menuItem) {
        if (menuItem.getItemId() == 10002) {
            kotlin.jvm.internal.o.d(view);
            jz5.l[] lVarArr = new jz5.l[5];
            com.tencent.mm.plugin.finder.profile.uic.o0 o0Var = this.f124099a;
            lVarArr[0] = new jz5.l("source_feedid", pm0.v.u(o0Var.b7()));
            lVarArr[1] = new jz5.l("source_feed_sessionbuffer", (java.lang.String) ((jz5.n) o0Var.D).getValue());
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            lVarArr[2] = new jz5.l("finder_tab_context_id", b52.b.c());
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            lVarArr[3] = new jz5.l("finder_context_id", b52.b.b());
            androidx.appcompat.app.AppCompatActivity context = o0Var.getActivity();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            lVarArr[4] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
            hc2.v0.e(view, "recommend_to_friends", 8, 0, false, true, kz5.c1.k(lVarArr), null, 76, null);
        }
    }
}
