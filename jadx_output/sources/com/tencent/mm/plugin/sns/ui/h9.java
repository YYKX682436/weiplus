package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class h9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.j9 f168492d;

    public h9(com.tencent.mm.plugin.sns.ui.j9 j9Var) {
        this.f168492d = j9Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SightWidget$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SightWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.j9 j9Var = this.f168492d;
        if (!com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.sns.ui.j9.o(j9Var))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SightWidget", "click videopath is not exist " + com.tencent.mm.plugin.sns.ui.j9.o(j9Var));
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SightWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SightWidget$2");
            return;
        }
        if (com.tencent.mm.plugin.sns.ui.j9.p(j9Var) != null) {
            com.tencent.mm.plugin.sns.ui.j9.p(j9Var).dismiss();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SightWidget");
            j9Var.f169497p = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SightWidget");
        }
        m34.n nVar = new m34.n(j9Var.f169957c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SightWidget");
        j9Var.f169497p = nVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SightWidget");
        m34.n p17 = com.tencent.mm.plugin.sns.ui.j9.p(j9Var);
        java.lang.String o17 = com.tencent.mm.plugin.sns.ui.j9.o(j9Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SightWidget");
        java.lang.String str = j9Var.f169490i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SightWidget");
        p17.f323361f = o17;
        p17.f323362g = str;
        m34.n p18 = com.tencent.mm.plugin.sns.ui.j9.p(j9Var);
        p18.f323363h = 0;
        p18.f323364i = 0;
        p18.f323365m = 1;
        com.tencent.mm.plugin.sns.ui.j9.p(j9Var).show();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SightWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SightWidget$2");
    }
}
