package mx0;

/* loaded from: classes3.dex */
public final class h7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f332030f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332029e = shootComposingPluginLayout;
        this.f332030f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.h7(this.f332029e, this.f332030f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.h7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332028d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            mx0.g7 g7Var = new mx0.g7(this.f332029e, this.f332030f, null);
            this.f332028d = 1;
            if (kotlinx.coroutines.l.g(g3Var, g7Var, this) == aVar) {
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
