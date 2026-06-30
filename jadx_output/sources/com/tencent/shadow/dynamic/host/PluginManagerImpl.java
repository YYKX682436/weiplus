package com.tencent.shadow.dynamic.host;

/* loaded from: classes16.dex */
public interface PluginManagerImpl extends com.tencent.shadow.dynamic.host.PluginManager {
    boolean isValid();

    void onCreate(android.os.Bundle bundle);

    void onDestroy();

    void onSaveInstanceState(android.os.Bundle bundle);
}
