package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class wh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView f170750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lh0 f170751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f170752f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f170753g;

    public wh(com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView snsEcsShareTailView, r45.lh0 lh0Var, java.lang.String str, long j17) {
        this.f170750d = snsEcsShareTailView;
        this.f170751e = lh0Var;
        this.f170752f = str;
        this.f170753g = j17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView$bindEcsShareInfo$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsEcsShareTailView$bindEcsShareInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.lh0 lh0Var = this.f170751e;
        java.lang.String str = this.f170752f;
        long j17 = this.f170753g;
        int i17 = com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView.f167147f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$processClick", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView");
        com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView snsEcsShareTailView = this.f170750d;
        snsEcsShareTailView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processClick", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView");
        c00.z2 z2Var = (c00.z2) i95.n0.c(c00.z2.class);
        android.content.Context context = snsEcsShareTailView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((b00.r) z2Var).uj(context, lh0Var, str, 1, j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processClick", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$processClick", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsEcsShareTailView$bindEcsShareInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView$bindEcsShareInfo$1");
    }
}
