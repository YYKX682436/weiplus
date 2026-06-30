package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class hp extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSettingUI f168527d;

    public hp(com.tencent.mm.plugin.sns.ui.SnsSettingUI snsSettingUI) {
        this.f168527d = snsSettingUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsSettingUI.g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        java.util.LinkedList linkedList = this.f168527d.e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        int size = linkedList.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
        return size;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
        int i18 = com.tencent.mm.plugin.sns.ui.SnsSettingUI.g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        java.util.LinkedList linkedList = this.f168527d.e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        java.lang.Object obj = linkedList.get(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
        return obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
        android.widget.TextView textView = new android.widget.TextView(this.f168527d);
        com.tencent.mm.plugin.sns.ui.lp lpVar = (com.tencent.mm.plugin.sns.ui.lp) getItem(i17);
        textView.setTag(lpVar);
        textView.setText(lpVar.a() + "->:" + lpVar.value());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setHeight(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 50));
        if (i17 % 2 == 1) {
            textView.setBackgroundColor(android.graphics.Color.parseColor("#e2efda"));
        }
        textView.setOnClickListener(new com.tencent.mm.plugin.sns.ui.gp(this, lpVar, textView));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
        return textView;
    }
}
