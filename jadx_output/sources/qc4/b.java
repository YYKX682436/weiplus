package qc4;

/* loaded from: classes4.dex */
public final class b implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout f361514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f361515e;

    public b(com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout snsImproveCoverLayout, android.view.View view) {
        this.f361514d = snsImproveCoverLayout;
        this.f361515e = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$addView$1");
        com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout snsImproveCoverLayout = this.f361514d;
        snsImproveCoverLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$addViewImpl", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        snsImproveCoverLayout.a(this.f361515e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$addViewImpl", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$addView$1");
    }
}
