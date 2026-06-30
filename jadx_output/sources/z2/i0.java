package z2;

/* loaded from: classes13.dex */
public class i0 extends z2.s0 {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.CharSequence f469450b;

    public i0(z2.k0 k0Var) {
        if (this.f469520a != k0Var) {
            this.f469520a = k0Var;
            if (k0Var != null) {
                k0Var.l(this);
            }
        }
    }

    @Override // z2.s0
    public void a(android.os.Bundle bundle) {
        super.a(bundle);
    }

    @Override // z2.s0
    public void b(z2.d0 d0Var) {
        z2.h0.a(z2.h0.c(z2.h0.b(((z2.e1) d0Var).f469432a), null), this.f469450b);
    }

    @Override // z2.s0
    public java.lang.String c() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
