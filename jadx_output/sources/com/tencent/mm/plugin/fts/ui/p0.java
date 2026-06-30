package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class p0 extends com.tencent.mm.plugin.fts.ui.r0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBaseMainUI f138139e;

    public p0(com.tencent.mm.plugin.fts.ui.FTSBaseMainUI fTSBaseMainUI) {
        this.f138139e = fTSBaseMainUI;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        q01.g gVar = (q01.g) obj;
        int i17 = gVar.f359280b;
        tg3.r1 r1Var = (tg3.r1) gVar.f359283e;
        com.tencent.mm.plugin.fts.ui.FTSBaseMainUI fTSBaseMainUI = this.f138139e;
        int i18 = gVar.f359281c;
        if (i17 == 4 && i18 == -4) {
            int i19 = com.tencent.mm.plugin.fts.ui.FTSBaseMainUI.W1;
            fTSBaseMainUI.getClass();
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fts.ui.h0(fTSBaseMainUI));
            db5.e1.o(fTSBaseMainUI, com.tencent.mm.R.string.icr, 0, true, null);
            return;
        }
        int i27 = com.tencent.mm.plugin.fts.ui.FTSBaseMainUI.W1;
        fTSBaseMainUI.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fts.ui.h0(fTSBaseMainUI));
        if (i17 != 0 || i18 != 0) {
            if (i18 == -24) {
                tm.a b17 = tm.a.b(gVar.f359282d);
                if (b17 != null) {
                    db5.e1.G(fTSBaseMainUI, b17.f420399b, b17.f420401d, true, null);
                }
            } else if (i18 == -4) {
                android.widget.Toast.makeText(fTSBaseMainUI, fTSBaseMainUI.getString(com.tencent.mm.R.string.icn), 0).show();
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.FTS.FTSMainUI", java.lang.String.format("Search contact failed: %d, %d.", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
            return;
        }
        r45.iw5 H = r1Var.H();
        if (H.D > 0) {
            java.util.LinkedList linkedList = H.E;
            if (linkedList.isEmpty()) {
                db5.e1.o(fTSBaseMainUI, com.tencent.mm.R.string.icr, 0, true, null);
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            ((c01.j0) ((qk.o6) i95.n0.c(qk.o6.class))).wi(intent, (r45.gw5) linkedList.getFirst(), fTSBaseMainUI.T1);
            j45.l.j(fTSBaseMainUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
            return;
        }
        java.lang.String g17 = x51.j1.g(H.f377356d);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (g17 == null) {
            g17 = "";
        }
        if (g17.length() > 0) {
            int i28 = H.K;
            if (2 == i28) {
                fTSBaseMainUI.T1 = 15;
            } else if (1 == i28) {
                fTSBaseMainUI.T1 = 1;
            }
            android.content.Intent intent2 = new android.content.Intent();
            ((c01.j0) ((qk.o6) i95.n0.c(qk.o6.class))).Ai(intent2, H, fTSBaseMainUI.T1);
            if (fTSBaseMainUI.T1 == 15) {
                intent2.putExtra("Contact_Search_Mobile", this.f138165d.trim());
            }
            intent2.putExtra("Contact_Scene", fTSBaseMainUI.T1);
            intent2.putExtra("add_more_friend_search_scene", 2);
            j45.l.j(fTSBaseMainUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
        }
    }
}
