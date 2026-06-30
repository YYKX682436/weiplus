package hc2;

/* loaded from: classes10.dex */
public abstract class l {
    public static final void a(java.lang.String logPrefix, int i17) {
        boolean z17;
        kotlin.jvm.internal.o.g(logPrefix, "logPrefix");
        boolean z18 = true;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (!z17 && !z65.c.a()) {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        if (z18) {
            throw new java.lang.RuntimeException(logPrefix + " type:" + i17 + " invalid");
        }
        com.tencent.mm.sdk.platformtools.Log.c("FinderExt", logPrefix + " type:" + i17 + " invalid", new java.lang.Object[0]);
    }

    public static final java.lang.String b(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        java.lang.String input = r26.n0.u0(str).toString();
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("(\n\n[\\s]*\n)|(\n[\\s]*\n\n)");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        kotlin.jvm.internal.o.g(input, "input");
        java.lang.String replaceAll = compile.matcher(input).replaceAll("\n\n");
        kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
        java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("(\r\n\r\n[\\s]*\r\n)|(\r\n[\\s]*\r\n\r\n)");
        kotlin.jvm.internal.o.f(compile2, "compile(...)");
        java.lang.String replaceAll2 = compile2.matcher(replaceAll).replaceAll("\r\n\r\n");
        kotlin.jvm.internal.o.f(replaceAll2, "replaceAll(...)");
        java.util.regex.Pattern compile3 = java.util.regex.Pattern.compile("[ ]{11,}");
        kotlin.jvm.internal.o.f(compile3, "compile(...)");
        java.lang.String replaceAll3 = compile3.matcher(replaceAll2).replaceAll("          ");
        kotlin.jvm.internal.o.f(replaceAll3, "replaceAll(...)");
        return replaceAll3;
    }

    public static final jz5.l c(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(str, false);
        kotlin.jvm.internal.o.d(i17);
        com.tencent.mm.plugin.finder.assist.l8 l8Var = new com.tencent.mm.plugin.finder.assist.l8(new android.media.ExifInterface(i17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getImageLocation] longitude:");
        java.lang.Float f17 = l8Var.f102365c;
        sb6.append(f17);
        sb6.append(" latitude:");
        java.lang.Float f18 = l8Var.f102364b;
        sb6.append(f18);
        com.tencent.mars.xlog.Log.i("FinderExt", sb6.toString());
        if (f18 == null || f17 == null) {
            return null;
        }
        return new jz5.l(java.lang.Double.valueOf(f18.floatValue()), java.lang.Double.valueOf(f17.floatValue()));
    }

    public static final java.lang.String d(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        java.lang.String obj = r26.n0.u0(str).toString();
        int L = r26.n0.L(obj, "\n", 0, false, 6, null);
        return L == -1 ? obj : r26.n0.b0(obj, L, obj.length(), "…").toString();
    }

    public static final com.tencent.mm.plugin.sight.base.b e(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).getClass();
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
        if (d17 == null) {
            d17 = new com.tencent.mm.plugin.sight.base.b();
        }
        if (d17.f162385d <= 0 || d17.f162384c <= 0) {
            try {
                android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(com.tencent.mm.vfs.w6.i(str, false));
                d17.f162384c = com.tencent.mm.sdk.platformtools.t8.P(mediaMetadataRetriever.extractMetadata(18), 0);
                d17.f162385d = com.tencent.mm.sdk.platformtools.t8.P(mediaMetadataRetriever.extractMetadata(19), 0);
                d17.f162383b = com.tencent.mm.sdk.platformtools.t8.P(mediaMetadataRetriever.extractMetadata(20), 0);
                d17.f162382a = com.tencent.mm.sdk.platformtools.t8.P(mediaMetadataRetriever.extractMetadata(9), 0);
                mediaMetadataRetriever.release();
            } catch (java.lang.Exception unused) {
            }
        }
        int mp4RotateVFS = ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).getMp4RotateVFS(str);
        com.tencent.mars.xlog.Log.i("FinderExt", "width %d, height %d, rotate %d", java.lang.Integer.valueOf(d17.f162384c), java.lang.Integer.valueOf(d17.f162385d), java.lang.Integer.valueOf(mp4RotateVFS));
        if (mp4RotateVFS == 90 || mp4RotateVFS == 270) {
            int i17 = d17.f162385d;
            d17.f162385d = d17.f162384c;
            d17.f162384c = i17;
        }
        return d17;
    }

    public static final jz5.l f(java.lang.String str) {
        int i17;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            gp.d dVar = new gp.d();
            dVar.setDataSource(str);
            java.lang.String extractMetadata = dVar.extractMetadata(23);
            dVar.release();
            com.tencent.mars.xlog.Log.i("FinderExt", "[getVideoLocation] locationString " + extractMetadata);
            if (!android.text.TextUtils.isEmpty(extractMetadata)) {
                kotlin.jvm.internal.o.d(extractMetadata);
                char[] charArray = extractMetadata.toCharArray();
                kotlin.jvm.internal.o.f(charArray, "toCharArray(...)");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                for (char c17 : charArray) {
                    if (c17 != '+' && c17 != '-' && c17 != '.') {
                        i17 = android.text.TextUtils.isDigitsOnly(c17 + "") ? 0 : i17 + 1;
                    }
                    sb6.append(c17);
                }
                java.lang.String sb7 = sb6.toString();
                kotlin.jvm.internal.o.f(sb7, "toString(...)");
                int O = r26.n0.O(sb7, '+', 0, false, 6, null);
                if (-1 == O) {
                    O = r26.n0.O(sb7, '-', 0, false, 6, null);
                }
                java.lang.String substring = sb7.substring(0, O);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                double parseDouble = java.lang.Double.parseDouble(substring);
                java.lang.String substring2 = sb7.substring(O);
                kotlin.jvm.internal.o.f(substring2, "substring(...)");
                return new jz5.l(java.lang.Double.valueOf(parseDouble), java.lang.Double.valueOf(java.lang.Double.parseDouble(substring2)));
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }

    public static final boolean g(java.lang.String str) {
        java.lang.String U = g92.b.f269769e.U();
        if (str == null || str.length() == 0) {
            return false;
        }
        return (U.length() > 0) && kotlin.jvm.internal.o.b(str, U);
    }

    public static final boolean h(java.lang.String str) {
        org.json.JSONObject optJSONObject;
        if (str == null) {
            return false;
        }
        try {
            if ((str.length() > 0 ? str : null) == null || (optJSONObject = new org.json.JSONObject(str).optJSONObject("sns_ad")) == null) {
                return false;
            }
            return optJSONObject.has("uxinfo");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderExt", "isJsapiFromAd " + e17.getMessage());
            return false;
        }
    }

    public static final boolean i(java.lang.String str) {
        return com.tencent.mm.sdk.platformtools.t8.D0(str, c01.z1.r());
    }

    public static final java.lang.String j(java.lang.String str, java.lang.String name) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(name, "name");
        java.lang.String pattern = "&?" + name + "=[^&]*";
        kotlin.jvm.internal.o.g(pattern, "pattern");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(pattern);
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public static final java.lang.String k(java.lang.String str) {
        java.lang.String str2;
        if (str != null) {
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            str2 = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
        } else {
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }

    public static final int l(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        try {
            return android.graphics.Color.parseColor(str);
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }
}
