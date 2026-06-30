package org.chromium.net.apihelpers;

/* loaded from: classes7.dex */
public class CronetResponse<T> {
    private final T mResponseBody;
    private final org.chromium.net.UrlResponseInfo mUrlResponseInfo;

    public CronetResponse(org.chromium.net.UrlResponseInfo urlResponseInfo, T t17) {
        this.mUrlResponseInfo = urlResponseInfo;
        this.mResponseBody = t17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org.chromium.net.apihelpers.CronetResponse)) {
            return false;
        }
        org.chromium.net.apihelpers.CronetResponse cronetResponse = (org.chromium.net.apihelpers.CronetResponse) obj;
        return java.util.Objects.equals(this.mUrlResponseInfo, cronetResponse.mUrlResponseInfo) && java.util.Objects.equals(this.mResponseBody, cronetResponse.mResponseBody);
    }

    public T getResponseBody() {
        return this.mResponseBody;
    }

    public org.chromium.net.UrlResponseInfo getUrlResponseInfo() {
        return this.mUrlResponseInfo;
    }

    public int hashCode() {
        return java.util.Objects.hash(this.mUrlResponseInfo, this.mResponseBody);
    }
}
