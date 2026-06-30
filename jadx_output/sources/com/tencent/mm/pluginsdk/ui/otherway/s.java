package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class s implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.v f190988d;

    public s(com.tencent.mm.pluginsdk.ui.otherway.v vVar) {
        this.f190988d = vVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        kb0.g gVar = this.f190988d.f191010k;
        if (gVar != null) {
            jz5.l[] lVarArr = new jz5.l[2];
            jz5.g gVar2 = gVar.f306203g;
            boolean z17 = false;
            lVarArr[0] = new jz5.l("install_app_name_list", (java.lang.String) ((jz5.n) gVar2).getValue());
            java.util.List list = gVar.f306199c;
            com.tencent.mm.pluginsdk.ui.otherway.w wVar = (com.tencent.mm.pluginsdk.ui.otherway.w) kz5.n0.Z(list);
            lVarArr[1] = new jz5.l("has_forward_yuanbao", java.lang.Integer.valueOf((wVar == null || !wVar.f191019i) ? 0 : 1));
            java.util.HashMap i17 = kz5.c1.i(lVarArr);
            java.util.HashMap hashMap = gVar.f306201e;
            i17.putAll(hashMap);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_sheet_app_panel", "view_exp", i17, 35480);
            com.tencent.mm.pluginsdk.ui.otherway.w wVar2 = (com.tencent.mm.pluginsdk.ui.otherway.w) kz5.n0.Z(list);
            if (wVar2 != null && wVar2.f191019i) {
                z17 = true;
            }
            if (z17) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("yuanbo_ad_component", "view_exp", hashMap, 35480);
            }
            com.tencent.mm.pluginsdk.model.p3 p3Var = gVar.f306197a.f189319l;
            if (p3Var == null) {
                return;
            }
            p3Var.f189406c = new kb0.f(gVar);
        }
    }
}
