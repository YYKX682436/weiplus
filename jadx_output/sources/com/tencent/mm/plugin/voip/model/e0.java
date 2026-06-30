package com.tencent.mm.plugin.voip.model;

/* loaded from: classes.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public int f176464a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f176465b = 0;

    public static java.lang.String a(java.util.Map map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (map != null) {
            try {
                if (map.size() > 0) {
                    sb6.append("<voiptenmin>");
                    for (java.util.Map.Entry entry : map.entrySet()) {
                        java.lang.Object key = entry.getKey();
                        com.tencent.mm.plugin.voip.model.e0 e0Var = (com.tencent.mm.plugin.voip.model.e0) entry.getValue();
                        sb6.append("<" + key);
                        sb6.append(" hitcount = \"");
                        sb6.append(e0Var.f176464a);
                        sb6.append("\"");
                        sb6.append(" sendcount = \"");
                        sb6.append(e0Var.f176465b);
                        sb6.append("\"");
                        sb6.append("/>");
                    }
                    sb6.append("</voiptenmin>");
                }
            } catch (java.lang.Exception e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("PostTaskTenMinutesLogicState", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                return null;
            }
        }
        return sb6.toString();
    }

    public static java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = null;
        if (str == null) {
            return null;
        }
        try {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "voiptenmin", null);
            if (d17 == null || d17.size() <= 0) {
                return null;
            }
            java.util.HashMap hashMap2 = new java.util.HashMap();
            try {
                for (java.util.Map.Entry entry : d17.entrySet()) {
                    java.lang.String str2 = (java.lang.String) entry.getKey();
                    if (str2 == null) {
                        break;
                    }
                    java.lang.String[] split = str2.split("\\.");
                    int length = split.length;
                    if (split.length >= 4) {
                        com.tencent.mm.plugin.voip.model.e0 e0Var = hashMap2.containsKey(split[2]) ? (com.tencent.mm.plugin.voip.model.e0) hashMap2.get(split[2]) : new com.tencent.mm.plugin.voip.model.e0();
                        if (str2.contains("hitcount")) {
                            e0Var.f176464a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) entry.getValue(), 0);
                        } else if (str2.contains("sendcount")) {
                            e0Var.f176465b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) entry.getValue(), 0);
                        }
                        e0Var.getClass();
                        hashMap2.put(split[2], e0Var);
                    }
                }
                return hashMap2;
            } catch (java.lang.Exception e17) {
                e = e17;
                hashMap = hashMap2;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("PostTaskTenMinutesLogicState", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e));
                return hashMap;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
        }
    }
}
