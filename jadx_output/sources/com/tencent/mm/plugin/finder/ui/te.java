package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class te implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f129877d;

    public te(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI) {
        this.f129877d = finderSelectCoverUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.tools.f5 f5Var = this.f129877d.C1;
        if (f5Var != null) {
            f5Var.f();
        } else {
            kotlin.jvm.internal.o.o("keyboardHeightProvider");
            throw null;
        }
    }
}
