package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class v60 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f136213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f136214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.x60 f136215f;

    public v60(java.util.List list, yz5.l lVar, com.tencent.mm.plugin.finder.viewmodel.component.x60 x60Var) {
        this.f136213d = list;
        this.f136214e = lVar;
        this.f136215f = x60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedSelectorPanelViewModel$setupSpeedTextViews$onClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) tag).floatValue();
        for (android.widget.TextView textView : this.f136213d) {
            if (kotlin.jvm.internal.o.b(textView, view)) {
                if (textView != null) {
                    textView.setTextColor(this.f136215f.f136405b.getResources().getColor(com.tencent.mm.R.color.f478502m));
                }
            } else if (textView != null) {
                textView.setTextColor(-1);
            }
        }
        yz5.l lVar = this.f136214e;
        if (lVar != null) {
            lVar.invoke(java.lang.Float.valueOf(floatValue));
        }
        com.tencent.mm.plugin.finder.viewmodel.component.x60.c(this.f136215f, false, false, floatValue, 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedSelectorPanelViewModel$setupSpeedTextViews$onClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
