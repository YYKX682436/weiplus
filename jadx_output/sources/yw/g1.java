package yw;

/* loaded from: classes11.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yw.g1 f466325d = new yw.g1();

    public g1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.sl b17 = ur1.n.f430361a.b();
        boolean z17 = true;
        if (b17.f385821e != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalCenterStrategy", "cellInfoList.is_feature_open = " + b17.f385821e);
        } else {
            if (!com.tencent.mm.sdk.platformtools.t8.L0(b17.f385820d)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalCenterStrategy", "canShowPersonalCenter = true");
                return java.lang.Boolean.valueOf(z17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalCenterStrategy", "cellInfoList.cell_list is Empty");
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
