package l44;

/* loaded from: classes4.dex */
public final class v1 implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f316387d;

    public v1(kotlinx.coroutines.flow.j jVar) {
        this.f316387d = jVar;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("collect", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getInteractFlow$$inlined$map$1");
        java.lang.Object a17 = this.f316387d.a(new l44.r1(kVar), continuation);
        if (a17 == pz5.a.f359186d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getInteractFlow$$inlined$map$1");
            return a17;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getInteractFlow$$inlined$map$1");
        return f0Var;
    }
}
