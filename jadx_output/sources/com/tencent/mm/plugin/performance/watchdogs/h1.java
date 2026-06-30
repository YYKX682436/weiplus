package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public abstract class h1 {
    public static boolean a(java.lang.String str) {
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z27;
        java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.plugin.performance.watchdogs.f1.f153044a).iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (android.os.Build.BRAND.equalsIgnoreCase((java.lang.String) it.next())) {
                z17 = true;
                break;
            }
        }
        java.util.Iterator it6 = ((java.util.ArrayList) com.tencent.mm.plugin.performance.watchdogs.f1.f153045b).iterator();
        while (true) {
            if (!it6.hasNext()) {
                z18 = false;
                break;
            }
            if (((java.lang.Integer) it6.next()).intValue() == android.os.Build.VERSION.SDK_INT) {
                z18 = true;
                break;
            }
        }
        java.util.Iterator it7 = ((java.util.ArrayList) com.tencent.mm.plugin.performance.watchdogs.f1.f153046c).iterator();
        while (true) {
            if (!it7.hasNext()) {
                z19 = false;
                break;
            }
            if (str.contains((java.lang.String) it7.next())) {
                z19 = true;
                break;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Boolean.valueOf(z17 && z18 && z19);
        java.lang.String str2 = android.os.Build.BRAND;
        objArr[1] = str2;
        int i17 = android.os.Build.VERSION.SDK_INT;
        objArr[2] = java.lang.Integer.valueOf(i17);
        objArr[3] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.ThreadWhiteList", "OnePlus_Q_AudioLeak: matchWhiteThread? %s, brand = %s, API = %s, threadName = %s", objArr);
        if (z17 && z18 && z19) {
            return true;
        }
        boolean equalsIgnoreCase = com.tencent.mm.plugin.performance.watchdogs.g1.f153048a.equalsIgnoreCase(str2);
        boolean z28 = i17 == com.tencent.mm.plugin.performance.watchdogs.g1.f153049b;
        boolean equals = com.tencent.mm.plugin.performance.watchdogs.g1.f153050c.equals(str);
        if (equalsIgnoreCase && z28 && equals) {
            java.util.Iterator it8 = ((java.util.ArrayList) com.tencent.mm.plugin.performance.watchdogs.g1.f153051d).iterator();
            while (true) {
                if (!it8.hasNext()) {
                    z27 = false;
                    break;
                }
                if (((java.lang.String) it8.next()).equalsIgnoreCase(wo.w0.m())) {
                    z27 = true;
                    break;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ThreadWhiteList", "Vivo_Q_Camera_Leak: matchWhiteThread? %s, brand = %s, model = %s, API = %s, threadName = %s", java.lang.Boolean.TRUE, android.os.Build.BRAND, wo.w0.m(), java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT), str);
        } else {
            z27 = false;
        }
        return z27;
    }
}
