package com.tencent.thumbplayer.core.downloadproxy.utils;

/* loaded from: classes15.dex */
public class TPCGIRequester {
    private static final java.lang.String FILE_NAME = "TPCGIRequester";
    private static final int MAX_RETRY_TIMES = 3;
    private static final int MSG_CONFIG_URL = 2011;
    private static final int MSG_REPORT_URL = 2010;
    private static final int MSG_WUJI_CONFIG_URL = 2013;
    private static final int RETRY_INTERVAL = 3000;
    private static final int TIMEOUT = 3000;
    private static volatile java.util.concurrent.ExecutorService mCustomExecutor;
    private static com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester mRequester;
    private java.util.concurrent.LinkedBlockingQueue<com.tencent.thumbplayer.core.downloadproxy.utils.TPRequestItem> mRetryQueue = new java.util.concurrent.LinkedBlockingQueue<>();
    private java.util.concurrent.LinkedBlockingQueue<com.tencent.thumbplayer.core.downloadproxy.utils.TPRequestItem> mRequestQueue = new java.util.concurrent.LinkedBlockingQueue<>();
    private java.util.TimerTask mTimerTask = new java.util.TimerTask() { // from class: com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester.1
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            while (com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester.this.mRetryQueue.peek() != null && java.lang.System.currentTimeMillis() - ((com.tencent.thumbplayer.core.downloadproxy.utils.TPRequestItem) com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester.this.mRetryQueue.peek()).getRequestFailedTime() > 3000) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester tPCGIRequester = com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester.this;
                tPCGIRequester.addNotifyReqQueue((com.tencent.thumbplayer.core.downloadproxy.utils.TPRequestItem) tPCGIRequester.mRetryQueue.poll());
            }
        }
    };

    private TPCGIRequester() {
        new java.util.Timer(true).scheduleAtFixedRate(this.mTimerTask, 0L, 1000L);
        process();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNotifyReqQueue(com.tencent.thumbplayer.core.downloadproxy.utils.TPRequestItem tPRequestItem) {
        try {
            this.mRequestQueue.put(tPRequestItem);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "RequestQueue add failed:" + th6.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRetryRequestItem(com.tencent.thumbplayer.core.downloadproxy.utils.TPRequestItem tPRequestItem) {
        try {
            if (tPRequestItem.getRequestTimes() <= 3) {
                this.mRetryQueue.put(tPRequestItem);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "retry queue add failed" + th6.toString());
        }
    }

    public static com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester getInstance() {
        if (mRequester == null) {
            synchronized (com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester.class) {
                if (mRequester == null) {
                    mRequester = new com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester();
                }
            }
        }
        return mRequester;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleRequestItem(com.tencent.thumbplayer.core.downloadproxy.utils.TPRequestItem r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester.handleRequestItem(com.tencent.thumbplayer.core.downloadproxy.utils.TPRequestItem):boolean");
    }

    private static java.util.concurrent.ExecutorService obtainThreadExcutor() {
        if (mCustomExecutor == null) {
            synchronized (com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester.class) {
                if (mCustomExecutor == null) {
                    mCustomExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
                }
            }
        }
        return mCustomExecutor;
    }

    private void process() {
        obtainThreadExcutor().execute(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester.2
            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    try {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPRequestItem tPRequestItem = (com.tencent.thumbplayer.core.downloadproxy.utils.TPRequestItem) com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester.this.mRequestQueue.take();
                        if (!com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester.this.handleRequestItem(tPRequestItem)) {
                            tPRequestItem.updateFailedTime();
                            com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester.this.addRetryRequestItem(tPRequestItem);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester.FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "request queue take failed: " + th6.toString());
                    }
                }
            }
        });
    }

    public void addRequestItem(java.lang.String str, int i17) {
        if (str.isEmpty()) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "request url null");
        } else {
            addNotifyReqQueue(new com.tencent.thumbplayer.core.downloadproxy.utils.TPRequestItem(str, i17));
        }
    }
}
