package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class d extends kotlinx.coroutines.n {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.c[] f310151d;

    public d(kotlinx.coroutines.e eVar, kotlinx.coroutines.c[] cVarArr) {
        this.f310151d = cVarArr;
    }

    @Override // kotlinx.coroutines.o
    public void a(java.lang.Throwable th6) {
        d();
    }

    public final void d() {
        for (kotlinx.coroutines.c cVar : this.f310151d) {
            kotlinx.coroutines.s1 s1Var = cVar.f310147i;
            if (s1Var == null) {
                kotlin.jvm.internal.o.o("handle");
                throw null;
            }
            s1Var.dispose();
        }
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        d();
        return jz5.f0.f302826a;
    }

    public java.lang.String toString() {
        return "DisposeHandlersOnCancel[" + this.f310151d + ']';
    }
}
