package com.tencent.wechat.zidl;

/* loaded from: classes7.dex */
public interface MagicSclRequest {

    /* loaded from: classes7.dex */
    public interface Callback {
        void onPreInitFrameSetComplete(long j17, double d17);
    }

    void attachFrameSet(java.lang.String str, java.lang.String str2, java.lang.String str3);

    void changeFrameSetData(java.lang.String str, java.lang.String str2, java.lang.String str3);

    void clickFrameSet(java.lang.String str, java.lang.String str2, java.lang.String str3);

    java.lang.String createFrameSet(java.lang.String str, java.lang.String str2, int i17);

    java.lang.String createFrameSetRoot(java.lang.String str, java.lang.String str2, java.lang.String str3);

    void deatchFrameSet(java.lang.String str, java.lang.String str2);

    void destroyFrameSet(java.lang.String str, java.lang.String str2);

    void destroyFrameSetRoot(java.lang.String str);

    java.lang.String getFrameSetCoverPath(java.lang.String str, java.lang.String str2);

    void pauseFrameSetRoot(java.lang.String str);

    void preInitFrameSetAsync(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    void redrawFrameSet(java.lang.String str, java.lang.String str2);

    void redrawFrameSetRoot(java.lang.String str);

    void resizeFrameSet(java.lang.String str, java.lang.String str2, double d17, double d18);

    void resumeFrameSetRoot(java.lang.String str);

    void scrollFrameSet(java.lang.String str, java.lang.String str2, double d17, double d18);

    void setCallback(com.tencent.wechat.zidl.MagicSclRequest.Callback callback);
}
