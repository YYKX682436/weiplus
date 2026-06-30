package nb4;

/* loaded from: classes4.dex */
public final class k implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f336081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nb4.m f336082e;

    public k(kotlinx.coroutines.flow.j jVar, nb4.m mVar) {
        this.f336081d = jVar;
        this.f336082e = mVar;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("collect", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$map$1");
        java.lang.Object a17 = this.f336081d.a(new nb4.j(kVar, this.f336082e), continuation);
        if (a17 == pz5.a.f359186d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$map$1");
            return a17;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$map$1");
        return f0Var;
    }
}
