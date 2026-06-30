package mw4;

/* loaded from: classes7.dex */
public final class g implements com.tencent.mars.cdn.CronetLogic.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f331764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.io.PipedOutputStream f331765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331766c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f331767d;

    public g(yz5.l lVar, java.io.PipedOutputStream pipedOutputStream, java.lang.String str, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        this.f331764a = lVar;
        this.f331765b = pipedOutputStream;
        this.f331766c = str;
        this.f331767d = atomicBoolean;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveChunkedData(com.tencent.mars.cdn.CronetLogic.ChunkedData chunkedData, long j17) {
        java.io.PipedOutputStream pipedOutputStream = this.f331765b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCronetReceiveChunkedData, length:");
        sb6.append(j17);
        sb6.append(", data:");
        kotlin.jvm.internal.o.d(chunkedData);
        sb6.append(chunkedData.data.length);
        com.tencent.mars.xlog.Log.i("MicroMsg.MpCronetInterceptor", sb6.toString());
        try {
            this.f331767d.set(true);
            pipedOutputStream.write(chunkedData.data);
            pipedOutputStream.flush();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MpCronetInterceptor", "onCronetReceiveChunkedData exception = " + e17.getMessage());
        }
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public int onCronetReceiveHeader(com.tencent.mars.cdn.CronetLogic.ResponseHeader header, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(header, "header");
        com.tencent.mars.xlog.Log.i("MicroMsg.MpCronetInterceptor", "onCronetReceiveHeader, url:" + this.f331766c + ", status_code:" + i17);
        com.tencent.mars.cdn.CronetLogic.HeaderMap[] headers = header.headers;
        kotlin.jvm.internal.o.f(headers, "headers");
        int length = headers.length;
        for (int i18 = 0; i18 < length; i18++) {
            com.tencent.mars.cdn.CronetLogic.HeaderMap headerMap = headers[i18];
            if (r26.i0.p(headerMap.key, "Content-Type", true)) {
                yz5.l lVar = this.f331764a;
                if (headerMap != null) {
                    lVar.invoke(headerMap.value);
                } else {
                    lVar.invoke("");
                }
                return 0;
            }
        }
        throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveUploadProgress(long j17, long j18) {
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetTaskCompleted(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        this.f331764a.invoke("");
        java.lang.String str3 = this.f331766c;
        java.io.PipedOutputStream pipedOutputStream = this.f331765b;
        if (cronetTaskResult == null) {
            pipedOutputStream.close();
            com.tencent.mars.xlog.Log.e("MicroMsg.MpCronetInterceptor", "mp over mars request failed, result is null, url: " + str3);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MpCronetInterceptor", "onCronetTaskCompleted, filekey:" + str + ", errorCode:" + cronetTaskResult.errorCode + ", errorMsg:" + cronetTaskResult.errorMsg + ", totalWriteByte:" + cronetTaskResult.totalWriteByte + ", totalReceiveByte:" + cronetTaskResult.totalReceiveByte + ", totalSendByte:" + cronetTaskResult.totalSendByte);
        try {
            if (this.f331767d.get()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MpCronetInterceptor", "mp over mars chunk request success");
                pipedOutputStream.flush();
                pipedOutputStream.close();
                return;
            }
            if (cronetTaskResult.statusCode != 200) {
                pipedOutputStream.close();
                com.tencent.mars.xlog.Log.e("MicroMsg.MpCronetInterceptor", "mp over mars request failed, statusCode: " + cronetTaskResult.statusCode + ", url: " + str3);
                return;
            }
            byte[] bArr = cronetTaskResult.data;
            if (bArr != null) {
                pipedOutputStream.write(bArr);
                pipedOutputStream.flush();
                pipedOutputStream.close();
                com.tencent.mars.xlog.Log.i("MicroMsg.MpCronetInterceptor", "mp over mars request success");
                return;
            }
            pipedOutputStream.close();
            com.tencent.mars.xlog.Log.e("MicroMsg.MpCronetInterceptor", "mp over mars request failed, data is empty, url: " + str3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MpCronetInterceptor", "onCronetTaskCompleted exception = " + e17.getMessage());
        }
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onDownloadProgressChanged(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
    }
}
