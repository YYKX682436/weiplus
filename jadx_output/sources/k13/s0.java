package k13;

/* loaded from: classes10.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f303264d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(k13.l1 l1Var) {
        super(0);
        this.f303264d = l1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = this.f303264d.b().getSystemService("keyguard");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        return (android.app.KeyguardManager) systemService;
    }
}
