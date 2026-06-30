package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class sl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.FinderTagView f133061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderTagView f133062e;

    public sl(com.tencent.mm.plugin.finder.view.FinderTagView finderTagView, com.tencent.mm.plugin.finder.view.FinderTagView tagView) {
        kotlin.jvm.internal.o.g(tagView, "tagView");
        this.f133062e = finderTagView;
        this.f133061d = tagView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderTagView$expandOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.FinderTagView finderTagView = this.f133061d;
        if (finderTagView.isFolded) {
            java.util.Iterator it = finderTagView.foldedView.iterator();
            while (it.hasNext()) {
                finderTagView.getTagLayout().addView((android.view.View) it.next());
            }
            finderTagView.foldedView.clear();
            finderTagView.isFolded = false;
            finderTagView.b();
            yz5.a aVar = finderTagView.onExpandListener;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        this.f133062e.setClickExpand(1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderTagView$expandOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
