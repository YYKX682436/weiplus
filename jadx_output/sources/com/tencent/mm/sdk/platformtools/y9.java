package com.tencent.mm.sdk.platformtools;

/* loaded from: classes.dex */
public abstract class y9 {
    public static java.lang.String a(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                return java.net.URLEncoder.encode(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            } catch (java.io.UnsupportedEncodingException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUtilities", "URLEncode fail, throw : %s", e17.getMessage());
            }
        }
        return str;
    }
}
