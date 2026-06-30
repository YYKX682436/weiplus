package gh3;

/* loaded from: classes.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f271890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f271891e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f271892f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f271893g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f271894h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f271895i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f271896m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f271897n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ gh3.i f271898o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kotlinx.coroutines.flow.j jVar, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.storage.f9 f9Var, boolean z17, android.content.Context context, android.content.Intent intent, int i17, gh3.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f271891e = jVar;
        this.f271892f = h0Var;
        this.f271893g = f9Var;
        this.f271894h = z17;
        this.f271895i = context;
        this.f271896m = intent;
        this.f271897n = i17;
        this.f271898o = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gh3.g(this.f271891e, this.f271892f, this.f271893g, this.f271894h, this.f271895i, this.f271896m, this.f271897n, this.f271898o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gh3.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f271890d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gh3.f fVar = new gh3.f(this.f271892f, this.f271893g, this.f271894h, this.f271895i, this.f271896m, this.f271897n, this.f271898o);
            this.f271890d = 1;
            if (this.f271891e.a(fVar, this) == aVar) {
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
