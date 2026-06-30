package r06;

/* loaded from: classes15.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r06.x0 f368547d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(r06.x0 x0Var) {
        super(1);
        this.f368547d = x0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n16.c fqName = (n16.c) obj;
        kotlin.jvm.internal.o.g(fqName, "fqName");
        r06.x0 x0Var = this.f368547d;
        ((r06.b1) x0Var.f368551i).getClass();
        e26.c0 storageManager = x0Var.f368548f;
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        return new r06.o0(x0Var, fqName, storageManager);
    }
}
