package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class co implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity f168139e;

    public co(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity, java.lang.String str) {
        this.f168139e = snsOnlineVideoActivity;
        this.f168138d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$8");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dw3.c cVar = dw3.c.f244181a;
        com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity = this.f168139e;
        boolean b17 = cVar.b(snsOnlineVideoActivity.getContext(), "com.tencent.phoenix", "A24DC0755072F64C480DC06DCD3412BF");
        int i17 = b17 ? com.tencent.mm.R.string.f490414ub : com.tencent.mm.R.string.f490413ua;
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        int i18 = com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.C1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        java.lang.String str = snsOnlineVideoActivity.S;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        s0Var.e(str, 2);
        db5.e1.j(snsOnlineVideoActivity.getContext(), i17, com.tencent.mm.R.string.f490573yv, com.tencent.mm.R.string.f490507x1, com.tencent.mm.R.string.f490347sg, new com.tencent.mm.plugin.sns.ui.ao(this, b17), new com.tencent.mm.plugin.sns.ui.bo(this));
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$8");
    }
}
