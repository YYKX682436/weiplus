package px0;

/* loaded from: classes5.dex */
public final class g implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f358776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment f358777e;

    public g(com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment) {
        this.f358776d = k0Var;
        this.f358777e = materialImportPreviewFragment;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        this.f358776d.u();
        if (menuItem.getItemId() == 1000) {
            com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment = this.f358777e;
            materialImportPreviewFragment.l0();
            materialImportPreviewFragment.m0("aigc_reminder_complete_half_screen", true, "aigc_reminder_complete_clk", 1);
        }
    }
}
