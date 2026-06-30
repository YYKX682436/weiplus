package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.f0 f121207d;

    public d0(com.tencent.mm.plugin.finder.member.preview.f0 f0Var) {
        this.f121207d = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewPayUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.member.preview.f0.V6(this.f121207d, null, null, 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewPayUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
