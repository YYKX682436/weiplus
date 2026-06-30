package org.chromium.support_lib_boundary;

/* loaded from: classes6.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    java.util.Set<java.lang.String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean z17);

    void setAllowFileAccess(boolean z17);

    void setBlockNetworkLoads(boolean z17);

    void setCacheMode(int i17);

    void setRequestedWithHeaderOriginAllowList(java.util.Set<java.lang.String> set);
}
