package fh1;

/* loaded from: classes7.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh1.z f262557d;

    public k(fh1.z zVar) {
        this.f262557d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fh1.x0 x0Var;
        fh1.z zVar = this.f262557d;
        com.tencent.mars.xlog.Log.i(zVar.f262631e, "recreate bizInstanceName:".concat(zVar.c()));
        synchronized (zVar) {
            x0Var = zVar.f262635i;
            zVar.f262635i = null;
        }
        if (x0Var != null) {
            x0Var.destroy();
        }
        zVar.a();
        yz5.a aVar = zVar.f262636j;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mm.plugin.appbrand.service.c0 C0 = zVar.f262627a.C0();
        if (C0 != null) {
            C0.g("onMagicBrushFrameRecreate", new org.json.JSONObject().toString());
        }
    }
}
