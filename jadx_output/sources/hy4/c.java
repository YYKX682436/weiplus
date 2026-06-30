package hy4;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final hy4.c f286089a = new hy4.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f286090b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f286091c = new java.util.concurrent.ConcurrentHashMap();

    public static java.lang.String b(hy4.c cVar, java.lang.String url, boolean z17, int i17, java.lang.Object obj) {
        java.lang.String sb6;
        int i18 = 0;
        boolean z18 = (i17 & 2) != 0 ? false : z17;
        cVar.getClass();
        kotlin.jvm.internal.o.g(url, "url");
        java.lang.String q07 = r26.n0.q0(url, "#", url);
        java.lang.String[] strArr = {"from", "isappinstalled", "pass_ticket", "exportKey"};
        try {
            android.net.Uri parse = android.net.Uri.parse(q07);
            java.util.Set<java.lang.String> queryParameterNames = parse.getQueryParameterNames();
            kotlin.jvm.internal.o.f(queryParameterNames, "getQueryParameterNames(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : queryParameterNames) {
                if (!kz5.z.G(strArr, (java.lang.String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            java.util.List<java.lang.String> D0 = kz5.n0.D0(arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(D0, 10));
            for (java.lang.String str : D0) {
                arrayList2.add(str + '=' + parse.getQueryParameter(str));
            }
            q07 = parse.getScheme() + "://" + parse.getHost() + parse.getPath() + '?' + kz5.n0.g0(arrayList2, "&", null, null, 0, null, null, 62, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("String", "clearUrlParams:" + e17.getMessage() + ", " + strArr + ", " + q07);
        }
        kotlin.jvm.internal.o.e(q07, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str2 = q07 + '-' + z18;
        synchronized (hy4.c.class) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f286090b;
            if (concurrentHashMap.containsKey(str2)) {
                sb6 = (java.lang.String) kz5.c1.h(concurrentHashMap, str2);
            } else {
                java.lang.String str3 = "unknow";
                try {
                    java.lang.String host = android.net.Uri.parse(!r26.i0.y(q07, "http", false) ? r26.n0.B(q07, "view.inews.qq.com", false) ? "https://".concat(q07) : "http://".concat(q07) : q07).getHost();
                    if (host != null) {
                        str3 = host;
                    }
                } catch (java.lang.Exception unused) {
                }
                java.lang.String str4 = "_domain_" + str3.hashCode();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("");
                java.lang.String[] strArr2 = {"__biz", "mid", "idx"};
                int i19 = 0;
                while (true) {
                    if (i19 < 3) {
                        java.lang.String param = strArr2[i19];
                        kotlin.jvm.internal.o.g(param, "param");
                        java.lang.String pattern = "(?<=" + param + "=).+?(?=&)";
                        kotlin.jvm.internal.o.g(pattern, "pattern");
                        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(pattern);
                        kotlin.jvm.internal.o.f(compile, "compile(...)");
                        java.util.regex.Matcher matcher = compile.matcher(q07);
                        kotlin.jvm.internal.o.f(matcher, "matcher(...)");
                        r26.m a17 = r26.u.a(matcher, 0, q07);
                        java.lang.String c17 = a17 != null ? ((r26.q) a17).c() : null;
                        if (c17 == null) {
                            java.lang.String[] strArr3 = {"sessionid", "subscene", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "ascene", "enterid", "clicktime", "fasttmpl_type", "fasttmpl_fullversion", "fasttmpl_flag", "realreporttime", "reporttime"};
                            java.lang.String str5 = q07;
                            for (int i27 = 0; i27 < 11; i27++) {
                                str5 = f286089a.a(str5, strArr3[i27], false);
                            }
                            java.lang.String url2 = r26.n0.v0(str5, '?', '&');
                            kotlin.jvm.internal.o.g(url2, "url");
                            com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N("mpRelateData_" + (com.tencent.mm.sdk.platformtools.x2.n() ? gm0.j1.b().h() : gm0.m.i()), 2, null);
                            kotlin.jvm.internal.o.f(N, "getMMKV(...)");
                            sb6 = N.u("short_url_".concat(url2), "");
                            kotlin.jvm.internal.o.f(sb6, "decodeString(...)");
                            if (com.tencent.mm.sdk.platformtools.t8.K0(sb6)) {
                                try {
                                    i18 = android.net.Uri.parse(url2).toString().hashCode();
                                } catch (java.lang.Exception e18) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("hashUrl", e18, "hash url %s", url2);
                                }
                                int hashCode = ("not_matched_" + i18).hashCode();
                                r26.a.a(16);
                                sb6 = java.lang.Integer.toString(hashCode, 16);
                                kotlin.jvm.internal.o.f(sb6, "toString(...)");
                                if (z18) {
                                    java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = f286091c;
                                    if (!concurrentHashMap2.containsKey(str4)) {
                                        concurrentHashMap2.put(str4, new java.util.concurrent.ConcurrentLinkedDeque());
                                    }
                                    java.lang.Object obj3 = concurrentHashMap2.get(str4);
                                    kotlin.jvm.internal.o.d(obj3);
                                    ((java.util.concurrent.ConcurrentLinkedDeque) obj3).add(str2);
                                    f286090b.put(str2, sb6);
                                }
                            } else {
                                f286090b.put(q07, sb6);
                            }
                        } else {
                            if (param.equals("idx")) {
                                sb7.append(param + '=' + c17);
                            } else {
                                sb7.append(param + '=' + c17 + '|');
                            }
                            i19++;
                        }
                    } else {
                        sb6 = sb7.toString();
                        kotlin.jvm.internal.o.f(sb6, "toString(...)");
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = f286091c;
                        if (!concurrentHashMap3.containsKey(str4)) {
                            concurrentHashMap3.put(str4, new java.util.concurrent.ConcurrentLinkedDeque());
                        }
                        java.lang.Object obj4 = concurrentHashMap3.get(str4);
                        kotlin.jvm.internal.o.d(obj4);
                        ((java.util.concurrent.ConcurrentLinkedDeque) obj4).add(str2);
                        f286090b.put(str2, sb6);
                    }
                }
            }
        }
        return sb6;
    }

    public final java.lang.String a(java.lang.String input, java.lang.String param, boolean z17) {
        kotlin.jvm.internal.o.g(input, "<this>");
        kotlin.jvm.internal.o.g(param, "param");
        if (!z17) {
            input = (java.lang.String) r26.n0.f0(input, new java.lang.String[]{"#"}, false, 0, 6, null).get(0);
        }
        java.lang.String pattern = "(?<=[?|&])" + param + "=.+?(?:&|$)";
        kotlin.jvm.internal.o.g(pattern, "pattern");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(pattern);
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        kotlin.jvm.internal.o.g(input, "input");
        java.lang.String replaceFirst = compile.matcher(input).replaceFirst("");
        kotlin.jvm.internal.o.f(replaceFirst, "replaceFirst(...)");
        return (!r26.i0.n(replaceFirst, "&", false) || r26.i0.o(input, "&", false, 2, null)) ? replaceFirst : r26.n0.v0(replaceFirst, '&');
    }

    public final java.lang.String c(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            return "";
        }
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        if ((a0Var != null && ((yq1.z) a0Var).o(str)) && r26.n0.B(str, "__biz", true) && r26.n0.B(str, "mid", true) && r26.n0.B(str, "idx", true)) {
            return b(this, str, false, 2, null);
        }
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
        kotlin.jvm.internal.o.d(b17);
        return b17;
    }
}
