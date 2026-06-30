package m31;

/* loaded from: classes2.dex */
public final class v {
    public v(kotlin.jvm.internal.i iVar) {
    }

    public final void a(int i17, android.view.View dialogRootView) {
        kotlin.jvm.internal.o.g(dialogRootView, "dialogRootView");
        android.content.Context context = dialogRootView.getContext();
        if (i17 == 1 || i17 == 3) {
            android.view.ViewGroup.LayoutParams layoutParams = dialogRootView.getLayoutParams();
            kotlin.jvm.internal.o.d(context);
            layoutParams.width = a06.d.b(context.getResources().getDisplayMetrics().density * 375);
            dialogRootView.setLayoutParams(layoutParams);
            return;
        }
        kotlin.jvm.internal.o.d(context);
        if (!((context.getResources().getConfiguration().screenLayout & 15) >= 3)) {
            android.view.ViewGroup.LayoutParams layoutParams2 = dialogRootView.getLayoutParams();
            layoutParams2.width = -1;
            dialogRootView.setLayoutParams(layoutParams2);
        } else {
            m31.u uVar = new m31.u(dialogRootView, context);
            if (dialogRootView.getViewTreeObserver().isAlive()) {
                dialogRootView.getViewTreeObserver().addOnPreDrawListener(new m31.x(dialogRootView, uVar));
            }
        }
    }
}
