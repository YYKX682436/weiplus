package com.tencent.thumbplayer.utils;

/* loaded from: classes13.dex */
public class TPCommonUtils {
    private static final java.lang.String TAG = "TPCommonUtils";

    public static void assertTrue(boolean z17, java.lang.String str) {
        if (!z17) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static java.lang.String getMd5(java.lang.String str) {
        try {
            byte[] digest = java.security.MessageDigest.getInstance("MD5").digest(str.getBytes(com.tencent.mapsdk.internal.rv.f51270c));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(40);
            for (byte b17 : digest) {
                int i17 = b17 & 255;
                if ((i17 >> 4) == 0) {
                    sb6.append("0");
                    sb6.append(java.lang.Integer.toHexString(i17));
                } else {
                    sb6.append(java.lang.Integer.toHexString(i17));
                }
            }
            return sb6.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17.toString());
            return null;
        }
    }

    public static boolean isEmpty(java.util.Collection<? extends java.lang.Object> collection) {
        return collection == null || collection.size() <= 0;
    }

    public static boolean isNumeric(java.lang.String str) {
        try {
            return java.util.regex.Pattern.compile("-?[0-9]+(\\.[0-9]+)?").matcher(new java.math.BigDecimal(str).toString()).matches();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static boolean isUrl(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return str.split(":")[0].matches("^((https|http|ftp|rtsp|mms)?)");
        } catch (java.util.regex.PatternSyntaxException unused) {
            return false;
        }
    }

    public static boolean isXmlDocument(java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(str) || !str.contains("<?xml")) {
                return false;
            }
            javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new org.xml.sax.InputSource(new java.io.StringReader(str)));
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static double optDouble(java.lang.String str, double d17) {
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                return java.lang.Double.parseDouble(str);
            } catch (java.lang.NumberFormatException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            }
        }
        return d17;
    }

    public static float optFloat(java.lang.String str, int i17) {
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                return java.lang.Float.parseFloat(str);
            } catch (java.lang.NumberFormatException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            }
        }
        return i17;
    }

    public static int optInt(java.lang.String str, int i17) {
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                return java.lang.Integer.parseInt(str);
            } catch (java.lang.NumberFormatException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            }
        }
        return i17;
    }

    public static long optLong(java.lang.String str, long j17) {
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                return java.lang.Long.parseLong(str);
            } catch (java.lang.NumberFormatException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            }
        }
        return j17;
    }

    public static void requireNotNull(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            if (android.text.TextUtils.isEmpty(str)) {
                str = "this argument should not be null!";
            }
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static boolean isEmpty(java.util.Map<? extends java.lang.Object, ? extends java.lang.Object> map) {
        return map == null || map.size() <= 0;
    }
}
