package te5;

/* loaded from: classes9.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te5.l1 f418689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f418690f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418691g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oi3.g f418692h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418693i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418694m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f418695n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f418696o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(te5.l1 l1Var, android.content.Context context, java.lang.String str, oi3.g gVar, java.lang.String str2, java.lang.String str3, boolean z17, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418689e = l1Var;
        this.f418690f = context;
        this.f418691g = str;
        this.f418692h = gVar;
        this.f418693i = str2;
        this.f418694m = str3;
        this.f418695n = z17;
        this.f418696o = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te5.j1(this.f418689e, this.f418690f, this.f418691g, this.f418692h, this.f418693i, this.f418694m, this.f418695n, this.f418696o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te5.j1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418688d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            te5.l1 l1Var = this.f418689e;
            android.content.Context context = this.f418690f;
            java.lang.String str = this.f418691g;
            oi3.g gVar = this.f418692h;
            int integer = gVar.getInteger(gVar.f345617d + 4);
            java.lang.String str2 = this.f418693i;
            java.lang.String str3 = this.f418694m;
            boolean z17 = this.f418695n;
            int i18 = this.f418696o;
            this.f418688d = 1;
            obj = l1Var.ij(context, str, integer, str2, str3, z17, i18, this);
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
