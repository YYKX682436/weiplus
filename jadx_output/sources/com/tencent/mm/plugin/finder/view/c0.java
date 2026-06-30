package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.CollapsibleTextView f131743d;

    public c0(com.tencent.mm.plugin.finder.view.CollapsibleTextView collapsibleTextView) {
        this.f131743d = collapsibleTextView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/CollapsibleTextView$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.CollapsibleTextView collapsibleTextView = this.f131743d;
        yz5.a onExpandBtnClickListener = collapsibleTextView.getOnExpandBtnClickListener();
        if (onExpandBtnClickListener != null) {
            onExpandBtnClickListener.invoke();
        }
        collapsibleTextView.setExpand(!collapsibleTextView.f130822r);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/CollapsibleTextView$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
