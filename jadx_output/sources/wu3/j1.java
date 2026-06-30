package wu3;

/* loaded from: classes2.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f449770d;

    public j1(android.view.View view) {
        this.f449770d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f449770d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorPanelHolder$setShow$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorPanelHolder$setShow$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f449770d;
        view2.setTranslationY(view2.getHeight());
        view2.animate().translationY(0.0f).start();
    }
}
