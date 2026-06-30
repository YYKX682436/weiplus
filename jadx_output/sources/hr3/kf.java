package hr3;

/* loaded from: classes.dex */
public final class kf implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f283726d;

    public kf(hr3.pf pfVar) {
        this.f283726d = pfVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        hr3.pf pfVar = this.f283726d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            pfVar.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("max_select_count", 1);
            intent.putExtra("show_header_view", false);
            intent.putExtra("query_source_type", 19);
            intent.putExtra("send_btn_string", pfVar.getString(com.tencent.mm.R.string.f490441v5));
            intent.addFlags(67108864);
            j45.l.n(pfVar.getActivity(), "gallery", ".ui.GalleryEntryUI", intent, 102);
            return;
        }
        pfVar.getClass();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity activity = pfVar.getActivity();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(activity, "android.permission.CAMERA", 16, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUIC", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), pfVar.getContext());
        if (a17) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            androidx.appcompat.app.AppCompatActivity activity2 = pfVar.getActivity();
            java.lang.String K = lp0.b.K();
            java.lang.String str = "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
            ((ub0.r) oVar).getClass();
            if (com.tencent.mm.pluginsdk.ui.tools.l7.l(activity2, K, str, 101)) {
                return;
            }
            dp.a.makeText(pfVar.getActivity(), pfVar.getString(com.tencent.mm.R.string.igw), 1).show();
        }
    }
}
