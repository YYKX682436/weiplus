package zk3;

/* loaded from: classes5.dex */
public final class w implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f473516d;

    public w(zk3.g0 g0Var) {
        this.f473516d = g0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.tencent.mm.plugin.multitask.ui.panel.MultiTaskCoordinatorLayout multiTaskCoordinatorLayout = this.f473516d.f473455m;
        if (multiTaskCoordinatorLayout != null && (viewTreeObserver = multiTaskCoordinatorLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new zk3.v(this.f473516d));
    }
}
