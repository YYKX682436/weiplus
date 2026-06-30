package wd4;

/* loaded from: classes4.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f444931d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f444932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f444933f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.k5 f444934g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wd4.h f444935h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.util.List list, com.tencent.mm.plugin.appbrand.service.k5 k5Var, wd4.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444933f = list;
        this.f444934g = k5Var;
        this.f444935h = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2");
        wd4.j jVar = new wd4.j(this.f444933f, this.f444934g, this.f444935h, continuation);
        jVar.f444932e = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2");
        return jVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2");
        java.lang.Object invokeSuspend = ((wd4.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f444931d;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f444932e;
            java.util.List<wd4.c> list = this.f444933f;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (wd4.c cVar : list) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials", "checkNotReadyConditions, condition: " + cVar.getName());
                arrayList.add(kotlinx.coroutines.l.b(y0Var, null, null, new wd4.i(cVar, this.f444934g, this.f444935h, null), 3, null));
            }
            this.f444931d = 1;
            obj = kotlinx.coroutines.h.a(arrayList, this);
            if (obj == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.Iterable iterable = (java.lang.Iterable) obj;
        if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
            java.util.Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((java.lang.Boolean) it.next()).booleanValue()) {
                    z17 = false;
                    break;
                }
            }
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$checkNotReadyConditions$2");
        return valueOf;
    }
}
