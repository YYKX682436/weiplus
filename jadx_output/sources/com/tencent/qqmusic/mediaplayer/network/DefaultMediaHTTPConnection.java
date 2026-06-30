package com.tencent.qqmusic.mediaplayer.network;

/* loaded from: classes13.dex */
public class DefaultMediaHTTPConnection implements com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection {
    private static final int CONNECT_TIMEOUT_MS = 30000;
    private static final int HTTP_TEMP_REDIRECT = 307;
    private static final int MAX_REDIRECTS = 20;
    private static final java.lang.String TAG = "MediaHTTPConnection";
    private static final boolean VERBOSE = false;
    private long mCurrentOffset = -1;
    private java.net.URL mURL = null;
    private java.util.Map<java.lang.String, java.lang.String> mHeaders = null;
    private java.net.HttpURLConnection mConnection = null;
    private long mTotalSize = -1;
    private java.io.InputStream mInputStream = null;
    private boolean mAllowCrossDomainRedirect = true;
    private boolean mAllowCrossProtocolRedirect = true;

    private boolean filterOutInternalHeaders(java.lang.String str, java.lang.String str2) {
        if (!"android-allow-cross-domain-redirect".equalsIgnoreCase(str)) {
            return false;
        }
        boolean parseBoolean = parseBoolean(str2);
        this.mAllowCrossDomainRedirect = parseBoolean;
        this.mAllowCrossProtocolRedirect = parseBoolean;
        return true;
    }

    private static final boolean isLocalHost(java.net.URL url) {
        java.lang.String host;
        if (url == null || (host = url.getHost()) == null) {
            return false;
        }
        try {
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "isLocalHost", e17);
        }
        return host.equalsIgnoreCase("localhost");
    }

    private boolean parseBoolean(java.lang.String str) {
        try {
            return java.lang.Long.parseLong(str) != 0;
        } catch (java.lang.NumberFormatException unused) {
            return "true".equalsIgnoreCase(str) || "yes".equalsIgnoreCase(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d2, code lost:
    
        r17.mURL = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void seekTo(long r18) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.network.DefaultMediaHTTPConnection.seekTo(long):void");
    }

    private void teardownConnection() {
        java.net.HttpURLConnection httpURLConnection = this.mConnection;
        if (httpURLConnection != null) {
            this.mInputStream = null;
            httpURLConnection.disconnect();
            this.mConnection = null;
            this.mCurrentOffset = -1L;
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection
    public boolean connect(java.net.URL url, java.util.Map<java.lang.String, java.lang.String> map) {
        disconnect();
        this.mAllowCrossDomainRedirect = true;
        this.mURL = url;
        this.mHeaders = map;
        return true;
    }

    @Override // com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection
    public void disconnect() {
        teardownConnection();
        this.mHeaders = null;
        this.mURL = null;
    }

    @Override // com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection
    public java.lang.String getMIMEType() {
        if (this.mConnection == null) {
            try {
                seekTo(0L);
            } catch (java.io.IOException e17) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "getMIMEType", e17);
                return "application/octet-stream";
            }
        }
        return this.mConnection.getContentType();
    }

    @Override // com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection
    public long getSize() {
        if (this.mConnection == null) {
            try {
                seekTo(0L);
            } catch (java.io.IOException e17) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "getSize", e17);
                return -1L;
            }
        }
        return this.mTotalSize;
    }

    @Override // com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection
    public java.lang.String getUri() {
        return this.mURL.toString();
    }

    @Override // com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection
    public int readAt(long j17, byte[] bArr, int i17, int i18) {
        try {
            if (j17 != this.mCurrentOffset) {
                seekTo(j17);
            }
            int read = this.mInputStream.read(bArr, i17, i18);
            if (read == -1) {
                read = 0;
            }
            this.mCurrentOffset += read;
            return read;
        } catch (java.net.NoRouteToHostException e17) {
            com.tencent.qqmusic.mediaplayer.util.Logger.w(TAG, "readAt " + j17 + " / " + i18 + " => " + e17);
            return -1010;
        } catch (java.net.ProtocolException e18) {
            com.tencent.qqmusic.mediaplayer.util.Logger.w(TAG, "readAt " + j17 + " / " + i18 + " => " + e18);
            return -1010;
        } catch (java.net.UnknownServiceException e19) {
            com.tencent.qqmusic.mediaplayer.util.Logger.w(TAG, "readAt " + j17 + " / " + i18 + " => " + e19);
            return -1010;
        } catch (java.io.IOException unused) {
            return -2;
        } catch (java.lang.Exception unused2) {
            return -3;
        }
    }
}
