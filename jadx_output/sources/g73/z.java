package g73;

/* loaded from: classes15.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final g73.z f269343d = new g73.z();

    public z() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("HandOffService", "onAppForeground");
        g73.o0.f269318n = true;
        com.tencent.mars.xlog.Log.i("HandOffService", "onAppForeground, send alllist");
        if (!g73.o0.f269317m.f77353f) {
            com.tencent.mars.xlog.Log.i("HandOffService", "webwx is offline, do not sync!");
        }
        return jz5.f0.f302826a;
    }
}
