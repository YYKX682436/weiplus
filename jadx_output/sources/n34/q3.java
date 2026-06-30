package n34;

/* loaded from: classes4.dex */
public final class q3 implements z35.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n34.v3 f334711a;

    public q3(n34.v3 v3Var) {
        this.f334711a = v3Var;
    }

    @Override // z35.g0
    public void a(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVisibleChange", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSeekBarBgImg$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        android.widget.ImageView imageView = this.f334711a.f334750b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSeekBarBgImg$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        if (imageView != null) {
            imageView.setVisibility(z17 ? 0 : 4);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVisibleChange", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$2");
    }
}
