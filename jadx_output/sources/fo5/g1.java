package fo5;

/* loaded from: classes14.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final fo5.g1 f264990d = new fo5.g1();

    public g1() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fo5.r0 f17 = fo5.q2.f265071d.f();
        f17.getClass();
        if (com.tencent.mm.ui.bk.Q()) {
            io5.e eVar = f17.f265098q;
            if (!eVar.f293537e) {
                eVar.e();
                int i17 = 360 - ((eVar.f293535c + (eVar.f293539g == 1 ? 0 : 270)) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1);
                if (eVar.f293536d != i17) {
                    eVar.f293536d = i17;
                    fo5.r0 r0Var = ((fo5.o) eVar.f293533a).f265037a;
                    r0Var.w();
                    fo5.r0.g(r0Var);
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPDeviceController", "device rotate changed to " + i17);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
