package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class ez implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.iz f134307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.j0 f134308b;

    public ez(com.tencent.mm.plugin.finder.viewmodel.component.iz izVar, so2.j0 j0Var) {
        this.f134307a = izVar;
        this.f134308b = j0Var;
    }

    @Override // db5.r4
    public final void a(android.view.View view, int i17, android.view.MenuItem menuItem) {
        java.lang.String str;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            str = "collection_card_nointerest";
        } else if (itemId != 2) {
            return;
        } else {
            str = "close_continue_watch";
        }
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, str);
        aVar.ik(view, com.tencent.mm.plugin.appbrand.jsapi.share.f0.CTRL_INDEX, 25496);
        androidx.appcompat.app.AppCompatActivity context = this.f134307a.getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
        lVarArr[1] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
        r45.vx0 vx0Var = (r45.vx0) this.f134308b.f410438d.getCustom(0);
        lVarArr[2] = new jz5.l("collection_id", pm0.v.u(vx0Var != null ? vx0Var.getLong(0) : 0L));
        aVar.gk(view, kz5.c1.k(lVarArr));
    }
}
