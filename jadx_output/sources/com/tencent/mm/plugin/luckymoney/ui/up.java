package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public abstract class up {
    public static void a(android.content.Context context, int i17) {
        com.tencent.mm.plugin.luckymoney.ui.tp tpVar = com.tencent.mm.plugin.luckymoney.ui.tp.NOTSET;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckySoundUtil", "play Err context:%s pathId:%d speekeron:%s looping:%b", context, java.lang.Integer.valueOf(i17), tpVar, java.lang.Boolean.FALSE);
            return;
        }
        if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Zi()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckySoundUtil", "do not play: system is mute");
        } else if (ip.b.s() && ip.b.b()) {
            com.tencent.mm.sdk.platformtools.d6.d(context, i17, com.tencent.mm.sdk.platformtools.x5.f193084d, false, null);
        }
    }
}
