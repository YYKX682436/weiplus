package pk2;

/* loaded from: classes3.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f355861d;

    /* renamed from: e, reason: collision with root package name */
    public int f355862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.l2 f355863f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355864g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(pk2.l2 l2Var, pk2.o9 o9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f355863f = l2Var;
        this.f355864g = o9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pk2.j2(this.f355863f, this.f355864g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.j2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pk2.l2 l2Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f355862e;
        pk2.l2 l2Var2 = this.f355863f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pk2.i2 i2Var = pk2.l2.f355938m;
            com.tencent.mm.ui.MMActivity mMActivity = this.f355864g.f356078d;
            java.lang.String e17 = xy2.c.e(mMActivity);
            this.f355861d = l2Var2;
            this.f355862e = 1;
            obj = i2Var.b(mMActivity, "addItem", e17, this);
            if (obj == aVar) {
                return aVar;
            }
            l2Var = l2Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l2Var = (pk2.l2) this.f355861d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        l2Var.f355940h = (r45.v71) obj;
        l2Var2.f355941i = null;
        return jz5.f0.f302826a;
    }
}
