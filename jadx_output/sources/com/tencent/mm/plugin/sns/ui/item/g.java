package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class g implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f169338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem f169339e;

    public g(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem baseTimeLineItem, android.view.View view) {
        this.f169339e = baseTimeLineItem;
        this.f169338d = view;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$9");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int[] iArr = new int[2];
        if (view.getTag(com.tencent.mm.R.id.ohu) instanceof int[]) {
            iArr = (int[]) view.getTag(com.tencent.mm.R.id.ohu);
        }
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem baseTimeLineItem = this.f169339e;
        rl5.r d17 = baseTimeLineItem.f169251h.d();
        android.view.View view2 = this.f169338d;
        com.tencent.mm.plugin.sns.ui.listener.i iVar = baseTimeLineItem.f169251h.f168039e;
        d17.h(view2, iVar.f169822y, iVar.f169809l, iArr[0], iArr[1]);
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$9");
        return true;
    }
}
