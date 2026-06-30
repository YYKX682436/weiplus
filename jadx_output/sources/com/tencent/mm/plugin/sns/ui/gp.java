package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class gp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.lp f168453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f168454e;

    public gp(com.tencent.mm.plugin.sns.ui.hp hpVar, com.tencent.mm.plugin.sns.ui.lp lpVar, android.widget.TextView textView) {
        this.f168453d = lpVar;
        this.f168454e = textView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$ChoiceAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f168453d.b(this.f168454e);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$ChoiceAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter$1");
    }
}
