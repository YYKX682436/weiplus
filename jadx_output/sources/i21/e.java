package i21;

/* loaded from: classes11.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f287890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f287891e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.c5 f287892f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f287893g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i21.g f287894h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, r45.c5 c5Var, int i17, i21.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f287891e = str;
        this.f287892f = c5Var;
        this.f287893g = i17;
        this.f287894h = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new i21.e(this.f287891e, this.f287892f, this.f287893g, this.f287894h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((i21.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f287890d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            i21.f fVar = i21.h.f287895a;
            java.lang.String str = this.f287891e;
            r45.c5 c5Var = this.f287892f;
            int i18 = this.f287893g;
            i21.d dVar = new i21.d(this.f287894h, null);
            this.f287890d = 1;
            if (i21.f.a(fVar, str, c5Var, i18, dVar, this) == aVar) {
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
