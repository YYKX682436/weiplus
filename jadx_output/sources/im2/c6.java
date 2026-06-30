package im2;

/* loaded from: classes3.dex */
public final class c6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f292278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f292279e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(im2.h6 h6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f292279e = h6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new im2.c6(this.f292279e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((im2.c6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f292278d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            s40.a1 a1Var = (s40.a1) i95.n0.c(s40.a1.class);
            java.lang.String str = this.f292279e.Y().f410646a;
            this.f292278d = 1;
            obj = ((com.tencent.mm.feature.finder.live.z5) a1Var).Ri(str, 1, this);
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
