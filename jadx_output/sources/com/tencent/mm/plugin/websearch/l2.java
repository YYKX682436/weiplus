package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public abstract class l2 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile java.lang.String f181562a;

    /* renamed from: b, reason: collision with root package name */
    public static int f181563b;

    public static int a(int i17) {
        return g(i17).b();
    }

    public static java.lang.String b() {
        return com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "wifi" : com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "4g" : com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "3g" : com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "2g" : !com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "fail" : "";
    }

    public static boolean c(java.util.Map map, java.lang.String str, boolean z17) {
        java.lang.String f17 = f(map, str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
            return z17;
        }
        try {
            if ("1".equals(f17)) {
                return true;
            }
            if ("0".equals(f17)) {
                return false;
            }
            return java.lang.Boolean.valueOf(f17).booleanValue();
        } catch (java.lang.Exception unused) {
            return z17;
        }
    }

    public static float d(java.util.Map map, java.lang.String str, float f17) {
        java.lang.String f18 = f(map, str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(f18)) {
            return f17;
        }
        try {
            return java.lang.Float.valueOf(f18).floatValue();
        } catch (java.lang.Exception unused) {
            return f17;
        }
    }

    public static int e(java.util.Map map, java.lang.String str, int i17) {
        java.lang.String f17 = f(map, str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
            return i17;
        }
        try {
            return java.lang.Integer.valueOf(f17).intValue();
        } catch (java.lang.Exception unused) {
            return i17;
        }
    }

    public static java.lang.String f(java.util.Map map, java.lang.String str) {
        return (!map.containsKey(str) || map.get(str) == null) ? "" : map.get(str).toString();
    }

    public static uv4.g g(int i17) {
        return uv4.x.f431458a.c(i17, java.lang.Boolean.FALSE);
    }

    public static boolean h(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchApiLogic", "isFTSH5TemplateAvail exportType:%d, use search default.", java.lang.Integer.valueOf(i17));
        return ((uv4.b) g(i17)).b() > 1;
    }

    public static void i(android.content.Context context, java.lang.String str, android.content.Intent intent) {
        if (intent == null) {
            try {
                intent = new android.content.Intent();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchApiLogic", "Class Not Found when startActivity %s", e17);
                return;
            }
        }
        if (str.startsWith(".")) {
            str = "com.tencent.mm.plugin.topstory".concat(str);
        }
        intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, str);
        java.lang.Class.forName(str, false, context.getClassLoader());
        if (context instanceof android.app.Activity) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/websearch/WebSearchApiLogic", "startTopStoryActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/websearch/WebSearchApiLogic", "startTopStoryActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        intent.addFlags(268435456);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/websearch/WebSearchApiLogic", "startTopStoryActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/websearch/WebSearchApiLogic", "startTopStoryActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static void j(android.content.Context context, java.lang.String str, android.content.Intent intent, int i17) {
        if (intent == null) {
            try {
                intent = new android.content.Intent();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchApiLogic", "Class Not Found when startActivity %s", e17);
                return;
            }
        }
        if (str.startsWith(".")) {
            str = "com.tencent.mm.plugin.topstory".concat(str);
        }
        intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, str);
        java.lang.Class.forName(str, false, context.getClassLoader());
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/websearch/WebSearchApiLogic", "startTopStoryActivityForResult", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }

    public static java.lang.String k(java.util.Map map) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (java.util.Map.Entry entry : map.entrySet()) {
            stringBuffer.append((java.lang.String) entry.getKey());
            stringBuffer.append("=");
            if (entry.getValue() != null) {
                stringBuffer.append(entry.getValue().toString());
            }
            stringBuffer.append("&");
        }
        return stringBuffer.substring(0, stringBuffer.length() - 1).toString();
    }
}
