package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class ol implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI f161399d;

    public ol(com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI settingsSearchAuthUI) {
        this.f161399d = settingsSearchAuthUI;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$6", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        if (i17 + i18 == i19) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI settingsSearchAuthUI = this.f161399d;
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSearchAuthUI", "scroll to the end nexPageData: %s", settingsSearchAuthUI.f160646s);
            if (settingsSearchAuthUI.f160646s != null && settingsSearchAuthUI.f160650w.getVisibility() == 0) {
                com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI.U6(settingsSearchAuthUI, settingsSearchAuthUI.f160643p, settingsSearchAuthUI.f160646s);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$6", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$6", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$6", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
