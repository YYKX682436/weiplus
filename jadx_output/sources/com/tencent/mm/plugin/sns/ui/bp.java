package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class bp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSettingUI f168030d;

    public bp(com.tencent.mm.plugin.sns.ui.SnsSettingUI snsSettingUI) {
        this.f168030d = snsSettingUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this.f168030d.getContext());
        u1Var.u("设置CDN测试IP");
        u1Var.f(java.lang.Boolean.TRUE);
        final java.lang.String str = "114.221.146.152";
        u1Var.o("114.221.146.152");
        u1Var.b(new com.tencent.mm.ui.widget.dialog.w1(str) { // from class: com.tencent.mm.plugin.sns.ui.bp$$a
            @Override // com.tencent.mm.ui.widget.dialog.w1
            public final void a(boolean z17, java.lang.String str2) {
                com.tencent.mm.plugin.sns.ui.bp bpVar = com.tencent.mm.plugin.sns.ui.bp.this;
                bpVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$onClick$0", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$3");
                com.tencent.mm.plugin.sns.ui.SnsSettingUI snsSettingUI = bpVar.f168030d;
                snsSettingUI.hideVKB();
                if (z17) {
                    x51.o1.C = true;
                    if (android.text.TextUtils.isEmpty(str2)) {
                        str2 = "114.221.146.152";
                    }
                    x51.o1.D = str2;
                    int i17 = com.tencent.mm.plugin.sns.ui.SnsSettingUI.g;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
                    com.tencent.mars.xlog.Log.i(snsSettingUI.d, "set cdn debug ip:%s", str2);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$onClick$0", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$3");
            }
        });
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$3");
    }
}
