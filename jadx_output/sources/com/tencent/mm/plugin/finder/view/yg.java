package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class yg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPostFooter f133393d;

    public yg(com.tencent.mm.plugin.finder.view.FinderPostFooter finderPostFooter) {
        this.f133393d = finderPostFooter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPostFooter$onFinishInflate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.ImageView");
        java.lang.Object tag = ((android.widget.ImageView) view).getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Boolean");
        boolean z17 = !((java.lang.Boolean) tag).booleanValue();
        int i17 = com.tencent.mm.plugin.finder.view.FinderPostFooter.f131363s;
        this.f133393d.b(z17, true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPostFooter$onFinishInflate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
