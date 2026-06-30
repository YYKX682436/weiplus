package yw;

/* loaded from: classes.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yw.m1 f466399d = new yw.m1();

    public m1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_manual_move_digest_msg_to_first, 1) == 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterInstantsHelper", "manualMoveDigestMsg " + valueOf.booleanValue());
        return valueOf;
    }
}
