package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes7.dex */
public final class p0 {
    public p0(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.wallet_core.utils.q0 a(int i17) {
        com.tencent.mm.plugin.wallet_core.utils.q0 q0Var;
        com.tencent.mm.plugin.wallet_core.utils.q0[] values = com.tencent.mm.plugin.wallet_core.utils.q0.values();
        int length = values.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                q0Var = null;
                break;
            }
            q0Var = values[i18];
            if (q0Var.f180969d == i17) {
                break;
            }
            i18++;
        }
        return q0Var == null ? com.tencent.mm.plugin.wallet_core.utils.q0.f180966f : q0Var;
    }
}
