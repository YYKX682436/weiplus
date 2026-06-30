package org.chromium.net;

/* loaded from: classes13.dex */
public final class ChromiumNetworkAdapter {
    private ChromiumNetworkAdapter() {
    }

    public static java.net.URLConnection openConnection(java.net.URL url, org.chromium.net.NetworkTrafficAnnotationTag networkTrafficAnnotationTag) {
        return url.openConnection();
    }

    public static java.io.InputStream openStream(java.net.URL url, org.chromium.net.NetworkTrafficAnnotationTag networkTrafficAnnotationTag) {
        return url.openStream();
    }

    public static java.net.URLConnection openConnection(java.net.URL url, java.net.Proxy proxy, org.chromium.net.NetworkTrafficAnnotationTag networkTrafficAnnotationTag) {
        return url.openConnection(proxy);
    }
}
