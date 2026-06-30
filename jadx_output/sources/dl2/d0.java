package dl2;

/* loaded from: classes.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl2.f0 f235193d;

    public d0(dl2.f0 f0Var) {
        this.f235193d = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dl2.f0 f0Var = this.f235193d;
        android.view.View view = (android.view.View) ((jz5.n) f0Var.f235200d).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$showPanel$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$showPanel$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((com.tencent.mm.ui.widget.LiveBottomSheetPanel) ((jz5.n) f0Var.f235199c).getValue()).f();
    }
}
