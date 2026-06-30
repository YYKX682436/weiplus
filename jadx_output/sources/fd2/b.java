package fd2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fd2.j f261260d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(fd2.j jVar) {
        super(1);
        this.f261260d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kotlinx.coroutines.r2 r2Var;
        if (((java.lang.Number) obj).intValue() == 0 && (r2Var = this.f261260d.f261276g) != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        return jz5.f0.f302826a;
    }
}
