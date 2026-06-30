package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class gc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210447f;

    public gc(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI, android.view.View view, android.view.View view2) {
        this.f210447f = showVideoUI;
        this.f210445d = view;
        this.f210446e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = this.f210447f;
        showVideoUI.F = false;
        this.f210445d.setBackgroundColor(showVideoUI.getResources().getColor(com.tencent.mm.R.color.f478712f3));
        android.view.View view = this.f210445d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/ShowVideoUI$20", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/tools/ShowVideoUI$20", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f210446e.setBackgroundColor(showVideoUI.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
        showVideoUI.U6(showVideoUI.getWindow(), true, true);
        new n3.m3(showVideoUI.getWindow(), showVideoUI.getWindow().getDecorView()).a(2);
    }
}
