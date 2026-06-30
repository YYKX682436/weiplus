package te2;

/* loaded from: classes3.dex */
public final class u7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f418475e;

    public u7(te2.p8 p8Var, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f418474d = p8Var;
        this.f418475e = k0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String string;
        int itemId = menuItem.getItemId();
        te2.p8 p8Var = this.f418474d;
        if (itemId == 1) {
            com.tencent.mars.xlog.Log.i("FinderLiveNoticeQRCodeUIC", "CHOICE_ALBUM_SET pick");
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.app.Activity context = p8Var.getContext();
            ((ub0.r) oVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.f(context, 1000, 9, 0, null, false);
        } else if (itemId == 2) {
            com.tencent.mars.xlog.Log.i("FinderLiveNoticeQRCodeUIC", "CHOICE_ALBUM_DEL_IMG pick");
            p8Var.t7("");
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.y2 y2Var = ml2.y2.f328261q;
            r45.h32 h32Var = p8Var.A1.f418391b;
            zy2.zb.qg(zbVar, y2Var, "", (h32Var == null || (string = h32Var.getString(3)) == null) ? "" : string, null, 8, null);
        }
        p8Var.g7().setIconColor(p8Var.getContext().getResources().getColor(com.tencent.mm.R.color.aby));
        this.f418475e.u();
    }
}
