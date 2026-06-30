package org.chromium.net.urlconnection;

/* loaded from: classes13.dex */
public class CronetHttpURLConnection extends java.net.HttpURLConnection {
    private static final java.lang.String CONTENT_LENGTH = "Content-Length";
    private static final java.lang.String TAG = "CronetHttpURLConnection";
    private final org.chromium.net.CronetEngine mCronetEngine;
    private java.io.IOException mException;
    private boolean mHasResponseHeadersOrCompleted;
    private org.chromium.net.urlconnection.CronetInputStream mInputStream;
    private final org.chromium.net.urlconnection.MessageLoop mMessageLoop;
    private boolean mOnRedirectCalled;
    private org.chromium.net.urlconnection.CronetOutputStream mOutputStream;
    private org.chromium.net.UrlRequest mRequest;
    private final java.util.List<android.util.Pair<java.lang.String, java.lang.String>> mRequestHeaders;
    private java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> mResponseHeadersList;
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> mResponseHeadersMap;
    private org.chromium.net.UrlResponseInfo mResponseInfo;
    private int mTrafficStatsTag;
    private boolean mTrafficStatsTagSet;
    private int mTrafficStatsUid;
    private boolean mTrafficStatsUidSet;

    /* loaded from: classes13.dex */
    public class CronetUrlRequestCallback extends org.chromium.net.UrlRequest.Callback {
        public CronetUrlRequestCallback() {
        }

        private void setResponseDataCompleted(java.io.IOException iOException) {
            org.chromium.net.urlconnection.CronetHttpURLConnection.this.mException = iOException;
            if (org.chromium.net.urlconnection.CronetHttpURLConnection.this.mInputStream != null) {
                org.chromium.net.urlconnection.CronetHttpURLConnection.this.mInputStream.setResponseDataCompleted(iOException);
            }
            if (org.chromium.net.urlconnection.CronetHttpURLConnection.this.mOutputStream != null) {
                org.chromium.net.urlconnection.CronetHttpURLConnection.this.mOutputStream.setRequestCompleted(iOException);
            }
            org.chromium.net.urlconnection.CronetHttpURLConnection.this.mHasResponseHeadersOrCompleted = true;
            org.chromium.net.urlconnection.CronetHttpURLConnection.this.mMessageLoop.quit();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onCanceled(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
            org.chromium.net.urlconnection.CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            setResponseDataCompleted(new java.io.IOException("disconnect() called"));
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onFailed(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
            if (cronetException == null) {
                throw new java.lang.IllegalStateException("Exception cannot be null in onFailed.");
            }
            org.chromium.net.urlconnection.CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            setResponseDataCompleted(cronetException);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onReadCompleted(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer) {
            org.chromium.net.urlconnection.CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            org.chromium.net.urlconnection.CronetHttpURLConnection.this.mMessageLoop.quit();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onRedirectReceived(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) {
            org.chromium.net.urlconnection.CronetHttpURLConnection.this.mOnRedirectCalled = true;
            try {
                java.net.URL url = new java.net.URL(str);
                boolean equals = url.getProtocol().equals(((java.net.HttpURLConnection) org.chromium.net.urlconnection.CronetHttpURLConnection.this).url.getProtocol());
                if (((java.net.HttpURLConnection) org.chromium.net.urlconnection.CronetHttpURLConnection.this).instanceFollowRedirects) {
                    ((java.net.HttpURLConnection) org.chromium.net.urlconnection.CronetHttpURLConnection.this).url = url;
                }
                if (((java.net.HttpURLConnection) org.chromium.net.urlconnection.CronetHttpURLConnection.this).instanceFollowRedirects && equals) {
                    org.chromium.net.urlconnection.CronetHttpURLConnection.this.mRequest.followRedirect();
                    return;
                }
            } catch (java.net.MalformedURLException unused) {
            }
            org.chromium.net.urlconnection.CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            org.chromium.net.urlconnection.CronetHttpURLConnection.this.mRequest.cancel();
            setResponseDataCompleted(null);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onResponseStarted(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
            org.chromium.net.urlconnection.CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            org.chromium.net.urlconnection.CronetHttpURLConnection.this.mHasResponseHeadersOrCompleted = true;
            org.chromium.net.urlconnection.CronetHttpURLConnection.this.mMessageLoop.quit();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onSucceeded(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
            org.chromium.net.urlconnection.CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            setResponseDataCompleted(null);
        }
    }

    public CronetHttpURLConnection(java.net.URL url, org.chromium.net.CronetEngine cronetEngine) {
        super(url);
        this.mCronetEngine = cronetEngine;
        this.mMessageLoop = new org.chromium.net.urlconnection.MessageLoop();
        this.mInputStream = new org.chromium.net.urlconnection.CronetInputStream(this);
        this.mRequestHeaders = new java.util.ArrayList();
    }

    private void checkHasResponseHeaders() {
        if (!this.mHasResponseHeadersOrCompleted) {
            throw new java.lang.IllegalStateException("No response.");
        }
        java.io.IOException iOException = this.mException;
        if (iOException != null) {
            throw iOException;
        }
        if (this.mResponseInfo == null) {
            throw new java.lang.NullPointerException("Response info is null when there is no exception.");
        }
    }

    private boolean checkTrafficStatsTag() {
        if (this.mTrafficStatsTagSet) {
            return true;
        }
        int threadStatsTag = android.net.TrafficStats.getThreadStatsTag();
        if (threadStatsTag != -1) {
            this.mTrafficStatsTag = threadStatsTag;
            this.mTrafficStatsTagSet = true;
        }
        return this.mTrafficStatsTagSet;
    }

    private boolean checkTrafficStatsUid() {
        if (this.mTrafficStatsUidSet) {
            return true;
        }
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return false;
        }
        int threadStatsUid = android.net.TrafficStats.getThreadStatsUid();
        if (threadStatsUid != -1) {
            this.mTrafficStatsUid = threadStatsUid;
            this.mTrafficStatsUidSet = true;
        }
        return this.mTrafficStatsUidSet;
    }

    private int findRequestProperty(java.lang.String str) {
        for (int i17 = 0; i17 < this.mRequestHeaders.size(); i17++) {
            if (((java.lang.String) this.mRequestHeaders.get(i17).first).equalsIgnoreCase(str)) {
                return i17;
            }
        }
        return -1;
    }

    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> getAllHeaders() {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.mResponseHeadersMap;
        if (map != null) {
            return map;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : getAllHeadersAsList()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((java.util.Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add(entry.getValue());
            treeMap.put(entry.getKey(), java.util.Collections.unmodifiableList(arrayList));
        }
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> unmodifiableMap = java.util.Collections.unmodifiableMap(treeMap);
        this.mResponseHeadersMap = unmodifiableMap;
        return unmodifiableMap;
    }

    private java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> getAllHeadersAsList() {
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list = this.mResponseHeadersList;
        if (list != null) {
            return list;
        }
        this.mResponseHeadersList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.mResponseInfo.getAllHeadersAsList()) {
            if (!entry.getKey().equalsIgnoreCase("Content-Encoding")) {
                this.mResponseHeadersList.add(new java.util.AbstractMap.SimpleImmutableEntry(entry));
            }
        }
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> unmodifiableList = java.util.Collections.unmodifiableList(this.mResponseHeadersList);
        this.mResponseHeadersList = unmodifiableList;
        return unmodifiableList;
    }

    private java.util.Map.Entry<java.lang.String, java.lang.String> getHeaderFieldEntry(int i17) {
        try {
            getResponse();
            java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> allHeadersAsList = getAllHeadersAsList();
            if (i17 >= allHeadersAsList.size()) {
                return null;
            }
            return allHeadersAsList.get(i17);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    private void getResponse() {
        org.chromium.net.urlconnection.CronetOutputStream cronetOutputStream = this.mOutputStream;
        if (cronetOutputStream != null) {
            cronetOutputStream.checkReceivedEnoughContent();
            if (isChunkedUpload()) {
                this.mOutputStream.close();
            }
        }
        if (!this.mHasResponseHeadersOrCompleted) {
            startRequest();
            this.mMessageLoop.loop();
        }
        checkHasResponseHeaders();
    }

    private long getStreamingModeContentLength() {
        long j17 = ((java.net.HttpURLConnection) this).fixedContentLength;
        long j18 = ((java.net.HttpURLConnection) this).fixedContentLengthLong;
        return j18 != -1 ? j18 : j17;
    }

    private boolean isChunkedUpload() {
        return ((java.net.HttpURLConnection) this).chunkLength > 0;
    }

    private final void setRequestPropertyInternal(java.lang.String str, java.lang.String str2, boolean z17) {
        if (((java.net.HttpURLConnection) this).connected) {
            throw new java.lang.IllegalStateException("Cannot modify request property after connection is made.");
        }
        int findRequestProperty = findRequestProperty(str);
        if (findRequestProperty >= 0) {
            if (!z17) {
                throw new java.lang.UnsupportedOperationException("Cannot add multiple headers of the same key, " + str + ". crbug.com/432719.");
            }
            this.mRequestHeaders.remove(findRequestProperty);
        }
        this.mRequestHeaders.add(android.util.Pair.create(str, str2));
    }

    private void startRequest() {
        if (((java.net.HttpURLConnection) this).connected) {
            return;
        }
        org.chromium.net.ExperimentalUrlRequest.Builder builder = (org.chromium.net.ExperimentalUrlRequest.Builder) this.mCronetEngine.newUrlRequestBuilder(getURL().toString(), new org.chromium.net.urlconnection.CronetHttpURLConnection.CronetUrlRequestCallback(), this.mMessageLoop);
        if (((java.net.HttpURLConnection) this).doOutput) {
            if (((java.net.HttpURLConnection) this).method.equals("GET")) {
                ((java.net.HttpURLConnection) this).method = "POST";
            }
            org.chromium.net.urlconnection.CronetOutputStream cronetOutputStream = this.mOutputStream;
            if (cronetOutputStream != null) {
                builder.setUploadDataProvider(cronetOutputStream.getUploadDataProvider(), (java.util.concurrent.Executor) this.mMessageLoop);
                if (getRequestProperty(CONTENT_LENGTH) == null && !isChunkedUpload()) {
                    addRequestProperty(CONTENT_LENGTH, java.lang.Long.toString(this.mOutputStream.getUploadDataProvider().getLength()));
                }
                this.mOutputStream.setConnected();
            } else if (getRequestProperty(CONTENT_LENGTH) == null) {
                addRequestProperty(CONTENT_LENGTH, "0");
            }
            if (getRequestProperty("Content-Type") == null) {
                addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            }
        }
        for (android.util.Pair<java.lang.String, java.lang.String> pair : this.mRequestHeaders) {
            builder.addHeader((java.lang.String) pair.first, (java.lang.String) pair.second);
        }
        if (!getUseCaches()) {
            builder.disableCache();
        }
        builder.setHttpMethod(((java.net.HttpURLConnection) this).method);
        if (checkTrafficStatsTag()) {
            builder.setTrafficStatsTag(this.mTrafficStatsTag);
        }
        if (checkTrafficStatsUid()) {
            builder.setTrafficStatsUid(this.mTrafficStatsUid);
        }
        org.chromium.net.ExperimentalUrlRequest build = builder.build();
        this.mRequest = build;
        build.start();
        ((java.net.HttpURLConnection) this).connected = true;
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(java.lang.String str, java.lang.String str2) {
        setRequestPropertyInternal(str, str2, false);
    }

    @Override // java.net.URLConnection
    public void connect() {
        getOutputStream();
        startRequest();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        if (((java.net.HttpURLConnection) this).connected) {
            this.mRequest.cancel();
        }
    }

    @Override // java.net.HttpURLConnection
    public java.io.InputStream getErrorStream() {
        try {
            getResponse();
            if (this.mResponseInfo.getHttpStatusCode() >= 400) {
                return this.mInputStream;
            }
            return null;
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.net.URLConnection
    public final java.lang.String getHeaderField(java.lang.String str) {
        try {
            getResponse();
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> allHeaders = getAllHeaders();
            if (!allHeaders.containsKey(str)) {
                return null;
            }
            return allHeaders.get(str).get(r4.size() - 1);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final java.lang.String getHeaderFieldKey(int i17) {
        java.util.Map.Entry<java.lang.String, java.lang.String> headerFieldEntry = getHeaderFieldEntry(i17);
        if (headerFieldEntry == null) {
            return null;
        }
        return headerFieldEntry.getKey();
    }

    @Override // java.net.URLConnection
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaderFields() {
        try {
            getResponse();
            return getAllHeaders();
        } catch (java.io.IOException unused) {
            return java.util.Collections.emptyMap();
        }
    }

    @Override // java.net.URLConnection
    public java.io.InputStream getInputStream() {
        getResponse();
        if (!((java.net.HttpURLConnection) this).instanceFollowRedirects && this.mOnRedirectCalled) {
            throw new java.io.IOException("Cannot read response body of a redirect.");
        }
        if (this.mResponseInfo.getHttpStatusCode() < 400) {
            return this.mInputStream;
        }
        throw new java.io.FileNotFoundException(((java.net.HttpURLConnection) this).url.toString());
    }

    public void getMoreData(java.nio.ByteBuffer byteBuffer) {
        this.mRequest.read(byteBuffer);
        this.mMessageLoop.loop(getReadTimeout());
    }

    @Override // java.net.URLConnection
    public java.io.OutputStream getOutputStream() {
        if (this.mOutputStream == null && ((java.net.HttpURLConnection) this).doOutput) {
            if (((java.net.HttpURLConnection) this).connected) {
                throw new java.net.ProtocolException("Cannot write to OutputStream after receiving response.");
            }
            if (isChunkedUpload()) {
                this.mOutputStream = new org.chromium.net.urlconnection.CronetChunkedOutputStream(this, ((java.net.HttpURLConnection) this).chunkLength, this.mMessageLoop);
                startRequest();
            } else {
                long streamingModeContentLength = getStreamingModeContentLength();
                if (streamingModeContentLength != -1) {
                    this.mOutputStream = new org.chromium.net.urlconnection.CronetFixedModeOutputStream(this, streamingModeContentLength, this.mMessageLoop);
                    startRequest();
                } else {
                    java.lang.String requestProperty = getRequestProperty(CONTENT_LENGTH);
                    if (requestProperty == null) {
                        this.mOutputStream = new org.chromium.net.urlconnection.CronetBufferedOutputStream(this);
                    } else {
                        this.mOutputStream = new org.chromium.net.urlconnection.CronetBufferedOutputStream(this, java.lang.Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.mOutputStream;
    }

    @Override // java.net.URLConnection
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getRequestProperties() {
        if (((java.net.HttpURLConnection) this).connected) {
            throw new java.lang.IllegalStateException("Cannot access request headers after connection is set.");
        }
        java.util.TreeMap treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
        for (android.util.Pair<java.lang.String, java.lang.String> pair : this.mRequestHeaders) {
            if (treeMap.containsKey(pair.first)) {
                throw new java.lang.IllegalStateException("Should not have multiple values.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add((java.lang.String) pair.second);
            treeMap.put((java.lang.String) pair.first, java.util.Collections.unmodifiableList(arrayList));
        }
        return java.util.Collections.unmodifiableMap(treeMap);
    }

    @Override // java.net.URLConnection
    public java.lang.String getRequestProperty(java.lang.String str) {
        int findRequestProperty = findRequestProperty(str);
        if (findRequestProperty >= 0) {
            return (java.lang.String) this.mRequestHeaders.get(findRequestProperty).second;
        }
        return null;
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        getResponse();
        return this.mResponseInfo.getHttpStatusCode();
    }

    @Override // java.net.HttpURLConnection
    public java.lang.String getResponseMessage() {
        getResponse();
        return this.mResponseInfo.getHttpStatusText();
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i17) {
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(java.lang.String str, java.lang.String str2) {
        setRequestPropertyInternal(str, str2, true);
    }

    public void setTrafficStatsTag(int i17) {
        if (((java.net.HttpURLConnection) this).connected) {
            throw new java.lang.IllegalStateException("Cannot modify traffic stats tag after connection is made.");
        }
        this.mTrafficStatsTagSet = true;
        this.mTrafficStatsTag = i17;
    }

    public void setTrafficStatsUid(int i17) {
        if (((java.net.HttpURLConnection) this).connected) {
            throw new java.lang.IllegalStateException("Cannot modify traffic stats UID after connection is made.");
        }
        this.mTrafficStatsUidSet = true;
        this.mTrafficStatsUid = i17;
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return false;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final java.lang.String getHeaderField(int i17) {
        java.util.Map.Entry<java.lang.String, java.lang.String> headerFieldEntry = getHeaderFieldEntry(i17);
        if (headerFieldEntry == null) {
            return null;
        }
        return headerFieldEntry.getValue();
    }
}
