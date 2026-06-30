package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class jj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129402d;

    public jj(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        this.f129402d = finderShareFeedRelUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.ui.qm qmVar = this.f129402d.D;
        if (qmVar != null) {
            qmVar.j0();
        } else {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
    }
}
