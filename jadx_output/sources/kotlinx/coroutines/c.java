package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class c extends kotlinx.coroutines.w2 {
    private volatile /* synthetic */ java.lang.Object _disposer = null;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.q f310146h;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.s1 f310147i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.e f310148m;

    public c(kotlinx.coroutines.e eVar, kotlinx.coroutines.q qVar) {
        this.f310148m = eVar;
        this.f310146h = qVar;
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        u((java.lang.Throwable) obj);
        return jz5.f0.f302826a;
    }

    @Override // kotlinx.coroutines.g0
    public void u(java.lang.Throwable th6) {
        if (th6 != null) {
            kotlinx.coroutines.r rVar = (kotlinx.coroutines.r) this.f310146h;
            rVar.getClass();
            kotlinx.coroutines.internal.l0 w17 = rVar.w(new kotlinx.coroutines.e0(th6, false, 2, null), null, null);
            if (w17 != null) {
                ((kotlinx.coroutines.r) this.f310146h).e(w17);
                kotlinx.coroutines.d dVar = (kotlinx.coroutines.d) this._disposer;
                if (dVar != null) {
                    dVar.d();
                    return;
                }
                return;
            }
            return;
        }
        if (kotlinx.coroutines.e.f310169b.decrementAndGet(this.f310148m) == 0) {
            kotlinx.coroutines.q qVar = this.f310146h;
            kotlinx.coroutines.f1[] f1VarArr = this.f310148m.f310170a;
            java.util.ArrayList arrayList = new java.util.ArrayList(f1VarArr.length);
            for (kotlinx.coroutines.f1 f1Var : f1VarArr) {
                arrayList.add(f1Var.f());
            }
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(arrayList));
        }
    }

    public final void x(kotlinx.coroutines.d dVar) {
        this._disposer = dVar;
    }
}
