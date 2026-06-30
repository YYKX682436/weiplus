package j0;

/* loaded from: classes13.dex */
public final class m3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f296450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.e f296451e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(z.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f296451e = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j0.m3(this.f296451e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((j0.m3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f296450d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            z.e eVar = this.f296451e;
            java.lang.Float f17 = new java.lang.Float(0.0f);
            float f18 = j0.q3.f296518a;
            z.p0 a17 = z.q.a(z.q.b(j0.p3.f296499d), null, 0L, 6, null);
            this.f296450d = 1;
            if (z.e.c(eVar, f17, a17, null, null, this, 12, null) == aVar) {
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
