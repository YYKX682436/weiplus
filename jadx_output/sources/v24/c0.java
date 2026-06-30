package v24;

/* loaded from: classes15.dex */
public class c0 implements k14.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v24.d0 f432905a;

    public c0(v24.d0 d0Var) {
        this.f432905a = d0Var;
    }

    @Override // k14.u
    public void a(android.content.Context context, boolean z17, r45.en0 en0Var) {
        v24.d0 d0Var = this.f432905a;
        if (en0Var == null || !z17) {
            v24.o0.l(d0Var.f432907a);
            d0Var.f432909c.a();
        } else {
            v24.o0.m(d0Var.f432907a);
            d0Var.f432909c.onSuccess();
        }
    }
}
