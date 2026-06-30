package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class r7 implements ud4.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.p7 f170392a;

    public r7(com.tencent.mm.plugin.sns.ui.p7 p7Var) {
        this.f170392a = p7Var;
    }

    @Override // ud4.d
    public void a(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("moveItem", "com.tencent.mm.plugin.sns.ui.PicWidget$2");
        com.tencent.mm.plugin.sns.ui.p7 p7Var = this.f170392a;
        com.tencent.mm.plugin.sns.ui.x7 x7Var = p7Var.f170164g;
        x7Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("moveItem", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        if (i17 == i18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("moveItem", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        } else if (x7Var.f171492a.size() <= i17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("moveItem", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        } else {
            java.lang.String str = (java.lang.String) x7Var.f171492a.remove(i17);
            if (i18 < x7Var.f171492a.size()) {
                x7Var.f171492a.add(i18, str);
            } else {
                x7Var.f171492a.add(str);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("moveItem", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        }
        p7Var.f169957c.getIntent().putExtra("sns_kemdia_path_list", p7Var.f170164g.d());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("moveItem", "com.tencent.mm.plugin.sns.ui.PicWidget$2");
    }

    @Override // ud4.d
    public void removeItem(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeItem", "com.tencent.mm.plugin.sns.ui.PicWidget$2");
        com.tencent.mars.xlog.Log.i("MicroMsg.PicWidget", "removeItem: pos:%d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.p7 p7Var = this.f170392a;
        com.tencent.mm.plugin.sns.ui.x7 x7Var = p7Var.f170164g;
        x7Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeItem", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        if (x7Var.f171492a.size() > i17) {
            x7Var.f171492a.remove(i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeItem", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        com.tencent.mm.ui.MMActivity mMActivity = p7Var.f169957c;
        if (mMActivity instanceof com.tencent.mm.plugin.sns.ui.SnsUploadUI) {
            ((com.tencent.mm.plugin.sns.ui.SnsUploadUI) mMActivity).q7();
        }
        p7Var.f169957c.getIntent().putExtra("sns_kemdia_path_list", p7Var.f170164g.d());
        p7Var.f169957c.getIntent().putExtra("sns_kemdia_path", "");
        ((ud4.t) p7Var.f170165h).d(p7Var.f170164g.c());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeItem", "com.tencent.mm.plugin.sns.ui.PicWidget$2");
    }
}
