package com.tencent.wechat.zidl;

/* loaded from: classes7.dex */
public class MagicSclRequestCaller {

    /* loaded from: classes7.dex */
    public interface PreInitFrameSetCallback {
        void complete(long j17, double d17);
    }

    private native void jniAttachFrameSet(java.lang.String str, java.lang.String str2, java.lang.String str3);

    private native void jniChangeFrameSetData(java.lang.String str, java.lang.String str2, java.lang.String str3);

    private native void jniClickFrameSet(java.lang.String str, java.lang.String str2, java.lang.String str3);

    private native java.lang.String jniCreateFrameSet(java.lang.String str, java.lang.String str2, int i17);

    private native java.lang.String jniCreateFrameSetRoot(java.lang.String str, java.lang.String str2, java.lang.String str3);

    private native void jniDeatchFrameSet(java.lang.String str, java.lang.String str2);

    private native void jniDestroyFrameSet(java.lang.String str, java.lang.String str2);

    private native void jniDestroyFrameSetRoot(java.lang.String str);

    private native java.lang.String jniGetFrameSetCoverPath(java.lang.String str, java.lang.String str2);

    private native void jniPauseFrameSetRoot(java.lang.String str);

    private native void jniPreInitFrameSetAsync(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Object obj);

    private native void jniRedrawFrameSet(java.lang.String str, java.lang.String str2);

    private native void jniRedrawFrameSetRoot(java.lang.String str);

    private native void jniResizeFrameSet(java.lang.String str, java.lang.String str2, double d17, double d18);

    private native void jniResumeFrameSetRoot(java.lang.String str);

    private native void jniScrollFrameSet(java.lang.String str, java.lang.String str2, double d17, double d18);

    public void attachFrameSet(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        jniAttachFrameSet(str, str2, str3);
    }

    public void changeFrameSetData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        jniChangeFrameSetData(str, str2, str3);
    }

    public void clickFrameSet(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        jniClickFrameSet(str, str2, str3);
    }

    public java.lang.String createFrameSet(java.lang.String str, java.lang.String str2, int i17) {
        return jniCreateFrameSet(str, str2, i17);
    }

    public java.lang.String createFrameSetRoot(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return jniCreateFrameSetRoot(str, str2, str3);
    }

    public void deatchFrameSet(java.lang.String str, java.lang.String str2) {
        jniDeatchFrameSet(str, str2);
    }

    public void destroyFrameSet(java.lang.String str, java.lang.String str2) {
        jniDestroyFrameSet(str, str2);
    }

    public void destroyFrameSetRoot(java.lang.String str) {
        jniDestroyFrameSetRoot(str);
    }

    public java.lang.String getFrameSetCoverPath(java.lang.String str, java.lang.String str2) {
        return jniGetFrameSetCoverPath(str, str2);
    }

    public void pauseFrameSetRoot(java.lang.String str) {
        jniPauseFrameSetRoot(str);
    }

    public void preInitFrameSetAsync(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.wechat.zidl.MagicSclRequestCaller.PreInitFrameSetCallback preInitFrameSetCallback) {
        jniPreInitFrameSetAsync(j17, str, str2, str3, str4, preInitFrameSetCallback);
    }

    public void redrawFrameSet(java.lang.String str, java.lang.String str2) {
        jniRedrawFrameSet(str, str2);
    }

    public void redrawFrameSetRoot(java.lang.String str) {
        jniRedrawFrameSetRoot(str);
    }

    public void resizeFrameSet(java.lang.String str, java.lang.String str2, double d17, double d18) {
        jniResizeFrameSet(str, str2, d17, d18);
    }

    public void resumeFrameSetRoot(java.lang.String str) {
        jniResumeFrameSetRoot(str);
    }

    public void scrollFrameSet(java.lang.String str, java.lang.String str2, double d17, double d18) {
        jniScrollFrameSet(str, str2, d17, d18);
    }
}
