package qc4;

/* loaded from: classes4.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout f361513d;

    public a(com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout snsImproveCoverLayout) {
        this.f361513d = snsImproveCoverLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/cover/SnsImproveCoverLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean b17 = w94.a.f444075a.b();
        com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout snsImproveCoverLayout = this.f361513d;
        if (b17) {
            int i17 = com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout.f169065o;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$changeCoverStage", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
            snsImproveCoverLayout.c();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$changeCoverStage", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        } else {
            int i18 = com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout.f169065o;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$legacyClick", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
            snsImproveCoverLayout.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("legacyClick", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
            db5.e1.f(snsImproveCoverLayout.getContext(), "", new java.lang.String[]{snsImproveCoverLayout.getContext().getString(com.tencent.mm.R.string.jgq)}, null, "", new qc4.d(snsImproveCoverLayout));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("legacyClick", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$legacyClick", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/cover/SnsImproveCoverLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$1");
    }
}
