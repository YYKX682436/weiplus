package f30;

/* loaded from: classes11.dex */
public final class b implements vg3.q4 {
    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        kotlin.jvm.internal.o.d(map);
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.emojisync.syncparam");
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiSyncMsgConsumer", "emoji sync message: syncParam = " + str2);
        if (n22.m.f334296b) {
            ((ku5.t0) ku5.t0.f312615d).B(f30.a.f259259d);
        }
        new pr.t(0, str2, false).a();
        return null;
    }
}
