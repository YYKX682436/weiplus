package xc2;

/* loaded from: classes.dex */
public final class m2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f453208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ab0.v f453209e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f453210f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f453211g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(ab0.v vVar, boolean z17, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453209e = vVar;
        this.f453210f = z17;
        this.f453211g = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xc2.m2(this.f453209e, this.f453210f, this.f453211g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc2.m2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f453208d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object obj2 = this.f453209e;
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            xc2.l2 l2Var = new xc2.l2(this.f453210f, this.f453211g);
            this.f453208d = 1;
            if (xg2.g.c((com.tencent.mm.modelbase.m1) obj2, l2Var, this) == aVar) {
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
