package je4;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final je4.b f299316a = new je4.b();

    public final boolean a(com.tencent.mm.plugin.sns.ui.zm networkMgr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkAutoPlay", "com.tencent.mm.plugin.sns.util.SnsAutoPlayUtil");
        kotlin.jvm.internal.o.g(networkMgr, "networkMgr");
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_video_autoplay, 0) == 1;
        java.lang.String m17 = wo.w0.m();
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = m17.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_sns_video_autoplay_disable_device, "", true);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
            kotlin.jvm.internal.o.d(Zi);
            if (r26.n0.B(Zi, lowerCase, false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsAutoPlayUtil", "model %s is hit, expt:%s", lowerCase, Zi);
                z17 = false;
            }
        }
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("is2GOr3G", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
            int i17 = networkMgr.f171701b;
            boolean z18 = i17 == 2 || i17 == 3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("is2GOr3G", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
            if (z18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsAutoPlayUtil", "2G/3G autoplay false");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWifi", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                r5 = networkMgr.f171701b == 5;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWifi", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
                if (r5) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsAutoPlayUtil", "wifi autoplay true");
                    r5 = true;
                } else {
                    java.lang.Object m18 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, java.lang.Boolean.TRUE);
                    kotlin.jvm.internal.o.e(m18, "null cannot be cast to non-null type kotlin.Boolean");
                    r5 = ((java.lang.Boolean) m18).booleanValue();
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAutoPlayUtil", "autoPlay DynamicConfig false");
            r5 = z17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAutoPlayUtil", "autoPlay:%s", java.lang.Boolean.valueOf(r5));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAutoPlay", "com.tencent.mm.plugin.sns.util.SnsAutoPlayUtil");
        return r5;
    }
}
