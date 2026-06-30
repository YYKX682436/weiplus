package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class of implements nl5.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentFooter f170098a;

    public of(com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter) {
        this.f170098a = snsCommentFooter;
    }

    @Override // nl5.a0
    public void a(android.view.View view, nl5.z zVar, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClicked", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$11");
        long e17 = c01.id.e();
        if (zVar.f338398b == 2) {
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = this.f170098a;
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter.l(snsCommentFooter).getText().insert(com.tencent.mm.plugin.sns.ui.SnsCommentFooter.l(snsCommentFooter).getSelectionStart(), com.tencent.mm.plugin.sns.ui.SnsCommentFooter.i(snsCommentFooter).getString(com.tencent.mm.R.string.jo7));
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter.I(snsCommentFooter.getContext(), snsCommentFooter.getTag(), com.tencent.mm.plugin.sns.ui.SnsCommentFooter.j(snsCommentFooter), "", 2, "", e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClicked", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$11");
    }

    @Override // nl5.a0
    public void b(java.util.List list, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuInit", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$11");
        long e17 = c01.id.e();
        ((su4.x0) i95.n0.c(su4.x0.class)).getClass();
        if (i17 != 8 && i17 != 1) {
            ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
            if (!su4.r2.l()) {
                com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = this.f170098a;
                list.add(new nl5.z(com.tencent.mm.plugin.sns.ui.SnsCommentFooter.i(snsCommentFooter).getString(com.tencent.mm.R.string.jo7), 2));
                com.tencent.mm.plugin.sns.ui.SnsCommentFooter.I(snsCommentFooter.getContext(), snsCommentFooter.getTag(), com.tencent.mm.plugin.sns.ui.SnsCommentFooter.j(snsCommentFooter), "", 1, "", e17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuInit", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$11");
    }
}
