package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class o {
    public o(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(com.tencent.mm.plugin.setting.ui.setting.o oVar, int i17, byte[] bArr, java.lang.String str) {
        oVar.getClass();
        if (bArr != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "save " + i17 + " to companion object Cache");
            com.tencent.mm.plugin.setting.ui.setting.i0.E.put(java.lang.Integer.valueOf(i17), bArr);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.util.Map map = com.tencent.mm.plugin.setting.ui.setting.i0.F;
            if (str == null) {
                str = "";
            }
            map.put(valueOf, str);
        }
    }
}
