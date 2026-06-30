package dt0;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f243120a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f243121b;

    /* renamed from: c, reason: collision with root package name */
    public ts0.c f243122c;

    /* renamed from: d, reason: collision with root package name */
    public final dt0.a f243123d;

    public b(android.content.Context ctx, gt0.a process) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(process, "process");
        this.f243121b = ctx;
        this.f243123d = new dt0.a(this, process, ctx);
    }

    public final void a(boolean z17, ts0.c cVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PreviewOrientationFit", "enable :" + z17 + " ,cameraConfig " + cVar);
        android.content.Context context = this.f243121b;
        if (context != null) {
            dt0.a aVar = this.f243123d;
            if (z17) {
                this.f243122c = cVar;
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                ((android.app.Activity) context).setRequestedOrientation(7);
                aVar.enable();
                return;
            }
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((android.app.Activity) context).setRequestedOrientation(1);
            aVar.disable();
            this.f243120a = 0;
        }
    }
}
