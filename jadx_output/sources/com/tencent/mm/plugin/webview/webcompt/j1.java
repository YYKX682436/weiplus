package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class j1 implements q25.a {
    static {
        new com.tencent.mm.plugin.webview.webcompt.i1(null);
    }

    public static final java.lang.String b(java.lang.String url) {
        boolean z17;
        kotlin.jvm.internal.o.g(url, "url");
        if (com.tencent.mm.plugin.webview.webcompt.l1.a().f("debug")) {
            z17 = com.tencent.mm.plugin.webview.webcompt.l1.a().getBoolean("debug", false);
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17) {
            try {
                java.util.Iterator it = r26.n0.f0(r26.n0.p0(url, "#", url), new java.lang.String[]{"&"}, false, 0, 6, null).iterator();
                while (true) {
                    if (it.hasNext()) {
                        java.util.List f07 = r26.n0.f0((java.lang.String) it.next(), new java.lang.String[]{"="}, false, 0, 6, null);
                        if (f07.size() == 2 && kotlin.jvm.internal.o.b(f07.get(0), "mock")) {
                            java.lang.String str2 = (java.lang.String) f07.get(1);
                            java.net.URL url2 = new java.net.URL(url);
                            url = url2.getProtocol() + "://" + str2 + url2.getFile() + com.tencent.mm.plugin.webview.webcompt.i1.a(url2);
                            break;
                        }
                    } else {
                        java.net.URL url3 = new java.net.URL(url);
                        if (com.tencent.mm.plugin.webview.webcompt.l1.a().f("mock_" + url3.getHost())) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(url3.getProtocol());
                            sb6.append("://");
                            sb6.append(com.tencent.mm.plugin.webview.webcompt.l1.a().getString("mock_" + url3.getHost(), url3.getHost()));
                            sb6.append(url3.getFile());
                            sb6.append(com.tencent.mm.plugin.webview.webcompt.i1.a(url3));
                            url = sb6.toString();
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("WebComptCommand", e17, "mockHost", new java.lang.Object[0]);
            }
        }
        return url;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0045. Please report as an issue. */
    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] args, java.lang.String username) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(args, "args");
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!(com.tencent.mars.xlog.Log.getLogLevel() == 0 && z65.c.a())) {
            return false;
        }
        kotlin.jvm.internal.b bVar = (kotlin.jvm.internal.b) kotlin.jvm.internal.c.a(args);
        if (!kotlin.jvm.internal.o.b(bVar.next(), "//webcompt")) {
            return false;
        }
        java.lang.String str2 = (java.lang.String) bVar.next();
        switch (str2.hashCode()) {
            case -1869744043:
                if (str2.equals("debugA8Key")) {
                    ((com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.plugin.webview.webcompt.l1.a().putBoolean("debug", true)).putString("debugA8Key", (java.lang.String) bVar.next());
                    com.tencent.mm.plugin.webview.webcompt.l1.b("webcompt set debugA8Key");
                    return true;
                }
                return false;
            case 3357066:
                if (str2.equals("mock")) {
                    java.lang.String str3 = (java.lang.String) bVar.next();
                    com.tencent.mm.plugin.webview.webcompt.l1.a().putString("mock_" + ((java.lang.String) bVar.next()), str3);
                    com.tencent.mm.plugin.webview.webcompt.l1.b("webcompt mock");
                    return true;
                }
                return false;
            case 94746189:
                if (str2.equals("clear")) {
                    if (!bVar.hasNext() || !kotlin.jvm.internal.o.b(bVar.next(), "sd")) {
                        com.tencent.mm.plugin.webview.webcompt.l1.a().clear();
                        com.tencent.mm.plugin.webview.webcompt.l1.b("webcompt clear all commands");
                    } else if (bVar.hasNext()) {
                        java.lang.String str4 = (java.lang.String) bVar.next();
                        if (kotlin.jvm.internal.o.b(str4, "jsapi")) {
                            com.tencent.mm.plugin.webview.webcompt.h0.e(com.tencent.mm.plugin.webview.webcompt.f1.f187797e, false, false, 1, null);
                            com.tencent.mm.plugin.webview.webcompt.l1.b("webcompt clear sdcard jsapi files");
                        } else if (kotlin.jvm.internal.o.b(str4, "app")) {
                            com.tencent.mm.plugin.webview.webcompt.h0.e(com.tencent.mm.plugin.webview.webcompt.f1.f187797e, false, false, 2, null);
                            com.tencent.mm.plugin.webview.webcompt.l1.b("webcompt clear sdcard app files");
                        }
                    } else {
                        com.tencent.mm.plugin.webview.webcompt.h0.e(com.tencent.mm.plugin.webview.webcompt.f1.f187797e, false, false, 3, null);
                        com.tencent.mm.plugin.webview.webcompt.l1.b("webcompt clear all sdcard files");
                    }
                    return true;
                }
                return false;
            case 95458899:
                if (str2.equals("debug")) {
                    com.tencent.mm.plugin.webview.webcompt.l1.a().putBoolean("debug", (bVar.hasNext() && kotlin.jvm.internal.o.b(bVar.next(), "false")) ? false : true);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("webcompt set debug:");
                    sb6.append(com.tencent.mm.plugin.webview.webcompt.l1.a().f("debug") ? com.tencent.mm.plugin.webview.webcompt.l1.a().getBoolean("debug", false) : false);
                    com.tencent.mm.plugin.webview.webcompt.l1.b(sb6.toString());
                    return true;
                }
                return false;
            case 1541691100:
                if (str2.equals("debugJS")) {
                    ((com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.plugin.webview.webcompt.l1.a().putBoolean("debug", true)).putString("debugJS", (java.lang.String) bVar.next());
                    com.tencent.mm.plugin.webview.webcompt.l1.b("webcompt set debugJS");
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}
