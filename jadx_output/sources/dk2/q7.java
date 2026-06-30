package dk2;

/* loaded from: classes3.dex */
public final class q7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f233944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233946f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233947g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233948h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ce2.i f233949i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233950m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, ce2.i iVar, java.lang.String str5, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f233945e = str;
        this.f233946f = str2;
        this.f233947g = str3;
        this.f233948h = str4;
        this.f233949i = iVar;
        this.f233950m = str5;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk2.q7(this.f233945e, this.f233946f, this.f233947g, this.f233948h, this.f233949i, this.f233950m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.q7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f233944d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.f233945e;
            java.lang.String str2 = this.f233946f;
            java.lang.String str3 = this.f233947g;
            java.lang.String str4 = this.f233948h;
            java.lang.String str5 = "checkAndDownloadMultiAnimation id:" + this.f233945e + " name:" + this.f233949i.field_name + " animationId:" + this.f233950m + " land ";
            this.f233944d = 1;
            obj = dk2.s7.a(str, str2, str3, str4, str5, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
