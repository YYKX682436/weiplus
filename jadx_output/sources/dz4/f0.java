package dz4;

/* loaded from: classes12.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f245238d;

    public f0(dz4.j0 j0Var) {
        this.f245238d = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterWeNoteNativeHelperImpl", "onRecordingStartedEvent: done");
        com.tencent.wechat.aff.wenote.i iVar = this.f245238d.f245310b;
        if (iVar != null) {
            iVar.d0();
        }
    }
}
