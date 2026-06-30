package id2;

/* loaded from: classes.dex */
public final class p1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f290726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f290727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290728f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(android.widget.TextView textView, id2.v1 v1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f290727e = textView;
        this.f290728f = v1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.p1(this.f290727e, this.f290728f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((id2.p1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f290726d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            android.content.Context context = this.f290727e.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            this.f290726d = 1;
            obj = ((c61.l7) b6Var).sl(context, 0, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) ((jz5.l) obj).f302833d).booleanValue()) {
            id2.v1.Q6(this.f290728f);
        }
        return jz5.f0.f302826a;
    }
}
