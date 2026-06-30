package v24;

/* loaded from: classes15.dex */
public class z implements k14.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v24.a0 f432969a;

    public z(v24.a0 a0Var) {
        this.f432969a = a0Var;
    }

    @Override // k14.u
    public void a(android.content.Context context, boolean z17, r45.en0 en0Var) {
        v24.a0 a0Var = this.f432969a;
        if (en0Var == null || !z17) {
            v24.o0.l(a0Var.f432896a);
            a0Var.f432899d.a();
        } else {
            v24.o0.m(a0Var.f432896a);
            a0Var.f432899d.onSuccess();
        }
    }
}
