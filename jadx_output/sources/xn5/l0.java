package xn5;

/* loaded from: classes13.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final xn5.l0 f455692d = new xn5.l0();

    public l0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int next;
        if (xn5.q0.f455704c == null) {
            synchronized (xn5.q0.f455703b) {
                if (xn5.q0.f455704c == null) {
                    try {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        java.lang.Object newInstance = com.tencent.mm.autogen.layout.BootX2CFactory.class.newInstance();
                        kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.view.x2c.IViewCreatorFactory");
                        xn5.q0.f455704c = (xn5.f0) newInstance;
                        com.tencent.mars.xlog.Log.i("MicroMsg.X2C", "init x2c factory success, cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                    } catch (java.lang.Exception unused) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.X2C", "create X2C Factory Fail className:com.tencent.mm.autogen.layout.BootX2CFactory");
                    }
                }
                if (xn5.q0.f455705d == null) {
                    android.content.res.XmlResourceParser layout = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getLayout(com.tencent.mm.R.layout.a8y);
                    kotlin.jvm.internal.o.f(layout, "getLayout(...)");
                    do {
                        next = layout.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    xn5.p0 p0Var = xn5.q0.f455702a;
                    xn5.q0.f455705d = android.util.Xml.asAttributeSet(layout);
                }
                bm5.o1.f22719a.n(xn5.q0.f455710i);
            }
        }
        bm5.o1.f22719a.n(xn5.q0.f455710i);
        pm0.v.X(xn5.k0.f455687d);
        return jz5.f0.f302826a;
    }
}
