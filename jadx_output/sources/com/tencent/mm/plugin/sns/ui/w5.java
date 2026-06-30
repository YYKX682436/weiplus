package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class w5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.x5 f170733d;

    public w5(com.tencent.mm.plugin.sns.ui.x5 x5Var) {
        this.f170733d = x5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        r45.ek4 ek4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/MegaVideoWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        com.tencent.mm.plugin.sns.ui.x5 x5Var = this.f170733d;
        x5Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gotoFinderDetail", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        m21.p pVar = x5Var.f171491q;
        if (pVar != null && (ek4Var = pVar.f322997a) != null) {
            long F0 = ca4.z0.F0(ek4Var.getString(0));
            if (F0 != 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("report_scene", 3);
                intent.putExtra("from_user", x5Var.f171491q.f322997a.getString(1));
                intent.putExtra("feed_object_id", F0);
                intent.putExtra("business_type", 1);
                intent.putExtra("finder_user_name", x5Var.f171491q.f322997a.getString(1));
                intent.putExtra("feed_object_nonceId", x5Var.f171491q.f322997a.getString(7));
                intent.putExtra("key_from_user_name", x5Var.f171491q.f322997a.getString(1));
                intent.putExtra("tab_type", 5);
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, 25, intent);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.e1.f460472a.A(x5Var.f169957c, intent, false);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gotoFinderDetail", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/MegaVideoWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.MegaVideoWidget$1");
    }
}
