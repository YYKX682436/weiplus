package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes12.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.lite.logic.h0 f143971a = new com.tencent.mm.plugin.lite.logic.h0();

    public final long a(com.tencent.mm.vfs.r6 r6Var) {
        if (r6Var == null) {
            return -1L;
        }
        com.tencent.mm.vfs.r6[] G = r6Var.G();
        long j17 = 0;
        if (G == null) {
            return 0L;
        }
        for (com.tencent.mm.vfs.r6 r6Var2 : G) {
            j17 += r6Var2.A() ? r6Var2.C() : a(r6Var2);
        }
        return j17;
    }
}
