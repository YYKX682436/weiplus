package t03;

/* loaded from: classes11.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t03.e f414429d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(t03.e eVar) {
        super(0);
        this.f414429d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("abandonFocus ");
        t03.e eVar = this.f414429d;
        sb6.append(eVar.hashCode());
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterPlayerAudioFocusController", sb6.toString());
        f25.m0 m0Var = eVar.f414442c;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
            eVar.f414442c = null;
        }
        return jz5.f0.f302826a;
    }
}
