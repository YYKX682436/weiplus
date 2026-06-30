package d22;

/* loaded from: classes15.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final d22.u f225876a = new d22.u();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(android.content.Context context, d22.v liteAppContext) {
        boolean z17;
        boolean z18;
        kotlin.jvm.internal.o.g(liteAppContext, "liteAppContext");
        java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
        if (!((((com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.d0.f(str, null, d22.c.class)).f68400d && liteAppContext.a()) || ((com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.d0.f(str, null, d22.b.class)).f68400d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMEmoticonLiteAppOpenApi", "exit in teen mode");
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
            return;
        }
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMEmoticonLiteAppOpenApi", "view context is null");
            return;
        }
        if (!liteAppContext.isValid()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMEmoticonLiteAppOpenApi", "liteapp context not valid");
            return;
        }
        d22.p b17 = liteAppContext.b();
        if (!b17.n(liteAppContext)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMEmoticonLiteAppOpenApi", "liteapp not enabled");
            b17.k(context, liteAppContext);
            return;
        }
        b17.f(liteAppContext);
        android.os.Bundle bundle = new android.os.Bundle();
        android.os.Bundle bundle2 = new android.os.Bundle();
        java.lang.String j17 = b17.j();
        java.lang.String e17 = b17.e();
        java.util.Map e18 = kz5.b1.e(new jz5.l("wxalite70a1e8c60370e23abcc1bde4e2c32f6f", "0.3.8"));
        java.lang.String d17 = b17.d(liteAppContext);
        boolean a17 = b17.a();
        boolean h17 = b17.h();
        try {
            z17 = ((qk.h7) liteAppContext).f364159e;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MMEmoticonLiteAppCreator", th6, "unable to cast PageContext", new java.lang.Object[0]);
            z17 = false;
        }
        if (z17) {
            bundle.putBoolean("isHalfScreen", true);
            bundle.putFloat("heightPercent", 0.75f);
            bundle.putBoolean("enableDragToCloseInHalfScreen", true);
            try {
                z18 = ((qk.h7) liteAppContext).f364160f;
            } catch (java.lang.Throwable unused) {
                z18 = false;
            }
            com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener b18 = b17.b(liteAppContext);
            if (b18 != null) {
                com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig liteAppHalfScreenConfig = new com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig();
                liteAppHalfScreenConfig.f143414h = true;
                liteAppHalfScreenConfig.f143416m = b18;
                liteAppHalfScreenConfig.f143411e = 0.75f;
                liteAppHalfScreenConfig.f143417n = z18;
                bundle.putParcelable("halfScreenConfig", liteAppHalfScreenConfig);
            }
        }
        if (kotlin.jvm.internal.o.b(b17.m(), "modal")) {
            bundle.putInt("nextAnimIn", com.tencent.mm.R.anim.f477876e0);
            bundle.putInt("currentAnimOut", com.tencent.mm.R.anim.f477877e1);
        }
        bundle.putString("appId", j17);
        bundle.putString("query", d17);
        bundle.putBundle(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, bundle2);
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, e17);
        if (e18.containsKey(j17)) {
            bundle.putString("minVersion", (java.lang.String) e18.get(j17));
        }
        bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, a17);
        bundle.putBoolean("forbidRightGesture", h17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMEmoticonLiteAppOpenApi", "open liteapp:" + j17 + ", page:" + e17);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(context, bundle, true, false, b17.i(liteAppContext), new d22.q(liteAppContext, b17, context));
    }
}
