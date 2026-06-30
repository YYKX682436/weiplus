package com.tencent.mm.plugin.sns.ui.improve.component.header;

/* loaded from: classes4.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe0.l0 f168823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xe0.o0 f168824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC f168825f;

    public c0(xe0.l0 l0Var, xe0.o0 o0Var, com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC) {
        this.f168823d = l0Var;
        this.f168824e = o0Var;
        this.f168825f = improveHeaderUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadNickName$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xe0.o0 o0Var = this.f168824e;
        xe0.l0 l0Var = this.f168823d;
        ((we0.j1) l0Var).nj("sns_timeline_head_status_icon", "view_clk", o0Var);
        com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC = this.f168825f;
        if (((we0.j1) l0Var).tj(improveHeaderUIC.getContext(), com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getUserName(improveHeaderUIC))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.HeaderUIC", "status span click, showForbidToastWhenNotFoundStatus");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadNickName$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$3");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.HeaderUIC", "status span click");
        android.app.Activity context = improveHeaderUIC.getContext();
        java.lang.String username = com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getUserName(improveHeaderUIC);
        kotlin.jvm.internal.o.g(username, "username");
        we0.j1 j1Var = (we0.j1) l0Var;
        j1Var.sj(context, new bi4.h1(username, 15, 156L, false, false, new bi4.g1(bi4.f1.f21042e, 0L, 2, null), new bi4.i1(0.0f, 0, 3, null), null));
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadNickName$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$3");
    }
}
