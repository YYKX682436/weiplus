package e21;

/* loaded from: classes3.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final e21.d0 f246503d = new e21.d0();

    public d0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int b17 = kk.m.b(gm0.j1.b().h(), 1000);
        com.tencent.mars.xlog.Log.i("MicroMsg.OplogReportHelper", "sampled hash:" + b17);
        return java.lang.Boolean.valueOf(b17 < 1);
    }
}
