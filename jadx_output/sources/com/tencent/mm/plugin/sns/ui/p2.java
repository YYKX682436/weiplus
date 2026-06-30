package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.q2 f170137d;

    public p2(com.tencent.mm.plugin.sns.ui.q2 q2Var) {
        this.f170137d = q2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        r45.kv2 kv2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/FinderMediaWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        com.tencent.mm.plugin.sns.ui.q2 q2Var = this.f170137d;
        q2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gotoFinderDetail", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        m21.k kVar = q2Var.f170306q;
        if (kVar != null && (kv2Var = kVar.f322992a) != null) {
            long F0 = ca4.z0.F0(kv2Var.getString(0));
            long j17 = q2Var.f170306q.f322992a.getLong(9);
            if (F0 != 0 || j17 != 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("report_scene", 3);
                intent.putExtra("from_user", q2Var.f170306q.f322992a.getString(1));
                intent.putExtra("feed_object_id", F0);
                intent.putExtra("business_type", 0);
                intent.putExtra("finder_user_name", q2Var.f170306q.f322992a.getString(1));
                intent.putExtra("feed_object_nonceId", q2Var.f170306q.f322992a.getString(8));
                intent.putExtra("key_from_user_name", q2Var.f170306q.f322992a.getString(1));
                intent.putExtra("tab_type", 5);
                intent.putExtra("feed_local_id", j17);
                intent.putExtra("key_need_related_list", false);
                if (F0 == 0 && j17 != 0) {
                    intent.putExtra("key_posting_scene", true);
                }
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, 25, intent);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.e1.f460472a.A(q2Var.f169957c, intent, false);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gotoFinderDetail", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/FinderMediaWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.FinderMediaWidget$2");
    }
}
