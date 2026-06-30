package rk4;

/* loaded from: classes10.dex */
public final class a5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.TingFlutterActivity f396544d;

    public a5(com.tencent.mm.plugin.ting.TingFlutterActivity tingFlutterActivity) {
        this.f396544d = tingFlutterActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.ting.TingFlutterActivity tingFlutterActivity = this.f396544d;
        tingFlutterActivity.Y6();
        if (tingFlutterActivity.isFinishing()) {
            return;
        }
        db5.f.b(tingFlutterActivity);
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = tingFlutterActivity.getSwipeBackLayout();
        if (swipeBackLayout != null) {
            swipeBackLayout.setNeedRequestActivityTranslucent(true);
            swipeBackLayout.d(false);
        }
    }
}
