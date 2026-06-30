package qv;

@j95.b
/* loaded from: classes.dex */
public class a extends i95.w implements rv.h2 {
    public java.lang.String wi(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !(str.startsWith("https://") || str.startsWith("http://"))) {
            com.tencent.mars.xlog.Log.i("AppMsgBizHelperService", "imgSourceUrl not encode, which is " + str);
            return str;
        }
        try {
            return java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("AppMsgBizHelperService", "encode img url error: " + e17);
            return str;
        }
    }
}
