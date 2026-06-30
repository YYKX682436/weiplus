package or1;

/* loaded from: classes.dex */
public class x implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI f347593d;

    public x(com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI brandServiceIndexUI) {
        this.f347593d = brandServiceIndexUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI brandServiceIndexUI = this.f347593d;
        if (itemId == 1) {
            int i18 = com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI.f93993p;
            brandServiceIndexUI.getClass();
            if (!com.tencent.mm.plugin.websearch.l2.h(0)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BrandService.BrandServiceIndexUI", "fts h5 template not avail");
                return;
            }
            ((com.tencent.mm.plugin.websearch.p2) ((su4.g1) i95.n0.c(su4.g1.class))).Bi(com.tencent.mm.sdk.platformtools.x2.f193071a, new or1.y(brandServiceIndexUI));
            return;
        }
        if (menuItem.getItemId() == 2) {
            int i19 = com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI.f93993p;
            brandServiceIndexUI.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("intent_service_type", brandServiceIndexUI.f93996f);
            j45.l.j(brandServiceIndexUI, "brandservice", ".ui.userinfo.ui.BrandServiceUserInfoManageUI", intent, null);
            return;
        }
        if (menuItem.getItemId() == 3) {
            int i27 = com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI.f93993p;
            java.lang.String string = brandServiceIndexUI.getContext().getResources().getString(com.tencent.mm.R.string.amk);
            java.lang.String string2 = brandServiceIndexUI.getContext().getResources().getString(com.tencent.mm.R.string.anh);
            java.lang.String string3 = brandServiceIndexUI.getContext().getResources().getString(com.tencent.mm.R.string.ang);
            wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
            or1.z zVar = new or1.z(brandServiceIndexUI);
            ((vd0.j2) q1Var).getClass();
            v24.o0.g(brandServiceIndexUI, string, string2, string3, zVar);
        }
    }
}
