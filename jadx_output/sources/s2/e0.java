package s2;

/* loaded from: classes14.dex */
public class e0 implements s2.c0 {
    @Override // s2.c0
    public void a(android.view.View composeView, int i17, int i18) {
        kotlin.jvm.internal.o.g(composeView, "composeView");
    }

    public void b(android.view.WindowManager windowManager, android.view.View popupView, android.view.ViewGroup.LayoutParams params) {
        kotlin.jvm.internal.o.g(windowManager, "windowManager");
        kotlin.jvm.internal.o.g(popupView, "popupView");
        kotlin.jvm.internal.o.g(params, "params");
        windowManager.updateViewLayout(popupView, params);
    }
}
