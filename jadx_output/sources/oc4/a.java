package oc4;

/* loaded from: classes4.dex */
public final class a extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView f344333a;

    public a(com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView improveUnreadTierView) {
        this.f344333a = improveUnreadTierView;
    }

    @Override // ym5.n0
    public long getExposedId(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$1");
        kotlin.jvm.internal.o.g(view, "view");
        long hashCode = this.f344333a.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$1");
        return hashCode;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$1");
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            com.tencent.mm.sdk.platformtools.o4.L().B("Key-Unread-Expose", currentTimeMillis);
            android.content.Context context = this.f344333a.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC improveUnreadUIC = (com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC.class);
            improveUnreadUIC.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unreadBtnExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            improveUnreadUIC.f169019o++;
            if (improveUnreadUIC.f169020p <= 0) {
                improveUnreadUIC.f169020p = java.lang.System.currentTimeMillis();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unreadBtnExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            rc4.e eVar = rc4.e.f394136a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUnreadTierExposed", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
            rc4.e.f394142g = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUnreadTierExposed", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveUnreadTierView", "markTierIndicatorExpose time:" + currentTimeMillis);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$1");
    }
}
