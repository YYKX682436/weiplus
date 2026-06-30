package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes7.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.v0 f180993a = new com.tencent.mm.plugin.wallet_core.utils.v0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f180994b = new java.util.LinkedHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0069, code lost:
    
        if (r7 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        if (r7 == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final jz5.l b(int r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.utils.v0.b(int, java.lang.String, java.lang.String):jz5.l");
    }

    public final void a(java.lang.String str, com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        if (str == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WCPaySessionInfoRecorder", "update chatType=" + info.f180838d + ", sendType=" + info.f180839e + " for " + str);
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        kotlin.jvm.internal.o.f(stackTrace, "getStackTrace(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = stackTrace.length;
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.StackTraceElement stackTraceElement = stackTrace[i17];
            java.lang.String className = stackTraceElement.getClassName();
            kotlin.jvm.internal.o.f(className, "getClassName(...)");
            if (r26.n0.B(className, "com.tencent", false)) {
                arrayList.add(stackTraceElement);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WCPaySessionInfoRecorder", kz5.n0.g0(arrayList, "\n", null, null, 0, null, com.tencent.mm.plugin.wallet_core.utils.t0.f180987d, 30, null));
        if (info.f180839e == com.tencent.mm.plugin.wallet_core.utils.s0.f180982g) {
            if (info.f180838d == com.tencent.mm.plugin.wallet_core.utils.n0.f180941g) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WCPaySessionInfoRecorder", "sendType == .enterprise correction: chatType single");
                info.f180838d = com.tencent.mm.plugin.wallet_core.utils.n0.f180942h;
            }
            if (info.f180838d == com.tencent.mm.plugin.wallet_core.utils.n0.f180943i) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WCPaySessionInfoRecorder", "sendType == .enterprise correction: chatType group");
                info.f180838d = com.tencent.mm.plugin.wallet_core.utils.n0.f180944m;
            }
            if (info.f180838d == com.tencent.mm.plugin.wallet_core.utils.n0.f180945n) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WCPaySessionInfoRecorder", "sendType == .enterprise correction: chatType timeline");
                info.f180838d = com.tencent.mm.plugin.wallet_core.utils.n0.f180946o;
            }
        }
        com.tencent.mm.plugin.wallet_core.utils.n0 n0Var = info.f180838d;
        com.tencent.mm.plugin.wallet_core.utils.n0 n0Var2 = com.tencent.mm.plugin.wallet_core.utils.n0.f180940f;
        if (n0Var == n0Var2) {
            com.tencent.mm.plugin.wallet_core.utils.s0 s0Var = info.f180839e;
            com.tencent.mm.plugin.wallet_core.utils.s0 s0Var2 = com.tencent.mm.plugin.wallet_core.utils.s0.f180981f;
            if (s0Var != s0Var2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WCPaySessionInfoRecorder", "chatType == .unknown correction: sendType from " + info.f180839e + " to unknown");
                info.f180839e = s0Var2;
            }
        }
        if (info.f180839e == com.tencent.mm.plugin.wallet_core.utils.s0.f180981f && info.f180838d != n0Var2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WCPaySessionInfoRecorder", "sendType == .unknown correction: sendType from " + info.f180838d + " to unknown");
            info.f180838d = n0Var2;
        }
        f180994b.put(str, info);
    }
}
