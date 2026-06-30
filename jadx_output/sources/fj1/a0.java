package fj1;

/* loaded from: classes7.dex */
public final class a0 implements si1.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f263103a;

    public a0(kotlinx.coroutines.q qVar) {
        this.f263103a = qVar;
    }

    @Override // si1.k
    public void a(si1.j checkReturn) {
        kotlin.jvm.internal.o.g(checkReturn, "checkReturn");
        kotlinx.coroutines.q qVar = this.f263103a;
        if (((kotlinx.coroutines.r) qVar).n()) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(checkReturn));
        }
    }

    @Override // si1.k
    public void b(int i17) {
    }
}
