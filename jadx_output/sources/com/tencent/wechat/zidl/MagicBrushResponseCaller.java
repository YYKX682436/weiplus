package com.tencent.wechat.zidl;

/* loaded from: classes7.dex */
public class MagicBrushResponseCaller {
    private native void jniOnSubViewCreated(java.lang.String str, java.lang.String str2);

    private native void jniOnViewStyleChanged(java.lang.String str, int i17, int i18, int i19, int i27);

    private native void jniOnViewTextureReady(java.lang.String str, int i17);

    public void onSubViewCreated(java.lang.String str, java.lang.String str2) {
        jniOnSubViewCreated(str, str2);
    }

    public void onViewStyleChanged(java.lang.String str, int i17, int i18, int i19, int i27) {
        jniOnViewStyleChanged(str, i17, i18, i19, i27);
    }

    public void onViewTextureReady(java.lang.String str, int i17) {
        jniOnViewTextureReady(str, i17);
    }
}
