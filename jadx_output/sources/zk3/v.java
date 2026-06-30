package zk3;

/* loaded from: classes5.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f473514d;

    public v(zk3.g0 g0Var) {
        this.f473514d = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View findViewById = this.f473514d.getRootView().findViewById(com.tencent.mm.R.id.jv9);
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.f150590J;
        marginLayoutParams.topMargin = 0;
        int i17 = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.P;
        marginLayoutParams.width = i17;
        marginLayoutParams.height = (int) (i17 * com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.Z);
        findViewById.setLayoutParams(marginLayoutParams);
    }
}
