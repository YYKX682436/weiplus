package dz4;

/* loaded from: classes12.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f245433d;

    public v(dz4.j0 j0Var) {
        this.f245433d = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ih0.p pVar = this.f245433d.f245309a;
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onNoteTriggerFloatWindow: holder null");
            return;
        }
        dz4.y1 a17 = ((ez4.u) pVar).a();
        a17.getClass();
        com.tencent.mars.xlog.Log.i(a17.f245464b, "handleTriggerFloatWindow: enter=true");
        cz4.f fVar = a17.f245465c;
        if (fVar != null) {
            fVar.A(true, 2);
        }
    }
}
