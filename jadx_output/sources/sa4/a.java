package sa4;

/* loaded from: classes11.dex */
public final class a extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public ob0.s2 f405312d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.performance.SnsMemoryStatUIC");
        e42.c0 c0Var = e42.c0.clicfg_matrix_biz_memory_stat_report_sns_timeline_sample_rate;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        long c17 = ih.a.c(c0Var, z65.c.a() ? 1L : -1L);
        if (getActivity() instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI) {
            this.f405312d = ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).Ai("sns_improve_timeline", c17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.performance.SnsMemoryStatUIC");
        } else {
            java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException("not support for " + getActivity());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.performance.SnsMemoryStatUIC");
            throw illegalArgumentException;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.performance.SnsMemoryStatUIC");
        this.f405312d = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.performance.SnsMemoryStatUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.performance.SnsMemoryStatUIC");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[SnsMemoryStatUIC] onStart ");
        ob0.s2 s2Var = this.f405312d;
        sb6.append(s2Var != null ? s2Var.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("SnsMemoryStatUIC", sb6.toString());
        ob0.s2 s2Var2 = this.f405312d;
        if (s2Var2 != null) {
            ((com.tencent.mm.plugin.performance.watchdogs.i) s2Var2).a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.performance.SnsMemoryStatUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.performance.SnsMemoryStatUIC");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[SnsMemoryStatUIC] onStop ");
        ob0.s2 s2Var = this.f405312d;
        sb6.append(s2Var != null ? s2Var.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("SnsMemoryStatUIC", sb6.toString());
        ob0.s2 s2Var2 = this.f405312d;
        if (s2Var2 != null) {
            ((com.tencent.mm.plugin.performance.watchdogs.i) s2Var2).b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.performance.SnsMemoryStatUIC");
    }
}
