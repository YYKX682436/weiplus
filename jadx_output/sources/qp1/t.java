package qp1;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final qp1.t f365742d = new qp1.t();

    public t() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(!((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() ? false : com.tencent.mm.sdk.platformtools.o4.L().getBoolean("key_multi_float_ball_mode_enable", true));
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallSwitchUtil", "multiFloatBallModeForNoneMainProcess: " + valueOf.booleanValue());
        return valueOf;
    }
}
