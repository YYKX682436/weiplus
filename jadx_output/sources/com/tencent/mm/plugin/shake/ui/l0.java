package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f162304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI f162305e;

    public l0(com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI shakeSayHiListUI, android.view.View view) {
        this.f162305e = shakeSayHiListUI;
        this.f162304d = view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeSayHiListUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI shakeSayHiListUI = this.f162305e;
        int i17 = shakeSayHiListUI.f162215g + 8;
        shakeSayHiListUI.f162215g = i17;
        com.tencent.mm.plugin.shake.ui.g gVar = shakeSayHiListUI.f162213e;
        gVar.c();
        gVar.f162265p = i17;
        gVar.q();
        if (shakeSayHiListUI.f162216h <= shakeSayHiListUI.f162215g) {
            shakeSayHiListUI.f162214f.removeFooterView(this.f162304d);
            int i18 = shakeSayHiListUI.f162215g;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeSayHiListUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
