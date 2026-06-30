package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class q extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.q f186443d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.q();

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f186444e = "all";

    /* JADX WARN: Removed duplicated region for block: B:38:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015d  */
    @Override // nw4.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(nw4.k r12, nw4.y2 r13) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.newjsapi.q.a(nw4.k, nw4.y2):boolean");
    }

    @Override // nw4.q2
    public int b() {
        return 520;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "checkPCWechatOnline";
    }

    public final boolean e(int i17) {
        if (kotlin.jvm.internal.o.b(f186444e, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL)) {
            return true;
        }
        if (kotlin.jvm.internal.o.b(f186444e, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC) && (i17 == 38 || i17 == 14)) {
            return true;
        }
        if (kotlin.jvm.internal.o.b(f186444e, com.eclipsesource.mmv8.Platform.WINDOWS) && (i17 == 37 || i17 == 15)) {
            return true;
        }
        if (kotlin.jvm.internal.o.b(f186444e, "ohos") && i17 == 43) {
            return true;
        }
        return kotlin.jvm.internal.o.b(f186444e, com.eclipsesource.mmv8.Platform.LINUX) && i17 == 39;
    }
}
