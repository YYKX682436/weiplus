package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class n1 {
    public n1(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.smiley.t1 a() {
        if (com.tencent.mm.smiley.t1.f193376n == null) {
            synchronized (com.tencent.mm.smiley.t1.class) {
                if (com.tencent.mm.smiley.t1.f193376n == null) {
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    com.tencent.mm.smiley.t1.f193376n = new com.tencent.mm.smiley.t1(context, null);
                    if (com.tencent.mm.sdk.platformtools.x2.n()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.QQSmileyManager", "checkNewEmoji");
                    }
                }
            }
        }
        com.tencent.mm.smiley.t1 t1Var = com.tencent.mm.smiley.t1.f193376n;
        kotlin.jvm.internal.o.d(t1Var);
        return t1Var;
    }
}
