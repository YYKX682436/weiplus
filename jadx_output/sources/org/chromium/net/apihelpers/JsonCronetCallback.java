package org.chromium.net.apihelpers;

/* loaded from: classes13.dex */
public abstract class JsonCronetCallback extends org.chromium.net.apihelpers.InMemoryTransformCronetCallback<org.json.JSONObject> {
    private static final org.chromium.net.apihelpers.StringCronetCallback STRING_CALLBACK = new org.chromium.net.apihelpers.StringCronetCallback() { // from class: org.chromium.net.apihelpers.JsonCronetCallback.1
        @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
        public boolean shouldFollowRedirect(org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }
    };

    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public org.chromium.net.apihelpers.JsonCronetCallback addCompletionListener(org.chromium.net.apihelpers.CronetRequestCompletionListener<? super org.json.JSONObject> cronetRequestCompletionListener) {
        super.addCompletionListener((org.chromium.net.apihelpers.CronetRequestCompletionListener) cronetRequestCompletionListener);
        return this;
    }

    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public org.json.JSONObject transformBodyBytes(org.chromium.net.UrlResponseInfo urlResponseInfo, byte[] bArr) {
        try {
            return new org.json.JSONObject(STRING_CALLBACK.transformBodyBytes(urlResponseInfo, bArr));
        } catch (org.json.JSONException e17) {
            throw new java.lang.IllegalArgumentException("Cannot parse the string as JSON!", e17);
        }
    }
}
