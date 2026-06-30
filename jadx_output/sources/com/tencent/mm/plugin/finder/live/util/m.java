package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public interface m {
    static /* synthetic */ boolean a(com.tencent.mm.plugin.finder.live.util.m mVar, android.view.View view, int i17, com.tencent.mm.plugin.finder.live.util.n nVar, dk2.g gVar, int i18, boolean z17, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: instantCallback");
        }
        if ((i19 & 32) != 0) {
            z17 = false;
        }
        return ((com.tencent.mm.plugin.finder.live.plugin.ep) mVar).d(view, i17, nVar, gVar, i18, z17);
    }

    static /* synthetic */ boolean b(com.tencent.mm.plugin.finder.live.util.m mVar, android.view.View view, int i17, int i18, com.tencent.mm.plugin.finder.live.util.n nVar, dk2.g gVar, boolean z17, boolean z18, int i19, java.lang.Object obj) {
        if (obj == null) {
            return ((com.tencent.mm.plugin.finder.live.plugin.ep) mVar).c(view, i17, i18, nVar, gVar, (i19 & 32) != 0 ? false : z17, (i19 & 64) != 0 ? false : z18);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: batchCallback");
    }
}
