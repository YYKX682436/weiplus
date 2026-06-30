package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class g implements com.tencent.mm.plugin.downloader.model.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.AppChooserUI f191629d;

    public g(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI) {
        this.f191629d = appChooserUI;
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void b(long j17, int i17, boolean z17) {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI = this.f191629d;
        c17.w(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.U6(274560, appChooserUI.G, appChooserUI.f191346t), 0L);
        appChooserUI.Y6(com.tencent.mm.pluginsdk.ui.tools.e0.UNINSTALL);
        com.tencent.mm.pluginsdk.ui.tools.a0 a0Var = appChooserUI.f191333e;
        if (a0Var != null) {
            a0Var.notifyDataSetChanged();
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = appChooserUI.f191336h;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.vfs.w6.j(str)) {
            return;
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI = this.f191629d;
        c17.w(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.U6(274560, appChooserUI.G, appChooserUI.f191346t), java.lang.Long.valueOf(appChooserUI.M));
        appChooserUI.Y6(com.tencent.mm.pluginsdk.ui.tools.e0.DOWNLOADED);
        com.tencent.mm.pluginsdk.ui.tools.a0 a0Var = appChooserUI.f191333e;
        if (a0Var != null && appChooserUI.M == j17) {
            a0Var.notifyDataSetChanged();
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = appChooserUI.f191336h;
        if (wxRecyclerAdapter == null || appChooserUI.M != j17) {
            return;
        }
        wxRecyclerAdapter.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void f(long j17) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void i(long j17, java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void k(long j17) {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI = this.f191629d;
        c17.w(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.U6(274560, appChooserUI.G, appChooserUI.f191346t), 0L);
        appChooserUI.Y6(com.tencent.mm.pluginsdk.ui.tools.e0.UNINSTALL);
        com.tencent.mm.pluginsdk.ui.tools.a0 a0Var = appChooserUI.f191333e;
        if (a0Var != null) {
            a0Var.notifyDataSetChanged();
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = appChooserUI.f191336h;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void l(long j17, java.lang.String str) {
        com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI = this.f191629d;
        appChooserUI.M = j17;
        gm0.j1.u().c().w(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.U6(274560, appChooserUI.G, appChooserUI.f191346t), java.lang.Long.valueOf(appChooserUI.M));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append("");
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void m(long j17) {
    }
}
