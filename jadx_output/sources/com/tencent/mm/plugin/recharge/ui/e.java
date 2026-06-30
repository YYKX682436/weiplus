package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.k f155153d;

    public e(com.tencent.mm.plugin.recharge.ui.k kVar) {
        this.f155153d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/MallEditText$MobileHistoryAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        us3.e.Ai().Ni(null);
        com.tencent.mm.plugin.recharge.ui.k kVar = this.f155153d;
        kVar.f155200i.setInput(null);
        com.tencent.mm.plugin.recharge.ui.MallEditText mallEditText = kVar.f155200i;
        com.tencent.mm.plugin.recharge.ui.k kVar2 = mallEditText.f155089m;
        kVar2.f155197f = new java.util.LinkedList();
        ((java.util.ArrayList) kVar2.f155195d).clear();
        kVar2.f155196e = false;
        mallEditText.f155089m.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/MallEditText$MobileHistoryAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
