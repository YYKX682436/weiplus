package l44;

/* loaded from: classes4.dex */
public final class m0 implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f316250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316251e;

    public m0(kotlinx.coroutines.flow.j jVar, java.lang.String str) {
        this.f316250d = jVar;
        this.f316251e = str;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("collect", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdLikeAnimEndFlow$$inlined$filter$1");
        java.lang.Object a17 = this.f316250d.a(new l44.l0(kVar, this.f316251e), continuation);
        if (a17 == pz5.a.f359186d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdLikeAnimEndFlow$$inlined$filter$1");
            return a17;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdLikeAnimEndFlow$$inlined$filter$1");
        return f0Var;
    }
}
