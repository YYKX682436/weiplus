package com.tencent.wechat.aff.newlife;

/* loaded from: classes15.dex */
public interface AffNewLifeActionManagerBase {

    /* loaded from: classes15.dex */
    public interface Callback {
        void onDoActionComplete(int i17, com.tencent.wechat.aff.newlife.NewLifeActionResponse newLifeActionResponse);
    }

    void doActionAsync(int i17, com.tencent.wechat.aff.newlife.NewLifeActionRequest newLifeActionRequest);

    com.tencent.wechat.aff.newlife.NewLifeActionResponse doActionSync(com.tencent.wechat.aff.newlife.NewLifeActionRequest newLifeActionRequest);

    void setCallback(com.tencent.wechat.aff.newlife.AffNewLifeActionManagerBase.Callback callback);
}
