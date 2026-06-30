package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f153145b;

    /* renamed from: d, reason: collision with root package name */
    public static long f153147d;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.performance.watchdogs.w f153144a = new com.tencent.mm.plugin.performance.watchdogs.w();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f153146c = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public static long f153148e = 367001600;

    /* renamed from: f, reason: collision with root package name */
    public static final long f153149f = java.util.concurrent.TimeUnit.MINUTES.toMillis(1);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f153150g = jz5.h.b(com.tencent.mm.plugin.performance.watchdogs.v.f153139d);

    public static final java.lang.String a(com.tencent.mm.plugin.performance.watchdogs.w wVar, long j17) {
        wVar.getClass();
        double d17 = 1024;
        java.lang.String format = java.lang.String.format("%.02f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf((j17 / d17) / d17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }

    public static final void b(com.tencent.mm.plugin.performance.watchdogs.w wVar, int i17, long j17, java.lang.String str) {
        wVar.getClass();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!com.tencent.mm.sdk.platformtools.t8.E0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MemoryLimitPublisher", "Check HPROF file failed, filePath is refer to private file.");
            return;
        }
        long k17 = com.tencent.mm.vfs.w6.k(str);
        if (k17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MemoryLimitPublisher", "Check HPROF file failed, file size is zero.");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(com.tencent.mm.opensdk.constants.ConstantsAPI.SDK_VERSION, com.tencent.mm.opensdk.constants.Build.SDK_INT);
        bundle.putString(com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE, "com.tencent.mm.openapi");
        bundle.putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
        com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req();
        req.transaction = null;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(new com.tencent.mm.opensdk.modelmsg.WXFileObject(str));
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!a17.f213279f.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String str3 = a17.f213279f;
        int lastIndexOf = str3.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str3 = str3.substring(lastIndexOf + 1);
        }
        wXMediaMessage.title = str3;
        wXMediaMessage.description = com.tencent.mm.sdk.platformtools.t8.f0(k17);
        req.message = wXMediaMessage;
        req.toBundle(bundle);
        int i18 = com.tencent.mm.ui.transmit.SelectConversationUI.B2;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.transmit.SelectConversationUI.class);
        int i19 = com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.B;
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.class);
        intent2.putExtras(bundle);
        intent2.putExtra("animation_pop_in", true);
        intent.putExtra("Select_Conv_NextStep", intent2);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.performance.watchdogs.t(context, i17, j17, intent));
    }

    public static final void c(com.tencent.mm.plugin.performance.watchdogs.w wVar, java.lang.String str, com.tencent.mm.plugin.performance.watchdogs.s sVar, long j17, java.lang.String str2) {
        wVar.getClass();
        jx3.f.INSTANCE.d(18573, str, str2, java.lang.Integer.valueOf(sVar.f153125d), 32, java.lang.Long.valueOf(j17), com.tencent.mm.sdk.platformtools.z.f193105a, com.tencent.mm.sdk.platformtools.z.f193109e);
    }

    public static final boolean d(long j17, long j18) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z65.c.a() && !ih.a.g(e42.d0.clicfg_memory_watchdog_trigger_dump_hprof_enable, false, false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MemoryLimitPublisher", "Skip hprof dump and publish: NOT enabled.");
            return false;
        }
        if (!ih.d.c()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MemoryLimitPublisher", "skip hprof dump and publish: Matrix NOT installed");
            return false;
        }
        if (((com.tencent.matrix.resource.x) ih.d.d().a(com.tencent.matrix.resource.x.class)) != null && cj.c.f41824d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MemoryLimitPublisher", "Skip hprof dump and publish: Matrix is analyzing resources.");
            return false;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - f153147d < f153149f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MemoryLimitPublisher", "Skip hprof dump for frequency limit");
            return false;
        }
        if (j17 <= f153148e || !f153146c.compareAndSet(false, true)) {
            return false;
        }
        f153147d = currentTimeMillis;
        f153148e += 52428800;
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.performance.watchdogs.u(j17));
        return true;
    }
}
