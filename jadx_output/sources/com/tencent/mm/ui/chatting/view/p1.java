package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.e2 f203049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qd5.b f203050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f203051f;

    public p1(com.tencent.mm.ui.chatting.view.e2 e2Var, qd5.b bVar, android.view.View view) {
        this.f203049d = e2Var;
        this.f203050e = bVar;
        this.f203051f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.view.e2 e2Var = this.f203049d;
        java.util.LinkedHashMap linkedHashMap = e2Var.f202913j;
        qd5.b bVar = this.f203050e;
        jz5.l lVar = (jz5.l) linkedHashMap.get(bVar.f361903b);
        boolean z17 = (lVar != null ? (android.view.View) lVar.f302833d : null) == this.f203051f;
        boolean e17 = e2Var.f202916m.e(e2Var.f202911h);
        if (!z17 || e17) {
            return;
        }
        android.view.View view = this.f203051f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$collectExpandedTargetForExpand$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$collectExpandedTargetForExpand$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        e2Var.f202913j.remove(bVar.f361903b);
        e2Var.J();
    }
}
