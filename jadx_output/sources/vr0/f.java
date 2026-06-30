package vr0;

/* loaded from: classes10.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f439467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vr0.z f439468e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vr0.z zVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f439468e = zVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vr0.f(this.f439468e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vr0.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f439467d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.j2 j2Var = this.f439468e.f439536t;
            bs0.g gVar = bs0.g.f23791h;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("camera_int_3", 1);
            jz5.l lVar = new jz5.l(gVar, bundle);
            this.f439467d = 1;
            ((kotlinx.coroutines.flow.h3) j2Var).emit(lVar, this);
            if (f0Var == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
