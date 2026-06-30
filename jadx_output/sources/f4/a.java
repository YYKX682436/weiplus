package f4;

/* loaded from: classes14.dex */
public final class a implements android.view.Window.OnFrameMetricsAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f259376a;

    public a(java.util.List delegates) {
        kotlin.jvm.internal.o.g(delegates, "delegates");
        this.f259376a = delegates;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public void onFrameMetricsAvailable(android.view.Window window, android.view.FrameMetrics frameMetrics, int i17) {
        java.util.Iterator it = this.f259376a.iterator();
        while (it.hasNext()) {
            ((android.view.Window.OnFrameMetricsAvailableListener) it.next()).onFrameMetricsAvailable(window, frameMetrics, i17);
        }
        if ((window != null ? window.getDecorView() : null) != null) {
            android.view.View decorView = window.getDecorView();
            kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
            android.view.ViewParent parent = decorView.getParent();
            while (parent instanceof android.view.View) {
                decorView = parent;
                parent = decorView.getParent();
            }
            java.lang.Object tag = decorView.getTag(com.tencent.mm.R.id.jid);
            if (tag == null) {
                tag = new f4.s();
                decorView.setTag(com.tencent.mm.R.id.jid, tag);
            }
            f4.u uVar = ((f4.s) tag).f259404a;
            if (uVar != null) {
                uVar.b();
            }
        }
    }
}
