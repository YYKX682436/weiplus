package x11;

/* loaded from: classes12.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x11.t f451374d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(x11.t tVar) {
        super(0);
        this.f451374d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        x11.t tVar = this.f451374d;
        if (!tVar.f451408y) {
            ((ku5.t0) ku5.t0.f312615d).l(new x11.i(tVar), 5000L, "initBlockDetector");
        }
        return jz5.f0.f302826a;
    }
}
