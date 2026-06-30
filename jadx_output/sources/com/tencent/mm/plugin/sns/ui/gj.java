package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class gj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe0.l0 f168436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.jj f168437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168438f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe0.o0 f168439g;

    public gj(xe0.l0 l0Var, com.tencent.mm.plugin.sns.ui.jj jjVar, java.lang.String str, xe0.o0 o0Var) {
        this.f168436d = l0Var;
        this.f168437e = jjVar;
        this.f168438f = str;
        this.f168439g = o0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsHeaderImprove$setUserName$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.jj jjVar = this.f168437e;
        android.content.Context context = jjVar.getContext();
        xe0.l0 l0Var = this.f168436d;
        java.lang.String username = this.f168438f;
        if (((we0.j1) l0Var).tj(context, username)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsHeader", "status span click, showForbidToastWhenNotFoundStatus");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsHeaderImprove$setUserName$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$2");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsHeader", "status span click");
        if (jjVar.getContext() instanceof android.app.Activity) {
            android.content.Context context2 = jjVar.getContext();
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
            kotlin.jvm.internal.o.g(username, "username");
            bi4.h1 h1Var = new bi4.h1(username, 16, 154L, false, false, new bi4.g1(bi4.f1.f21042e, 0L, 2, null), new bi4.i1(0.0f, 0, 3, null), null);
            ((we0.j1) l0Var).sj((android.app.Activity) context2, h1Var);
            ((we0.j1) l0Var).nj("sns_personal_status_icon", "view_clk", this.f168439g);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsHeaderImprove$setUserName$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$2");
    }
}
