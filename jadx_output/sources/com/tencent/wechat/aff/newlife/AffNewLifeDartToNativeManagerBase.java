package com.tencent.wechat.aff.newlife;

/* loaded from: classes6.dex */
public interface AffNewLifeDartToNativeManagerBase {

    /* loaded from: classes6.dex */
    public interface Callback {
        void onSayHhelloComplete(int i17, java.lang.String str);
    }

    void sayHhelloAsync(int i17, java.lang.String str);

    void setCallback(com.tencent.wechat.aff.newlife.AffNewLifeDartToNativeManagerBase.Callback callback);
}
