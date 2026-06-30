package com.tencent.mm.plugin.finder.member.question;

/* loaded from: classes2.dex */
public final class d extends com.tencent.mm.plugin.finder.view.mj {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.question.s f121322e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.finder.member.question.s sVar, com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout) {
        super(rlLayout);
        kotlin.jvm.internal.o.g(rlLayout, "rlLayout");
        this.f121322e = sVar;
    }

    @Override // com.tencent.mm.plugin.finder.view.mj
    public int a() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f132666d.getRecyclerView();
        androidx.recyclerview.widget.f2 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter != null) {
            return wxRecyclerAdapter.a0();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    @Override // com.tencent.mm.plugin.finder.view.mj
    public void b() {
        com.tencent.mm.plugin.finder.member.question.s sVar = this.f121322e;
        if (sVar.f121346f.getDataList().size() > sVar.f121346f.f107516h) {
            com.tencent.mm.plugin.finder.member.question.w wVar = sVar.f121347g;
            if (wVar != null) {
                wVar.j(false, sVar.f121350m);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.member.question.w wVar2 = sVar.f121347g;
        if (wVar2 != null) {
            android.view.View view = wVar2.f121382s;
            if (view == null) {
                kotlin.jvm.internal.o.o("footer");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "hideFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "hideFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
