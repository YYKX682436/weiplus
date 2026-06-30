package com.tencent.mm.plugin.finder.member.all;

/* loaded from: classes2.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.all.q f121103d;

    public p(com.tencent.mm.plugin.finder.member.all.q qVar) {
        this.f121103d = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback$showError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f121103d.f121105e.f121090f.requestRefresh();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback$showError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
