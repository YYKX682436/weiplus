package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.type.IPCBoolean f208463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208464e;

    public c1(com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean, com.tencent.mm.ui.feature.api.screenshot.j1 j1Var) {
        this.f208463d = iPCBoolean;
        this.f208464e = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shareToBiz IPC result: ");
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = this.f208463d;
        sb6.append(iPCBoolean.f68400d);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", sb6.toString());
        if (iPCBoolean.f68400d) {
            com.tencent.mm.ui.feature.api.screenshot.j1 j1Var = this.f208464e;
            qj5.n nVar = j1Var.f208500f;
            if (nVar != null) {
                nVar.u();
            }
            j1Var.f208500f = null;
        }
    }
}
