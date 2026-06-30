package com.tencent.shadow.core.common;

/* loaded from: classes7.dex */
public interface IWVAComponentDelegateV2 extends com.tencent.shadow.core.common.IWVAComponentDelegate {
    void moveToForeground();

    @Override // com.tencent.shadow.core.common.IWVAComponentDelegate
    default void startActivity(android.content.Intent intent) {
        startActivity(intent, false);
    }

    void startActivity(android.content.Intent intent, boolean z17);

    boolean supportRunInBackground();
}
