package kz0;

/* loaded from: classes14.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f313832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.b4 f313833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313834f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(yz5.a aVar, androidx.compose.ui.platform.b4 b4Var, n0.v2 v2Var) {
        super(0);
        this.f313832d = aVar;
        this.f313833e = b4Var;
        this.f313834f = v2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (kz0.k1.e(this.f313834f).f313651f) {
            this.f313832d.invoke();
        } else {
            androidx.compose.ui.platform.b4 b4Var = this.f313833e;
            if (b4Var != null) {
                ((androidx.compose.ui.platform.o2) b4Var).a();
            }
        }
        return jz5.f0.f302826a;
    }
}
