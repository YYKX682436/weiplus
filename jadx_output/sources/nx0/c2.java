package nx0;

/* loaded from: classes5.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f341084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FaceEffectView f341085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f341086f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FaceEffectView faceEffectView, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f341085e = faceEffectView;
        this.f341086f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nx0.c2(this.f341085e, this.f341086f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nx0.c2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f341084d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FaceEffectView faceEffectView = this.f341085e;
            nx0.r1 r1Var = faceEffectView.f69594f;
            if (r1Var != null) {
                yz5.p pVar = faceEffectView.f69595g;
                this.f341084d = 1;
                if (pVar.invoke(r1Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f341086f.invoke();
        return jz5.f0.f302826a;
    }
}
