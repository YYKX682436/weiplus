package lp4;

/* loaded from: classes10.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f320413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f320414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lp4.u f320415f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f320416g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f320417h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i17, lp4.u uVar, long j17, long j18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f320414e = i17;
        this.f320415f = uVar;
        this.f320416g = j17;
        this.f320417h = j18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lp4.r(this.f320414e, this.f320415f, this.f320416g, this.f320417h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((lp4.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f320413d;
        lp4.u uVar = this.f320415f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rm5.v vVar = uVar.f320429h;
            int size = (vVar == null || (arrayList = vVar.f397584l) == null) ? 0 : arrayList.size();
            int i18 = this.f320414e;
            if (i18 < size) {
                rm5.v vVar2 = uVar.f320429h;
                kotlin.jvm.internal.o.d(vVar2);
                java.lang.Long l17 = new java.lang.Long(((rm5.j) vVar2.f397584l.get(i18)).f397501c);
                long j17 = this.f320416g;
                long j18 = this.f320417h;
                this.f320413d = 1;
                uVar.getClass();
                if (kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new lp4.t(j17, j18, l17, uVar, null), this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return uVar.f320429h;
    }
}
