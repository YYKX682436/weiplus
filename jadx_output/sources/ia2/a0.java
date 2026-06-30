package ia2;

/* loaded from: classes10.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f289897d;

    /* renamed from: e, reason: collision with root package name */
    public int f289898e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f289899f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f289899f = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ia2.a0(this.f289899f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ia2.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f289898e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.content.Context context = this.f289899f;
            this.f289897d = context;
            this.f289898e = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            ((y80.k0) ((z80.g0) i95.n0.c(z80.g0.class))).Ai(context, 0L, com.tencent.pigeon.mm_foundation.MMLocationGeoMode.GCJ02, new ia2.z(rVar));
            obj = rVar.j();
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
