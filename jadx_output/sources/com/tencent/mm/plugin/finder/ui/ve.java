package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class ve implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f129957d;

    public ve(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI) {
        this.f129957d = finderSelectCoverUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.f128668e2;
        cw2.aa i76 = this.f129957d.i7();
        if (i76 != null) {
            i76.resume();
        }
    }
}
