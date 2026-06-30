package st2;

/* loaded from: classes3.dex */
public final class l2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f412392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.br2 f412393e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(r45.br2 br2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f412393e = br2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new st2.l2(this.f412393e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((st2.l2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f412392d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            i95.m c17 = i95.n0.c(zy2.b6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r45.br2 br2Var = this.f412393e;
            this.f412392d = 1;
            if (zy2.b6.b9((zy2.b6) c17, context, br2Var, null, null, false, false, this, 60, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        zl2.b0 b0Var = zl2.b0.f473663a;
        r45.br2 br2Var2 = this.f412393e;
        b0Var.g(br2Var2, "share_commodity", zl2.b0.d(b0Var, br2Var2, null, null, null, null, 30, null));
        return jz5.f0.f302826a;
    }
}
