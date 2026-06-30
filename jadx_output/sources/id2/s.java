package id2;

/* loaded from: classes3.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290789d;

    public s(id2.v1 v1Var) {
        this.f290789d = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        id2.v1 v1Var = this.f290789d;
        android.view.View view = (android.view.View) ((jz5.n) v1Var.f290848u).getValue();
        int i17 = v1Var.T6().getHeight() >= v1Var.T6().getMaxHeight() ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$checkRvMask$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$checkRvMask$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
