package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class m2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.s2 f132627d;

    public m2(com.tencent.mm.plugin.finder.view.s2 s2Var) {
        this.f132627d = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.s2 s2Var = this.f132627d;
        yz5.a aVar = s2Var.f133008p;
        if (aVar != null) {
            aVar.invoke();
        }
        s2Var.f133002j = 4;
        s2Var.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
