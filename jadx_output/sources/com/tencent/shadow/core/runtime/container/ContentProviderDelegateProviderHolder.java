package com.tencent.shadow.core.runtime.container;

/* loaded from: classes16.dex */
public class ContentProviderDelegateProviderHolder {
    static com.tencent.shadow.core.runtime.container.ContentProviderDelegateProvider contentProviderDelegateProvider;
    private static com.tencent.shadow.core.runtime.container.ContentProviderDelegateProviderHolder.DelegateProviderHolderPrepareListener sPrepareListener;

    /* loaded from: classes16.dex */
    public interface DelegateProviderHolderPrepareListener {
        void onPrepare();
    }

    private static void notifyDelegateProviderHolderPrepare() {
        com.tencent.shadow.core.runtime.container.ContentProviderDelegateProviderHolder.DelegateProviderHolderPrepareListener delegateProviderHolderPrepareListener = sPrepareListener;
        if (delegateProviderHolderPrepareListener != null) {
            delegateProviderHolderPrepareListener.onPrepare();
        }
    }

    public static void setContentProviderDelegateProvider(com.tencent.shadow.core.runtime.container.ContentProviderDelegateProvider contentProviderDelegateProvider2) {
        contentProviderDelegateProvider = contentProviderDelegateProvider2;
        notifyDelegateProviderHolderPrepare();
    }

    public static void setDelegateProviderHolderPrepareListener(com.tencent.shadow.core.runtime.container.ContentProviderDelegateProviderHolder.DelegateProviderHolderPrepareListener delegateProviderHolderPrepareListener) {
        sPrepareListener = delegateProviderHolderPrepareListener;
    }
}
