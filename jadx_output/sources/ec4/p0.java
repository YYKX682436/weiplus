package ec4;

/* loaded from: classes.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec4.q0 f251181d;

    public p0(ec4.q0 q0Var) {
        this.f251181d = q0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC$onCreate$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoTitleBarUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isPreview$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC");
        ec4.q0 q0Var = this.f251181d;
        boolean z17 = q0Var.f251182d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isPreview$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC");
        if (z17) {
            androidx.appcompat.app.AppCompatActivity activity = q0Var.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isShowTitle$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC");
            boolean z18 = q0Var.f251183e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isShowTitle$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC");
            mMActivity.setTitleVisibility(z18 ? 8 : 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isShowTitle$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC");
            boolean z19 = q0Var.f251183e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isShowTitle$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setShowTitle$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC");
            q0Var.f251183e = !z19;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setShowTitle$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoTitleBarUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoTitleBarUIC$onCreate$3");
    }
}
