package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class tl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.FinderTagView f133135d;

    public tl(com.tencent.mm.plugin.finder.view.FinderTagView tagView) {
        kotlin.jvm.internal.o.g(tagView, "tagView");
        this.f133135d = tagView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderTagView$flodOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.FinderTagView finderTagView = this.f133135d;
        finderTagView.getTagLayout().post(new com.tencent.mm.plugin.finder.view.ul(finderTagView));
        finderTagView.b();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderTagView$flodOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
