package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes3.dex */
public final class z3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.UniCommentFooter f130471d;

    public z3(com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter) {
        this.f130471d = uniCommentFooter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$onFinishInflate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.ImageView");
        kotlin.jvm.internal.o.e(((android.widget.ImageView) view).getTag(), "null cannot be cast to non-null type kotlin.Boolean");
        com.tencent.mm.plugin.finder.uniComments.UniCommentFooter.c(this.f130471d, !((java.lang.Boolean) r7).booleanValue());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$onFinishInflate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
