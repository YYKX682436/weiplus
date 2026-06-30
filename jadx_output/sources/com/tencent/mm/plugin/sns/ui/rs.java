package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class rs implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar f170432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f170433e;

    public rs(com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar snsTimelineImgBottomBar, r45.jj4 jj4Var) {
        this.f170432d = snsTimelineImgBottomBar;
        this.f170433e = jj4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar$setComponentVisible$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsTimelineImgBottomBar$setComponentVisible$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String a17 = com.tencent.mm.ui.l2.a("wxid_wi_1d142z0zdj03");
        if (a17 == null) {
            a17 = "";
        }
        java.lang.String str = a17;
        vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
        if (n1Var != null) {
            com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar snsTimelineImgBottomBar = this.f170432d;
            ((vh0.f3) n1Var).bj(snsTimelineImgBottomBar.getContext(), "wxid_wi_1d142z0zdj03", 10, str, new com.tencent.mm.plugin.sns.ui.qs(snsTimelineImgBottomBar, this.f170433e));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimelineImgBottomBar$setComponentVisible$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar$setComponentVisible$1");
    }
}
