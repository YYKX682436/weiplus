package mx0;

/* loaded from: classes5.dex */
public final class p8 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f332217d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332218e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332219f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332220g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f332220g = shootComposingPluginLayout;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mx0.p8 p8Var = new mx0.p8(this.f332220g, (kotlin.coroutines.Continuation) obj3);
        p8Var.f332218e = (java.lang.String) obj;
        p8Var.f332219f = (rx0.k) obj2;
        return p8Var.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332217d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = (java.lang.String) this.f332218e;
            rx0.k kVar = (rx0.k) this.f332219f;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            mx0.o8 o8Var = new mx0.o8(str, kVar, this.f332220g, null);
            this.f332218e = null;
            this.f332217d = 1;
            if (kotlinx.coroutines.l.g(g3Var, o8Var, this) == aVar) {
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
