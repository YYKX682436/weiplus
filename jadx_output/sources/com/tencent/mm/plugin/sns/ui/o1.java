package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class o1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.p1 f170063d;

    public o1(com.tencent.mm.plugin.sns.ui.p1 p1Var) {
        this.f170063d = p1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.BizCardWidget$initView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/BizCardWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$handleClick", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        com.tencent.mm.plugin.sns.ui.p1 p1Var = this.f170063d;
        p1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleClick", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        c01.l2 c17 = c01.n2.d().c(p1Var.N, true);
        boolean a17 = c17.a("_DATA_CENTER_ITEM_SHOW_TYPE");
        com.tencent.mm.ui.MMActivity mMActivity = p1Var.J0;
        if (a17) {
            int e17 = c17.e("_DATA_CENTER_ITEM_SHOW_TYPE", -1);
            ((yg0.s4) ((zg0.q3) i95.n0.c(zg0.q3.class))).getClass();
            com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
            android.content.Intent intent = new android.content.Intent();
            str = "com.tencent.mm.plugin.sns.ui.BizCardWidget$initView$1";
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
            zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
            java.lang.String str2 = p1Var.f167845g;
            ((yq1.z) a0Var).getClass();
            if (!((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(p1Var.J0, ot0.g0.a(str2, 2, 10000, currentTimeMillis), e17, true, 2, 10000, intent)) {
                intent.putExtra("rawUrl", p1Var.f167845g);
                j45.l.j(mMActivity, "webview", ".ui.tools.WebViewUI", intent, null);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleClick", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        } else {
            str = "com.tencent.mm.plugin.sns.ui.BizCardWidget$initView$1";
            com.tencent.mars.xlog.Log.i("MicroMsg.LinkWidget", "adlink url " + p1Var.f167845g);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", p1Var.f167845g);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent2, mMActivity);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleClick", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$handleClick", "com.tencent.mm.plugin.sns.ui.BizCardWidget");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/BizCardWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", str);
    }
}
