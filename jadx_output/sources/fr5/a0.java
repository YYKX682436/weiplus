package fr5;

/* loaded from: classes15.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f265890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fr5.f0 f265891e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f265892f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ er5.g f265893g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f265894h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f265895i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f265896m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(fr5.f0 f0Var, long j17, er5.g gVar, int i17, float f17, long j18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265891e = f0Var;
        this.f265892f = j17;
        this.f265893g = gVar;
        this.f265894h = i17;
        this.f265895i = f17;
        this.f265896m = j18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fr5.a0(this.f265891e, this.f265892f, this.f265893g, this.f265894h, this.f265895i, this.f265896m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fr5.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        boolean z18;
        fr5.f0 f0Var;
        int i17;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f265890d;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        float f17 = this.f265895i;
        int i19 = this.f265894h;
        fr5.f0 f0Var3 = this.f265891e;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j17 = f0Var3.f265942g;
            long j18 = this.f265892f;
            f0Var3.f265942g = zq5.l.e(j17, zq5.m.a(java.lang.Math.abs(zq5.l.b(j18)), java.lang.Math.abs(zq5.l.c(j18))));
            boolean z19 = f0Var3.f265937b;
            zq5.l lVar = f0Var3.f265939d;
            er5.g gVar = this.f265893g;
            boolean b17 = gVar.b(4);
            boolean b18 = gVar.b(2);
            boolean b19 = gVar.b(1);
            gVar.f256240a.d(new fr5.z(z19, this.f265894h, lVar, b17, b18, b19));
            if (z19) {
                return f0Var2;
            }
            hr5.a1 a1Var = gVar.f256242c;
            if (b17 && i19 == 1 && lVar != null) {
                f0Var3.f265940e = true;
                float c17 = (zq5.l.c(j18) / ((gr5.t) ((gr5.y) ((kotlinx.coroutines.flow.h3) gVar.f256259t).getValue()).f274955a).f274947b) + 1.0f;
                a1Var.f(8);
                er5.g gVar2 = this.f265893g;
                long j19 = lVar.f475080a;
                long j27 = zq5.l.f475077b;
                this.f265890d = 1;
                z17 = true;
                f0Var = f0Var3;
                if (gVar2.c(j19, j27, c17, 0.0f, this) == aVar) {
                    return aVar;
                }
                i17 = 2;
                z18 = false;
            } else {
                z17 = true;
                f0Var3.f265940e = false;
                if (b18 || b19) {
                    long j28 = b19 ? j18 : zq5.l.f475077b;
                    float f18 = b18 ? f17 : 1.0f;
                    a1Var.f(8);
                    er5.g gVar3 = this.f265893g;
                    long j29 = this.f265896m;
                    this.f265890d = 2;
                    z18 = false;
                    f0Var = f0Var3;
                    if (gVar3.c(j29, j28, f18, 0.0f, this) == aVar) {
                        return aVar;
                    }
                } else {
                    z18 = false;
                    f0Var = f0Var3;
                }
                i17 = 2;
            }
        } else if (i18 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            z17 = true;
            f0Var = f0Var3;
            i17 = 2;
            z18 = false;
        } else {
            if (i18 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            z17 = true;
            f0Var = f0Var3;
            z18 = false;
            i17 = 2;
        }
        if (i19 == i17) {
            if (f17 != 1.0f) {
                z17 = z18;
            }
            if (!z17) {
                f0Var.f265941f = new zq5.l(this.f265896m);
            }
        }
        return f0Var2;
    }
}
