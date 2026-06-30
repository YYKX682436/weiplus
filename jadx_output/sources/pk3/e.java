package pk3;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView f356441a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.ViewGroup f356442b;

    /* renamed from: c, reason: collision with root package name */
    public int f356443c;

    public e(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f356443c = 1;
        i65.a.k(context);
        com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView multiTaskFloatBallView = new com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView(context, null, 0, 6, null);
        this.f356441a = multiTaskFloatBallView;
        ((java.util.concurrent.CopyOnWriteArraySet) multiTaskFloatBallView.f150511g).add(new pk3.d(this));
    }

    public final void a() {
        try {
            android.view.ViewGroup viewGroup = this.f356442b;
            if (viewGroup == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FloatBallContainer", "detachFromWindowInternal, window manager is null");
                return;
            }
            if (viewGroup != null) {
                viewGroup.removeView(this.f356441a);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "detachFromWindowInternal, detach all views");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallContainer", e17, "detachFromWindowInternal exception", new java.lang.Object[0]);
        }
    }
}
