package df;

/* loaded from: classes7.dex */
public final class m implements com.tencent.mars.cdn.CronetLogic.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df.l f229510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f229511b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CronetLogic.CronetRequestParams f229512c;

    public m(df.l lVar, int i17, com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams) {
        this.f229510a = lVar;
        this.f229511b = i17;
        this.f229512c = cronetRequestParams;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveChunkedData(com.tencent.mars.cdn.CronetLogic.ChunkedData chunkedData, long j17) {
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public int onCronetReceiveHeader(com.tencent.mars.cdn.CronetLogic.ResponseHeader responseHeader, int i17, java.lang.String str) {
        return 0;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetReceiveUploadProgress(long j17, long j18) {
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onCronetTaskCompleted(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetTaskResult result, java.lang.String str2) {
        java.lang.String[] strArr;
        java.lang.String[] strArr2;
        java.lang.Runnable runnable;
        kotlin.jvm.internal.o.g(result, "result");
        this.f229510a.b();
        java.lang.String[] strArr3 = new java.lang.String[0];
        java.lang.String[] strArr4 = new java.lang.String[0];
        com.tencent.mars.cdn.CronetLogic.HeaderMap[] headerMapArr = result.headers;
        if (headerMapArr != null) {
            int length = headerMapArr.length;
            java.lang.String[] strArr5 = new java.lang.String[length];
            for (int i17 = 0; i17 < length; i17++) {
                strArr5[i17] = "";
            }
            int length2 = result.headers.length;
            java.lang.String[] strArr6 = new java.lang.String[length2];
            for (int i18 = 0; i18 < length2; i18++) {
                strArr6[i18] = "";
            }
            com.tencent.mars.cdn.CronetLogic.HeaderMap[] headers = result.headers;
            kotlin.jvm.internal.o.f(headers, "headers");
            int length3 = headers.length;
            int i19 = 0;
            int i27 = 0;
            while (i19 < length3) {
                com.tencent.mars.cdn.CronetLogic.HeaderMap headerMap = headers[i19];
                java.lang.String key = headerMap.key;
                kotlin.jvm.internal.o.f(key, "key");
                strArr5[i27] = key;
                java.lang.String value = headerMap.value;
                kotlin.jvm.internal.o.f(value, "value");
                strArr6[i27] = value;
                i19++;
                i27++;
            }
            strArr = strArr5;
            strArr2 = strArr6;
        } else {
            strArr = strArr3;
            strArr2 = strArr4;
        }
        byte[] bArr = result.data;
        com.tencent.skyline.jni.SkylineJNI.notifyCronetResponse(this.f229511b, result.errorCode, result.statusCode, strArr, strArr2, bArr == null ? new byte[0] : bArr);
        java.lang.Object obj = df.n.f229523g;
        com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams = this.f229512c;
        synchronized (obj) {
            java.util.HashSet hashSet = df.n.f229522f;
            if (hashSet.contains(cronetRequestParams.taskId)) {
                hashSet.remove(cronetRequestParams.taskId);
                df.n.f229520d--;
                java.util.LinkedList linkedList = df.n.f229521e;
                if ((!linkedList.isEmpty()) && (runnable = (java.lang.Runnable) linkedList.poll()) != null) {
                    runnable.run();
                }
            }
        }
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskCallback
    public void onDownloadProgressChanged(java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
    }
}
