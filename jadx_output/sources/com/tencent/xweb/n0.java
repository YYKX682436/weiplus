package com.tencent.xweb;

/* loaded from: classes13.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.List f220344a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static java.util.List f220345b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static java.util.List f220346c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static boolean f220347d;

    static {
        b();
    }

    public static java.lang.String a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String trim = str.trim();
        if (!trim.startsWith("http")) {
            trim = "http://".concat(trim);
        }
        java.lang.String host = android.net.Uri.parse(trim).getHost();
        by5.c4.f("UrlDispatcher", "getHost, host:" + host + ", url:" + trim);
        return host;
    }

    public static synchronized boolean b() {
        synchronized (com.tencent.xweb.n0.class) {
            if (f220347d) {
                return true;
            }
            try {
                java.lang.String g17 = com.tencent.xweb.b.m().g("tools_white_list_host_suffix", "tools");
                java.lang.String g18 = com.tencent.xweb.b.m().g("new_white_list_host_suffix", "tools");
                java.lang.String g19 = com.tencent.xweb.b.m().g("new_black_list_host_suffix", "tools");
                f220344a.addAll(d(g17));
                f220345b.addAll(d(g18));
                f220346c.addAll(d(g19));
                f220347d = true;
            } catch (java.lang.Throwable th6) {
                by5.c4.d("UrlDispatcher", "init failed error", th6);
            }
            return f220347d;
        }
    }

    public static boolean c(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            if (!android.text.TextUtils.isEmpty(str)) {
                if (com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL.equalsIgnoreCase(str2)) {
                    return true;
                }
                if (str.endsWith(str2) && (str.length() == str2.length() || str.charAt((str.length() - str2.length()) - 1) == '.')) {
                    return true;
                }
            }
        }
        return false;
    }

    public static java.util.List d(java.lang.String str) {
        java.lang.String[] split;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!android.text.TextUtils.isEmpty(str) && (split = str.split(",")) != null && split.length != 0) {
            for (java.lang.String str2 : split) {
                if (!android.text.TextUtils.isEmpty(str2)) {
                    arrayList.add(str2.trim());
                }
            }
        }
        return arrayList;
    }
}
