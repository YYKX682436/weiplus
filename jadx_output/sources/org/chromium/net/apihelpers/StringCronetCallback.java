package org.chromium.net.apihelpers;

/* loaded from: classes13.dex */
public abstract class StringCronetCallback extends org.chromium.net.apihelpers.InMemoryTransformCronetCallback<java.lang.String> {
    private static final java.lang.String CONTENT_TYPE_HEADER_NAME = "Content-Type";

    private java.nio.charset.Charset getCharsetFromHeaders(org.chromium.net.UrlResponseInfo urlResponseInfo) {
        java.util.Iterator<java.lang.String> it = urlResponseInfo.getAllHeaders().get(CONTENT_TYPE_HEADER_NAME).iterator();
        java.lang.String str = null;
        while (it.hasNext()) {
            org.chromium.net.apihelpers.ContentTypeParametersParser contentTypeParametersParser = new org.chromium.net.apihelpers.ContentTypeParametersParser(it.next());
            while (contentTypeParametersParser.hasMore()) {
                try {
                    java.util.Map.Entry<java.lang.String, java.lang.String> nextParameter = contentTypeParametersParser.getNextParameter();
                    nextParameter.getKey();
                    java.lang.String value = nextParameter.getValue();
                    if (str != null && !value.equalsIgnoreCase(str)) {
                        throw new java.lang.IllegalArgumentException("Multiple charsets provided: " + value + " and " + str);
                    }
                    str = value;
                } catch (org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException unused) {
                    continue;
                }
            }
        }
        return str != null ? java.nio.charset.Charset.forName(str) : java.nio.charset.Charset.defaultCharset();
    }

    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public org.chromium.net.apihelpers.StringCronetCallback addCompletionListener(org.chromium.net.apihelpers.CronetRequestCompletionListener<? super java.lang.String> cronetRequestCompletionListener) {
        super.addCompletionListener((org.chromium.net.apihelpers.CronetRequestCompletionListener) cronetRequestCompletionListener);
        return this;
    }

    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public java.lang.String transformBodyBytes(org.chromium.net.UrlResponseInfo urlResponseInfo, byte[] bArr) {
        return new java.lang.String(bArr, getCharsetFromHeaders(urlResponseInfo));
    }
}
