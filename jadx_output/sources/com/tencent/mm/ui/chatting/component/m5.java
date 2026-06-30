package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public class m5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.l5 f199480d;

    public m5(com.tencent.mm.ui.chatting.component.l5 l5Var) {
        this.f199480d = l5Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        boolean z17;
        g4Var.a(0, com.tencent.mm.R.string.h0q);
        g4Var.a(1, com.tencent.mm.R.string.h0r);
        com.tencent.mm.ui.chatting.component.l5 l5Var = this.f199480d;
        android.app.Activity g17 = l5Var.f199398d.f198580d.g();
        com.tencent.wework.api.IWWAPI.WWAppType wWAppType = com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeWxwork;
        boolean h17 = com.tencent.mm.ui.chatting.hd.h(g17, wWAppType);
        com.tencent.mm.ui.chatting.component.b5 b5Var = l5Var.f199398d;
        if (h17 && !com.tencent.mm.ui.chatting.hd.k()) {
            android.app.Activity g18 = b5Var.f198580d.g();
            android.app.Activity g19 = b5Var.f198580d.g();
            com.tencent.wework.api.IWWAPI a17 = com.tencent.wework.api.WWAPIFactory.a(g19);
            java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
            g4Var.f(2, g18.getString(com.tencent.mm.R.string.h0s, !yp5.a.f464409a.a() ? g19.getString(com.tencent.mm.R.string.l_7) : a17.d(wWAppType)));
        }
        android.app.Activity g27 = b5Var.f198580d.g();
        com.tencent.wework.api.IWWAPI.WWAppType wWAppType2 = com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeLocal;
        if (com.tencent.mm.ui.chatting.hd.h(g27, wWAppType2) && !com.tencent.mm.ui.chatting.hd.j()) {
            android.app.Activity g28 = b5Var.f198580d.g();
            android.app.Activity g29 = b5Var.f198580d.g();
            com.tencent.wework.api.IWWAPI a18 = com.tencent.wework.api.WWAPIFactory.a(g29);
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.a9.f192463a;
            g4Var.f(3, g28.getString(com.tencent.mm.R.string.h0s, !yp5.a.f464409a.a() ? g29.getString(com.tencent.mm.R.string.l_7) : a18.d(wWAppType2)));
        }
        ct.j3 j3Var = (ct.j3) i95.n0.c(ct.j3.class);
        boolean z18 = b5Var.f198698i;
        qg5.z2 z2Var = (qg5.z2) j3Var;
        z2Var.getClass();
        if (j62.e.g().c(new com.tencent.mm.repairer.config.yuanbao.RepairerConfigYuanBaoMultipleEntrances()) != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "YuanBao Analyze is replaced by Copy to YuanBao");
            z17 = false;
        } else {
            boolean z19 = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigYuanBaoAnalyzeChatRecordsEntrance()) == 1;
            boolean bj6 = z2Var.bj();
            boolean z27 = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigYuanBaoAnalyzeChatRecordsSupportPrivateChat()) == 1;
            z17 = z19 && bj6 && (z18 || z27);
            if (!z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "isShowAnalyzeButton: " + z17 + ", analyzeChatRecordsConfigEnabled: " + z19 + ", isMainlandHkMoUser: " + bj6 + ", isGroupChat: " + z18 + ", analyzeSupportPrivateChatEnabled: " + z27);
            }
        }
        if (z17) {
            android.app.Activity g37 = b5Var.f198580d.g();
            db5.h4 h4Var = new db5.h4(g37, 4, 0);
            h4Var.f228368i = g37.getString(com.tencent.mm.R.string.p4t);
            h4Var.f228373q = g37.getString(com.tencent.mm.R.string.p4u);
            db5.h4 h4Var2 = new db5.h4(g4Var.f228346f, 0, 0);
            h4Var2.H = true;
            ((java.util.ArrayList) g4Var.f228344d).add(h4Var2);
            g4Var.v(h4Var);
            ((vh0.p3) ((vh0.o1) i95.n0.c(vh0.o1.class))).aj();
        }
    }
}
