package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class s6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI f173138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f173139e;

    public s6(com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI, android.widget.TextView textView) {
        this.f173138d = teenModePrivatePwdUI;
        this.f173139e = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI.f172900r;
        com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI = this.f173138d;
        if (teenModePrivatePwdUI.i7()) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("IntentResult_GoVerifyPwd", true);
            teenModePrivatePwdUI.setResult(0, intent);
            teenModePrivatePwdUI.finish();
        } else {
            android.widget.TextView textView = this.f173139e;
            com.tencent.mm.ui.MMWizardActivity.Y6(textView.getContext(), new android.content.Intent(textView.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI.class), new android.content.Intent(textView.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain.class));
            teenModePrivatePwdUI.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
