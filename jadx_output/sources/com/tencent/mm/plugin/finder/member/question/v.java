package com.tencent.mm.plugin.finder.member.question;

/* loaded from: classes2.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.question.w f121360d;

    public v(com.tencent.mm.plugin.finder.member.question.w wVar) {
        this.f121360d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback$showError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f121360d.f121371e.f121346f.requestRefresh();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback$showError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
