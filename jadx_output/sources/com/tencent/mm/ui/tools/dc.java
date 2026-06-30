package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class dc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210360e;

    public dc(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI, android.view.View view) {
        this.f210360e = showVideoUI;
        this.f210359d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = this.f210360e;
        showVideoUI.F = true;
        this.f210359d.setBackgroundColor(showVideoUI.getResources().getColor(com.tencent.mm.R.color.f478491c));
        android.view.View view = this.f210359d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/ShowVideoUI$18", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/tools/ShowVideoUI$18", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        showVideoUI.U6(showVideoUI.getWindow(), true, false);
        new n3.m3(showVideoUI.getWindow(), showVideoUI.getWindow().getDecorView()).f334374a.g(2);
    }
}
