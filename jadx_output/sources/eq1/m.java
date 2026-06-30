package eq1;

/* loaded from: classes.dex */
public final class m implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eq1.u f255831d;

    public m(eq1.u uVar) {
        this.f255831d = uVar;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        pm0.v.X(new eq1.k(this));
        if (z17) {
            eq1.u uVar = this.f255831d;
            kotlinx.coroutines.l.d(uVar.f255869d, null, null, new eq1.l(uVar, f18, f17, null), 3, null);
            return true;
        }
        eq1.u uVar2 = this.f255831d;
        synchronized (this) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            uVar2.f255867b = kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("Location failed"))));
            yz5.l lVar = uVar2.f255868c;
            if (lVar != null) {
                kotlin.Result result = uVar2.f255867b;
                kotlin.jvm.internal.o.d(result);
                lVar.invoke(result);
            }
            uVar2.f255868c = null;
        }
        return false;
    }
}
