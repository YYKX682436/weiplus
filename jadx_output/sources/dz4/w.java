package dz4;

/* loaded from: classes12.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f245439d;

    public w(dz4.j0 j0Var) {
        this.f245439d = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.wenote.multitask.e eVar;
        ih0.p pVar = this.f245439d.f245309a;
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onNoteTriggerStar: holder null");
            return;
        }
        dz4.y1 a17 = ((ez4.u) pVar).a();
        java.lang.ref.WeakReference weakReference = ((ez4.u) a17.f245463a).f257944c;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        java.lang.String str = a17.f245464b;
        if (activity == null || (eVar = a17.f245466d) == null) {
            com.tencent.mars.xlog.Log.e(str, "handleTriggerStar: err");
            return;
        }
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = eVar.f300077a;
        boolean z17 = !((!((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() || multiTaskInfo == null) ? false : ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ri(multiTaskInfo));
        java.lang.String title = z17 ? a17.f245467e : "";
        com.tencent.mars.xlog.Log.i(str, "handleTriggerStar: toSelect " + z17);
        com.tencent.mm.plugin.wenote.multitask.e eVar2 = a17.f245466d;
        if (eVar2 != null) {
            kotlin.jvm.internal.o.g(title, "title");
            eVar2.A = title;
            eVar2.j();
            eVar2.B(z17);
        }
    }
}
