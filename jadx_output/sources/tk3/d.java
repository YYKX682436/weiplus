package tk3;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView f419913a;

    /* renamed from: b, reason: collision with root package name */
    public int f419914b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.WindowManager f419915c;

    public d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f419914b = 1;
        i65.a.k(context);
        com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView = new com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView(context, null, 0, 6, null);
        this.f419913a = multiTaskNewFloatBallView;
        multiTaskNewFloatBallView.f150540h.add(new tk3.b(this));
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f419915c = (android.view.WindowManager) systemService;
    }

    public final void a() {
        com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallContainer", "detachFromWindowInternal, detach all listeners");
            android.view.WindowManager windowManager = this.f419915c;
            if (windowManager == null || (multiTaskNewFloatBallView = this.f419913a) == null) {
                return;
            }
            kotlin.jvm.internal.o.d(multiTaskNewFloatBallView);
            ((java.util.concurrent.CopyOnWriteArraySet) multiTaskNewFloatBallView.f150540h).clear();
            ((java.util.concurrent.CopyOnWriteArraySet) multiTaskNewFloatBallView.f150541i).clear();
            kotlin.jvm.internal.o.d(windowManager);
            windowManager.removeView(this.f419913a);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MultiTaskNewFloatBallContainer", e17, "detachFromWindowInternal exception", new java.lang.Object[0]);
        }
    }

    public final void b(float f17) {
        com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallContainer", "setAlpha");
        com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView2 = this.f419913a;
        if (kotlin.jvm.internal.o.a(multiTaskNewFloatBallView2 != null ? java.lang.Float.valueOf(multiTaskNewFloatBallView2.getAlpha()) : null, f17) || (multiTaskNewFloatBallView = this.f419913a) == null) {
            return;
        }
        multiTaskNewFloatBallView.setAlpha(f17);
    }
}
