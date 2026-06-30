package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ti implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsHeader f170525d;

    public ti(com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader) {
        this.f170525d = snsHeader;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeader$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.e8 pj6 = com.tencent.mm.plugin.sns.model.l4.pj();
        com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader = this.f170525d;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) pj6).n(snsHeader.f167167f, true);
        if (n17 == null || !(n17.r2() || snsHeader.f167172n)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            android.content.Context context = snsHeader.f167170i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            android.content.Intent intent = ((android.app.Activity) context).getIntent();
            intent.putExtra("Contact_User", snsHeader.f167167f);
            com.tencent.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            android.content.Context context2 = snsHeader.f167170i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            y7Var.l(intent, context2);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Contact_User", snsHeader.f167167f);
            java.lang.String str = snsHeader.f167167f;
            if (str != null && str.length() > 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                int i17 = snsHeader.f167171m;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                intent2.putExtra("CONTACT_INFO_UI_SOURCE", i17 == 1 ? 101 : 1);
                com.tencent.mm.app.y7 y7Var2 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                android.content.Context context3 = snsHeader.f167170i;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                y7Var2.l(intent2, context3);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeader$1");
    }
}
