package mx0;

/* loaded from: classes5.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f332116e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJRecordingSettings f332117f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f332118g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f332119h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(mx0.e1 e1Var, com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings, boolean z17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332116e = e1Var;
        this.f332117f = mJRecordingSettings;
        this.f332118g = z17;
        this.f332119h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.l0(this.f332116e, this.f332117f, this.f332118g, this.f332119h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.l0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332115d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f332116e.f331940g = this.f332117f.isExportPhoto();
            if (this.f332116e.f331936c && this.f332118g && !this.f332116e.f331937d) {
                mx0.e1 e1Var = this.f332116e;
                this.f332115d = 1;
                if (mx0.e1.c(e1Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f332119h.invoke(java.lang.Boolean.valueOf(this.f332118g));
        return jz5.f0.f302826a;
    }
}
