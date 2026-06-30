package x11;

/* loaded from: classes12.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final x11.e f451356d = new x11.e();

    public e() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recordExptGet hasGetExpt:");
        x11.g gVar = x11.t.D;
        sb6.append(x11.g.a(gVar));
        sb6.append(" hasCallNewInitBegin:");
        sb6.append(x11.t.F);
        sb6.append(" isGetExptBeforeInit:");
        sb6.append(gVar.b());
        sb6.append(" isSupportInitContact:");
        sb6.append(gVar.c());
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", sb6.toString());
        return jz5.f0.f302826a;
    }
}
