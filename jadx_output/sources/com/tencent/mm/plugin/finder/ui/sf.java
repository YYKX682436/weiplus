package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class sf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f129807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f129808e;

    public sf(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI, r45.mb4 mb4Var) {
        this.f129807d = finderSelectCoverUI;
        this.f129808e = mb4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.f128668e2;
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f129807d;
        android.graphics.Bitmap h76 = finderSelectCoverUI.h7();
        if (h76 != null) {
            r45.mb4 mb4Var = this.f129808e;
            com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.d7(finderSelectCoverUI, mb4Var.getBoolean(13), (r45.dd4) mb4Var.getCustom(14), h76);
        }
    }
}
