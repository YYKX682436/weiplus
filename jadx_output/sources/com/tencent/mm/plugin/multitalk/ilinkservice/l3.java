package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.b f149689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f149690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149691f;

    public l3(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var, com.tencent.mm.plugin.multitalk.ilinkservice.b bVar, boolean z17) {
        this.f149691f = i4Var;
        this.f149689d = bVar;
        this.f149690e = z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149691f;
        int i17 = i4Var.f149637n;
        com.tencent.mm.plugin.multitalk.ilinkservice.b bVar = this.f149689d;
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkService", "hy: not in room!");
            if (bVar != null) {
                bVar.a(-10086, com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMNOTFOUND, "not in room", "");
                return;
            }
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.s sVar = i4Var.f149625g;
        boolean z17 = this.f149690e;
        if (sVar.f149760b != null) {
            sVar.f149760b.n(z17);
            objArr = true;
        } else {
            objArr = false;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        objArr2[0] = z17 ? "mute" : "unMute";
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "hy: setMuteRecord call switchAV %s", objArr2);
        boolean z18 = !z17;
        i4Var.T1 = z18;
        com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.SwitchAV(z18 ? 1 : 0, i4Var.f149642p0 ? 1 : 0, i4Var.f149653x0);
        if (bVar != null) {
            if (objArr == true) {
                bVar.a(0, 0, "ok", "");
            } else {
                bVar.a(-10086, -15, "set mute failed", "");
            }
        }
    }
}
