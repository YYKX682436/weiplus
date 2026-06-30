package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class t7 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f161565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI f161566e;

    public t7(com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI) {
        this.f161566e = settingsAuthUI;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI = this.f161566e;
        com.tencent.mm.plugin.setting.ui.setting.l7 l7Var = settingsAuthUI.f160335n;
        boolean z17 = false;
        if (l7Var != null && l7Var.x()) {
            z17 = true;
        }
        float f17 = 0.0f;
        if (z17) {
            settingsAuthUI.getMMTitleView().setAlpha(0.0f);
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        int i19 = this.f161565d + i18;
        this.f161565d = i19;
        if (i19 >= settingsAuthUI.f160331g) {
            f17 = i19 > settingsAuthUI.f160332h ? 1.0f : ((i19 - r9) * 1.0f) / (r4 - r9);
        }
        settingsAuthUI.getMMTitleView().setAlpha(f17);
        java.lang.Integer num = settingsAuthUI.f160337p;
        kotlin.jvm.internal.o.d(num);
        settingsAuthUI.setActionbarColor(com.tencent.mm.ui.uk.a(num.intValue(), (int) (f17 * 100)));
        com.tencent.mm.ui.ga controller = settingsAuthUI.getController();
        java.lang.Integer num2 = settingsAuthUI.f160337p;
        kotlin.jvm.internal.o.d(num2);
        controller.G0(num2.intValue());
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$onCreate$3$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
