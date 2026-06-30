package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class dp implements android.view.View.OnClickListener {
    public dp(com.tencent.mm.plugin.sns.ui.SnsSettingUI snsSettingUI) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$5");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.storage.p0 Ri = com.tencent.mm.plugin.sns.model.l4.Ri();
        if (Ri != null) {
            Ri.delete(Ri.getTableName(), (java.lang.String) null, (java.lang.String[]) null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$5");
    }
}
