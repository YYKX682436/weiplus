package com.tencent.shadow.core.runtime.container;

/* loaded from: classes14.dex */
public interface DelegateProvider {
    public static final java.lang.String LOADER_VERSION_KEY = "LOADER_VERSION";
    public static final java.lang.String PROCESS_ID_KEY = "PROCESS_ID_KEY";

    com.tencent.shadow.core.runtime.container.HostActivityDelegate getHostActivityDelegate(java.lang.Class<? extends com.tencent.shadow.core.runtime.container.HostActivityDelegator> cls);
}
