package com.tencent.tmassistantsdk.network;

/* loaded from: classes13.dex */
public abstract class PostHttpRequest {
    static final java.lang.String REQUEST_SERVER_URL = "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy6) + "/";
    static final java.lang.String TAG = "BaseHttpRequest";
    org.apache.http.client.methods.HttpPost mHttpPost = null;

    public synchronized void cancleRequest() {
        org.apache.http.client.methods.HttpPost httpPost = this.mHttpPost;
        if (httpPost != null && !httpPost.isAborted()) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "BaseHttpRequest:" + this + " cancleRequest");
            try {
                try {
                    this.mHttpPost.abort();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
                }
            } finally {
                this.mHttpPost = null;
            }
        }
    }

    public abstract void onFinished(com.qq.taf.jce.JceStruct jceStruct, com.qq.taf.jce.JceStruct jceStruct2, int i17);

    public synchronized boolean sendRequest(final com.qq.taf.jce.JceStruct jceStruct) {
        if (jceStruct == null) {
            return false;
        }
        if (this.mHttpPost != null) {
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.network.PostHttpRequest.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
            /* JADX WARN: Type inference failed for: r4v4, types: [org.apache.http.client.methods.HttpPost] */
            /* JADX WARN: Type inference failed for: r5v2, types: [org.apache.http.HttpEntity, org.apache.http.entity.ByteArrayEntity] */
            /* JADX WARN: Type inference failed for: r5v3 */
            /* JADX WARN: Type inference failed for: r5v8, types: [org.apache.http.client.HttpClient] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 292
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.network.PostHttpRequest.AnonymousClass1.run():void");
            }
        });
        return false;
    }
}
