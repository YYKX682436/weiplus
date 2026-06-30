package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.CommentHeaderCollapsibleExpandButton f132128d;

    public g0(com.tencent.mm.plugin.finder.view.CommentHeaderCollapsibleExpandButton commentHeaderCollapsibleExpandButton) {
        this.f132128d = commentHeaderCollapsibleExpandButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/CommentHeaderCollapsibleExpandButton$onFinishInflate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a onExpandListener = this.f132128d.getOnExpandListener();
        if (onExpandListener != null) {
            onExpandListener.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/CommentHeaderCollapsibleExpandButton$onFinishInflate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
