package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class tp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI f161586d;

    public tp(com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI) {
        this.f161586d = unfamiliarContactDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI = this.f161586d;
        android.widget.CheckBox checkBox = (android.widget.CheckBox) unfamiliarContactDetailUI.f160774o.findViewById(com.tencent.mm.R.id.btf);
        checkBox.setChecked(!checkBox.isChecked());
        if (checkBox.isChecked()) {
            for (int i17 = 0; i17 < unfamiliarContactDetailUI.f160779t.size(); i17++) {
                unfamiliarContactDetailUI.f160780u.add(java.lang.Integer.valueOf(i17));
            }
        } else {
            unfamiliarContactDetailUI.f160780u.clear();
        }
        if (unfamiliarContactDetailUI.f160780u.size() > 0) {
            unfamiliarContactDetailUI.f160773n.setEnabled(true);
            unfamiliarContactDetailUI.f160772m.setEnabled(true);
        } else {
            unfamiliarContactDetailUI.f160773n.setEnabled(false);
            unfamiliarContactDetailUI.f160772m.setEnabled(false);
        }
        unfamiliarContactDetailUI.f160769g.post(new com.tencent.mm.plugin.setting.ui.setting.sp(this));
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
