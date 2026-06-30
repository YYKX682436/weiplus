package tr0;

/* loaded from: classes14.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f421294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tr0.t f421295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421296f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(tr0.t tVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f421295e = tVar;
        this.f421296f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tr0.e(this.f421295e, this.f421296f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tr0.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f421294d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        tr0.t tVar = this.f421295e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f421294d = 1;
            if (tVar.q(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        tVar.N("GrabStopPreview");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("camera_string", this.f421296f);
        kotlinx.coroutines.flow.j2 j2Var = tVar.f421358t;
        jz5.l lVar = new jz5.l(bs0.g.f23788e, bundle);
        this.f421294d = 2;
        ((kotlinx.coroutines.flow.h3) j2Var).emit(lVar, this);
        return f0Var == aVar ? aVar : f0Var;
    }
}
