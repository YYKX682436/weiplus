package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes.dex */
public class a0 implements j45.k {
    public static boolean c() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return (c01.z1.j() & 8388608) == 8388608;
        }
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, null, com.tencent.mm.plugin.game.luggage.z.class);
        if (iPCBoolean == null) {
            return false;
        }
        return iPCBoolean.f68400d;
    }

    @Override // j45.i
    public boolean b(android.content.Context context, java.lang.String str, android.content.Intent intent, int i17, com.tencent.mm.ui.x7 x7Var) {
        if (!c01.e2.a0() || !str.equals(com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI.class.getName()) || !c()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGameInterceptor", "intercept!");
        wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
        com.tencent.mm.plugin.game.luggage.y yVar = new com.tencent.mm.plugin.game.luggage.y(this, context, intent);
        ((vd0.j2) q1Var).getClass();
        v24.o0.h(context, 8388608L, null, yVar, 3);
        return true;
    }
}
