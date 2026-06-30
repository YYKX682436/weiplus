package com.tencent.mm.plugin.finder.member.all;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.all.m f121087d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.finder.member.all.m mVar) {
        super(1);
        this.f121087d = mVar;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.member.all.q qVar;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse response = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(response, "response");
        int pullType = response.getPullType();
        com.tencent.mm.plugin.finder.member.all.m mVar = this.f121087d;
        if (pullType == 0) {
            java.util.List incrementList = response.getIncrementList();
            boolean z17 = (incrementList != null ? incrementList.size() : 0) <= mVar.f121090f.f107503g;
            if (response.getErrCode() == 0 || !z17) {
                com.tencent.mm.plugin.finder.member.all.q qVar2 = mVar.f121091g;
                if (qVar2 != null) {
                    qVar2.g(z17, mVar.f121093i);
                }
            } else {
                com.tencent.mm.plugin.finder.member.all.q qVar3 = mVar.f121091g;
                if (qVar3 != null) {
                    android.view.View view = qVar3.f121109i;
                    if (view == null) {
                        kotlin.jvm.internal.o.o("emptyLayout");
                        throw null;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view2 = qVar3.f121111n;
                    if (view2 == null) {
                        kotlin.jvm.internal.o.o("retryTip");
                        throw null;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view3 = qVar3.f121112o;
                    if (view3 == null) {
                        kotlin.jvm.internal.o.o("emptyTip");
                        throw null;
                    }
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view4 = qVar3.f121110m;
                    if (view4 == null) {
                        kotlin.jvm.internal.o.o("progress");
                        throw null;
                    }
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view5 = qVar3.f121109i;
                    if (view5 == null) {
                        kotlin.jvm.internal.o.o("emptyLayout");
                        throw null;
                    }
                    view5.setOnClickListener(new com.tencent.mm.plugin.finder.member.all.p(qVar3));
                }
            }
        }
        if (!response.getHasMore() && (qVar = mVar.f121091g) != null) {
            qVar.a().E(true);
        }
        mVar.f121093i = response.getHasMore();
        return jz5.f0.f302826a;
    }
}
