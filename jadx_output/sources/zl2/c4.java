package zl2;

/* loaded from: classes3.dex */
public final class c4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f473698d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f473699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f473700f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.ba4 f473701g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f473702h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f473703i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(gk2.e eVar, r45.ba4 ba4Var, android.content.Context context, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f473700f = eVar;
        this.f473701g = ba4Var;
        this.f473702h = context;
        this.f473703i = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        zl2.c4 c4Var = new zl2.c4(this.f473700f, this.f473701g, this.f473702h, this.f473703i, continuation);
        c4Var.f473699e = obj;
        return c4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zl2.c4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f473698d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            y0Var = (kotlinx.coroutines.y0) this.f473699e;
            oz5.l f11582e = y0Var.getF11582e();
            zl2.b4 b4Var = new zl2.b4(this.f473700f, this.f473701g, null);
            this.f473699e = y0Var;
            this.f473698d = 1;
            obj = kotlinx.coroutines.l.g(f11582e, b4Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (i17 == 3) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (kotlinx.coroutines.y0) this.f473699e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.l lVar = (jz5.l) obj;
        r45.ba4 ba4Var = (r45.ba4) lVar.f302834e;
        boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
        if (ba4Var == null) {
            oz5.l f11582e2 = y0Var.getF11582e();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            oz5.l plus = f11582e2.plus(kotlinx.coroutines.internal.b0.f310484a);
            zl2.y3 y3Var = new zl2.y3(this.f473702h, null);
            this.f473699e = null;
            this.f473698d = 2;
            return kotlinx.coroutines.l.g(plus, y3Var, this) == aVar ? aVar : f0Var;
        }
        oz5.l f11582e3 = y0Var.getF11582e();
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        oz5.l plus2 = f11582e3.plus(kotlinx.coroutines.internal.b0.f310484a);
        zl2.a4 a4Var = new zl2.a4(booleanValue, ba4Var, this.f473702h, this.f473703i, this.f473700f, null);
        this.f473699e = null;
        this.f473698d = 3;
        return kotlinx.coroutines.l.g(plus2, a4Var, this) == aVar ? aVar : f0Var;
    }
}
