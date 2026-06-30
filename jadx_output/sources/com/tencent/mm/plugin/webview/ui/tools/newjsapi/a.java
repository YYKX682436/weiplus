package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes7.dex */
public abstract class a extends qw4.a {
    public final gg.c e(nw4.k env) {
        gg.c cVar;
        kotlin.jvm.internal.o.g(env, "env");
        zg0.q2 a17 = env.a();
        if (a17 != null) {
            com.tencent.mm.plugin.webview.core.r0 r0Var = (com.tencent.mm.plugin.webview.core.r0) a17;
            if (r0Var.L0 == null) {
                r0Var.R0();
            }
            cVar = r0Var.L0;
        } else {
            cVar = null;
        }
        if (cVar instanceof gg.c) {
            return cVar;
        }
        return null;
    }
}
