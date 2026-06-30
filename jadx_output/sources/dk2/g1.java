package dk2;

/* loaded from: classes3.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.s f233483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.r0 f233484e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(yz5.s sVar, dk2.r0 r0Var) {
        super(0);
        this.f233483d = sVar;
        this.f233484e = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.s sVar = this.f233483d;
        if (sVar != null) {
            dk2.r0 r0Var = this.f233484e;
            sVar.v(java.lang.Boolean.valueOf(r0Var.f233991a), java.lang.Integer.valueOf(r0Var.f233992b), java.lang.Integer.valueOf(r0Var.f233993c), r0Var.f233994d, r0Var.f233995e);
        }
        return jz5.f0.f302826a;
    }
}
