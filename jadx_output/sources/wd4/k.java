package wd4;

/* loaded from: classes4.dex */
public final class k implements zh1.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f444940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wd4.g f444941b;

    public k(kotlin.coroutines.Continuation continuation, wd4.g gVar) {
        this.f444940a = continuation;
        this.f444941b = gVar;
    }

    @Override // zh1.a1
    public final void a(boolean z17, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection collection) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOpenMaterialsGot", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$doFetch$2$1");
        kotlin.jvm.internal.o.g(collection, "collection");
        kotlin.coroutines.Continuation continuation = this.f444940a;
        if (z17) {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(collection));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOpenMaterialsGot", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$doFetch$2$1");
            return;
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.io.IOException("fetchOpenMaterials for " + this.f444941b.a() + " failure"))));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOpenMaterialsGot", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$doFetch$2$1");
    }
}
