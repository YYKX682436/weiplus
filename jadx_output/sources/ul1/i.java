package ul1;

/* loaded from: classes.dex */
public class i implements java.lang.Runnable, android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f428582d;

    public i(android.view.View view) {
        this.f428582d = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f428582d;
        if (view == null) {
            return;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPagePromptHelper$ToastViewDismissRunner", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPagePromptHelper$ToastViewDismissRunner", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f428582d.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) this.f428582d.getParent()).removeView(this.f428582d);
            }
        } finally {
            this.f428582d = null;
        }
    }
}
