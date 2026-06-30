package kb0;

/* loaded from: classes8.dex */
public final class f implements com.tencent.mm.pluginsdk.model.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kb0.g f306196a;

    public f(kb0.g gVar) {
        this.f306196a = gVar;
    }

    public void a(boolean z17, java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.pluginsdk.ui.otherway.w) {
            jz5.l[] lVarArr = new jz5.l[4];
            lVarArr[0] = new jz5.l("popup_action_type", java.lang.Integer.valueOf(z17 ? 1 : 0));
            kb0.g gVar = this.f306196a;
            com.tencent.mm.pluginsdk.ui.otherway.w wVar = (com.tencent.mm.pluginsdk.ui.otherway.w) obj;
            int i17 = (java.lang.Integer) gVar.f306207k.get(gVar.b(wVar));
            if (i17 == null) {
                i17 = -1;
            }
            lVarArr[1] = new jz5.l("app_index", i17);
            lVarArr[2] = new jz5.l("app_name", wVar.a());
            lVarArr[3] = new jz5.l("app_type", java.lang.Integer.valueOf(gVar.g(wVar)));
            java.util.HashMap i18 = kz5.c1.i(lVarArr);
            i18.putAll(gVar.f306201e);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_sheet_other_app_item_popup", "view_clk", i18, 35480);
        }
    }

    public void b(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.pluginsdk.ui.otherway.w) {
            jz5.l[] lVarArr = new jz5.l[3];
            kb0.g gVar = this.f306196a;
            com.tencent.mm.pluginsdk.ui.otherway.w wVar = (com.tencent.mm.pluginsdk.ui.otherway.w) obj;
            int i17 = (java.lang.Integer) gVar.f306207k.get(gVar.b(wVar));
            if (i17 == null) {
                i17 = -1;
            }
            lVarArr[0] = new jz5.l("app_index", i17);
            lVarArr[1] = new jz5.l("app_name", wVar.a());
            lVarArr[2] = new jz5.l("app_type", java.lang.Integer.valueOf(gVar.g(wVar)));
            java.util.HashMap i18 = kz5.c1.i(lVarArr);
            i18.putAll(gVar.f306201e);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_sheet_other_app_item_popup", "view_exp", i18, 35480);
        }
    }
}
