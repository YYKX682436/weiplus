package re2;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.n0 f394354d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(mm2.n0 n0Var) {
        super(0);
        this.f394354d = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.e50 e50Var = (r45.e50) ((kotlinx.coroutines.flow.l2) this.f394354d.f329269n).getValue();
        return java.lang.Long.valueOf(e50Var != null ? e50Var.getLong(1) : 0L);
    }
}
