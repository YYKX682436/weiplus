package nb4;

/* loaded from: classes4.dex */
public final class h implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f336074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nb4.m f336075e;

    public h(kotlinx.coroutines.flow.j jVar, nb4.m mVar) {
        this.f336074d = jVar;
        this.f336075e = mVar;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("collect", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$filter$1");
        java.lang.Object a17 = this.f336074d.a(new nb4.g(kVar, this.f336075e), continuation);
        if (a17 == pz5.a.f359186d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$filter$1");
            return a17;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$invokeSuspend$$inlined$filter$1");
        return f0Var;
    }
}
