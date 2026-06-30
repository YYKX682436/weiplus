package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class g4 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI f207697a;

    public g4(com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI) {
        this.f207697a = enterpriseConversationFmUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        r01.m y07;
        int i17;
        if (message == null || message.what != 1) {
            return;
        }
        com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI = this.f207697a;
        if (enterpriseConversationFmUI.thisActivity() == null || enterpriseConversationFmUI.thisActivity().isFinishing()) {
            return;
        }
        int count = enterpriseConversationFmUI.f207350i.getCount();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        int i28 = 0;
        for (int i29 = 0; i29 < count; i29++) {
            com.tencent.mm.ui.conversation.p7 item = enterpriseConversationFmUI.f207350i.getItem(i29);
            com.tencent.mm.storage.l4 l4Var = item == null ? null : item.f207965c;
            if (l4Var == null) {
                com.tencent.mm.ui.conversation.p7 item2 = enterpriseConversationFmUI.f207350i.getItem(i29);
                s01.b bVar = item2 == null ? null : item2.f207966d;
                if (bVar != null && (i17 = bVar.field_unReadCount) > 0) {
                    i19 += i17;
                }
            } else {
                java.lang.String h17 = l4Var.h1();
                if (h17 != null) {
                    if (c01.e2.J(h17) && r01.z.i(h17)) {
                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(h17, true);
                        boolean K = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(h17);
                        boolean z17 = (n17 == null || (n17.getType() & 2048) == 0) ? false : true;
                        if (z17 && !K) {
                            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().S(h17);
                        } else if (!z17 && K) {
                            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().V(h17);
                        }
                        if (l4Var.d1() > 0) {
                            if (c01.e2.Q(h17)) {
                                i27++;
                            } else {
                                i28++;
                                i18 += l4Var.d1();
                            }
                        }
                    } else {
                        linkedList.add(h17);
                    }
                }
            }
        }
        r01.m y08 = r01.q3.bj().y0(enterpriseConversationFmUI.f207351m);
        int i37 = y08 != null ? y08.field_qyUin : 0;
        long j17 = y08 != null ? y08.field_wwCorpId : 0L;
        long j18 = y08 != null ? y08.field_wwUserVid : 0L;
        int i38 = (com.tencent.mm.sdk.platformtools.t8.K0(enterpriseConversationFmUI.f207359u) || (y07 = r01.q3.bj().y0(enterpriseConversationFmUI.f207359u)) == null) ? 0 : y07.field_qyUin;
        int i39 = i18 + i19;
        enterpriseConversationFmUI.setUnread(i39, false);
        if (i39 > 0) {
            enterpriseConversationFmUI.setMMTitle(enterpriseConversationFmUI.f207345d + "(" + i39 + ")");
        } else {
            enterpriseConversationFmUI.setMMTitle(enterpriseConversationFmUI.f207345d);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EnterpriseConversationUI", "redNumSum:%s, redBizChatNumSum:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12892, enterpriseConversationFmUI.f207351m, java.lang.Integer.valueOf(enterpriseConversationFmUI.f207360v), java.lang.Integer.valueOf(count), "", java.lang.Integer.valueOf(enterpriseConversationFmUI.f207357s), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Long.valueOf(enterpriseConversationFmUI.f207358t), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i37), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        if (linkedList.size() > 0) {
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).m(linkedList);
            enterpriseConversationFmUI.f207350i.q();
        }
        if (r01.q3.Ai().c(enterpriseConversationFmUI.f207351m, null)) {
            r01.q3.bj().b1(enterpriseConversationFmUI.f207351m, null);
        }
        java.util.List i110 = r01.q3.cj().i1(enterpriseConversationFmUI.f207351m);
        int i47 = 0;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) i110;
            if (i47 >= arrayList.size()) {
                return;
            }
            java.lang.String str = (java.lang.String) arrayList.get(i47);
            if (c01.e2.J(str)) {
                r01.q3.Ai().c(str, null);
            }
            i47++;
        }
    }
}
