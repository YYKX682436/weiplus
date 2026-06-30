package vr1;

/* loaded from: classes3.dex */
public final class j0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI f439573d;

    public j0(com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI bizPCRecentReadUI) {
        this.f439573d = bizPCRecentReadUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI bizPCRecentReadUI = this.f439573d;
            com.tencent.mars.xlog.Log.i(bizPCRecentReadUI.f94063d, "showCloseMakeSureMenu");
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) bizPCRecentReadUI.getContext(), 1, true);
            k0Var.r(bizPCRecentReadUI.getString(com.tencent.mm.R.string.f490744am0), 17, i65.a.b(bizPCRecentReadUI.getContext(), 12), null);
            k0Var.f211872n = new vr1.f0(bizPCRecentReadUI);
            k0Var.f211881s = new vr1.h0(bizPCRecentReadUI);
            k0Var.v();
        }
    }
}
