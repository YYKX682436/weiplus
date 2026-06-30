package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.c0 f121298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f121299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f121300f;

    public y(com.tencent.mm.plugin.finder.member.preview.c0 c0Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, int i17) {
        this.f121298d = c0Var;
        this.f121299e = finderItem;
        this.f121300f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewHeaderUIC$updateCurLive$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.member.preview.c0 c0Var = this.f121298d;
        if (((r45.tr0) c0Var.f255580d) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewHeaderUIC$updateCurLive$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Jk(c0Var.getContext(), this.f121299e, this.f121300f, "206");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewHeaderUIC$updateCurLive$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
