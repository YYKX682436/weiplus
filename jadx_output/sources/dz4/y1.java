package dz4;

/* loaded from: classes12.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final ih0.p f245463a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f245464b;

    /* renamed from: c, reason: collision with root package name */
    public cz4.f f245465c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wenote.multitask.e f245466d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f245467e;

    public y1(ih0.p holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f245463a = holder;
        this.f245464b = "MicroMsg.WeNoteFlutterFloatWindowHelper";
        this.f245467e = "";
    }

    public final boolean a(boolean z17) {
        java.lang.ref.WeakReference weakReference = ((ez4.u) this.f245463a).f257944c;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        java.lang.String str = this.f245464b;
        if (activity == null) {
            com.tencent.mars.xlog.Log.e(str, "onActivityCreate: activity null");
            return false;
        }
        com.tencent.mm.plugin.wenote.multitask.e eVar = this.f245466d;
        if (eVar != null) {
            kotlin.jvm.internal.o.d(eVar);
            if (eVar.c0(z17 ? 2 : 1, this.f245467e, false)) {
                com.tencent.mars.xlog.Log.i(str, "checkInterceptFlutterNotePageExit: star");
                return true;
            }
        }
        cz4.f fVar = this.f245465c;
        if (fVar != null) {
            kotlin.jvm.internal.o.d(fVar);
            if (fVar.m0(z17 ? 2 : 1)) {
                com.tencent.mars.xlog.Log.i(str, "checkInterceptFlutterNotePageExit: float window");
                return true;
            }
        }
        return false;
    }
}
