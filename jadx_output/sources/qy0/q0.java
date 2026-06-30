package qy0;

/* loaded from: classes14.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f367640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.b4 f367641e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f367642f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(yz5.a aVar, androidx.compose.ui.platform.b4 b4Var, n0.v2 v2Var) {
        super(0);
        this.f367640d = aVar;
        this.f367641e = b4Var;
        this.f367642f = v2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (((qy0.a) this.f367642f.getValue()) != qy0.a.f367554f) {
            this.f367640d.invoke();
        } else {
            androidx.compose.ui.platform.b4 b4Var = this.f367641e;
            if (b4Var != null) {
                ((androidx.compose.ui.platform.o2) b4Var).a();
            }
        }
        return jz5.f0.f302826a;
    }
}
