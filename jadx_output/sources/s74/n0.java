package s74;

/* loaded from: classes4.dex */
public final class n0 extends oz5.a implements kotlinx.coroutines.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f404435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(kotlinx.coroutines.q0 q0Var, s74.o0 o0Var) {
        super(q0Var);
        this.f404435d = o0Var;
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$special$$inlined$CoroutineExceptionHandler$1");
        com.tencent.mars.xlog.Log.e(this.f404435d.j(), "error = ".concat(jz5.a.b(th6)));
        ca4.q.c("DynamicComponent", th6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$special$$inlined$CoroutineExceptionHandler$1");
    }
}
