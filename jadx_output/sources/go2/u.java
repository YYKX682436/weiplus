package go2;

/* loaded from: classes2.dex */
public final class u implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.z f274067d;

    public u(go2.z zVar) {
        this.f274067d = zVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent();
        int itemId = menuItem.getItemId();
        go2.z zVar = this.f274067d;
        if (itemId == 1) {
            intent.putExtra("key_finder_post_router", 2);
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            android.app.Activity context = zVar.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var, 1, "post_acionsheet_camera", "", nyVar != null ? nyVar.V6() : null, null, 16, null);
        } else if (itemId == 2) {
            intent.putExtra("key_finder_post_router", 3);
            intent.putExtra("key_maas_entrance", 2);
            i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) c18;
            android.app.Activity context2 = zVar.getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var2, 1, "post_actionsheet_album", "", nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
        } else if (itemId == 4) {
            intent.putExtra("key_finder_post_router", 16);
        } else if (zVar.F.containsKey(java.lang.Integer.valueOf(menuItem.getItemId()))) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.i1.f460495a.a(zVar.getActivity(), (r45.xa5) zVar.F.get(java.lang.Integer.valueOf(menuItem.getItemId())));
        }
        intent.putExtra("key_finder_post_from", 24);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.b().j());
        sb6.append('_');
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        p2Var.T(sb7, null);
        p2Var.W(p2Var.i(zVar.getContext(), 29, false));
        intent.putExtra("key_finder_post_id", sb7);
        intent.putExtra("KEY_FINDER_MEMBER_VIDEO", true);
        intent.putExtra("KEY_FINDER_ACTION_BAR_TITLE", zVar.getContext().getResources().getString(com.tencent.mm.R.string.ena));
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).gk(zVar.getContext(), intent);
    }
}
