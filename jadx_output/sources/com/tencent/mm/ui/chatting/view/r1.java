package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.e2 f203070d;

    public r1(com.tencent.mm.ui.chatting.view.e2 e2Var) {
        this.f203070d = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.view.e2 e2Var = this.f203070d;
        if (e2Var.f202916m.e(e2Var.f202911h) || !(!e2Var.f202915l.isEmpty())) {
            return;
        }
        java.util.Collection<android.view.View> values = e2Var.f202915l.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (android.view.View view : values) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$collectFoldedTargetsForCollapse$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$collectFoldedTargetsForCollapse$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }
        e2Var.f202915l.clear();
        e2Var.J();
    }
}
