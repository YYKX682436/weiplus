package q81;

/* loaded from: classes3.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f360697d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(kotlinx.coroutines.q qVar) {
        super(1);
        this.f360697d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        kotlinx.coroutines.r rVar = (kotlinx.coroutines.r) this.f360697d;
        if (rVar.n()) {
            if (gm0.j1.a()) {
                rVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(booleanValue)));
            } else {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                rVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new c01.c())));
            }
        }
        return jz5.f0.f302826a;
    }
}
