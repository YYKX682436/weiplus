package com.tencent.mm.plugin.game;

/* loaded from: classes5.dex */
public class s0 implements q80.f0 {
    public s0(com.tencent.mm.plugin.game.p0 p0Var) {
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameExternalService", "createLiteApp fail");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameExternalService", "createLiteApp success");
    }
}
