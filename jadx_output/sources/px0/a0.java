package px0;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment f358765d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment) {
        super(0);
        this.f358765d = materialImportPreviewFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        int i17 = com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment.f69642z;
        com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment = this.f358765d;
        android.content.Context context = materialImportPreviewFragment.getContext();
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = null;
        if (context == null) {
            k0Var = null;
        } else {
            k0Var = new com.tencent.mm.ui.widget.dialog.k0(materialImportPreviewFragment.requireContext(), 1, false);
            k0Var.f211872n = new px0.c(context, materialImportPreviewFragment);
            k0Var.f211881s = new px0.d(k0Var, materialImportPreviewFragment);
            k0Var.f211860g = new px0.e(materialImportPreviewFragment);
        }
        if (k0Var != null) {
            k0Var.v();
            materialImportPreviewFragment.m0("aigc_give_up_generation_half_screen", false, "", 0);
            k0Var2 = k0Var;
        }
        materialImportPreviewFragment.f69657u = k0Var2;
        return jz5.f0.f302826a;
    }
}
