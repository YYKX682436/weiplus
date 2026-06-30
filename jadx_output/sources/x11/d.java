package x11;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final x11.d f451355d = new x11.d();

    public d() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = false;
        boolean z18 = j62.e.g().c(new com.tencent.mm.repairer.config.msgsync.RepairerConfigNewInitSupportInitContact()) == 1;
        jz5.g gVar = p01.b.f350360a;
        boolean z19 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) p01.b.f350360a).getValue()).getBoolean("need_revert_v2", false);
        if (z18 && !z19) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "isSupportInitContact isSupportInitContact:" + z18 + " isNeedRevert:" + z19 + " res:" + z17);
        return java.lang.Boolean.valueOf(z17);
    }
}
