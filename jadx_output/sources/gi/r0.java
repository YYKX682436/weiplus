package gi;

/* loaded from: classes12.dex */
public class r0 extends gi.d1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272100b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(qh.f0 f0Var, java.lang.String str, java.lang.String str2) {
        super(f0Var, str);
        this.f272100b = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // gi.d1
    public void a() {
        char c17;
        java.lang.String str = this.f272100b;
        f(str);
        boolean f17 = mm.o.f();
        str.getClass();
        switch (str.hashCode()) {
            case -732590663:
                if (str.equals("ExplicitBg")) {
                    c17 = 0;
                    break;
                }
                c17 = 65535;
                break;
            case -732590539:
                if (str.equals("ExplicitFg")) {
                    c17 = 1;
                    break;
                }
                c17 = 65535;
                break;
            case -51753083:
                if (str.equals("ExcessiveCpu")) {
                    c17 = 2;
                    break;
                }
                c17 = 65535;
                break;
            case 2671072:
                if (str.equals("VoIp")) {
                    c17 = 3;
                    break;
                }
                c17 = 65535;
                break;
            case 797006181:
                if (str.equals("MultiTalk")) {
                    c17 = 4;
                    break;
                }
                c17 = 65535;
                break;
            case 1864111384:
                if (str.equals("ExplicitBgPoll")) {
                    c17 = 5;
                    break;
                }
                c17 = 65535;
                break;
            case 1978627988:
                if (str.equals("ExplicitFgPoll")) {
                    c17 = 6;
                    break;
                }
                c17 = 65535;
                break;
            default:
                c17 = 65535;
                break;
        }
        rh.c1 c1Var = this.f272021a;
        switch (c17) {
            case 0:
            case 1:
            case 5:
            case 6:
                b(true, false);
                c();
                if (com.tencent.mm.sdk.platformtools.x2.n() || com.tencent.mm.sdk.platformtools.x2.p()) {
                    e();
                }
                h(java.lang.Math.max(gi.d.f272005m, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT));
                c1Var.F(rh.n3.class);
                if ("ExplicitBg".equals(str)) {
                    c1Var.F(mm.a0.class);
                }
                if (f17) {
                    c1Var.F(gi.j.class);
                    if ("ExplicitFg".equals(str)) {
                        c1Var.H(rh.r1.class, 5000L);
                        c1Var.H(rh.w1.class, 5000L);
                        c1Var.H(rh.l3.class, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                b(false, false);
                h(java.lang.Math.min(java.lang.Math.max(gi.d.f272005m, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT), 900000L));
                return;
            case 3:
            case 4:
                b(true, false);
                c();
                if (com.tencent.mm.sdk.platformtools.x2.n()) {
                    e();
                }
                g(60000L);
                h(java.lang.Math.max(gi.d.f272005m, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT));
                if (f17) {
                    c1Var.F(gi.j.class);
                    c1Var.H(rh.r1.class, 5000L);
                    c1Var.H(rh.w1.class, 5000L);
                    c1Var.H(rh.l3.class, 5000L);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
