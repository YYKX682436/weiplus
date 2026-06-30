package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class qa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowImageUI f210661f;

    public qa(com.tencent.mm.ui.tools.ShowImageUI showImageUI, android.view.View view, android.view.View view2) {
        this.f210661f = showImageUI;
        this.f210659d = view;
        this.f210660e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.ShowImageUI showImageUI = this.f210661f;
        showImageUI.f210200p = false;
        this.f210659d.setBackgroundColor(showImageUI.getResources().getColor(com.tencent.mm.R.color.f478712f3));
        android.view.View view = this.f210659d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/ShowImageUI$13", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/tools/ShowImageUI$13", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        showImageUI.f210202r.setAlpha(0.0f);
        this.f210660e.setBackgroundColor(showImageUI.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
        showImageUI.U6(showImageUI.getWindow(), true, true);
        new n3.m3(showImageUI.getWindow(), showImageUI.getWindow().getDecorView()).a(2);
    }
}
