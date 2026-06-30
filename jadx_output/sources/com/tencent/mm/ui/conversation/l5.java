package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class l5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf5.n f207844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f207845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.a5 f207846f;

    public l5(yf5.n nVar, android.view.ViewGroup.LayoutParams layoutParams, com.tencent.mm.ui.conversation.a5 a5Var) {
        this.f207844d = nVar;
        this.f207845e = layoutParams;
        this.f207846f = a5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yf5.n nVar = this.f207844d;
        android.view.View view = nVar.f461931r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$3", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$3", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        nVar.f461929p = 0;
        nVar.f461930q.setLayoutParams(this.f207845e);
        android.view.View view2 = nVar.f461930q;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        nVar.f461930q.requestLayout();
        com.tencent.mm.ui.conversation.a5 a5Var = this.f207846f;
        if (a5Var != null) {
            ((com.tencent.mm.ui.conversation.i5) a5Var).a(nVar);
        }
    }
}
