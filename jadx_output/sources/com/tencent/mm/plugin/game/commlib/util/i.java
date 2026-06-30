package com.tencent.mm.plugin.game.commlib.util;

/* loaded from: classes8.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static volatile com.tencent.mm.sdk.platformtools.n3 f139409a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f139410b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f139411c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f139412d = com.tencent.mm.sdk.platformtools.o4.M("activityExistNum");

    public static void a(java.lang.Object obj) {
        com.tencent.mm.plugin.game.commlib.util.g.f139404b.c();
        java.lang.String[] split = obj.getClass().getName().split("\\.");
        if (split.length > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameCommLibUtil", "gamelog.activity, %s, onCreate", split[split.length - 1]);
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = f139412d;
        o4Var.putInt("existNum", o4Var.getInt("existNum", 0) + 1);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("action_id", 1);
        bundle.putString("action_param", obj.getClass().getName());
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.game.commlib.util.h.class, null);
    }

    public static android.os.Bundle b() {
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.plugin.game.commlib.util.e eVar = com.tencent.mm.plugin.game.commlib.util.g.f139404b;
        eVar.a();
        eVar.getClass();
        bundle.putString("session_id", (java.lang.String) com.tencent.mm.plugin.game.commlib.util.g.f139405c.b(eVar, com.tencent.mm.plugin.game.commlib.util.e.f139402a[0]));
        eVar.a();
        bundle.putLong("client_timestamp", eVar.b());
        return bundle;
    }

    public static com.tencent.mm.sdk.platformtools.n3 c() {
        if (f139409a == null) {
            synchronized (f139410b) {
                if (f139409a == null) {
                    f139409a = new com.tencent.mm.sdk.platformtools.n3("GameCommLib#WorkThread");
                    lm5.i.c("GameCommLib#WorkThread", new t65.g("GameCommLib#WorkThread"));
                }
            }
        }
        return f139409a;
    }

    public static boolean d(android.content.Context context, java.lang.String str) {
        return ((java.util.HashSet) f139411c).contains(str);
    }

    public static java.lang.String e() {
        com.tencent.mm.plugin.game.commlib.util.e eVar = com.tencent.mm.plugin.game.commlib.util.g.f139404b;
        eVar.getClass();
        java.lang.String str = ((java.lang.System.currentTimeMillis() - eVar.b()) > 300000L ? 1 : ((java.lang.System.currentTimeMillis() - eVar.b()) == 300000L ? 0 : -1)) > 0 && f139412d.getInt("existNum", 0) == 0 ? "" : (java.lang.String) com.tencent.mm.plugin.game.commlib.util.g.f139405c.b(eVar, com.tencent.mm.plugin.game.commlib.util.e.f139402a[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameCommLibUtil", "gamelog.report, reportDownload, querySessionId sessionId = %s", str);
        return str;
    }

    public static void f(java.lang.Object obj) {
        com.tencent.mm.plugin.game.commlib.util.g.f139404b.c();
        java.lang.String[] split = obj.getClass().getName().split("\\.");
        if (split.length > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameCommLibUtil", "gamelog.activity, %s, onDestroy", split[split.length - 1]);
        }
        f139412d.putInt("existNum", r1.getInt("existNum", 0) - 1);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("action_id", 2);
        bundle.putString("action_param", obj.getClass().getName());
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.game.commlib.util.h.class, null);
    }
}
