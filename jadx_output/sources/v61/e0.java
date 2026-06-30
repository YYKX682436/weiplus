package v61;

/* loaded from: classes.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f433434d;

    public e0(android.view.View view) {
        this.f433434d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f433434d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/model/LoginUtil$Companion$updateLoginAsExdevice$1$show$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/model/LoginUtil$Companion$updateLoginAsExdevice$1$show$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
