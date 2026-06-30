package eb4;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f250887d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yz5.p pVar) {
        super(1);
        this.f250887d = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdLandingFormCompAppointmentJsApi$process$1");
        jz5.o it = (jz5.o) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdLandingFormCompAppointmentJsApi$process$1");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object obj2 = it.f302841d;
        int intValue = ((java.lang.Number) obj2).intValue();
        yz5.p pVar = this.f250887d;
        if (intValue == 0) {
            pVar.invoke(ya.b.SUCCESS, kz5.c1.l(new jz5.l("ret", obj2), new jz5.l("status", it.f302843f)));
        } else {
            pVar.invoke(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, kz5.c1.l(new jz5.l("ret", obj2)));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdLandingFormCompAppointmentJsApi$process$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdLandingFormCompAppointmentJsApi$process$1");
        return f0Var;
    }
}
