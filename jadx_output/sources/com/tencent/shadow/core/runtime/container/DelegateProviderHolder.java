package com.tencent.shadow.core.runtime.container;

/* loaded from: classes14.dex */
public class DelegateProviderHolder {
    public static final java.lang.String DEFAULT_KEY = "DEFAULT_KEY";
    private static java.util.Map<java.lang.String, com.tencent.shadow.core.runtime.container.DelegateProvider> delegateProviderMap = new java.util.HashMap();
    public static long sCustomPid = android.os.SystemClock.elapsedRealtime();

    public static com.tencent.shadow.core.runtime.container.DelegateProvider getDelegateProvider(java.lang.String str) {
        return delegateProviderMap.get(str);
    }

    public static void setDelegateProvider(java.lang.String str, com.tencent.shadow.core.runtime.container.DelegateProvider delegateProvider) {
        delegateProviderMap.put(str, delegateProvider);
    }
}
