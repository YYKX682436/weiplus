package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class b2 implements q80.f0 {
    public b2(com.tencent.mm.plugin.lite.logic.c2 c2Var) {
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteApp.LiteAppLogic", "postProcessFromUDRCheck open fail.");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "postProcessFromUDRCheck open success.");
    }
}
