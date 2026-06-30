package s74;

/* loaded from: classes4.dex */
public final class z3 extends oz5.a implements kotlinx.coroutines.r0 {
    public z3(kotlinx.coroutines.q0 q0Var) {
        super(q0Var);
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$special$$inlined$CoroutineExceptionHandler$1");
        com.tencent.mars.xlog.Log.e("DynamicView.Preloader", "error in preloadDynamicView: " + android.util.Log.getStackTraceString(th6));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2008, 4);
        ca4.e0.b("error_in_dynamic_view_preload", "0", 0, 0, r26.p0.E0(r26.i0.t(jz5.a.b(th6), ",", ";", false), 1000));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$special$$inlined$CoroutineExceptionHandler$1");
    }
}
