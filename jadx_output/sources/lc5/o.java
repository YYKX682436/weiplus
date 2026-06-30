package lc5;

/* loaded from: classes.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f318022d;

    public o(android.view.View view) {
        this.f318022d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f318022d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/floatball/ImageFloatBallHelper$executeBackgroundFadeOutAnimation$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/floatball/ImageFloatBallHelper$executeBackgroundFadeOutAnimation$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
