package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class t6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f133090d;

    public t6(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f133090d = finderCommentFooter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.FinderCommentFooter.c(this.f133090d, true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
