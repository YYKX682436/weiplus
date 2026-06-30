package ri;

/* loaded from: classes12.dex */
public abstract class j {
    public static java.lang.String a(java.lang.String str, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String[] split = str.split("\n");
        for (int i17 = 0; i17 < split.length && i17 < 30; i17++) {
            sb6.append(sb6.length() == 0 ? "" : z17 ? ";" : "\n");
            sb6.append(split[i17]);
        }
        return sb6.toString();
    }

    public static m3.d b(int i17, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        int i18;
        java.lang.String str3;
        java.lang.String d17;
        str = "";
        try {
        } catch (java.lang.Throwable th6) {
            str2 = "unwind_err: " + th6.getMessage();
        }
        if (i17 != android.os.Process.myPid()) {
            if (!com.tencent.matrix.hook.junwind.JUnwindJni.e(false, 1, null)) {
                str2 = "unwind_err: init fail";
                return new m3.d(str2, str);
            }
            str3 = "unwind_err: collect fail";
            ph.u e17 = gi.d.e();
            if (e17 != null) {
                java.lang.String a17 = e17.f354296h.f363335d.A.a(i17);
                if (!android.text.TextUtils.isEmpty(a17)) {
                    str3 = a(a17, z17);
                    str = gi.c.e(a17) ? c(a17, z17) : "";
                    if (gi.c.f(a17)) {
                        d17 = d(a17, z17);
                    }
                }
            }
            str2 = str3;
            return new m3.d(str2, str);
        }
        str2 = "unwind_err: skip ui thread";
        if (mm.k.f328504o.h() && com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.isBackground()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("UI");
            for (java.lang.StackTraceElement stackTraceElement : android.os.Looper.getMainLooper().getThread().getStackTrace()) {
                sb6.append("\nat ");
                sb6.append(stackTraceElement);
            }
            java.lang.String sb7 = sb6.toString();
            str3 = a(sb7, z17);
            d17 = c(sb7, z17);
        }
        return new m3.d(str2, str);
        str = d17;
        str2 = str3;
        return new m3.d(str2, str);
    }

    public static java.lang.String c(java.lang.String str, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.String str2 : str.split("\n")) {
            java.lang.String trim = str2.trim();
            if (!trim.startsWith("com.tencent.wxperf.thread.ThreadInspect") && !trim.startsWith("at com.tencent.wxperf.thread.ThreadInspect")) {
                sb6.append(sb6.length() == 0 ? "" : z17 ? ";" : "\n");
                sb6.append(trim);
            }
        }
        return sb6.toString();
    }

    public static java.lang.String d(java.lang.String str, boolean z17) {
        boolean z18;
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.List asList = java.util.Arrays.asList("tencent", "hilive");
        int i17 = 0;
        for (java.lang.String str2 : str.split("\n")) {
            if (i17 >= 10) {
                break;
            }
            java.util.Iterator it = asList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z18 = false;
                    break;
                }
                if (str2.contains((java.lang.String) it.next())) {
                    z18 = true;
                    break;
                }
            }
            if (z18) {
                int length = str2.length();
                int lastIndexOf = str2.contains("/lib") ? str2.lastIndexOf("/lib") + 4 : str2.contains(" (") ? str2.lastIndexOf(" (") + 2 : -1;
                if (str2.contains("+")) {
                    length = str2.lastIndexOf("+");
                }
                if (lastIndexOf >= 0 && lastIndexOf < length) {
                    java.lang.String trim = str2.substring(lastIndexOf, length).trim();
                    if (!android.text.TextUtils.isEmpty(trim) && (!trim.endsWith(".so") || !sb6.toString().endsWith(trim))) {
                        sb6.append(sb6.length() == 0 ? "" : z17 ? ";" : "\n");
                        sb6.append(trim);
                        i17++;
                    }
                }
            }
        }
        return sb6.toString();
    }
}
