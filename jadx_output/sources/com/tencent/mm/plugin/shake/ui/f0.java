package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f162262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeMsgListUI f162263e;

    public f0(com.tencent.mm.plugin.shake.ui.ShakeMsgListUI shakeMsgListUI, android.view.View view) {
        this.f162263e = shakeMsgListUI;
        this.f162262d = view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeMsgListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.shake.ui.ShakeMsgListUI shakeMsgListUI = this.f162263e;
        int i17 = shakeMsgListUI.f162106h + 8;
        shakeMsgListUI.f162106h = i17;
        com.tencent.mm.plugin.shake.ui.a0 a0Var = shakeMsgListUI.f162103e;
        a0Var.c();
        a0Var.f162237q = i17;
        a0Var.q();
        if (shakeMsgListUI.f162107i <= shakeMsgListUI.f162106h) {
            shakeMsgListUI.f162104f.removeFooterView(this.f162262d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeMsgListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
