package com.tencent.mm.plugin.multitask;

/* loaded from: classes8.dex */
public interface j0 extends i95.m {
    static /* synthetic */ void Ff(com.tencent.mm.plugin.multitask.j0 j0Var, int i17, java.lang.String str, int i18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMultiTaskEvent");
        }
        if ((i19 & 2) != 0) {
            str = "";
        }
        if ((i19 & 4) != 0) {
            i18 = 0;
        }
        ((com.tencent.mm.plugin.multitask.i1) j0Var).qj(i17, str, i18);
    }

    static /* synthetic */ void We(com.tencent.mm.plugin.multitask.j0 j0Var, java.lang.String str, int i17, boolean z17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeTaskInfoAndCoverImg");
        }
        if ((i18 & 4) != 0) {
            z17 = true;
        }
        ((com.tencent.mm.plugin.multitask.i1) j0Var).nj(str, i17, z17);
    }
}
