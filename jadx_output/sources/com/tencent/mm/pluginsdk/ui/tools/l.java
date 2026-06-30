package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class l implements j35.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.AppChooserUI f191755a;

    public l(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI) {
        this.f191755a = appChooserUI;
    }

    @Override // j35.d
    public void a(boolean z17) {
        com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI = this.f191755a;
        if (z17) {
            appChooserUI.Y6(com.tencent.mm.pluginsdk.ui.tools.e0.DOWNLOADED);
            com.tencent.mm.pluginsdk.ui.tools.a0 a0Var = appChooserUI.f191333e;
            if (a0Var != null) {
                a0Var.notifyDataSetChanged();
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = appChooserUI.f191336h;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        gm0.j1.u().c().w(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.U6(274560, appChooserUI.G, appChooserUI.f191346t), 0L);
        appChooserUI.Y6(com.tencent.mm.pluginsdk.ui.tools.e0.UNINSTALL);
        com.tencent.mm.pluginsdk.ui.tools.a0 a0Var2 = appChooserUI.f191333e;
        if (a0Var2 != null) {
            a0Var2.notifyDataSetChanged();
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = appChooserUI.f191336h;
        if (wxRecyclerAdapter2 != null) {
            wxRecyclerAdapter2.notifyDataSetChanged();
        }
    }
}
