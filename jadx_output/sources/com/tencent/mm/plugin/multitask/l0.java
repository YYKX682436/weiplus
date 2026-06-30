package com.tencent.mm.plugin.multitask;

/* loaded from: classes8.dex */
public interface l0 extends i95.m {

    /* renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ int f150465z0 = 0;

    static /* synthetic */ void Bd(com.tencent.mm.plugin.multitask.l0 l0Var, int i17, java.lang.String str, int i18, java.lang.String PROCESS_MAIN, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMultiTaskEvent");
        }
        if ((i19 & 2) != 0) {
            str = "";
        }
        if ((i19 & 4) != 0) {
            i18 = 0;
        }
        if ((i19 & 8) != 0) {
            PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
            kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        }
        ((com.tencent.mm.plugin.multitask.p1) l0Var).Vi(i17, str, i18, PROCESS_MAIN);
    }

    static void C7(com.tencent.mm.plugin.multitask.l0 l0Var, java.lang.String str, int i17, boolean z17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeTaskInfoAndCoverImg");
        }
        if ((i18 & 4) != 0) {
            z17 = true;
        }
        ((com.tencent.mm.plugin.multitask.p1) l0Var).getClass();
        ((com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class))).nj(str, i17, z17);
    }
}
