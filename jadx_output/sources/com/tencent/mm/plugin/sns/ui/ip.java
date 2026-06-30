package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class ip implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.jp f169243a;

    public ip(com.tencent.mm.plugin.sns.ui.jp jpVar) {
        this.f169243a = jpVar;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.jp jpVar = this.f169243a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem$1");
        try {
            java.lang.Object obj = jpVar.f169537d;
            boolean z17 = obj instanceof int[];
            com.tencent.mm.storage.u3 u3Var = jpVar.f169536c;
            if (z17) {
                int i19 = ((int[]) obj)[i17];
                if (gm0.j1.a()) {
                    gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(i19));
                }
            } else if (obj instanceof long[]) {
                long j17 = ((long[]) obj)[i17];
                if (gm0.j1.a()) {
                    gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(j17));
                }
            }
            com.tencent.mm.plugin.sns.ui.SnsSettingUI snsSettingUI = jpVar.f169538e;
            int i27 = com.tencent.mm.plugin.sns.ui.SnsSettingUI.g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
            com.tencent.mm.plugin.sns.ui.hp hpVar = snsSettingUI.f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
            hpVar.notifyDataSetChanged();
        } catch (java.lang.Exception e17) {
            com.tencent.mm.plugin.sns.ui.SnsSettingUI snsSettingUI2 = jpVar.f169538e;
            int i28 = com.tencent.mm.plugin.sns.ui.SnsSettingUI.g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
            java.lang.String str = snsSettingUI2.d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceItem$1");
    }
}
