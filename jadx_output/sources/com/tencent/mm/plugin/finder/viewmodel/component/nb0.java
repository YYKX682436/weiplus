package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public interface nb0 extends pf5.c {
    static void F0(com.tencent.mm.plugin.finder.viewmodel.component.nb0 nb0Var, boolean z17, android.content.Context context, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAttachVideoMute");
        }
        if ((i17 & 2) != 0) {
            context = null;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler = (com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) nb0Var;
        finderVideoRecycler.getClass();
        pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.pa0(finderVideoRecycler, context, z17));
    }

    static /* synthetic */ void I0(com.tencent.mm.plugin.finder.viewmodel.component.nb0 nb0Var, android.view.ViewGroup viewGroup, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pauseAndRecycle");
        }
        if ((i17 & 4) != 0) {
            z18 = false;
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) nb0Var).b7(viewGroup, z17, z18);
    }

    static /* synthetic */ void z6(com.tencent.mm.plugin.finder.viewmodel.component.nb0 nb0Var, android.view.ViewGroup viewGroup, int i17, mn2.j4 j4Var, boolean z17, yz5.l lVar, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrCreate");
        }
        if ((i18 & 8) != 0) {
            z17 = false;
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) nb0Var).U6(viewGroup, i17, j4Var, z17, lVar);
    }
}
