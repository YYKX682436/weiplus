package org.chromium.net.impl;

/* loaded from: classes13.dex */
public final class UrlResponseInfoImpl extends org.chromium.net.UrlResponseInfo {
    private final org.chromium.net.impl.UrlResponseInfoImpl.HeaderBlockImpl mHeaders;
    private final int mHttpStatusCode;
    private final java.lang.String mHttpStatusText;
    private final java.lang.String mNegotiatedProtocol;
    private final java.lang.String mProxyServer;
    private final java.util.concurrent.atomic.AtomicLong mReceivedByteCount;
    private final java.util.List<java.lang.String> mResponseInfoUrlChain;
    private final boolean mWasCached;

    /* loaded from: classes13.dex */
    public static final class HeaderBlockImpl extends org.chromium.net.UrlResponseInfo.HeaderBlock {
        private final java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> mAllHeadersList;
        private java.util.Map<java.lang.String, java.util.List<java.lang.String>> mHeadersMap;

        public HeaderBlockImpl(java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list) {
            this.mAllHeadersList = list;
        }

        @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
        public java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> getAsList() {
            return this.mAllHeadersList;
        }

        @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
        public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getAsMap() {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.mHeadersMap;
            if (map != null) {
                return map;
            }
            java.util.TreeMap treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.mAllHeadersList) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (treeMap.containsKey(entry.getKey())) {
                    arrayList.addAll((java.util.Collection) treeMap.get(entry.getKey()));
                }
                arrayList.add(entry.getValue());
                treeMap.put(entry.getKey(), java.util.Collections.unmodifiableList(arrayList));
            }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> unmodifiableMap = java.util.Collections.unmodifiableMap(treeMap);
            this.mHeadersMap = unmodifiableMap;
            return unmodifiableMap;
        }
    }

    public UrlResponseInfoImpl(java.util.List<java.lang.String> list, int i17, java.lang.String str, java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list2, boolean z17, java.lang.String str2, java.lang.String str3, long j17) {
        this.mResponseInfoUrlChain = java.util.Collections.unmodifiableList(list);
        this.mHttpStatusCode = i17;
        this.mHttpStatusText = str;
        this.mHeaders = new org.chromium.net.impl.UrlResponseInfoImpl.HeaderBlockImpl(java.util.Collections.unmodifiableList(list2));
        this.mWasCached = z17;
        this.mNegotiatedProtocol = str2;
        this.mProxyServer = str3;
        this.mReceivedByteCount = new java.util.concurrent.atomic.AtomicLong(j17);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getAllHeaders() {
        return this.mHeaders.getAsMap();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> getAllHeadersAsList() {
        return this.mHeaders.getAsList();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public int getHttpStatusCode() {
        return this.mHttpStatusCode;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public java.lang.String getHttpStatusText() {
        return this.mHttpStatusText;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public java.lang.String getNegotiatedProtocol() {
        return this.mNegotiatedProtocol;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public java.lang.String getProxyServer() {
        return this.mProxyServer;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public long getReceivedByteCount() {
        return this.mReceivedByteCount.get();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public java.lang.String getUrl() {
        return this.mResponseInfoUrlChain.get(r0.size() - 1);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public java.util.List<java.lang.String> getUrlChain() {
        return this.mResponseInfoUrlChain;
    }

    public void setReceivedByteCount(long j17) {
        this.mReceivedByteCount.set(j17);
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ROOT, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), getUrl(), getUrlChain().toString(), java.lang.Integer.valueOf(getHttpStatusCode()), getHttpStatusText(), getAllHeadersAsList().toString(), java.lang.Boolean.valueOf(wasCached()), getNegotiatedProtocol(), getProxyServer(), java.lang.Long.valueOf(getReceivedByteCount()));
    }

    @Override // org.chromium.net.UrlResponseInfo
    public boolean wasCached() {
        return this.mWasCached;
    }

    @java.lang.Deprecated
    public UrlResponseInfoImpl(java.util.List<java.lang.String> list, int i17, java.lang.String str, java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list2, boolean z17, java.lang.String str2, java.lang.String str3) {
        this(list, i17, str, list2, z17, str2, str3, 0L);
    }
}
