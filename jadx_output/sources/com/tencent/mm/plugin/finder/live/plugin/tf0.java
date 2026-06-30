package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class tf0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ag0 f114391d;

    public tf0(com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var) {
        this.f114391d = ag0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.dk dkVar;
        com.tencent.mm.plugin.finder.live.plugin.ui uiVar = (com.tencent.mm.plugin.finder.live.plugin.ui) this.f114391d.X0(com.tencent.mm.plugin.finder.live.plugin.ui.class);
        if (uiVar == null || (dkVar = uiVar.f114568p) == null) {
            return;
        }
        dkVar.g();
    }
}
