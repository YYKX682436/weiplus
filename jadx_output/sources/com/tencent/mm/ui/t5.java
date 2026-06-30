package com.tencent.mm.ui;

/* loaded from: classes3.dex */
public class t5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f209879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FindMoreFriendsUI f209880e;

    public t5(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI, android.view.View view) {
        this.f209880e = findMoreFriendsUI;
        this.f209879d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f209879d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/FindMoreFriendsUI$39", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/FindMoreFriendsUI$39", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f209879d.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this.f209880e.getContext(), com.tencent.mm.R.anim.f477784bd));
    }
}
