package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class m9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro f161321d;

    public m9(com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro) {
        this.f161321d = settingsCareModeIntro;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro = this.f161321d;
        intent.setClass(settingsCareModeIntro, com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI.class);
        settingsCareModeIntro.startActivityForResult(intent, settingsCareModeIntro.f160362x.hashCode());
        java.util.HashMap hashMap = new java.util.HashMap();
        wd0.g1 Ui = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ui();
        int Di = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Di();
        if (Ui == wd0.g1.f444714f) {
            Di = 100;
        }
        hashMap.put("vocals_enhance_mode", java.lang.Integer.valueOf(Di));
        jz5.g gVar = com.tencent.mm.plugin.setting.ui.setting.bm.f160878a;
        java.lang.String str = com.tencent.mm.plugin.setting.ui.setting.bm.f160879b;
        if (str == null) {
            str = (java.lang.String) ((jz5.n) com.tencent.mm.plugin.setting.ui.setting.bm.f160878a).getValue();
        }
        hashMap.put("care_mode_sessionid", str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("vocals_enhance_btn", "view_clk", hashMap, 35684);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
