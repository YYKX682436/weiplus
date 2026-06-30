package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes14.dex */
public class v0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.ui.t0 f177012d;

    public v0(com.tencent.mm.plugin.voip.ui.t0 t0Var) {
        this.f177012d = t0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipVoiceMiniManager", "click small view and time is up we remove it..");
        com.tencent.mm.plugin.voip.ui.t0 t0Var = this.f177012d;
        t0Var.a(false);
        com.tencent.mm.sdk.platformtools.b4 b4Var = t0Var.f176989c;
        if (b4Var == null) {
            return true;
        }
        b4Var.d();
        return true;
    }
}
