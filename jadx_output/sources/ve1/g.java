package ve1;

/* loaded from: classes13.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f436082a = android.os.Build.VERSION.SDK_INT;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f436083b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f436084c;

    static {
        new java.util.concurrent.atomic.AtomicInteger(1);
        f436084c = new java.util.HashMap();
    }

    public static int a() {
        java.net.ServerSocket serverSocket;
        java.lang.Throwable th6;
        java.net.ServerSocket serverSocket2 = null;
        try {
            serverSocket = new java.net.ServerSocket(0);
            try {
                try {
                    serverSocket.setReuseAddress(true);
                    int localPort = serverSocket.getLocalPort();
                    try {
                        serverSocket.close();
                    } catch (java.io.IOException unused) {
                    }
                    try {
                        serverSocket.close();
                    } catch (java.io.IOException unused2) {
                    }
                    return localPort;
                } catch (java.io.IOException unused3) {
                    serverSocket2 = serverSocket;
                    if (serverSocket2 != null) {
                        try {
                            serverSocket2.close();
                        } catch (java.io.IOException unused4) {
                        }
                    }
                    throw new java.lang.IllegalStateException("Could not find a free TCP/IP port to start video proxy");
                }
            } catch (java.lang.Throwable th7) {
                th6 = th7;
                if (serverSocket != null) {
                    try {
                        serverSocket.close();
                    } catch (java.io.IOException unused5) {
                    }
                }
                throw th6;
            }
        } catch (java.io.IOException unused6) {
        } catch (java.lang.Throwable th8) {
            serverSocket = null;
            th6 = th8;
        }
    }

    public static int b(int i17) {
        try {
            return a();
        } catch (java.lang.IllegalStateException unused) {
            for (int i18 = 0; i18 < i17; i18++) {
                try {
                    return a();
                } catch (java.lang.IllegalStateException unused2) {
                    p(5, "PlayerUtils", "retry findFreePort i=" + i18, null);
                }
            }
            throw new java.lang.IllegalStateException("Could not find a free TCP/IP port to start video proxy, maxRetry=" + i17);
        }
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return str;
        }
        if (str2.startsWith("http")) {
            return str2;
        }
        try {
            return new java.net.URL(new java.net.URL(str), str2).toString();
        } catch (java.net.MalformedURLException unused) {
            if (str.endsWith("/")) {
                str = str.substring(0, str.length() - 1);
            }
            int lastIndexOf = str.lastIndexOf(47);
            if (lastIndexOf > 0) {
                str = str.substring(0, lastIndexOf);
            }
            return str + str2;
        }
    }

    public static long d(java.lang.String str) {
        long j17 = 0;
        if (android.text.TextUtils.isEmpty(str)) {
            return 0L;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (r6Var.A()) {
            return r6Var.C();
        }
        com.tencent.mm.vfs.r6[] G = r6Var.G();
        if (G != null) {
            for (com.tencent.mm.vfs.r6 r6Var2 : G) {
                if (r6Var2 != null) {
                    j17 += d(r6Var2.o());
                }
            }
        }
        return j17;
    }

    public static long e(long j17, long j18) {
        int i17;
        java.lang.String[] j19 = j();
        if (j19 != null) {
            p(4, "PlayerUtils", "proxy setting " + n(java.util.Arrays.asList(j19).iterator(), "|"), null);
            i17 = -3;
        } else {
            i17 = -2;
        }
        return ((j17 - j18) - (i17 * 100000000)) / 100000;
    }

    public static long f(long j17, long j18) {
        int i17;
        java.lang.String[] j19 = j();
        if (j19 != null) {
            p(4, "PlayerUtils", "proxy setting " + n(java.util.Arrays.asList(j19).iterator(), "|"), null);
            i17 = -3;
        } else {
            i17 = -2;
        }
        return (i17 * 100000000) + (j17 * 100000) + j18;
    }

    public static java.lang.String g(java.lang.Throwable th6) {
        return h(th6, false);
    }

    public static java.lang.String h(java.lang.Throwable th6, boolean z17) {
        if (th6 == null) {
            return "";
        }
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!z17) {
            sb6.append("Exception in thread \"");
            sb6.append(currentThread.getName());
            sb6.append("\"");
            sb6.append(th6.toString());
        }
        for (java.lang.StackTraceElement stackTraceElement : th6.getStackTrace()) {
            sb6.append("\tat ");
            sb6.append(stackTraceElement);
            sb6.append("\n");
        }
        java.lang.Throwable targetException = th6 instanceof java.lang.reflect.InvocationTargetException ? ((java.lang.reflect.InvocationTargetException) th6).getTargetException() : th6.getCause();
        if (targetException != null) {
            sb6.append("caused by: ");
            sb6.append(targetException.toString());
            sb6.append("\n");
            sb6.append(h(targetException, true));
        }
        return sb6.toString();
    }

    public static long i(java.util.Map map) {
        if (map == null) {
            return -99999L;
        }
        long r17 = r((java.util.List) map.get("x-server-error"));
        if (r17 != -1 && r17 != 0) {
            return r17;
        }
        long r18 = r((java.util.List) map.get("x-proxy-error"));
        if (r18 != -1) {
            return r18 - 20000;
        }
        long r19 = r((java.util.List) map.get("error"));
        if (r19 != -1) {
            return r19;
        }
        return -99999L;
    }

    public static java.lang.String[] j() {
        try {
            java.lang.reflect.Method method = android.net.ConnectivityManager.class.getMethod("getProxy", new java.lang.Class[0]);
            qe1.a.a().getClass();
            java.lang.Object invoke = method.invoke((android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity"), new java.lang.Object[0]);
            if (invoke == null) {
                return null;
            }
            return k(invoke);
        } catch (java.lang.NoSuchMethodException | java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.String[] k(java.lang.Object obj) {
        java.lang.Class<?> cls = java.lang.Class.forName("android.net.ProxyProperties");
        java.lang.String[] strArr = {(java.lang.String) cls.getMethod("getHost", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]), java.lang.String.valueOf((java.lang.Integer) cls.getMethod("getPort", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0])), (java.lang.String) cls.getMethod("getExclusionList", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0])};
        if (strArr[0] != null) {
            return strArr;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String l(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.g.l(java.lang.String):java.lang.String");
    }

    public static boolean m(java.lang.String str) {
        java.util.HashMap hashMap = f436084c;
        if (hashMap.containsKey(str)) {
            return ((java.lang.Boolean) hashMap.get(str)).booleanValue();
        }
        boolean z17 = str.contains("m3u8") || str.contains("m3u");
        hashMap.put(str, java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public static java.lang.String n(java.util.Iterator it, java.lang.String str) {
        java.lang.String str2 = "";
        if (it != null) {
            while (it.hasNext()) {
                str2 = str2 + ((java.lang.String) it.next());
                if (it.hasNext()) {
                    str2 = str2 + str;
                }
            }
        }
        return str2;
    }

    public static void o(int i17, java.lang.String str, java.lang.String str2) {
        p(i17, str, str2, null);
    }

    public static void p(int i17, java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        int i18 = 0;
        if (th6 != null) {
            str2 = str2 + ":" + h(th6, false);
        }
        if (str2.length() > 1000) {
            java.util.ArrayList arrayList = new java.util.ArrayList(((str2.length() + 1000) - 1) / 1000);
            while (i18 < str2.length()) {
                int i19 = i18 + 1000;
                arrayList.add(str2.substring(i18, java.lang.Math.min(str2.length(), i19)));
                i18 = i19;
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o(i17, str, (java.lang.String) it.next());
            }
            return;
        }
        if (qe1.a.a().f362028m == null) {
            return;
        }
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.i("WxPlayer/" + str, str2);
        } else if (i17 == 5) {
            com.tencent.mars.xlog.Log.w("WxPlayer/" + str, str2);
        } else {
            if (i17 != 6) {
                return;
            }
            com.tencent.mars.xlog.Log.e("WxPlayer/" + str, str2);
        }
    }

    public static void q(java.net.HttpURLConnection httpURLConnection, long j17) {
        int i17 = f436082a;
        if (i17 == 19 || i17 == 20) {
            try {
                java.io.InputStream inputStream = httpURLConnection.getInputStream();
                if (j17 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j17 <= 2048) {
                    return;
                }
                java.lang.String name = inputStream.getClass().getName();
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    java.lang.reflect.Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new java.lang.Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new java.lang.Object[0]);
                }
            } catch (java.io.IOException | java.lang.Exception unused) {
            }
        }
    }

    public static long r(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return -1L;
        }
        java.lang.String str = (java.lang.String) list.get(0);
        if (android.text.TextUtils.isEmpty(str)) {
            return -1L;
        }
        try {
            return java.lang.Long.parseLong(str);
        } catch (java.lang.NumberFormatException unused) {
            p(6, "PlayerUtils", "getSubErrorCode: long string is ill-format", null);
            return -1L;
        }
    }

    public static int s(java.lang.String str) {
        int i17;
        java.lang.String t17 = t(str);
        if (android.text.TextUtils.isEmpty(t17)) {
            return -1;
        }
        try {
            i17 = java.lang.Integer.parseInt(t17);
        } catch (java.lang.Exception e17) {
            p(6, "PlayerUtils", "parseM3u8Number error " + e17, null);
            i17 = -1;
        }
        if (i17 != -1) {
            return i17;
        }
        try {
            return (int) java.lang.Float.parseFloat(t17);
        } catch (java.lang.Exception e18) {
            p(6, "PlayerUtils", "parseM3u8Number error " + e18, null);
            return i17;
        }
    }

    public static java.lang.String t(java.lang.String str) {
        int indexOf;
        if (android.text.TextUtils.isEmpty(str) || !str.startsWith("#") || (indexOf = str.indexOf(":")) == -1) {
            return "";
        }
        java.lang.String substring = str.substring(indexOf + 1);
        return str.lastIndexOf(",") != -1 ? substring.substring(0, substring.length() - 1) : substring;
    }

    public static java.lang.String u(java.lang.String str) {
        java.lang.String str2;
        java.net.URL url;
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        java.util.HashMap hashMap = f436083b;
        if (!isEmpty) {
            java.lang.String str3 = (java.lang.String) hashMap.get(str);
            if (!android.text.TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        re1.h hVar = qe1.a.a().f362031p;
        if (android.webkit.URLUtil.isNetworkUrl(str)) {
            java.lang.String substring = (str == null || !str.startsWith("http://mpvideo.qpic.cn")) ? str : str.substring(0, str.indexOf("?"));
            str2 = null;
            try {
                url = new java.net.URL(substring);
            } catch (java.net.MalformedURLException e17) {
                p(6, "DefaultCacheKeyGenerator", h(e17, false), null);
                url = null;
            }
            if (url != null) {
                str2 = com.tencent.mm.sdk.platformtools.w2.a(substring).substring(0, 20);
            }
        } else {
            str2 = str;
        }
        hashMap.put(str, str2);
        return str2;
    }

    public static java.lang.String v(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            str2 = "|";
        }
        return str != null ? str.replaceAll("\\r\\n", str2).replaceAll("\\r|\\n", str2) : str;
    }
}
