package sy;

/* loaded from: classes5.dex */
public final /* synthetic */ class b0$$a implements java.util.function.BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        sy.c0 c0Var = (sy.c0) obj2;
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str) == null) {
            return;
        }
        long j17 = com.tencent.mm.sdk.platformtools.o4.L().getLong("plugin_msg_report_unread_" + str + gm0.j1.b().j(), -1L);
        if (j17 == -1 || j17 >= r0.d1()) {
            return;
        }
        c0Var.f413788c = r0.d1() - j17;
        com.tencent.mm.sdk.platformtools.o4.L().putLong("plugin_msg_report_unread_" + str + gm0.j1.b().j(), -1L);
        com.tencent.mars.xlog.Log.i("PluginMsgReporter", "[loadSupplementaryData] %s, lastUnReadCount:%d, recvMsgCount:%d", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(c0Var.f413788c));
    }
}
