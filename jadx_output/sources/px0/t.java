package px0;

/* loaded from: classes5.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment f358809d;

    public t(com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment) {
        this.f358809d = materialImportPreviewFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/fragment/MaterialImportPreviewFragment$onCreateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment = this.f358809d;
        if (materialImportPreviewFragment.f69655s.length() == 0) {
            com.tencent.mars.xlog.Log.i("MaterialImportPreviewFragment", "onRemindClick return for " + materialImportPreviewFragment.f69655s);
            yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/fragment/MaterialImportPreviewFragment$onCreateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(materialImportPreviewFragment.requireContext(), 1, true);
        k0Var.q(i65.a.r(materialImportPreviewFragment.requireContext(), com.tencent.mm.R.string.f493132oi2), 17);
        k0Var.f211872n = px0.f.f358774d;
        k0Var.f211881s = new px0.g(k0Var, materialImportPreviewFragment);
        k0Var.f211860g = new px0.h(materialImportPreviewFragment);
        materialImportPreviewFragment.f69658v = k0Var;
        k0Var.v();
        materialImportPreviewFragment.m0("aigc_reminder_complete_half_screen", false, "", 0);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/fragment/MaterialImportPreviewFragment$onCreateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
