package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes5.dex */
public class n5 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f157848d;

    public n5(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, android.widget.TextView textView) {
        this.f157848d = textView;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$47", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.widget.TextView textView = this.f157848d;
        rl5.r rVar = new rl5.r(textView.getContext(), textView);
        rVar.f397351u = new com.tencent.mm.plugin.remittance.ui.k5(this);
        rVar.f397354x = new com.tencent.mm.plugin.remittance.ui.l5(this);
        rVar.L = new com.tencent.mm.plugin.remittance.ui.m5(this);
        rVar.n(0, 0);
        yj0.a.i(false, this, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$47", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
