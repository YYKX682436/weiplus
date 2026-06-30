package pj;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final pj.e f354903a = new pj.e();

    public static final java.lang.String a(java.util.Map dict) {
        kotlin.jvm.internal.o.g(dict, "dict");
        try {
            java.lang.String jSONObject = new org.json.JSONObject(dict).toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            return r26.i0.t(jSONObject, ",", ";", false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Matrix.MatrixReportUtils", e17, "json error", new java.lang.Object[0]);
            return e17.getMessage();
        }
    }

    public static final java.lang.String c(long j17, java.lang.String pattern) {
        kotlin.jvm.internal.o.g(pattern, "pattern");
        if (j17 > 0) {
            java.lang.String format = new java.text.SimpleDateFormat(pattern, java.util.Locale.getDefault()).format(new java.util.Date(j17));
            kotlin.jvm.internal.o.f(format, "format(...)");
            return format;
        }
        return j17 + "ms";
    }

    public static /* synthetic */ java.lang.String d(long j17, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str = com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS;
        }
        return c(j17, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x007d, code lost:
    
        if ((r1.length() > 0) == true) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String e(android.content.Context r6) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r6, r0)
            android.content.pm.PackageManager r0 = r6.getPackageManager()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L88
            java.lang.String r2 = r6.getPackageName()
            android.content.pm.InstallSourceInfo r2 = r0.getInstallSourceInfo(r2)
            r3 = 34
            r4 = 1
            r5 = 0
            if (r1 < r3) goto L38
            java.lang.String r1 = r2.getUpdateOwnerPackageName()
            if (r1 == 0) goto L30
            int r1 = r1.length()
            if (r1 <= 0) goto L2b
            r1 = r4
            goto L2c
        L2b:
            r1 = r5
        L2c:
            if (r1 != r4) goto L30
            r1 = r4
            goto L31
        L30:
            r1 = r5
        L31:
            if (r1 == 0) goto L38
            java.lang.String r6 = r2.getUpdateOwnerPackageName()
            return r6
        L38:
            java.lang.String r1 = r2.getOriginatingPackageName()
            if (r1 == 0) goto L4b
            int r1 = r1.length()
            if (r1 <= 0) goto L46
            r1 = r4
            goto L47
        L46:
            r1 = r5
        L47:
            if (r1 != r4) goto L4b
            r1 = r4
            goto L4c
        L4b:
            r1 = r5
        L4c:
            if (r1 == 0) goto L53
            java.lang.String r6 = r2.getOriginatingPackageName()
            return r6
        L53:
            java.lang.String r1 = r2.getInstallingPackageName()
            if (r1 == 0) goto L66
            int r1 = r1.length()
            if (r1 <= 0) goto L61
            r1 = r4
            goto L62
        L61:
            r1 = r5
        L62:
            if (r1 != r4) goto L66
            r1 = r4
            goto L67
        L66:
            r1 = r5
        L67:
            if (r1 == 0) goto L6e
            java.lang.String r6 = r2.getInstallingPackageName()
            return r6
        L6e:
            java.lang.String r1 = r2.getInitiatingPackageName()
            if (r1 == 0) goto L80
            int r1 = r1.length()
            if (r1 <= 0) goto L7c
            r1 = r4
            goto L7d
        L7c:
            r1 = r5
        L7d:
            if (r1 != r4) goto L80
            goto L81
        L80:
            r4 = r5
        L81:
            if (r4 == 0) goto L88
            java.lang.String r6 = r2.getInitiatingPackageName()
            return r6
        L88:
            java.lang.String r6 = r6.getPackageName()
            java.lang.String r6 = r0.getInstallerPackageName(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pj.e.e(android.content.Context):java.lang.String");
    }

    public static final boolean f(java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(name, "name");
        if (i17 == android.os.Process.myPid()) {
            return false;
        }
        java.lang.String a17 = bm5.f1.a();
        if (!kotlin.jvm.internal.o.b(name, a17) && !r26.i0.n(name, "_fake", false)) {
            kotlin.jvm.internal.o.d(a17);
            if (!r26.i0.n(a17, name, false)) {
                if (!r26.i0.y(name, com.tencent.mm.sdk.platformtools.x2.f193072b + ':', false)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final java.lang.String j(java.lang.String input) {
        kotlin.jvm.internal.o.g(input, "input");
        java.util.List f07 = r26.n0.f0(input, new java.lang.String[]{"\n", "\t"}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : f07) {
            java.lang.String className = (java.lang.String) obj;
            kotlin.jvm.internal.o.g(className, "className");
            boolean z17 = false;
            if (!r26.i0.y(className, "android.", false) && !r26.i0.y(className, "androidx.", false) && !r26.i0.y(className, "java.", false) && !r26.i0.y(className, "dalvik.", false) && !r26.i0.y(className, "$Proxy", false)) {
                z17 = true;
            }
            if (z17) {
                arrayList.add(obj);
            }
        }
        return kz5.n0.g0(arrayList, "\n", null, null, 0, null, null, 62, null);
    }

    public final jz5.l b(java.lang.String stackLine) {
        int i17;
        kotlin.jvm.internal.o.g(stackLine, "stackLine");
        java.lang.String obj = r26.n0.u0(stackLine).toString();
        int L = r26.n0.L(obj, "(", 0, false, 6, null);
        if (L < 0) {
            return null;
        }
        java.lang.String substring = obj.substring(0, L);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        int P = r26.n0.P(substring, ".", 0, false, 6, null);
        if (P < 0 || (i17 = P + 1) >= substring.length()) {
            return null;
        }
        java.lang.String substring2 = substring.substring(i17);
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        int i18 = r26.i0.y(substring, "at ", false) ? 3 : 0;
        if (i18 >= P) {
            return null;
        }
        java.lang.String substring3 = substring.substring(i18, P);
        kotlin.jvm.internal.o.f(substring3, "substring(...)");
        return new jz5.l(substring3, substring2);
    }

    public final boolean g(java.lang.String tag, int i17, yz5.a block) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(block, "block");
        if (!i(i17)) {
            if (!com.tencent.mm.sdk.platformtools.s9.f192975c || com.tencent.mars.xlog.Log.getLogLevel() > 1) {
                return false;
            }
            return true;
        }
        com.tencent.mars.xlog.Log.i(tag, "SAMPLING(1/" + i17 + "): " + ((java.lang.String) block.invoke()));
        return true;
    }

    public final java.util.Map h(java.lang.String category, java.util.Map extra, yz5.l lVar) {
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(extra, "extra");
        java.lang.Object obj = extra.get(category);
        if (obj == null) {
            obj = new java.util.LinkedHashMap();
            extra.put(category, obj);
        }
        java.util.Map c17 = kotlin.jvm.internal.m0.c(obj);
        if (lVar != null) {
            lVar.invoke(c17);
        }
        return c17;
    }

    public final boolean i(int i17) {
        if (i17 > 0) {
            return i17 == 1 || java.lang.System.currentTimeMillis() % ((long) i17) == 0;
        }
        throw new java.lang.IllegalArgumentException("sampling base must be greater than 0!");
    }
}
