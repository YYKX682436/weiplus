package fj3;

/* loaded from: classes14.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f263208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.f1 f263209e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.f1 f1Var) {
        super(1);
        this.f263208d = c0Var;
        this.f263209e = f1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17 = false;
        if (((java.lang.Throwable) obj) == null) {
            ej3.b bVar = (ej3.b) this.f263209e.f();
            if (!((bVar == null || bVar.f253319a) ? false : true)) {
                z17 = true;
            }
        }
        this.f263208d.f310112d = z17;
        return jz5.f0.f302826a;
    }
}
