package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class zp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.bq f161836d;

    public zp(com.tencent.mm.plugin.setting.ui.setting.bq bqVar, com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI) {
        this.f161836d = bqVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$ContactViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.tencent.mm.plugin.setting.ui.setting.bq bqVar = this.f161836d;
        bqVar.f160889m.setChecked(!r1.isChecked());
        if (bqVar.f160889m.isChecked()) {
            bqVar.f160892p.f160780u.add(java.lang.Integer.valueOf(intValue));
        } else {
            bqVar.f160892p.f160780u.remove(java.lang.Integer.valueOf(intValue));
        }
        if (bqVar.f160892p.f160780u.size() == 0) {
            bqVar.f160892p.f160773n.setEnabled(false);
            bqVar.f160892p.f160772m.setEnabled(false);
        } else {
            bqVar.f160892p.f160773n.setEnabled(true);
            bqVar.f160892p.f160772m.setEnabled(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$ContactViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
