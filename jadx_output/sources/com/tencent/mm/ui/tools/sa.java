package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class sa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210738e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowImageUI f210739f;

    public sa(com.tencent.mm.ui.tools.ShowImageUI showImageUI, android.view.View view, android.view.View view2) {
        this.f210739f = showImageUI;
        this.f210737d = view;
        this.f210738e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.ShowImageUI showImageUI = this.f210739f;
        showImageUI.f210200p = true;
        this.f210737d.setBackgroundColor(showImageUI.getResources().getColor(com.tencent.mm.R.color.f478491c));
        android.view.View view = this.f210737d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/ShowImageUI$15", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/tools/ShowImageUI$15", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        showImageUI.f210202r.setAlpha(1.0f);
        this.f210738e.setBackgroundColor(showImageUI.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
        showImageUI.U6(showImageUI.getWindow(), true, false);
        new n3.m3(showImageUI.getWindow(), showImageUI.getWindow().getDecorView()).f334374a.g(2);
    }
}
