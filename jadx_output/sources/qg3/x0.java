package qg3;

/* loaded from: classes2.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.od0 f362885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f362886e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(bw5.od0 od0Var, android.app.Activity activity) {
        super(0);
        this.f362885d = od0Var;
        this.f362886e = activity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (!this.f362885d.f31069h) {
            android.app.Activity activity = this.f362886e;
            if (!((androidx.appcompat.app.AppCompatActivity) activity).isFinishing()) {
                vn2.u0.f438387a.c(activity);
            }
        }
        return jz5.f0.f302826a;
    }
}
