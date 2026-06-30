package t03;

/* loaded from: classes11.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t03.e f414435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t03.e eVar) {
        super(0);
        this.f414435d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        f25.n0 n0Var = (f25.n0) i95.n0.c(f25.n0.class);
        t03.e eVar = this.f414435d;
        f25.m0 m96 = n0Var.m9(eVar.f414441b, new t03.c(eVar));
        g25.e eVar2 = (g25.e) m96;
        boolean z17 = eVar2.f267980c;
        f25.l0 l0Var = eVar.f414441b;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterPlayerAudioFocusController", "requestFocus success " + eVar.hashCode() + ", currentLockFocusScene: " + eVar2.f267981d + ", scene: " + l0Var.f259104a);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterPlayerAudioFocusController", "requestFocus fail " + eVar.hashCode() + ", scene: " + l0Var.f259104a);
        }
        eVar.f414442c = m96;
        return jz5.f0.f302826a;
    }
}
