package dk2;

/* loaded from: classes3.dex */
public final class p7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f233907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233909f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233910g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233911h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ce2.i f233912i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233913m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, ce2.i iVar, java.lang.String str5, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f233908e = str;
        this.f233909f = str2;
        this.f233910g = str3;
        this.f233911h = str4;
        this.f233912i = iVar;
        this.f233913m = str5;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk2.p7(this.f233908e, this.f233909f, this.f233910g, this.f233911h, this.f233912i, this.f233913m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.p7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f233907d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.f233908e;
            java.lang.String str2 = this.f233909f;
            java.lang.String str3 = this.f233910g;
            java.lang.String str4 = this.f233911h;
            java.lang.String str5 = "checkAndDownloadMultiAnimation id:" + this.f233908e + " name:" + this.f233912i.field_name + " animationId:" + this.f233913m;
            this.f233907d = 1;
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
