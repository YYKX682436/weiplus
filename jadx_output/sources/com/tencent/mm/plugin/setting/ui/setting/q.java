package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.i0 f161457d;

    public q(com.tencent.mm.plugin.setting.ui.setting.i0 i0Var) {
        this.f161457d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/ColorSelfQRCodeGradientFgWhiteBgUIC$attachChangeStyleButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.i0 i0Var = this.f161457d;
        int W6 = i0Var.W6();
        v24.e eVar = i0Var.f161306d;
        if (eVar != null) {
            v24.e.c(eVar, 12, W6, null, null, 0, 28, null);
        }
        i0Var.O6(true);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/ColorSelfQRCodeGradientFgWhiteBgUIC$attachChangeStyleButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
