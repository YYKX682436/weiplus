package px0;

/* loaded from: classes5.dex */
public final class d implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f358769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment f358770e;

    public d(com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment) {
        this.f358769d = k0Var;
        this.f358770e = materialImportPreviewFragment;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        yx0.b8 f69557v;
        this.f358769d.u();
        int itemId = menuItem.getItemId();
        com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment = this.f358770e;
        if (itemId != 1001) {
            if (itemId != 1002) {
                return;
            }
            materialImportPreviewFragment.l0();
            materialImportPreviewFragment.m0("aigc_give_up_generation_half_screen", true, "aigc_give_up_generation_clk", 1);
            return;
        }
        int i18 = com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment.f69642z;
        if (materialImportPreviewFragment.isAdded() && !materialImportPreviewFragment.isDetached() && !materialImportPreviewFragment.isRemoving()) {
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = materialImportPreviewFragment.f69653q;
            if (shootComposingPluginLayout != null && (f69557v = shootComposingPluginLayout.getF69557v()) != null) {
                f69557v.p(com.tencent.maas.camstudio.MJAIGCCancelReason.UserAbandon);
            }
            androidx.fragment.app.i2 beginTransaction = materialImportPreviewFragment.getParentFragmentManager().beginTransaction();
            beginTransaction.j(materialImportPreviewFragment);
            beginTransaction.g();
            if (shootComposingPluginLayout != null) {
                shootComposingPluginLayout.J0();
            }
        }
        materialImportPreviewFragment.m0("aigc_give_up_generation_half_screen", true, "aigc_give_up_generation_clk", 2);
    }
}
