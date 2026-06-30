package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public class a6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ModRemarkNameUI f206589d;

    public a6(com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI) {
        this.f206589d = modRemarkNameUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int i18;
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI = this.f206589d;
        if (itemId != 1) {
            if (itemId == 2 && (i18 = 3 - modRemarkNameUI.E) > 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("max_select_count", i18);
                intent.putExtra("show_header_view", false);
                intent.putExtra("query_source_type", 19);
                intent.putExtra("send_btn_string", modRemarkNameUI.getResources().getString(com.tencent.mm.R.string.f490441v5));
                intent.addFlags(67108864);
                intent.putExtra("gallery_report_tag", 19);
                j45.l.n(modRemarkNameUI, "gallery", ".ui.GalleryEntryUI", intent, 200);
                return;
            }
            return;
        }
        int i19 = com.tencent.mm.ui.contact.ModRemarkNameUI.f206466y1;
        modRemarkNameUI.getClass();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity context = modRemarkNameUI.getContext();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(context, "android.permission.CAMERA", 16, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MiroMsg.ModRemarkName", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), modRemarkNameUI.getContext());
        if (a17) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            java.lang.String K = lp0.b.K();
            java.lang.String str = "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
            ((ub0.r) oVar).getClass();
            if (com.tencent.mm.pluginsdk.ui.tools.l7.l(modRemarkNameUI, K, str, 100)) {
                return;
            }
            dp.a.makeText(modRemarkNameUI, modRemarkNameUI.getString(com.tencent.mm.R.string.igw), 1).show();
        }
    }
}
