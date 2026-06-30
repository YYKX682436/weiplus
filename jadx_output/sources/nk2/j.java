package nk2;

/* loaded from: classes3.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f338001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f338002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f338003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f338004g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f338005h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f338006i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f338007m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f338008n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f338009o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j17, java.lang.String str, long j18, long j19, int i17, int i18, int i19, org.json.JSONArray jSONArray, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f338002e = j17;
        this.f338003f = str;
        this.f338004g = j18;
        this.f338005h = j19;
        this.f338006i = i17;
        this.f338007m = i18;
        this.f338008n = i19;
        this.f338009o = jSONArray;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nk2.j(this.f338002e, this.f338003f, this.f338004g, this.f338005h, this.f338006i, this.f338007m, this.f338008n, this.f338009o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nk2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f338001d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            lu5.a aVar2 = lu5.a.f321457f;
            nk2.i iVar = new nk2.i(this.f338002e, this.f338003f, this.f338004g, this.f338005h, this.f338006i, this.f338007m, this.f338008n, this.f338009o, null);
            this.f338001d = 1;
            if (kotlinx.coroutines.l.g(aVar2, iVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
