package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class se implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f129806d;

    public se(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI) {
        this.f129806d = finderSelectCoverUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.tools.f5 f5Var = this.f129806d.C1;
        if (f5Var != null) {
            f5Var.d();
        } else {
            kotlin.jvm.internal.o.o("keyboardHeightProvider");
            throw null;
        }
    }
}
