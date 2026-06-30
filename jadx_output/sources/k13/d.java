package k13;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.g f303201d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k13.g gVar) {
        super(0);
        this.f303201d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = this.f303201d.b().getSystemService("power");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return (android.os.PowerManager) systemService;
    }
}
