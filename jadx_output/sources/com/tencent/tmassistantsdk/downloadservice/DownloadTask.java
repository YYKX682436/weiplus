package com.tencent.tmassistantsdk.downloadservice;

/* loaded from: classes13.dex */
public class DownloadTask {
    public static final java.lang.String AD_INJECT_KEY_PREFIX = "ad-inject-apk-offset:";
    public static final java.lang.String TAG = "_DownloadTask";
    protected com.tencent.tmassistantsdk.downloadservice.DownloadInfo mDownloadInfo;
    private java.lang.String mRequestUrl;
    com.tencent.tmassistantsdk.storage.TMAssistantFile mSaveFile;
    protected boolean mStopTask = false;
    org.apache.http.client.HttpClient mHttpClient = null;
    org.apache.http.client.methods.HttpGet mHttpGet = null;
    protected final byte[] mRecvBuf = new byte[4096];
    protected final int mTaskId = com.tencent.tmassistantsdk.util.GlobalUtil.getMemUUID();
    private java.lang.String startDownloadNetType = "wifi";
    private boolean mIsRedirect = false;

    public DownloadTask(com.tencent.tmassistantsdk.downloadservice.DownloadInfo downloadInfo) {
        this.mDownloadInfo = null;
        this.mDownloadInfo = downloadInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelInWorkThread() {
        this.mStopTask = true;
        org.apache.http.client.methods.HttpGet httpGet = this.mHttpGet;
        if (httpGet == null || httpGet.isAborted()) {
            return;
        }
        this.mHttpGet.abort();
    }

    private void handleResponseCode(org.apache.http.HttpResponse httpResponse, com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo downloadChunkLogInfo) {
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "httpResponseCode = " + statusCode + " " + java.lang.Thread.currentThread().getName());
        downloadChunkLogInfo.readHeaderTime = java.lang.System.currentTimeMillis();
        downloadChunkLogInfo.responseHttpCode = statusCode;
        if (statusCode == 200 || statusCode == 206) {
            this.mDownloadInfo.mRetryCnt = 0;
        }
        if (statusCode == 200) {
            org.apache.http.Header[] headers = httpResponse.getHeaders("Content-Type");
            if (headers != null && headers.length > 0) {
                if (this.mDownloadInfo.mContentType.equals("resource/tm.android.unknown")) {
                    this.mDownloadInfo.mFileName = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.renameAPKFileName(this.mDownloadInfo.mFileName);
                } else {
                    java.lang.String value = headers[0].getValue();
                    if (!android.text.TextUtils.isEmpty(value) && value.startsWith(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT)) {
                        throw new com.tencent.tmassistantsdk.downloadservice.StopRequestException(708, "Return contenttype = text " + java.lang.Thread.currentThread().getName());
                    }
                    renameApkFileName(httpResponse);
                }
            }
            onReceivedResponseData(httpResponse, downloadChunkLogInfo);
            return;
        }
        if (statusCode == 206) {
            if (this.mDownloadInfo.mContentType.equals("resource/tm.android.unknown")) {
                this.mDownloadInfo.mFileName = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.renameAPKFileName(this.mDownloadInfo.mFileName);
            } else {
                renameApkFileName(httpResponse);
            }
            onReceivedResponseData(httpResponse, downloadChunkLogInfo);
            return;
        }
        if (statusCode != 307) {
            if (statusCode == 416) {
                throw new com.tencent.tmassistantsdk.downloadservice.StopRequestException(statusCode, "HTTP response code error, code = " + statusCode);
            }
            if (statusCode == 500) {
                throw new com.tencent.tmassistantsdk.downloadservice.StopRequestException(statusCode, "HTTP response code error, code = " + statusCode);
            }
            if (statusCode == 503) {
                throw new com.tencent.tmassistantsdk.downloadservice.StopRequestException(statusCode, "HTTP response code error, code = " + statusCode);
            }
            switch (statusCode) {
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    throw new com.tencent.tmassistantsdk.downloadservice.StopRequestException(statusCode, "HTTP response code error, code = " + statusCode);
            }
        }
        if (this.mDownloadInfo.mRedirectCnt > 5) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "mRedirectCnt = " + this.mDownloadInfo.mRedirectCnt + ",MAX_REDIRESTS = 5");
            throw new com.tencent.tmassistantsdk.downloadservice.StopRequestException(709, "Redirect cnt many times.");
        }
        org.apache.http.Header firstHeader = httpResponse.getFirstHeader(ya.b.LOCATION);
        if (firstHeader == null) {
            com.tencent.tmassistantsdk.util.TMLog.e(TAG, "location header is null. httpResponseCode = " + statusCode);
            throw new com.tencent.tmassistantsdk.downloadservice.StopRequestException(702, "location header is null. httpResponseCode = " + statusCode);
        }
        java.lang.String value2 = firstHeader.getValue();
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "jumpURL = " + value2);
        if (com.tencent.tmassistantsdk.downloadservice.DownloadHelper.isValidURL(value2)) {
            this.mRequestUrl = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.correctURL(value2);
            this.mIsRedirect = true;
            this.mDownloadInfo.mRedirectCnt++;
            return;
        }
        throw new com.tencent.tmassistantsdk.downloadservice.StopRequestException(700, "Jump url is not valid. httpResponseCode = " + statusCode + " url: " + value2);
    }

    private void onDownloadError(java.lang.Throwable th6) {
        if (th6 != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0363, code lost:
    
        r2 = r26.mSaveFile;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0365, code lost:
    
        if (r2 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0367, code lost:
    
        r2.close();
        r26.mSaveFile = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x036d, code lost:
    
        r28.receiveDataSize = r4;
        r0 = r27.getFirstHeader("X-COS-META-EDGEPACK-OFFSET");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0377, code lost:
    
        if (r0 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x037b, code lost:
    
        if (r26.mDownloadInfo == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x037d, code lost:
    
        r0 = r17 + r0.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0393, code lost:
    
        if (r0.length() <= 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0395, code lost:
    
        r2 = com.tencent.mm.sdk.platformtools.o4.N("ad-apk-inject-mmkv", 2, null);
        r3 = com.tencent.tmassistantsdk.downloadservice.DownloadTask.AD_INJECT_KEY_PREFIX + r26.mDownloadInfo.mURL;
        r2.putString(r3, r0);
        com.tencent.mars.xlog.Log.i(com.tencent.tmassistantsdk.downloadservice.DownloadTask.TAG, "inject info to mmkv, key = " + r3 + "   value = " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x03cb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0206 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0363 A[EDGE_INSN: B:80:0x0363->B:53:0x0363 BREAK  A[LOOP:0: B:20:0x01fe->B:33:0x0315], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void onReceivedResponseData(org.apache.http.HttpResponse r27, com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo r28) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.downloadservice.DownloadTask.onReceivedResponseData(org.apache.http.HttpResponse, com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo):void");
    }

    private void renameApkFileName(org.apache.http.HttpResponse httpResponse) {
        java.lang.String genAPKFileName;
        if (httpResponse != null && this.mDownloadInfo.mContentType.equals("application/vnd.android.package-archive")) {
            org.apache.http.Header[] headers = httpResponse.getHeaders("Content-Disposition");
            if (headers == null || headers.length <= 0) {
                genAPKFileName = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.genAPKFileName(this.mDownloadInfo.mRequestURL);
            } else {
                java.lang.String value = headers[0].getValue();
                com.tencent.tmassistantsdk.util.TMLog.i(TAG, "headerFileName = " + value);
                if (android.text.TextUtils.isEmpty(value) || !value.contains("filename=\"")) {
                    genAPKFileName = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.genAPKFileName(this.mDownloadInfo.mRequestURL);
                } else {
                    java.lang.String substring = value.substring(value.indexOf("filename=\"") + 10);
                    if (android.text.TextUtils.isEmpty(substring)) {
                        genAPKFileName = null;
                    } else {
                        genAPKFileName = substring.substring(0, substring.indexOf("\""));
                        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "header file Name =" + genAPKFileName);
                    }
                }
            }
            if (android.text.TextUtils.isEmpty(genAPKFileName)) {
                return;
            }
            this.mDownloadInfo.mFileName = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.correctFileName(com.tencent.tmassistantsdk.downloadservice.DownloadHelper.decodeFileName(genAPKFileName));
        }
    }

    private void setExtraHeaderParam(org.apache.http.client.methods.HttpGet httpGet, java.util.Map<java.lang.String, java.lang.String> map) {
        if (httpGet == null || map == null || map.size() <= 0) {
            return;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            httpGet.addHeader(entry.getKey(), entry.getValue());
        }
    }

    private void setRangeHeader(org.apache.http.client.methods.HttpGet httpGet, com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo downloadChunkLogInfo) {
        long j17;
        java.lang.String netStatus = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.getNetStatus();
        this.mDownloadInfo.mNetType = netStatus;
        if (android.text.TextUtils.isEmpty(netStatus) || (!netStatus.contains("wap") && (!netStatus.contains("net") || this.mDownloadInfo.mRetryCnt <= 0))) {
            java.lang.String str = "bytes=" + this.mDownloadInfo.mReceivedBytes + "-";
            httpGet.addHeader("range", str);
            com.tencent.tmassistantsdk.util.TMLog.d(TAG, "set range header: " + str);
            downloadChunkLogInfo.responseContentLength = this.mDownloadInfo.getTotalSize();
            downloadChunkLogInfo.requestRanagePosition = this.mDownloadInfo.mReceivedBytes;
            downloadChunkLogInfo.requestRanageSize = 0L;
            return;
        }
        try {
            int splitSizeInBytes = com.tencent.tmassistantsdk.downloadservice.DownloadSetting.getSplitSizeInBytes(netStatus);
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo downloadInfo = this.mDownloadInfo;
            long j18 = downloadInfo.mReceivedBytes;
            if (downloadInfo.getTotalSize() > 0) {
                com.tencent.tmassistantsdk.downloadservice.DownloadInfo downloadInfo2 = this.mDownloadInfo;
                j17 = (downloadInfo2.mReceivedBytes + splitSizeInBytes) - 1;
                if (j17 >= downloadInfo2.getTotalSize()) {
                    j17 = this.mDownloadInfo.getTotalSize() - 1;
                }
            } else {
                j17 = splitSizeInBytes - 1;
            }
            java.lang.String str2 = "bytes=" + j18 + "-" + j17;
            httpGet.addHeader("range", str2);
            com.tencent.tmassistantsdk.util.TMLog.d(TAG, "set range header: " + str2);
            downloadChunkLogInfo.responseContentLength = this.mDownloadInfo.getTotalSize();
            downloadChunkLogInfo.requestRanagePosition = j18;
            downloadChunkLogInfo.requestRanageSize = splitSizeInBytes;
        } catch (java.lang.UnsupportedOperationException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    private boolean shouldRetryConnect() {
        boolean z17 = false;
        if (this.mStopTask) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "mStopTask = " + this.mStopTask);
            return false;
        }
        try {
            java.lang.Thread.sleep(5000L);
        } catch (java.lang.InterruptedException unused) {
        }
        if (!com.tencent.tmassistantsdk.downloadservice.DownloadHelper.isNetworkConncted()) {
            int i17 = 0;
            while (!com.tencent.tmassistantsdk.downloadservice.DownloadHelper.isNetworkConncted() && i17 < 5) {
                i17++;
                try {
                    java.lang.Thread.sleep(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                } catch (java.lang.InterruptedException unused2) {
                    this.mDownloadInfo.mDownloadFailedErrCode = 600;
                }
            }
        }
        if (!com.tencent.tmassistantsdk.downloadservice.DownloadHelper.isNetworkConncted()) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "network unconnected");
            return false;
        }
        if (!com.tencent.tmassistantsdk.downloadservice.DownloadHelper.getNetStatus().equalsIgnoreCase("wifi") && !com.tencent.tmassistantsdk.downloadservice.DownloadHelper.getNetStatus().equalsIgnoreCase(this.startDownloadNetType)) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "not equal netType, current: " + com.tencent.tmassistantsdk.downloadservice.DownloadHelper.getNetStatus() + ", startNetType: " + this.startDownloadNetType);
            return false;
        }
        if (this.mDownloadInfo.hasRetryChance()) {
            com.tencent.tmassistantsdk.downloadservice.DownloadInfo downloadInfo = this.mDownloadInfo;
            downloadInfo.mRetryCnt++;
            downloadInfo.mRedirectCnt = 0;
            try {
                java.lang.Thread.sleep(5000L);
                z17 = true;
            } catch (java.lang.InterruptedException unused3) {
                this.mDownloadInfo.mDownloadFailedErrCode = 600;
            }
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "shouldRetryConnect(" + z17 + "), retryCnt = " + this.mDownloadInfo.mRetryCnt);
        return z17;
    }

    private boolean verifyTotalLen(org.apache.http.HttpResponse httpResponse, org.apache.http.HttpEntity httpEntity) {
        if (httpResponse.getStatusLine().getStatusCode() == 200) {
            long contentLength = httpEntity.getContentLength();
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "verifyTotalLen,totalLen = " + contentLength + "mRequestFileSize = " + this.mDownloadInfo.mRequestFileSize);
            return contentLength != -1 && (this.mDownloadInfo.mRequestFileSize.longValue() <= 0 || contentLength == this.mDownloadInfo.mRequestFileSize.longValue());
        }
        if (httpResponse.getStatusLine().getStatusCode() != 206) {
            return true;
        }
        long totalSize = com.tencent.tmassistantsdk.downloadservice.ByteRange.getTotalSize(httpResponse.getFirstHeader("content-range").getValue());
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "verifyTotalLen,totalLen = " + totalSize + "mRequestFileSize = " + this.mDownloadInfo.mRequestFileSize);
        return totalSize != -1 && (this.mDownloadInfo.mRequestFileSize.longValue() <= 0 || totalSize == this.mDownloadInfo.mRequestFileSize.longValue());
    }

    public void cancel() {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "DownloadTask::cancel url: " + this.mDownloadInfo.mURL);
        if (java.lang.Thread.currentThread().getId() == android.os.Looper.getMainLooper().getThread().getId()) {
            com.tencent.mm.ipcinvoker.w0.b(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.downloadservice.DownloadTask.1
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.tmassistantsdk.downloadservice.DownloadTask.this.cancelInWorkThread();
                }
            });
        } else {
            cancelInWorkThread();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0366, code lost:
    
        if (r1 == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0368, code lost:
    
        r1.close();
        r11.mSaveFile = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x036d, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0316, code lost:
    
        if (r1 == null) goto L152;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0475 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0016 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e9 A[Catch: all -> 0x017b, StopRequestException -> 0x01d3, IOException -> 0x0271, SSLHandshakeException -> 0x02c9, InterruptedException -> 0x0319, UnknownHostException -> 0x0370, SocketTimeoutException -> 0x03c8, ConnectTimeoutException -> 0x041f, TryCatch #5 {ConnectTimeoutException -> 0x041f, blocks: (B:8:0x003c, B:12:0x0040, B:14:0x0044, B:17:0x004b, B:18:0x0075, B:20:0x00e9, B:21:0x0106, B:30:0x012c, B:24:0x015a, B:25:0x017a, B:49:0x0052, B:50:0x0073, B:51:0x0063), top: B:7:0x003c, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void exec(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.downloadservice.DownloadTask.exec(java.lang.String):void");
    }

    public java.lang.String getDownloadURI() {
        return this.mDownloadInfo.mURL;
    }

    public int getPriority() {
        return this.mDownloadInfo.mPriority;
    }

    public int getTaskId() {
        return this.mTaskId;
    }
}
