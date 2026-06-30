package ub;

/* loaded from: classes13.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static long f425991a;

    public static int a(java.io.IOException iOException) {
        if (iOException instanceof java.io.CharConversionException) {
            return -20;
        }
        if (iOException instanceof java.nio.charset.MalformedInputException) {
            return -21;
        }
        if (iOException instanceof java.nio.charset.UnmappableCharacterException) {
            return -22;
        }
        if (iOException instanceof java.nio.channels.ClosedChannelException) {
            return -24;
        }
        if (iOException instanceof java.io.EOFException) {
            return -26;
        }
        if (iOException instanceof java.nio.channels.FileLockInterruptionException) {
            return -27;
        }
        if (iOException instanceof java.io.FileNotFoundException) {
            return -28;
        }
        if (iOException instanceof java.net.HttpRetryException) {
            return -29;
        }
        if (iOException instanceof org.apache.http.conn.ConnectTimeoutException) {
            return -7;
        }
        if (iOException instanceof java.net.SocketTimeoutException) {
            return -8;
        }
        if (iOException instanceof java.util.InvalidPropertiesFormatException) {
            return -30;
        }
        if (iOException instanceof java.net.MalformedURLException) {
            return -3;
        }
        if (iOException instanceof java.io.InvalidClassException) {
            return -33;
        }
        if (iOException instanceof java.io.InvalidObjectException) {
            return -34;
        }
        if (iOException instanceof java.io.NotActiveException) {
            return -35;
        }
        if (iOException instanceof java.io.NotSerializableException) {
            return -36;
        }
        if (iOException instanceof java.io.OptionalDataException) {
            return -37;
        }
        if (iOException instanceof java.io.StreamCorruptedException) {
            return -38;
        }
        if (iOException instanceof java.io.WriteAbortedException) {
            return -39;
        }
        if (iOException instanceof java.net.ProtocolException) {
            return -40;
        }
        if (iOException instanceof javax.net.ssl.SSLHandshakeException) {
            return -41;
        }
        if (iOException instanceof javax.net.ssl.SSLKeyException) {
            return -42;
        }
        if (iOException instanceof javax.net.ssl.SSLPeerUnverifiedException) {
            return -43;
        }
        if (iOException instanceof javax.net.ssl.SSLProtocolException) {
            return -44;
        }
        if (iOException instanceof java.net.BindException) {
            return -45;
        }
        if (iOException instanceof java.net.ConnectException) {
            return -46;
        }
        if (iOException instanceof java.net.NoRouteToHostException) {
            return -47;
        }
        if (iOException instanceof java.net.PortUnreachableException) {
            return -48;
        }
        if (iOException instanceof java.io.SyncFailedException) {
            return -49;
        }
        if (iOException instanceof java.io.UTFDataFormatException) {
            return -50;
        }
        if (iOException instanceof java.net.UnknownHostException) {
            return -51;
        }
        if (iOException instanceof java.net.UnknownServiceException) {
            return -52;
        }
        if (iOException instanceof java.io.UnsupportedEncodingException) {
            return -53;
        }
        return iOException instanceof java.util.zip.ZipException ? -54 : -2;
    }

    public static java.lang.String b() {
        java.lang.String str = com.tencent.midas.api.APMidasPayAPI.env;
        return com.tencent.midas.control.APMidasPayHelper.isPayCenterSDK ? com.tencent.midas.comm.APIPConfig.getDomain(str) : str.equals(com.tencent.midas.api.APMidasPayAPI.ENV_DEV) ? "dev.api.unipay.qq.com" : str.equals("test") ? "sandbox.api.unipay.qq.com" : "api.unipay.qq.com";
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String[] split = str.split("[?]");
        if (split.length > 1 && (str3 = split[1]) != null) {
            for (java.lang.String str6 : str3.split("[&]")) {
                java.lang.String[] split2 = str6.split("[=]");
                if (split2.length <= 1 || (str4 = split2[0]) == null) {
                    str4 = null;
                }
                if (split2.length <= 1 || (str5 = split2[1]) == null) {
                    str5 = null;
                }
                if (str4 != null && str4.compareToIgnoreCase(str2) == 0) {
                    return str5;
                }
            }
        }
        return null;
    }

    public static boolean d() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - f425991a < 3000) {
            return true;
        }
        f425991a = currentTimeMillis;
        return false;
    }

    public static java.lang.String e(java.lang.String str, int i17) {
        java.lang.String str2 = "";
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.midas.comm.APLog.w("", "解码内容为空");
        } else {
            if (i17 <= 0) {
                return str;
            }
            int i18 = 0;
            while (i18 < i17) {
                try {
                    str2 = java.net.URLDecoder.decode(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                } catch (java.lang.Exception e17) {
                    com.tencent.midas.comm.APLog.i("urlEncode", e17.toString());
                }
                i18++;
                str = str2;
            }
        }
        return str2;
    }

    public static java.lang.String f(java.lang.String str, int i17) {
        java.lang.String str2 = "";
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.midas.comm.APLog.i("urlEncode", "编码内容为空");
        } else {
            if (i17 <= 0) {
                return str;
            }
            int i18 = 0;
            while (i18 < i17) {
                try {
                    str2 = java.net.URLEncoder.encode(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                } catch (java.lang.Exception e17) {
                    com.tencent.midas.comm.APLog.i("urlEncode", e17.toString());
                }
                i18++;
                str = str2;
            }
        }
        return str2;
    }
}
