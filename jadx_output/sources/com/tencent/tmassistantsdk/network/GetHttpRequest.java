package com.tencent.tmassistantsdk.network;

/* loaded from: classes13.dex */
public abstract class GetHttpRequest {
    protected static final java.lang.String REQUEST_SERVER_URL = "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxw) + "/cgi-bin/appstage/yyb_get_userapp_info";
    protected static final java.lang.String TAG = "NetworkTask";
    protected org.apache.http.client.methods.HttpGet mHttpGet = null;

    public abstract void onFinished(org.json.JSONObject jSONObject, int i17);

    public synchronized boolean sendData(final java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.mHttpGet != null) {
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.network.GetHttpRequest.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0128  */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v6, types: [org.apache.http.client.HttpClient] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.StringBuilder] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 304
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.network.GetHttpRequest.AnonymousClass1.run():void");
            }
        });
        return false;
    }
}
