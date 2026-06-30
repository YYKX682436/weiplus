package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class wd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f129985d;

    public wd(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI) {
        this.f129985d = finderSelectCoverUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.f128668e2;
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f129985d;
        android.graphics.Bitmap h76 = finderSelectCoverUI.h7();
        if (h76 != null) {
            finderSelectCoverUI.f128685y0 = true;
            com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.e7(finderSelectCoverUI, h76);
        }
    }
}
