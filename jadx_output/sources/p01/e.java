package p01;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final p01.e f350363d = new p01.e();

    public e() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.g gVar = p01.b.f350360a;
        boolean z17 = false;
        boolean z18 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) p01.b.f350360a).getValue()).getBoolean("need_revert_v2", false);
        int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.msgsync.RepairerConfigNewInitNetSceneOpt());
        int abs = java.lang.Math.abs(gm0.j1.b().h() % 1000);
        if ((c17 == 1 || abs < 100) && !z18) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewInitThread", "isNetSceneOptOpen expt:" + c17 + " uinMod:" + abs + " needRevert:" + z18 + " res:" + z17);
        return java.lang.Boolean.valueOf(z17);
    }
}
