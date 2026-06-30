package vm1;

/* loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f438079d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(yz5.l lVar) {
        super(1);
        this.f438079d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var = jz5.f0.f302826a;
        yz5.l lVar = this.f438079d;
        if (booleanValue) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(f0Var)));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("addToStar failed")))));
        }
        return f0Var;
    }
}
