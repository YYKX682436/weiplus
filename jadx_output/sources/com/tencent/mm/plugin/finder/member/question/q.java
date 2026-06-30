package com.tencent.mm.plugin.finder.member.question;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.question.s f121342d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.finder.member.question.s sVar) {
        super(1);
        this.f121342d = sVar;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.member.question.w wVar;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse response = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(response, "response");
        int pullType = response.getPullType();
        com.tencent.mm.plugin.finder.member.question.s sVar = this.f121342d;
        if (pullType == 0) {
            java.util.List incrementList = response.getIncrementList();
            boolean z17 = (incrementList != null ? incrementList.size() : 0) <= sVar.f121346f.f107516h;
            if (response.getErrCode() == 0 || !z17) {
                com.tencent.mm.plugin.finder.member.question.w wVar2 = sVar.f121347g;
                if (wVar2 != null) {
                    wVar2.j(z17, sVar.f121350m);
                }
            } else {
                com.tencent.mm.plugin.finder.member.question.w wVar3 = sVar.f121347g;
                if (wVar3 != null) {
                    android.view.View view = wVar3.f121376m;
                    if (view == null) {
                        kotlin.jvm.internal.o.o("emptyLayout");
                        throw null;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view2 = wVar3.f121378o;
                    if (view2 == null) {
                        kotlin.jvm.internal.o.o("retryTip");
                        throw null;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view3 = wVar3.f121379p;
                    if (view3 == null) {
                        kotlin.jvm.internal.o.o("emptyTip");
                        throw null;
                    }
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view4 = wVar3.f121377n;
                    if (view4 == null) {
                        kotlin.jvm.internal.o.o("progress");
                        throw null;
                    }
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view5 = wVar3.f121376m;
                    if (view5 == null) {
                        kotlin.jvm.internal.o.o("emptyLayout");
                        throw null;
                    }
                    view5.setOnClickListener(new com.tencent.mm.plugin.finder.member.question.v(wVar3));
                }
            }
        }
        if (!response.getHasMore() && (wVar = sVar.f121347g) != null) {
            wVar.a().E(true);
        }
        sVar.f121350m = response.getHasMore();
        return jz5.f0.f302826a;
    }
}
