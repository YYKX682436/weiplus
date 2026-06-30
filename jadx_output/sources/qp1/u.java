package qp1;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final qp1.u f365743a = new qp1.u();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f365744b = jz5.h.b(qp1.s.f365741d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f365745c = jz5.h.b(qp1.t.f365742d);

    public final boolean a() {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            return com.tencent.mm.sdk.platformtools.o4.L().f("key_float_ball_new_style") ? com.tencent.mm.sdk.platformtools.o4.L().getBoolean("key_float_ball_new_style", false) : ((java.lang.Boolean) ((jz5.n) f365745c).getValue()).booleanValue();
        }
        boolean booleanValue = j62.e.g().c(new com.tencent.mm.repairer.config.multitask.RepairerConfigFloatBallNewStyle()) != 1 ? ((java.lang.Boolean) ((jz5.n) f365744b).getValue()).booleanValue() : true;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallSwitchUtil", "floatBall new style: " + booleanValue);
        com.tencent.mm.sdk.platformtools.o4.L().putBoolean("key_float_ball_new_style", booleanValue);
        return booleanValue;
    }
}
