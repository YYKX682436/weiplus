package s92;

/* loaded from: classes2.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f404997d;

    /* renamed from: e, reason: collision with root package name */
    public int f404998e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f404999f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f405000g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f405001h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f405002i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.a34 f405003m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j17, java.lang.String str, long j18, r45.a34 a34Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f405000g = j17;
        this.f405001h = str;
        this.f405002i = j18;
        this.f405003m = a34Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        s92.e eVar = new s92.e(this.f405000g, this.f405001h, this.f405002i, this.f405003m, continuation);
        eVar.f404999f = obj;
        return eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((s92.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f404998e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f404999f;
            long c17 = c01.id.c();
            com.tencent.mars.xlog.Log.i("Finder.ActivityProfileUI", "preloadCampaignInfo start");
            s92.d dVar = new s92.d(this.f405000g, this.f405001h, this.f405002i, this.f405003m);
            oz5.l f11582e = y0Var.getF11582e();
            int i18 = kotlinx.coroutines.r2.O0;
            u92.e eVar = new u92.e(dVar, (kotlinx.coroutines.r2) f11582e.get(kotlinx.coroutines.q2.f310571d), null, null, 12, null);
            this.f404997d = c17;
            this.f404998e = 1;
            if (ay1.l.h(eVar, this) == aVar) {
                return aVar;
            }
            j17 = c17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f404997d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("Finder.ActivityProfileUI", "preloadCampaignInfo end " + (c01.id.c() - j17));
        return jz5.f0.f302826a;
    }
}
