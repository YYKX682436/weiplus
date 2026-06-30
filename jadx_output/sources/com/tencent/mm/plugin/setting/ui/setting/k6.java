package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class k6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f161224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI f161225e;

    public k6(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI settingsAboutSystemUI, android.widget.LinearLayout linearLayout) {
        this.f161225e = settingsAboutSystemUI;
        this.f161224d = linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = 0;
        while (true) {
            android.widget.LinearLayout linearLayout = this.f161224d;
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
        int intValue = ((java.lang.Integer) gm0.j1.u().c().l(7, 0)).intValue();
        int intValue2 = ((java.lang.Integer) view.getTag()).intValue();
        if ((intValue2 == 0) == ((intValue & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) == 0)) {
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean z17 = intValue2 == 0;
        int i18 = z17 ? intValue & (-16777217) : intValue | com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62;
        int i19 = z17 ? 2 : 1;
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(i18));
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 35;
        p53Var.f382762e = i19;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        ((com.tencent.mm.app.o7) f14.g.a()).Zi();
        view.post(new com.tencent.mm.plugin.setting.ui.setting.j6(this));
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
