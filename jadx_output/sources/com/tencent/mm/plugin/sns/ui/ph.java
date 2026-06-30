package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ph implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.qh f170218d;

    public ph(com.tencent.mm.plugin.sns.ui.qh qhVar) {
        this.f170218d = qhVar;
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWhenLess", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWhenLess", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$2$1");
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWhenOK", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$2$1");
        com.tencent.mm.plugin.sns.ui.qh qhVar = this.f170218d;
        java.lang.String trim = com.tencent.mm.plugin.sns.ui.SnsCommentUI.T6(qhVar.f170342d).getText().toString().trim();
        com.tencent.mm.plugin.sns.ui.SnsCommentUI snsCommentUI = qhVar.f170342d;
        com.tencent.mm.plugin.sns.ui.SnsCommentUI.T6(snsCommentUI).setText("");
        if (trim.length() > 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
            int i17 = snsCommentUI.f167142g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
            if (i17 == 0) {
                snsCommentUI.hideVKB();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                snsCommentUI.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendComment", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                com.tencent.mm.plugin.sns.storage.SnsInfo i18 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(snsCommentUI.f167141f);
                if (i18 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendComment", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                } else {
                    snsCommentUI.f167144i = true;
                    zb4.a aVar = new zb4.a();
                    aVar.i(trim);
                    aVar.g(0);
                    if (i18.isExtFlag()) {
                        com.tencent.mm.plugin.sns.model.d6.m(i18, 2, trim, 0L, "", false, snsCommentUI.f167143h);
                    } else {
                        com.tencent.mm.plugin.sns.model.d6.p(i18.field_userName, 3, aVar, i18, snsCommentUI.f167143h);
                    }
                    snsCommentUI.hideVKB();
                    snsCommentUI.f167140e = db5.e1.Q(snsCommentUI, snsCommentUI.getString(com.tencent.mm.R.string.f490573yv), snsCommentUI.getString(com.tencent.mm.R.string.f490552yb), true, true, new com.tencent.mm.plugin.sns.ui.oh(snsCommentUI));
                    com.tencent.mm.plugin.sns.statistics.s0.f164937k0.Q().f60458r = 2L;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendComment", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
            } else if (i17 == 1) {
                snsCommentUI.hideVKB();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                snsCommentUI.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendSayHi", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                if (snsCommentUI.isFinishing()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendSayHi", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                } else {
                    c01.z1.r();
                    com.tencent.mm.plugin.sns.model.y7 y7Var = new com.tencent.mm.plugin.sns.model.y7(2, snsCommentUI.getContext());
                    y7Var.t(trim);
                    if (snsCommentUI.f167139d.getPasterLen() > q94.a.f360928a) {
                        y7Var.u(1, 2);
                    }
                    y7Var.i();
                    snsCommentUI.setResult(-1);
                    snsCommentUI.finish();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendSayHi", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsCommentUI");
            } else if (i17 == 2) {
                snsCommentUI.hideVKB();
                snsCommentUI.getIntent().getLongExtra("sns_id", 0L);
                snsCommentUI.getIntent().getLongExtra("action_st_time", 0L);
                snsCommentUI.getIntent().getStringExtra("sns_uxinfo");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                snsCommentUI.getIntent().getStringExtra("sns_actionresult");
                java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.sns.model.l4.vj().getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWhenOK", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$2$1");
                return;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWhenOK", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$2$1");
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWhenMore", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$2$1");
        db5.e1.i(this.f170218d.f170342d, com.tencent.mm.R.string.f493259jh1, com.tencent.mm.R.string.f493260jh2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWhenMore", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$2$1");
    }
}
