package m54;

/* loaded from: classes4.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f324271d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f324272e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f324273f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f324274g;

    /* renamed from: h, reason: collision with root package name */
    public int f324275h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f324276i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324277m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324278n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f324279o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ im5.b f324280p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324281q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j17, java.lang.String str, java.lang.String str2, int i17, im5.b bVar, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f324276i = j17;
        this.f324277m = str;
        this.f324278n = str2;
        this.f324279o = i17;
        this.f324280p = bVar;
        this.f324281q = str3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader$suspendRequest$2");
        m54.i iVar = new m54.i(this.f324276i, this.f324277m, this.f324278n, this.f324279o, this.f324280p, this.f324281q, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader$suspendRequest$2");
        return iVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader$suspendRequest$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader$suspendRequest$2");
        java.lang.Object invokeSuspend = ((m54.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader$suspendRequest$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader$suspendRequest$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader$suspendRequest$2");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f324275h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j18 = this.f324276i;
            java.lang.String str = this.f324277m;
            java.lang.String str2 = this.f324278n;
            int i18 = this.f324279o;
            im5.b bVar = this.f324280p;
            java.lang.String str3 = this.f324281q;
            this.f324271d = str;
            this.f324272e = str2;
            this.f324273f = bVar;
            this.f324274g = str3;
            this.f324275h = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            m54.j jVar = m54.j.f324282a;
            m54.h hVar = new m54.h(rVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("request$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
            jVar.j(j18, str, str2, i18, bVar, null, str3, hVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("request$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
            j17 = rVar.j();
            if (j17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader$suspendRequest$2");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader$suspendRequest$2");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            j17 = obj;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader$suspendRequest$2");
        return j17;
    }
}
