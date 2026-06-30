package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class xq implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI f171582a;

    public xq(com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI snsStrangerCommentDetailUI) {
        this.f171582a = snsStrangerCommentDetailUI;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$4");
        if (i17 == 0) {
            com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI snsStrangerCommentDetailUI = this.f171582a;
            if (com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI.U6(snsStrangerCommentDetailUI).o2()) {
                c01.e2.F0(com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI.U6(snsStrangerCommentDetailUI));
                com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI.U6(snsStrangerCommentDetailUI).r3();
                ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
            } else {
                c01.e2.k0(com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI.U6(snsStrangerCommentDetailUI));
                com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI.U6(snsStrangerCommentDetailUI).E2();
                ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$4");
    }
}
