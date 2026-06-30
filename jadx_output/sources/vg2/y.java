package vg2;

/* loaded from: classes3.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.a0 f436619d;

    public y(vg2.a0 a0Var) {
        this.f436619d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f436619d.f436468d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget$adjustWidget$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget$adjustWidget$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
