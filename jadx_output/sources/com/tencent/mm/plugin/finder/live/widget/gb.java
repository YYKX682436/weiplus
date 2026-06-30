package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class gb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nb f118417d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(com.tencent.mm.plugin.finder.live.widget.nb nbVar) {
        super(1);
        this.f118417d = nbVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.widget.v1 hostInfo = (com.tencent.mm.plugin.finder.live.widget.v1) obj;
        kotlin.jvm.internal.o.g(hostInfo, "hostInfo");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveInvitorPreparePanel", "remove clicked: " + hostInfo.f120020a);
        com.tencent.mm.plugin.finder.live.widget.nb nbVar = this.f118417d;
        nbVar.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(nbVar.f118183e, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.live.widget.lb(nbVar);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.live.widget.mb(nbVar, hostInfo);
        k0Var.v();
        return jz5.f0.f302826a;
    }
}
