package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public abstract class k3 {
    public static void a(java.lang.String str) {
        if (str.endsWith("@kefu.openim")) {
            return;
        }
        ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().g(str);
    }

    public static java.util.List b() {
        b95.j Ai = ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai();
        Ai.getClass();
        java.util.List d17 = Ai.d(b95.b.a(), j62.e.g().c(new com.tencent.mm.repairer.config.forward.RepairerConfigRecentForwardCount()), 2);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentForwardInfoStorage", "[query] list size=" + d17.size());
        return d17;
    }

    public static java.util.List c() {
        b95.j Ai = ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai();
        Ai.getClass();
        java.util.List d17 = Ai.d(b95.b.a(), j62.e.g().c(new com.tencent.mm.repairer.config.forward.RepairerConfigRecentForwardCount()), 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentForwardInfoStorage", "[query] list size=" + d17.size());
        return d17;
    }

    public static java.util.List d() {
        return ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().e();
    }
}
