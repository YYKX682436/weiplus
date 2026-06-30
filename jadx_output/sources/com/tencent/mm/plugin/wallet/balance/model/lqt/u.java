package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes8.dex */
public class u extends com.tencent.mm.wallet_core.model.h1 {
    public u(int i17, int i18, int i19) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ig5();
        lVar.f70665b = new r45.jg5();
        lVar.f70667d = 1916;
        lVar.f70666c = "/cgi-bin/mmpay-bin/qryautoplanorderlist";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.ig5 ig5Var = (r45.ig5) a17.f70710a.f70684a;
        ig5Var.f377037d = i17;
        ig5Var.f377038e = i18;
        ig5Var.f377039f = i19;
        p(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiLqtPlanOrderList", "CgiLqtPlanOrderList Req：plan_id: %s, offset: %s, limit: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    public static r45.n85 s(com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$PlanItemParcel cgiLqtPlanOrderList$PlanItemParcel) {
        if (cgiLqtPlanOrderList$PlanItemParcel == null) {
            return null;
        }
        r45.n85 n85Var = new r45.n85();
        n85Var.f381172p = cgiLqtPlanOrderList$PlanItemParcel.f177608i;
        n85Var.f381164e = cgiLqtPlanOrderList$PlanItemParcel.f177604e;
        n85Var.f381163d = cgiLqtPlanOrderList$PlanItemParcel.f177603d;
        n85Var.f381175s = cgiLqtPlanOrderList$PlanItemParcel.f177611o;
        n85Var.f381174r = cgiLqtPlanOrderList$PlanItemParcel.f177610n;
        n85Var.f381165f = cgiLqtPlanOrderList$PlanItemParcel.f177605f;
        n85Var.f381166g = cgiLqtPlanOrderList$PlanItemParcel.f177606g;
        n85Var.f381173q = cgiLqtPlanOrderList$PlanItemParcel.f177609m;
        n85Var.f381176t = cgiLqtPlanOrderList$PlanItemParcel.f177612p;
        if (cgiLqtPlanOrderList$PlanItemParcel.f177607h != null) {
            r45.dn4 dn4Var = new r45.dn4();
            n85Var.f381171o = dn4Var;
            com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$MngPlanItemParcel cgiLqtPlanOrderList$MngPlanItemParcel = cgiLqtPlanOrderList$PlanItemParcel.f177607h;
            dn4Var.f372595d = cgiLqtPlanOrderList$MngPlanItemParcel.f177600d;
            dn4Var.f372596e = cgiLqtPlanOrderList$MngPlanItemParcel.f177601e;
            java.util.Iterator it = cgiLqtPlanOrderList$MngPlanItemParcel.f177602f.iterator();
            while (it.hasNext()) {
                n85Var.f381171o.f372597f.add((java.lang.Integer) it.next());
            }
        }
        return n85Var;
    }

    public static com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$PlanItemParcel t(r45.n85 n85Var) {
        if (n85Var == null) {
            return null;
        }
        com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$PlanItemParcel cgiLqtPlanOrderList$PlanItemParcel = new com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$PlanItemParcel();
        cgiLqtPlanOrderList$PlanItemParcel.f177608i = n85Var.f381172p;
        cgiLqtPlanOrderList$PlanItemParcel.f177604e = n85Var.f381164e;
        cgiLqtPlanOrderList$PlanItemParcel.f177603d = n85Var.f381163d;
        cgiLqtPlanOrderList$PlanItemParcel.f177611o = n85Var.f381175s;
        cgiLqtPlanOrderList$PlanItemParcel.f177610n = n85Var.f381174r;
        cgiLqtPlanOrderList$PlanItemParcel.f177605f = n85Var.f381165f;
        cgiLqtPlanOrderList$PlanItemParcel.f177606g = n85Var.f381166g;
        cgiLqtPlanOrderList$PlanItemParcel.f177609m = n85Var.f381173q;
        cgiLqtPlanOrderList$PlanItemParcel.f177612p = n85Var.f381176t;
        if (n85Var.f381171o != null) {
            com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$MngPlanItemParcel cgiLqtPlanOrderList$MngPlanItemParcel = new com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList$MngPlanItemParcel();
            cgiLqtPlanOrderList$PlanItemParcel.f177607h = cgiLqtPlanOrderList$MngPlanItemParcel;
            r45.dn4 dn4Var = n85Var.f381171o;
            cgiLqtPlanOrderList$MngPlanItemParcel.f177600d = dn4Var.f372595d;
            cgiLqtPlanOrderList$MngPlanItemParcel.f177601e = dn4Var.f372596e;
            java.util.Iterator it = dn4Var.f372597f.iterator();
            while (it.hasNext()) {
                cgiLqtPlanOrderList$PlanItemParcel.f177607h.f177602f.add((java.lang.Integer) it.next());
            }
        }
        return cgiLqtPlanOrderList$PlanItemParcel;
    }
}
