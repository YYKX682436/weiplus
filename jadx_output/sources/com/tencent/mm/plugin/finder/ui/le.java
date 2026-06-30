package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes5.dex */
public final class le implements l45.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f129473a;

    public le(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI) {
        this.f129473a = finderSelectCoverUI;
    }

    @Override // l45.m
    public boolean a(xk0.p pVar) {
        return false;
    }

    @Override // l45.m
    public void b() {
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f129473a;
        android.view.View view = finderSelectCoverUI.B;
        if (view == null) {
            kotlin.jvm.internal.o.o("footerView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMoveStop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMoveStop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = finderSelectCoverUI.f128687z;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("cropOperationLayout");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMoveStop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMoveStop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // l45.m
    public void c(java.lang.Boolean bool) {
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f129473a;
            android.view.View view = finderSelectCoverUI.B;
            if (view == null) {
                kotlin.jvm.internal.o.o("footerView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMove", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMove", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = finderSelectCoverUI.f128687z;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("cropOperationLayout");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMove", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initEditor$2$2", "onTextMove", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
