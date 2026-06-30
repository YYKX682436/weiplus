package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class ep implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSettingUI f168257d;

    public ep(com.tencent.mm.plugin.sns.ui.SnsSettingUI snsSettingUI) {
        this.f168257d = snsSettingUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$6");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this.f168257d.getContext());
        u1Var.u("清除见面有礼广告彩蛋页MMKV（重启生效）");
        u1Var.f(java.lang.Boolean.TRUE);
        u1Var.b(new com.tencent.mm.ui.widget.dialog.w1() { // from class: com.tencent.mm.plugin.sns.ui.ep$$a
            @Override // com.tencent.mm.ui.widget.dialog.w1
            public final void a(boolean z17, java.lang.String str) {
                com.tencent.mm.plugin.sns.ui.ep epVar = com.tencent.mm.plugin.sns.ui.ep.this;
                epVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$onClick$0", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$6");
                epVar.f168257d.hideVKB();
                if (z17) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearFreshList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
                    if (str == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearFreshList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
                    } else {
                        java.lang.String d17 = p44.b0.f351771a.d(str);
                        com.tencent.mars.xlog.Log.i("RandomPickCardStorage", "clearFreshList, key=" + d17);
                        p34.o.i(d17, "");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearFreshList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardStorage");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$onClick$0", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$6");
            }
        });
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$6");
    }
}
