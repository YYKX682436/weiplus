package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes.dex */
public final class h8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f151194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f151195e;

    public h8(android.view.View view, int i17) {
        this.f151194d = view;
        this.f151195e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f151194d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f151195e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord$Companion$simpleSettingMethod$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mv/ui/uic/VisibleRecord$Companion$simpleSettingMethod$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
