package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class t implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.v f190990a;

    public t(com.tencent.mm.pluginsdk.ui.otherway.v vVar) {
        this.f190990a = vVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        int i17;
        jz5.f0 f0Var;
        com.tencent.mm.pluginsdk.ui.otherway.v vVar = this.f190990a;
        kb0.g gVar = vVar.f191010k;
        if (gVar != null) {
            java.util.Set<com.tencent.mm.pluginsdk.ui.otherway.w> set = gVar.f306205i;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(set, 10));
            for (com.tencent.mm.pluginsdk.ui.otherway.w wVar : set) {
                java.lang.Integer num = (java.lang.Integer) gVar.f306207k.get(gVar.b(wVar));
                if (num == null) {
                    num = -1;
                }
                kotlin.jvm.internal.o.d(num);
                arrayList.add(gVar.c(wVar, num.intValue()));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                java.lang.String str = (java.lang.String) next;
                if ((((str == null || str.length() == 0) ? 1 : 0) ^ 1) != 0) {
                    arrayList2.add(next);
                }
            }
            java.lang.String g07 = kz5.n0.g0(arrayList2, "#", null, null, 0, null, null, 62, null);
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("install_app_name_list", (java.lang.String) ((jz5.n) gVar.f306203g).getValue());
            lVarArr[1] = new jz5.l("expose_app_name_list", g07);
            com.tencent.mm.pluginsdk.ui.otherway.w wVar2 = (com.tencent.mm.pluginsdk.ui.otherway.w) kz5.n0.Z(gVar.f306199c);
            if (wVar2 != null && wVar2.f191019i) {
                i17 = 1;
            }
            lVarArr[2] = new jz5.l("has_forward_yuanbao", java.lang.Integer.valueOf(i17));
            java.util.HashMap i18 = kz5.c1.i(lVarArr);
            i18.putAll(gVar.f306201e);
            java.lang.String concat = "unexp app list: ".concat(g07);
            java.lang.String str2 = gVar.f306200d;
            com.tencent.mars.xlog.Log.i(str2, concat);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("share_sheet_app_panel", "view_unexp", i18, 35480);
            java.util.Iterator it6 = gVar.f306206j.iterator();
            while (it6.hasNext()) {
                wj.t0 t0Var = ((com.tencent.mm.pluginsdk.ui.otherway.w) it6.next()).f191021n;
                if (t0Var != null) {
                    xj.m Ui = ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).Ui(t0Var);
                    if (Ui != null) {
                        i95.m c17 = i95.n0.c(xj.i.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        xj.i.gg((xj.i) c17, Ui.f454753a, wj.w0.f446542e, null, 4, null);
                        f0Var = jz5.f0.f302826a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        com.tencent.mars.xlog.Log.e(str2, "adInfo is null posId: " + t0Var);
                    }
                }
            }
        }
        vVar.f191010k = null;
    }
}
