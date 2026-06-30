package com.tencent.wechat.aff.websearch;

/* loaded from: classes16.dex */
public interface WebSearchPlatformManagerBase {

    /* loaded from: classes8.dex */
    public interface Callback {
        void onGetWebViewPixelsComplete(long j17, byte[] bArr);

        void onNativeEventsEvent(java.lang.String str, java.lang.String str2);

        void onNotifyFilterShowOrHideComplete(long j17, int i17);
    }

    void createPlatformView(double d17, boolean z17);

    void dispose(int i17);

    void getWebViewPixelsAsync(long j17);

    void notifyFilterShowOrHideAsync(long j17, boolean z17);

    void notifyFocusChanged(boolean z17);

    void notifyH5BoxResult(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5);

    void setCallback(com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase.Callback callback);
}
