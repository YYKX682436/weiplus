package org.chromium.net.urlconnection;

/* loaded from: classes16.dex */
class CronetHttpURLStreamHandler extends java.net.URLStreamHandler {
    private final org.chromium.net.ExperimentalCronetEngine mCronetEngine;

    public CronetHttpURLStreamHandler(org.chromium.net.ExperimentalCronetEngine experimentalCronetEngine) {
        this.mCronetEngine = experimentalCronetEngine;
    }

    @Override // java.net.URLStreamHandler
    public java.net.URLConnection openConnection(java.net.URL url) {
        return this.mCronetEngine.openConnection(url);
    }

    @Override // java.net.URLStreamHandler
    public java.net.URLConnection openConnection(java.net.URL url, java.net.Proxy proxy) {
        return this.mCronetEngine.openConnection(url, proxy);
    }
}
