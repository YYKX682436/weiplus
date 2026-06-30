package com.tencent.mm.plugin.multitask;

/* loaded from: classes8.dex */
public final class r1 {
    public r1(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.multitask.m0 a() {
        com.tencent.mm.plugin.multitask.s1 s1Var = com.tencent.mm.plugin.multitask.s1.f150503e;
        if (s1Var == null) {
            synchronized (this) {
                s1Var = com.tencent.mm.plugin.multitask.s1.f150503e;
                if (s1Var == null) {
                    s1Var = new com.tencent.mm.plugin.multitask.s1();
                    com.tencent.mm.plugin.multitask.s1.f150503e = s1Var;
                }
            }
        }
        return s1Var;
    }
}
