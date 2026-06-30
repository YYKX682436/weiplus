package l0;

/* loaded from: classes14.dex */
public final class i2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f314252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0.a3 f314253e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f314254f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l0.p1 f314255g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p2.f f314256h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314257i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f314258m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(l0.a3 a3Var, java.util.Map map, l0.p1 p1Var, p2.f fVar, yz5.p pVar, float f17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f314253e = a3Var;
        this.f314254f = map;
        this.f314255g = p1Var;
        this.f314256h = fVar;
        this.f314257i = pVar;
        this.f314258m = f17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new l0.i2(this.f314253e, this.f314254f, this.f314255g, this.f314256h, this.f314257i, this.f314258m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((l0.i2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f314252d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            l0.a3 a3Var = this.f314253e;
            java.util.Map map = (java.util.Map) ((n0.q4) a3Var.f314036i).getValue();
            java.util.Map map2 = this.f314254f;
            kotlin.jvm.internal.o.g(map2, "<set-?>");
            ((n0.q4) a3Var.f314036i).setValue(map2);
            ((n0.q4) a3Var.f314042o).setValue(this.f314255g);
            yz5.p pVar = this.f314257i;
            p2.f fVar = this.f314256h;
            ((n0.q4) a3Var.f314040m).setValue(new l0.h2(map2, pVar, fVar));
            float R = fVar.R(this.f314258m);
            ((n0.q4) a3Var.f314041n).setValue(java.lang.Float.valueOf(R));
            this.f314252d = 1;
            if (a3Var.c(map, map2, this) == aVar) {
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
