package pr1;

/* loaded from: classes9.dex */
public class f implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView f357938d;

    public f(com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView) {
        this.f357938d = brandServiceSortView;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView = this.f357938d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(brandServiceSortView.f94052w)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceSortView", "username is null or nil.");
            return;
        }
        if (menuItem.getItemId() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceSortView", "Menu Item selected, pos(%d)", java.lang.Integer.valueOf(i17));
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(brandServiceSortView.f94052w, true);
            qk.o b17 = r01.z.b(brandServiceSortView.f94052w);
            android.content.Context context = brandServiceSortView.getContext();
            int groupId = menuItem.getGroupId();
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceSortView", "showRemoveBizAlertDialog");
            if (b17 == null || context == null || !(context instanceof android.app.Activity) || n17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BrandServiceSortView", "bizInfo(%s) or context(%s) or contact(%s) is null", b17, context, n17);
                return;
            }
            qk.n6 n6Var = (qk.n6) i95.n0.c(qk.n6.class);
            pr1.g gVar = new pr1.g(brandServiceSortView, groupId);
            ((com.tencent.mm.app.o7) n6Var).getClass();
            com.tencent.mm.ui.tools.n1.b(b17, (android.app.Activity) context, n17, false, gVar, 0);
        }
    }
}
