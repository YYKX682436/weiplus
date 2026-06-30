package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class p5 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI f161424d;

    public p5(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI) {
        this.f161424d = settingsAboutMicroMsgUI;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMicroMsgUI$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI = this.f161424d;
        com.tencent.mm.sdk.platformtools.b0.e(settingsAboutMicroMsgUI.getString(com.tencent.mm.R.string.cu_));
        db5.t7.i(settingsAboutMicroMsgUI, settingsAboutMicroMsgUI.getString(com.tencent.mm.R.string.iow), com.tencent.mm.R.drawable.icon_toast_ok);
        yj0.a.i(true, this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMicroMsgUI$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
