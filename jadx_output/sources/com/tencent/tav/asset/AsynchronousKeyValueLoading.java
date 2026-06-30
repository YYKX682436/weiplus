package com.tencent.tav.asset;

/* loaded from: classes6.dex */
public interface AsynchronousKeyValueLoading {

    /* loaded from: classes6.dex */
    public interface loadCallback {
        void loadSucceeds();
    }

    void loadValuesAsynchronouslyForKeys(java.util.List<java.lang.String> list, com.tencent.tav.asset.AsynchronousKeyValueLoading.loadCallback loadcallback);

    int statusOfValueForKey(java.lang.String str);
}
