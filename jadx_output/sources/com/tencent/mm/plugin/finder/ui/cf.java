package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class cf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f128990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f128991e;

    public cf(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI, r45.mb4 mb4Var) {
        this.f128990d = finderSelectCoverUI;
        this.f128991e = mb4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.f128668e2;
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f128990d;
        android.graphics.Bitmap h76 = finderSelectCoverUI.h7();
        if (h76 != null) {
            r45.mb4 mb4Var = this.f128991e;
            com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.d7(finderSelectCoverUI, mb4Var.getBoolean(13), (r45.dd4) mb4Var.getCustom(14), h76);
        }
    }
}
