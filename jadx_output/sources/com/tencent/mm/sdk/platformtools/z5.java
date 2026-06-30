package com.tencent.mm.sdk.platformtools;

/* loaded from: classes13.dex */
public final class z5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.thumbplayer.api.ITPPlayer f193134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.w5 f193135e;

    public z5(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.mm.sdk.platformtools.w5 w5Var) {
        this.f193134d = iTPPlayer;
        this.f193135e = w5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.sdk.platformtools.y5 y5Var;
        com.tencent.mm.sdk.platformtools.w5 w5Var = this.f193135e;
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f193134d;
        try {
            if (iTPPlayer != null) {
                try {
                    iTPPlayer.stopAsync();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PlaySoundNew", e17, "onCompletion release player error", new java.lang.Object[0]);
                    y5Var = new com.tencent.mm.sdk.platformtools.y5(w5Var);
                }
            }
            if (iTPPlayer != null) {
                iTPPlayer.release();
            }
            y5Var = new com.tencent.mm.sdk.platformtools.y5(w5Var);
            d75.b.g(y5Var);
        } catch (java.lang.Throwable th6) {
            d75.b.g(new com.tencent.mm.sdk.platformtools.y5(w5Var));
            throw th6;
        }
    }
}
