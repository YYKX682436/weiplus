package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class m6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f161315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f161316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI f161317f;

    public m6(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI settingsAboutSystemUI, android.widget.LinearLayout linearLayout, int i17) {
        this.f161317f = settingsAboutSystemUI;
        this.f161315d = linearLayout;
        this.f161316e = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = 0;
        while (true) {
            android.widget.LinearLayout linearLayout = this.f161315d;
            if (i17 >= linearLayout.getChildCount()) {
                break;
            }
            android.widget.TextView textView = (android.widget.TextView) linearLayout.getChildAt(i17);
            if (com.tencent.mm.R.id.f487334ob5 != textView.getId()) {
                textView.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.raw.radio_off, 0, 0, 0);
            }
            i17++;
        }
        ((android.widget.TextView) view).setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.raw.radio_on, 0, 0, 0);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        int i18 = this.f161316e;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAboutSystemUI", "choice: %d, %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(intValue));
        if (i18 == intValue) {
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            view.post(new com.tencent.mm.plugin.setting.ui.setting.l6(this, intValue));
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
