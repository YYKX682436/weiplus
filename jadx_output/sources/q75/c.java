package q75;

/* loaded from: classes10.dex */
public abstract class c {
    public static java.lang.String a(java.lang.String str) {
        return d() + java.lang.String.format(java.util.Locale.US, "%s%d.%s", "mmexport", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str);
    }

    public static java.lang.String b(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT > 29) {
            return a(str);
        }
        return lp0.b.r() + java.lang.String.format(java.util.Locale.US, "%s%d.%s", "mmexport", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str);
    }

    public static java.lang.String c(java.lang.String str) {
        java.lang.String str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        try {
            str2 = new java.io.File(str).getCanonicalPath();
        } catch (java.lang.Throwable unused) {
            str2 = str;
        }
        int length = str2.startsWith(lp0.b.d0()) ? lp0.b.d0().length() : str2.startsWith(lp0.b.Y()) ? lp0.b.Y().length() : -1;
        if (length < 0) {
            return str;
        }
        java.lang.String substring = str.substring(length);
        return (substring.startsWith("/") ? "/sdcard" : "/sdcard/").concat(substring);
    }

    public static java.lang.String d() {
        java.lang.String m17 = lp0.b.m();
        com.tencent.mars.xlog.Log.i("Luggage.AndroidMediaUtil", "getSysCameraDirPath: " + m17);
        return m17;
    }

    public static java.lang.String e() {
        java.lang.String e07 = lp0.b.e0();
        java.lang.String absolutePath = e07.startsWith(lp0.b.d0()) ? new java.io.File(e07).getParentFile().getParentFile().getParentFile().getAbsolutePath() : lp0.b.Y();
        try {
            absolutePath = new java.io.File(absolutePath).getCanonicalPath();
        } catch (java.lang.Throwable unused) {
        }
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(d(), true);
        int indexOf = i17.indexOf(absolutePath);
        if (indexOf < 0) {
            return i17;
        }
        java.lang.String substring = i17.substring(indexOf + absolutePath.length());
        return substring.startsWith("/") ? "/sdcard".concat(substring) : "/sdcard/".concat(substring);
    }

    public static void f(java.lang.String str, android.content.Context context) {
        com.tencent.mm.vfs.x1 m17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(str, false);
        if (i17 != null) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(i17);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null && m17.f213236f) {
                com.tencent.mars.xlog.Log.e("Luggage.AndroidMediaUtil", "refreshMediaScanner error for path isDirectory.%s", i17);
                return;
            }
            try {
                h(context, i17);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.AndroidMediaUtil", th6, "Cannot update media database", new java.lang.Object[0]);
            }
            try {
                context.sendBroadcast(new android.content.Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", com.tencent.mm.sdk.platformtools.i1.b(context, new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(i17)))));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.AndroidMediaUtil", e17, "", new java.lang.Object[0]);
            }
        }
        com.tencent.mars.xlog.Log.i("Luggage.AndroidMediaUtil", "refreshing media scanner on path=%s", str);
        if (android.os.Build.VERSION.SDK_INT <= 28) {
            context.sendBroadcast(new android.content.Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", com.tencent.mm.sdk.platformtools.i1.b(context, new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)))).addFlags(1));
            com.tencent.mars.xlog.Log.i("Luggage.AndroidMediaUtil", "refreshing media scanner on path=%s", str);
        } else {
            try {
                android.media.MediaScannerConnection.scanFile(context.getApplicationContext(), new java.lang.String[]{i17}, new java.lang.String[]{q75.g.c(str)}, null);
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.e("Luggage.AndroidMediaUtil", "refresh by MediaScannerConnection, path = %s, thr = %s", str, th7);
            }
        }
    }

    public static void g(java.lang.String str, android.content.Context context) {
        ((ku5.t0) ku5.t0.f312615d).g(new q75.b(str, context));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[Catch: all -> 0x0185, TryCatch #2 {all -> 0x0185, blocks: (B:3:0x0005, B:7:0x000c, B:10:0x0024, B:17:0x0037, B:20:0x004b, B:22:0x0065, B:24:0x00c9, B:27:0x00d2, B:29:0x00d8, B:31:0x00de, B:32:0x00ec, B:34:0x00f2, B:36:0x00fa, B:38:0x010b, B:39:0x011e, B:40:0x00e1, B:42:0x00e7, B:43:0x00ea, B:47:0x0128, B:50:0x0135, B:52:0x013f, B:53:0x014e, B:56:0x015e, B:58:0x0159, B:60:0x006d, B:64:0x0084, B:65:0x0074, B:67:0x007c, B:73:0x0040, B:74:0x0043, B:70:0x0045, B:77:0x008c, B:79:0x0092, B:80:0x00c5), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(android.content.Context r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q75.c.h(android.content.Context, java.lang.String):void");
    }
}
