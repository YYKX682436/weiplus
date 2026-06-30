package l44;

/* loaded from: classes4.dex */
public final class j0 implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f316187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316188e;

    public j0(kotlinx.coroutines.flow.j jVar, java.lang.String str) {
        this.f316187d = jVar;
        this.f316188e = str;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("collect", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdCommentFlow$$inlined$filter$1");
        java.lang.Object a17 = this.f316187d.a(new l44.i0(kVar, this.f316188e), continuation);
        if (a17 == pz5.a.f359186d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdCommentFlow$$inlined$filter$1");
            return a17;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdCommentFlow$$inlined$filter$1");
        return f0Var;
    }
}
