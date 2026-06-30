package vn2;

/* loaded from: classes.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f438366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f438367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f438368f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(xg2.h hVar, kotlin.coroutines.Continuation continuation, yz5.p pVar) {
        super(2, continuation);
        this.f438367e = hVar;
        this.f438368f = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vn2.r0(this.f438367e, continuation, this.f438368f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vn2.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f438366d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xg2.a aVar2 = (xg2.a) ((xg2.b) this.f438367e).f454381b;
            yz5.p pVar = this.f438368f;
            if (pVar != null) {
                this.f438366d = 1;
                if (pVar.invoke(aVar2, this) == aVar) {
                    return aVar;
                }
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
