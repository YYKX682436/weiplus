package qa5;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qa5.l f361124d;

    public j(qa5.l lVar) {
        this.f361124d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f361124d.f361126b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/anim/content/SizeAnimController$requestGone$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/anim/content/SizeAnimController$requestGone$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
