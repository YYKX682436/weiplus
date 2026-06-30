package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public class tr implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI f170545d;

    public tr(com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI snsTagPartlyUI) {
        this.f170545d = snsTagPartlyUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI snsTagPartlyUI = this.f170545d;
        if (i17 < com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI.T6(snsTagPartlyUI).getCount() - 1) {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.sns.storage.q2 q2Var = (com.tencent.mm.plugin.sns.storage.q2) com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI.T6(snsTagPartlyUI).getItem(i17);
            if (q2Var == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$2");
                return;
            }
            intent.putExtra("k_sns_tag_id", q2Var.field_tagId);
            intent.setClass(snsTagPartlyUI, com.tencent.mm.plugin.sns.ui.SnsTagDetailUI.class);
            com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI snsTagPartlyUI2 = this.f170545d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(snsTagPartlyUI2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            snsTagPartlyUI2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(snsTagPartlyUI2, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            java.lang.String r17 = c01.z1.r();
            intent2.putExtra("titile", snsTagPartlyUI.getString(com.tencent.mm.R.string.f489930ft));
            intent2.putExtra("list_type", 1);
            intent2.putExtra("KBlockOpenImFav", true);
            com.tencent.mm.ui.contact.i5.e();
            intent2.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206782c, 1024, 64, 262144) & (-16777217));
            intent2.putExtra("min_limit_num", 1);
            intent2.putExtra("block_contact", r17);
            j45.l.v(snsTagPartlyUI, ".ui.contact.SelectContactUI", intent2, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$2");
    }
}
