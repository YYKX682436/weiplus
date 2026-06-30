package k13;

/* loaded from: classes10.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f303260d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(k13.l1 l1Var) {
        super(0);
        this.f303260d = l1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = this.f303260d.b().getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (android.media.AudioManager) systemService;
    }
}
