package px0;

/* loaded from: classes5.dex */
public final class h implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment f358778d;

    public h(com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment) {
        this.f358778d = materialImportPreviewFragment;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        int i17 = com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment.f69642z;
        this.f358778d.m0("aigc_reminder_complete_half_screen", true, "aigc_reminder_complete_clk", 2);
    }
}
