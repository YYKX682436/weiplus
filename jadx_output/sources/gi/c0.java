package gi;

/* loaded from: classes.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final gi.c0 f271992d = new gi.c0();

    public c0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long l17 = mm.k.l(mm.k.f328521z, null, 1, null);
        com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "setDeviceChargingApiMode: " + l17);
        if (l17 < 1) {
            l17 = 1;
        }
        if (l17 > 3) {
            l17 = 3;
        }
        return java.lang.Integer.valueOf((int) l17);
    }
}
