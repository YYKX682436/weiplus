package mr3;

/* loaded from: classes8.dex */
public final class c implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mr3.d f330850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f330851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f330852f;

    public c(mr3.d dVar, android.app.Activity activity, int i17) {
        this.f330850d = dVar;
        this.f330851e = activity;
        this.f330852f = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        android.app.Activity activity = this.f330851e;
        mr3.d dVar = this.f330850d;
        if (itemId == 1) {
            dVar.getClass();
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            boolean a17 = j35.u.a(activity, "android.permission.CAMERA", 16, "", "");
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.DescImageAddClicker", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), activity);
            if (a17) {
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                java.lang.String K = lp0.b.K();
                java.lang.String str = "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
                ((ub0.r) oVar).getClass();
                if (com.tencent.mm.pluginsdk.ui.tools.l7.l(activity, K, str, 100)) {
                    return;
                }
                dp.a.makeText(activity, activity.getString(com.tencent.mm.R.string.igw), 1).show();
                return;
            }
            return;
        }
        int i18 = this.f330852f;
        if (itemId == 2) {
            int i19 = dVar.f330856d - i18;
            if (i19 > 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("max_select_count", i19);
                intent.putExtra("show_header_view", false);
                intent.putExtra("query_source_type", 19);
                intent.putExtra("send_btn_string", activity.getResources().getString(com.tencent.mm.R.string.f490441v5));
                intent.addFlags(67108864);
                intent.putExtra("gallery_report_tag", 19);
                j45.l.n(activity, "gallery", ".ui.GalleryEntryUI", intent, 200);
                return;
            }
            return;
        }
        if (itemId != 3) {
            return;
        }
        java.lang.String str2 = dVar.f330853a;
        if (str2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DescImageAddClicker", "targetUserName shouldn't be null");
            return;
        }
        int i27 = dVar.f330856d - i18;
        if (i27 > 0) {
            if (!(activity instanceof com.tencent.mm.ui.MMFragmentActivity)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.DescImageAddClicker", "selectChatImage: context is not MMFragmentActivity");
                return;
            }
            ((uv1.d) ((lo.k) i95.n0.c(lo.k.class))).wi((com.tencent.mm.ui.MMFragmentActivity) activity, str2, "image", i27, "", dVar.f330855c, mr3.a.f330847a);
        }
    }
}
