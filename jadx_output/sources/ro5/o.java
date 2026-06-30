package ro5;

/* loaded from: classes14.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.b0 f398267d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ro5.b0 b0Var) {
        super(0);
        this.f398267d = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        so5.p0 p0Var = new so5.p0(true);
        boolean a17 = vq4.b0.f439270a.a();
        boolean z17 = vq4.b0.i() == 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.WevisionRenderLogic", "init() called with: enableFaceBeauty = " + a17 + ", newBeauty = " + z17);
        if (a17) {
            p0Var.f410902i = new p05.l4(1, false, p0Var.f410896c, true, p0Var.f410897d, true, rh0.z.f395611e, null, false, 386, null);
            p0Var.c();
            if (z17) {
                com.tencent.mm.plugin.xlabeffect.XEffectConfig xEffectConfig = p0Var.f410905l;
                com.tencent.mars.xlog.Log.i("MicroMsg.WevisionRenderLogic", "initNewFaceBeauty: ".concat(xEffectConfig.a()));
                p05.l4 l4Var = p0Var.f410902i;
                if (l4Var != null) {
                    l4Var.F(xEffectConfig);
                }
                p05.l4 l4Var2 = p0Var.f410902i;
                if (l4Var2 != null) {
                    l4Var2.r();
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WevisionRenderLogic", "initFaceBeauty: ");
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_lut_color_weight, 0);
                int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_skin_smooth_weight, -1);
                int Ni3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_skin_bright_weight, -1);
                int Ni4 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_eye_bigger_weight, -1);
                int Ni5 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_eye_bright_weight, -1);
                int Ni6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_face_thin_weight, -1);
                com.tencent.mars.xlog.Log.i("MicroMsg.WevisionRenderLogic", "Face beauty config: lutWeight: %d, skinSmooth: %d, skinBright: %d, eyeMorph: %d, eyeBright: %d, faceMorph: %d", java.lang.Integer.valueOf(Ni), java.lang.Integer.valueOf(Ni2), java.lang.Integer.valueOf(Ni3), java.lang.Integer.valueOf(Ni4), java.lang.Integer.valueOf(Ni5), java.lang.Integer.valueOf(Ni6));
                p05.l4 l4Var3 = p0Var.f410902i;
                if (l4Var3 != null) {
                    l4Var3.A(Ni2, Ni4, Ni6, Ni3, Ni5);
                }
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                com.tencent.mars.xlog.Log.i("MicroMsg.WevisionRenderLogic", "initial, needSkin:%s, needShape:%s, needFilter:%s", bool, bool2, bool2);
                p05.l4 l4Var4 = p0Var.f410902i;
                if (l4Var4 != null) {
                    l4Var4.K(true);
                }
                p05.l4 l4Var5 = p0Var.f410902i;
                if (l4Var5 != null) {
                    l4Var5.r();
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WevisionRenderLogic", "init: success");
        ro5.b0 b0Var = this.f398267d;
        p0Var.d(b0Var.f398147d);
        b0Var.f398148e = new java.lang.ref.WeakReference(p0Var);
        return p0Var;
    }
}
