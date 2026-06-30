package tj3;

/* loaded from: classes14.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tj3.h f419728d;

    public c(tj3.h hVar) {
        this.f419728d = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.multitalk.ui.b0 viewModel;
        com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout cameraSwitcher;
        com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout cameraSwitcher2;
        boolean booleanValue;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/avatar_view/MultiTalkAvatarControlLayout$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tj3.h hVar = this.f419728d;
        viewModel = hVar.getViewModel();
        if (kotlin.jvm.internal.o.b(viewModel.f150263n.getValue(), java.lang.Boolean.TRUE)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkUIViewModel", "onSwitchCameraClick: switchCam");
            com.tencent.mm.plugin.multitalk.model.e3.wi().a();
            boolean d17 = com.tencent.mm.plugin.multitalk.model.e3.wi().d();
            androidx.lifecycle.j0 j0Var = viewModel.f150270u;
            androidx.lifecycle.g0 g0Var = viewModel.f150271v;
            if (d17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSwitchCameraClick: backCamVBState ");
                sb6.append(viewModel.f150269t);
                sb6.append(", ");
                java.lang.Boolean bool = (java.lang.Boolean) g0Var.getValue();
                if (bool == null) {
                    bool = java.lang.Boolean.FALSE;
                }
                sb6.append(bool.booleanValue());
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkUIViewModel", sb6.toString());
                java.lang.Boolean bool2 = (java.lang.Boolean) g0Var.getValue();
                booleanValue = bool2 != null ? bool2.booleanValue() : false;
                viewModel.f150269t = booleanValue;
                java.util.Map miniInfoHolder = com.tencent.mm.plugin.multitalk.model.e3.Ri().V;
                kotlin.jvm.internal.o.f(miniInfoHolder, "miniInfoHolder");
                ((java.util.HashMap) miniInfoHolder).put("back_cam_vb", java.lang.Boolean.valueOf(booleanValue));
                j0Var.postValue(java.lang.Boolean.valueOf(viewModel.f150268s));
                com.tencent.mm.plugin.multitalk.model.a2 n17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n();
                if (n17 != null) {
                    n17.i(viewModel.f150268s);
                }
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onSwitchCameraClick: frontCamVBState ");
                sb7.append(viewModel.f150268s);
                sb7.append(", ");
                java.lang.Boolean bool3 = (java.lang.Boolean) g0Var.getValue();
                if (bool3 == null) {
                    bool3 = java.lang.Boolean.FALSE;
                }
                sb7.append(bool3.booleanValue());
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkUIViewModel", sb7.toString());
                java.lang.Boolean bool4 = (java.lang.Boolean) g0Var.getValue();
                booleanValue = bool4 != null ? bool4.booleanValue() : false;
                viewModel.f150268s = booleanValue;
                java.util.Map miniInfoHolder2 = com.tencent.mm.plugin.multitalk.model.e3.Ri().V;
                kotlin.jvm.internal.o.f(miniInfoHolder2, "miniInfoHolder");
                ((java.util.HashMap) miniInfoHolder2).put("front_cam_vb", java.lang.Boolean.valueOf(booleanValue));
                j0Var.postValue(java.lang.Boolean.valueOf(viewModel.f150269t));
                com.tencent.mm.plugin.multitalk.model.a2 n18 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n();
                if (n18 != null) {
                    n18.i(viewModel.f150269t);
                }
            }
            com.tencent.mm.plugin.multitalk.model.u0.a(7);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.MT.MultiTalkUIViewModel", "onSwitchCameraClick: cam not open");
        }
        if (com.tencent.mm.plugin.multitalk.model.e3.wi().d()) {
            cameraSwitcher2 = hVar.getCameraSwitcher();
            android.content.Context context = hVar.getContext();
            cameraSwitcher2.setContentDescription(context != null ? context.getString(com.tencent.mm.R.string.h1s) : null);
        } else {
            cameraSwitcher = hVar.getCameraSwitcher();
            android.content.Context context2 = hVar.getContext();
            cameraSwitcher.setContentDescription(context2 != null ? context2.getString(com.tencent.mm.R.string.f492580h11) : null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/avatar_view/MultiTalkAvatarControlLayout$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
