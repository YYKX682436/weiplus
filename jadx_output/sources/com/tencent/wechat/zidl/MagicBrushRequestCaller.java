package com.tencent.wechat.zidl;

/* loaded from: classes.dex */
public class MagicBrushRequestCaller {
    private native boolean jniDispatchTouchEvent(java.lang.String str, byte[] bArr);

    public boolean dispatchTouchEvent(java.lang.String str, byte[] bArr) {
        return jniDispatchTouchEvent(str, bArr);
    }
}
