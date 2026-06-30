package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class b1 implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208461a;

    public b1(com.tencent.mm.ui.feature.api.screenshot.j1 j1Var) {
        this.f208461a = j1Var;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(err_msg, "err_msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "shareToBiz success: " + z17 + ", err_msg: " + err_msg + ", extraInfo: " + jSONObject);
        if (z17) {
            com.tencent.mm.ui.feature.api.screenshot.j1 j1Var = this.f208461a;
            qj5.n nVar = j1Var.f208500f;
            if (nVar != null) {
                nVar.u();
            }
            j1Var.f208500f = null;
        }
    }
}
