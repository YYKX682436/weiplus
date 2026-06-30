package org.chromium.net.impl;

/* loaded from: classes13.dex */
public abstract class UrlRequestBase extends org.chromium.net.ExperimentalUrlRequest {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface StatusValues {
    }

    public static int convertLoadState(int i17) {
        switch (i17) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
            default:
                throw new java.lang.IllegalArgumentException("No request status found.");
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
        }
    }

    public abstract void addHeader(java.lang.String str, java.lang.String str2);

    public abstract void setHttpMethod(java.lang.String str);

    public abstract void setUploadDataProvider(org.chromium.net.UploadDataProvider uploadDataProvider, java.util.concurrent.Executor executor);
}
