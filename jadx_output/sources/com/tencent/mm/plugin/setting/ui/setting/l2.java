package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes3.dex */
public class l2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI f161265d;

    public l2(com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI) {
        this.f161265d = selfQRCodeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI.U6(this.f161265d);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
