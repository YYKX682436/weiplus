package go2;

/* loaded from: classes2.dex */
public final class s implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.z f274062d;

    public s(go2.z zVar) {
        this.f274062d = zVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        go2.z zVar = this.f274062d;
        if (itemId == 1020) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_WHITE_LIST_MODE", 8);
            ((im2.p4) ((zy2.m8) ((jz5.n) zVar.f274086J).getValue())).R6(intent);
            return;
        }
        if (itemId != 1021) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_MEMBER", true);
        intent2.putExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_PROFILE", false);
        im2.p4 p4Var = (im2.p4) ((zy2.m8) ((jz5.n) zVar.f274086J).getValue());
        com.tencent.mars.xlog.Log.i(p4Var.f292487d, "FinderLive.entrance, create notice btn click");
        p4Var.f292499s = intent2;
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(p4Var.getActivity())) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(p4Var.getActivity());
            u1Var.g(p4Var.getActivity().getResources().getString(com.tencent.mm.R.string.dls));
            u1Var.n(p4Var.getActivity().getResources().getString(com.tencent.mm.R.string.f490454vi));
            u1Var.l(im2.k4.f292417a);
            u1Var.q(false);
            return;
        }
        if (p4Var.Q6(xy2.c.e(p4Var.getContext()))) {
            m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
            if (I1 != null && I1.v0()) {
                zl2.q4.f473933a.Q();
            } else {
                pf5.e.launchUI$default(p4Var, null, null, new im2.j4(p4Var, null), 3, null);
            }
        }
    }
}
