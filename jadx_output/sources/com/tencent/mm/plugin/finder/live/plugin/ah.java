package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ah extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel f111885p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f111885p = root;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel finderLiveCommentPostRealNamePanel = this.f111885p;
        finderLiveCommentPostRealNamePanel.setDialogHeight(com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y * 0.55d);
        finderLiveCommentPostRealNamePanel.setWebviewForwardCallback(new com.tencent.mm.plugin.finder.live.plugin.yg(this));
        com.tencent.mm.plugin.finder.live.plugin.zg zgVar = new com.tencent.mm.plugin.finder.live.plugin.zg(callback);
        finderLiveCommentPostRealNamePanel.getClass();
        finderLiveCommentPostRealNamePanel.f115826e = zgVar;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = finderLiveCommentPostRealNamePanel.f115827f;
        if (z2Var == null) {
            kotlin.jvm.internal.o.o("bottomDialog");
            throw null;
        }
        z2Var.C();
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Dk(ml2.d4.f327361e);
    }
}
