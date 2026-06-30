package m0;

/* loaded from: classes16.dex */
public abstract class g0 {
    public static final boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("GPVersion", java.lang.Integer.valueOf((com.tencent.mm.sdk.platformtools.a0.c() || c01.z1.y()) ? 1 : 0));
        env.f340863d.e(msg.f341013c, "handleMPPageAction:ok", hashMap);
        return true;
    }

    public static final boolean b(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.util.Map params = msg.f340790a;
        kotlin.jvm.internal.o.f(params, "params");
        if (params.containsKey("fullUrl")) {
            java.lang.Object obj = msg.f340790a.get("fullUrl");
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            str = (java.lang.String) obj;
        } else {
            java.lang.Object obj2 = msg.f340790a.get("url");
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            str = (java.lang.String) obj2;
        }
        java.util.Map params2 = msg.f340790a;
        kotlin.jvm.internal.o.f(params2, "params");
        int i17 = -1;
        if (params2.containsKey("itemShowType")) {
            java.lang.Object obj3 = msg.f340790a.get("itemShowType");
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
            i17 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) obj3, -1);
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        nw4.g gVar = env.f340863d;
        if (K0) {
            gVar.e(msg.f341013c, "handleMPPageAction:fail_url_is_null", null);
            return true;
        }
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        lr1.f.f320657a.a(str, i17);
        gVar.e(msg.f341013c, "handleMPPageAction:ok", null);
        return true;
    }

    public static final boolean c(nw4.k env, nw4.y2 msg) {
        boolean z17;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.util.Map params = msg.f340790a;
        kotlin.jvm.internal.o.f(params, "params");
        if (params.containsKey("show")) {
            java.lang.Object obj = msg.f340790a.get("show");
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            z17 = com.tencent.mm.sdk.platformtools.t8.y((java.lang.String) obj, true);
        } else {
            z17 = true;
        }
        if (!z17) {
            try {
                com.tencent.mm.plugin.webview.stub.z0 b17 = env.b();
                if (b17 != null) {
                    b17.i(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE, new android.os.Bundle());
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewNativePageUtil", "hide scroll ex " + e17.getMessage());
            }
        }
        env.f340863d.e(msg.f341013c, "handleMPPageAction:ok", null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9 A[Catch: Exception -> 0x00aa, TryCatch #0 {Exception -> 0x00aa, blocks: (B:65:0x009e, B:16:0x00ad, B:18:0x00b4, B:20:0x00bd, B:25:0x00c9, B:27:0x00d2, B:32:0x00de, B:33:0x00e5), top: B:64:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00de A[Catch: Exception -> 0x00aa, TryCatch #0 {Exception -> 0x00aa, blocks: (B:65:0x009e, B:16:0x00ad, B:18:0x00b4, B:20:0x00bd, B:25:0x00c9, B:27:0x00d2, B:32:0x00de, B:33:0x00e5), top: B:64:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(nw4.k r20, nw4.y2 r21) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.g0.d(nw4.k, nw4.y2):boolean");
    }
}
