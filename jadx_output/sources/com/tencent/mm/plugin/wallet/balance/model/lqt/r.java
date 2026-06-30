package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes8.dex */
public class r extends com.tencent.mm.wallet_core.model.h1 {
    public r() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.l85();
        lVar.f70665b = new r45.m85();
        lVar.f70667d = 2796;
        lVar.f70666c = "/cgi-bin/mmpay-bin/planindex";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        p(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiLqtPlanIndex", "isfirstclick: %s");
    }

    public static com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$PlanIndexParcel s(r45.m85 m85Var) {
        if (m85Var == null) {
            return null;
        }
        com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$PlanIndexParcel cgiLqtPlanIndex$PlanIndexParcel = new com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$PlanIndexParcel();
        cgiLqtPlanIndex$PlanIndexParcel.f177576d = m85Var.f380238d;
        cgiLqtPlanIndex$PlanIndexParcel.f177577e = m85Var.f380239e;
        java.util.Iterator it = m85Var.f380240f.iterator();
        while (it.hasNext()) {
            r45.n85 n85Var = (r45.n85) it.next();
            com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$PlanItemParcel cgiLqtPlanIndex$PlanItemParcel = new com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$PlanItemParcel();
            cgiLqtPlanIndex$PlanItemParcel.f177584d = n85Var.f381163d;
            cgiLqtPlanIndex$PlanItemParcel.f177585e = n85Var.f381164e;
            cgiLqtPlanIndex$PlanItemParcel.f177586f = n85Var.f381165f;
            cgiLqtPlanIndex$PlanItemParcel.f177587g = n85Var.f381166g;
            cgiLqtPlanIndex$PlanItemParcel.f177588h = n85Var.f381167h;
            cgiLqtPlanIndex$PlanItemParcel.f177589i = n85Var.f381168i;
            cgiLqtPlanIndex$PlanItemParcel.f177596s = n85Var.f381175s;
            cgiLqtPlanIndex$PlanItemParcel.f177597t = n85Var.f381176t;
            r45.ro6 ro6Var = n85Var.f381169m;
            if (ro6Var != null) {
                com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$TransTipsItemParcel cgiLqtPlanIndex$TransTipsItemParcel = new com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$TransTipsItemParcel();
                cgiLqtPlanIndex$PlanItemParcel.f177590m = cgiLqtPlanIndex$TransTipsItemParcel;
                cgiLqtPlanIndex$TransTipsItemParcel.f177598d = ro6Var.f385065d;
                cgiLqtPlanIndex$TransTipsItemParcel.f177599e = ro6Var.f385066e;
            }
            r45.eq4 eq4Var = n85Var.f381170n;
            if (eq4Var != null) {
                com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$MoreRecordsParcel cgiLqtPlanIndex$MoreRecordsParcel = new com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$MoreRecordsParcel();
                cgiLqtPlanIndex$PlanItemParcel.f177591n = cgiLqtPlanIndex$MoreRecordsParcel;
                cgiLqtPlanIndex$MoreRecordsParcel.f177574d = eq4Var.f373675d;
                cgiLqtPlanIndex$MoreRecordsParcel.f177575e = eq4Var.f373676e;
            }
            if (n85Var.f381171o != null) {
                com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$MngPlanItemParcel cgiLqtPlanIndex$MngPlanItemParcel = new com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$MngPlanItemParcel();
                cgiLqtPlanIndex$PlanItemParcel.f177592o = cgiLqtPlanIndex$MngPlanItemParcel;
                r45.dn4 dn4Var = n85Var.f381171o;
                cgiLqtPlanIndex$MngPlanItemParcel.f177571d = dn4Var.f372595d;
                cgiLqtPlanIndex$MngPlanItemParcel.f177572e = dn4Var.f372596e;
                java.util.Iterator it6 = dn4Var.f372597f.iterator();
                while (it6.hasNext()) {
                    cgiLqtPlanIndex$PlanItemParcel.f177592o.f177573f.add((java.lang.Integer) it6.next());
                }
            }
            cgiLqtPlanIndex$PlanItemParcel.f177593p = n85Var.f381172p;
            cgiLqtPlanIndex$PlanItemParcel.f177594q = n85Var.f381173q;
            cgiLqtPlanIndex$PlanItemParcel.f177595r = n85Var.f381174r;
            cgiLqtPlanIndex$PlanIndexParcel.f177578f.add(cgiLqtPlanIndex$PlanItemParcel);
        }
        cgiLqtPlanIndex$PlanIndexParcel.f177579g = m85Var.f380241g;
        cgiLqtPlanIndex$PlanIndexParcel.f177580h = m85Var.f380242h;
        r45.rd rdVar = m85Var.f380243i;
        if (rdVar != null) {
            com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$BannerParcel cgiLqtPlanIndex$BannerParcel = new com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$BannerParcel();
            cgiLqtPlanIndex$PlanIndexParcel.f177581i = cgiLqtPlanIndex$BannerParcel;
            cgiLqtPlanIndex$BannerParcel.f177569d = rdVar.f384735d;
            cgiLqtPlanIndex$BannerParcel.f177570e = rdVar.f384736e;
        }
        cgiLqtPlanIndex$PlanIndexParcel.f177582m = m85Var.f380244m;
        cgiLqtPlanIndex$PlanIndexParcel.f177583n = m85Var.f380245n;
        return cgiLqtPlanIndex$PlanIndexParcel;
    }

    public static r45.m85 t(com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$PlanIndexParcel cgiLqtPlanIndex$PlanIndexParcel) {
        if (cgiLqtPlanIndex$PlanIndexParcel == null) {
            return null;
        }
        r45.m85 m85Var = new r45.m85();
        m85Var.f380238d = cgiLqtPlanIndex$PlanIndexParcel.f177576d;
        m85Var.f380239e = cgiLqtPlanIndex$PlanIndexParcel.f177577e;
        java.util.Iterator it = cgiLqtPlanIndex$PlanIndexParcel.f177578f.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$PlanItemParcel cgiLqtPlanIndex$PlanItemParcel = (com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$PlanItemParcel) it.next();
            r45.n85 n85Var = new r45.n85();
            n85Var.f381163d = cgiLqtPlanIndex$PlanItemParcel.f177584d;
            n85Var.f381164e = cgiLqtPlanIndex$PlanItemParcel.f177585e;
            n85Var.f381165f = cgiLqtPlanIndex$PlanItemParcel.f177586f;
            n85Var.f381166g = cgiLqtPlanIndex$PlanItemParcel.f177587g;
            n85Var.f381167h = cgiLqtPlanIndex$PlanItemParcel.f177588h;
            n85Var.f381168i = cgiLqtPlanIndex$PlanItemParcel.f177589i;
            n85Var.f381176t = cgiLqtPlanIndex$PlanItemParcel.f177597t;
            n85Var.f381175s = cgiLqtPlanIndex$PlanItemParcel.f177596s;
            if (cgiLqtPlanIndex$PlanItemParcel.f177590m != null) {
                r45.ro6 ro6Var = new r45.ro6();
                n85Var.f381169m = ro6Var;
                com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$TransTipsItemParcel cgiLqtPlanIndex$TransTipsItemParcel = cgiLqtPlanIndex$PlanItemParcel.f177590m;
                ro6Var.f385065d = cgiLqtPlanIndex$TransTipsItemParcel.f177598d;
                ro6Var.f385066e = cgiLqtPlanIndex$TransTipsItemParcel.f177599e;
            }
            if (cgiLqtPlanIndex$PlanItemParcel.f177591n != null) {
                r45.eq4 eq4Var = new r45.eq4();
                n85Var.f381170n = eq4Var;
                com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$MoreRecordsParcel cgiLqtPlanIndex$MoreRecordsParcel = cgiLqtPlanIndex$PlanItemParcel.f177591n;
                eq4Var.f373675d = cgiLqtPlanIndex$MoreRecordsParcel.f177574d;
                eq4Var.f373676e = cgiLqtPlanIndex$MoreRecordsParcel.f177575e;
            }
            if (cgiLqtPlanIndex$PlanItemParcel.f177592o != null) {
                r45.dn4 dn4Var = new r45.dn4();
                n85Var.f381171o = dn4Var;
                com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$MngPlanItemParcel cgiLqtPlanIndex$MngPlanItemParcel = cgiLqtPlanIndex$PlanItemParcel.f177592o;
                dn4Var.f372595d = cgiLqtPlanIndex$MngPlanItemParcel.f177571d;
                dn4Var.f372596e = cgiLqtPlanIndex$MngPlanItemParcel.f177572e;
                java.util.Iterator it6 = cgiLqtPlanIndex$MngPlanItemParcel.f177573f.iterator();
                while (it6.hasNext()) {
                    n85Var.f381171o.f372597f.add((java.lang.Integer) it6.next());
                }
            }
            n85Var.f381172p = cgiLqtPlanIndex$PlanItemParcel.f177593p;
            n85Var.f381173q = cgiLqtPlanIndex$PlanItemParcel.f177594q;
            n85Var.f381174r = cgiLqtPlanIndex$PlanItemParcel.f177595r;
            m85Var.f380240f.add(n85Var);
        }
        m85Var.f380241g = cgiLqtPlanIndex$PlanIndexParcel.f177579g;
        m85Var.f380242h = cgiLqtPlanIndex$PlanIndexParcel.f177580h;
        if (cgiLqtPlanIndex$PlanIndexParcel.f177581i != null) {
            r45.rd rdVar = new r45.rd();
            m85Var.f380243i = rdVar;
            com.tencent.mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex$BannerParcel cgiLqtPlanIndex$BannerParcel = cgiLqtPlanIndex$PlanIndexParcel.f177581i;
            rdVar.f384735d = cgiLqtPlanIndex$BannerParcel.f177569d;
            rdVar.f384736e = cgiLqtPlanIndex$BannerParcel.f177570e;
        }
        m85Var.f380244m = cgiLqtPlanIndex$PlanIndexParcel.f177582m;
        m85Var.f380245n = cgiLqtPlanIndex$PlanIndexParcel.f177583n;
        return m85Var;
    }
}
