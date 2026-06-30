package vr1;

/* loaded from: classes3.dex */
public final class d0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI f439555d;

    public d0(com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI bizPCRecentReadUI) {
        this.f439555d = bizPCRecentReadUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI.f94062h;
        com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI bizPCRecentReadUI = this.f439555d;
        bizPCRecentReadUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) bizPCRecentReadUI.getContext(), 1, false);
        k0Var.f211872n = new vr1.i0(bizPCRecentReadUI);
        k0Var.f211881s = new vr1.j0(bizPCRecentReadUI);
        k0Var.v();
        return true;
    }
}
