package tj3;

/* loaded from: classes14.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tj3.h f419730d;

    public d(tj3.h hVar) {
        this.f419730d = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.multitalk.ui.b0 viewModel;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/avatar_view/MultiTalkAvatarControlLayout$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        viewModel = this.f419730d.getViewModel();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onVirtualBackgroundClick: cut state: ");
        androidx.lifecycle.g0 g0Var = viewModel.f150271v;
        sb6.append(g0Var.getValue());
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkUIViewModel", sb6.toString());
        java.lang.Boolean bool = (java.lang.Boolean) g0Var.getValue();
        if (bool == null) {
            bool = java.lang.Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        com.tencent.mm.plugin.multitalk.model.a2 n17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n();
        if (n17 != null) {
            n17.i(!booleanValue);
        }
        boolean z17 = !booleanValue;
        viewModel.f150270u.postValue(java.lang.Boolean.valueOf(z17));
        if (com.tencent.mm.plugin.multitalk.model.e3.wi().d()) {
            viewModel.f150268s = z17;
            java.util.Map miniInfoHolder = com.tencent.mm.plugin.multitalk.model.e3.Ri().V;
            kotlin.jvm.internal.o.f(miniInfoHolder, "miniInfoHolder");
            ((java.util.HashMap) miniInfoHolder).put("front_cam_vb", java.lang.Boolean.valueOf(z17));
        } else {
            viewModel.f150269t = z17;
            java.util.Map miniInfoHolder2 = com.tencent.mm.plugin.multitalk.model.e3.Ri().V;
            kotlin.jvm.internal.o.f(miniInfoHolder2, "miniInfoHolder");
            ((java.util.HashMap) miniInfoHolder2).put("back_cam_vb", java.lang.Boolean.valueOf(z17));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/avatar_view/MultiTalkAvatarControlLayout$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
