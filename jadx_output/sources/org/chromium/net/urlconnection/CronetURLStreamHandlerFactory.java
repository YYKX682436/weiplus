package org.chromium.net.urlconnection;

/* loaded from: classes16.dex */
public class CronetURLStreamHandlerFactory implements java.net.URLStreamHandlerFactory {
    private final org.chromium.net.ExperimentalCronetEngine mCronetEngine;

    public CronetURLStreamHandlerFactory(org.chromium.net.ExperimentalCronetEngine experimentalCronetEngine) {
        if (experimentalCronetEngine == null) {
            throw new java.lang.NullPointerException("CronetEngine is null.");
        }
        this.mCronetEngine = experimentalCronetEngine;
    }

    @Override // java.net.URLStreamHandlerFactory
    public java.net.URLStreamHandler createURLStreamHandler(java.lang.String str) {
        if ("http".equals(str) || "https".equals(str)) {
            return new org.chromium.net.urlconnection.CronetHttpURLStreamHandler(this.mCronetEngine);
        }
        return null;
    }
}
