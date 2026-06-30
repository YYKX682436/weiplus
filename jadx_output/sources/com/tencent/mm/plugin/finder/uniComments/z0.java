package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f130468d;

    public z0(com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter) {
        this.f130468d = textStatusCommentFooter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/TextStatusCommentFooter$onFinishInflate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter = this.f130468d;
        android.content.Context context = textStatusCommentFooter.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter.N;
        new com.tencent.mm.plugin.finder.ui.at.q(context, bool, com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter.N, new com.tencent.mm.plugin.finder.uniComments.y0(textStatusCommentFooter)).show();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/TextStatusCommentFooter$onFinishInflate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
