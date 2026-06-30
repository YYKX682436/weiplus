package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class th implements nl5.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentUI f170524a;

    public th(com.tencent.mm.plugin.sns.ui.SnsCommentUI snsCommentUI) {
        this.f170524a = snsCommentUI;
    }

    @Override // nl5.a0
    public void a(android.view.View view, nl5.z zVar, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClicked", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$5");
        long e17 = c01.id.e();
        if (zVar.f338398b == 2) {
            com.tencent.mm.plugin.sns.ui.SnsCommentUI snsCommentUI = this.f170524a;
            com.tencent.mm.plugin.sns.ui.SnsCommentUI.T6(snsCommentUI).getText().insert(com.tencent.mm.plugin.sns.ui.SnsCommentUI.T6(snsCommentUI).getSelectionStart(), snsCommentUI.getContext().getString(com.tencent.mm.R.string.jo7));
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter.I(snsCommentUI.getContext(), snsCommentUI.f167146n, false, "", 2, "", e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClicked", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$5");
    }

    @Override // nl5.a0
    public void b(java.util.List list, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuInit", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$5");
        long e17 = c01.id.e();
        ((su4.x0) i95.n0.c(su4.x0.class)).getClass();
        if (i17 != 8 && i17 != 1) {
            ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
            if (!su4.r2.l()) {
                com.tencent.mm.plugin.sns.ui.SnsCommentUI snsCommentUI = this.f170524a;
                list.add(new nl5.z(snsCommentUI.getContext().getString(com.tencent.mm.R.string.jo7), 2));
                if (snsCommentUI.f167146n == null) {
                    com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                    int i18 = snsCommentUI.f167141f;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                    snsCommentUI.f167146n = Fj.i1(i18);
                }
                com.tencent.mm.plugin.sns.ui.SnsCommentFooter.I(snsCommentUI.getContext(), snsCommentUI.f167146n, false, "", 1, "", e17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuInit", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$5");
    }
}
