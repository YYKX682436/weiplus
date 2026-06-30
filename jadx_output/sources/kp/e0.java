package kp;

/* loaded from: classes13.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f310729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310730e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(kotlinx.coroutines.q qVar, kp.i1 i1Var) {
        super(1);
        this.f310729d = qVar;
        this.f310730e = i1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            kotlinx.coroutines.r rVar = (kotlinx.coroutines.r) this.f310729d;
            if (rVar.n()) {
                this.f310730e.f310770n = null;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                rVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
            }
        }
        return jz5.f0.f302826a;
    }
}
