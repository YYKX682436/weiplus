package dz4;

/* loaded from: classes12.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.wenote.l f245224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f245225e;

    public e0(com.tencent.wechat.aff.wenote.l lVar, dz4.j0 j0Var) {
        this.f245224d = lVar;
        this.f245225e = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRecordingEndEvent: ");
        com.tencent.wechat.aff.wenote.l lVar = this.f245224d;
        sb6.append(lVar.f217698e);
        sb6.append(", ");
        sb6.append(lVar.f217700g[1] ? lVar.f217697d : "");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterWeNoteNativeHelperImpl", sb6.toString());
        com.tencent.wechat.aff.wenote.i iVar = this.f245225e.f245310b;
        if (iVar != null) {
            iVar.e1(lVar);
        }
    }
}
