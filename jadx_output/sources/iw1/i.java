package iw1;

/* loaded from: classes14.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f295213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.f1 f295214e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.f1 f1Var) {
        super(1);
        this.f295213d = c0Var;
        this.f295214e = f1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17 = false;
        if (((java.lang.Throwable) obj) == null) {
            hw1.b bVar = (hw1.b) this.f295214e.f();
            if (!((bVar == null || bVar.f285500a) ? false : true)) {
                z17 = true;
            }
        }
        this.f295213d.f310112d = z17;
        return jz5.f0.f302826a;
    }
}
