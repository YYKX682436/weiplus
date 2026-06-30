package gx0;

/* loaded from: classes5.dex */
public final class sb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276950d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276951e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f276952f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(ex0.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276952f = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        gx0.sb sbVar = new gx0.sb(this.f276952f, continuation);
        sbVar.f276951e = obj;
        return sbVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.sb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276950d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f276951e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (ex0.q qVar : this.f276952f.f257097g.f257179g) {
                if (!(!(qVar.f257164s.length == 0))) {
                    qVar.b(vu0.u.f440163h);
                    arrayList.add(kotlinx.coroutines.l.b(y0Var, null, null, new gx0.rb(qVar, null), 3, null));
                }
            }
            this.f276950d = 1;
            obj = kotlinx.coroutines.h.a(arrayList, this);
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
