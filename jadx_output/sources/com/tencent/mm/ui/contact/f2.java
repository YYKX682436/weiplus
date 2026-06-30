package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f206700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.g2 f206701e;

    public f2(com.tencent.mm.ui.contact.g2 g2Var, int i17) {
        this.f206701e = g2Var;
        this.f206700d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Runnable runnable;
        i21.q h17 = i21.q.h();
        com.tencent.mm.ui.contact.g2 g2Var = this.f206701e;
        com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI = g2Var.f206717a;
        java.lang.String str = contactRemarkInfoModUI.f206385t;
        java.util.LinkedList linkedList = contactRemarkInfoModUI.f206389x;
        int i17 = this.f206700d;
        java.lang.String d17 = h17.d(str, ((r45.c5) linkedList.get(i17)).f371292d);
        g2Var.f206717a.G.add(i17, d17);
        if (i17 < g2Var.f206717a.f206368J.size()) {
            ((r45.ko5) g2Var.f206717a.f206368J.get(i17)).set(2, d17);
        }
        if (i17 == 0 && ((r45.c5) g2Var.f206717a.f206389x.get(i17)).f371293e == null) {
            g2Var.f206717a.E.add(d17);
            g2Var.f206717a.f206392y.remove(i17);
        }
        com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI2 = g2Var.f206717a;
        contactRemarkInfoModUI2.f7(contactRemarkInfoModUI2.G, 0);
        com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI3 = g2Var.f206717a;
        com.tencent.mars.xlog.Log.i("MiroMsg.ContactRemarkInfoModUI", "checkRunPendingAddRecommendImage() called remarkImageDownloadCount:%s", java.lang.Integer.valueOf(contactRemarkInfoModUI3.R1));
        if (contactRemarkInfoModUI3.R1 != 0 || (runnable = contactRemarkInfoModUI3.O1) == null) {
            return;
        }
        runnable.run();
        contactRemarkInfoModUI3.O1 = null;
    }
}
