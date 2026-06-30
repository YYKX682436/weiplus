package com.tencent.mm.toolkit.frontia.core;

/* loaded from: classes13.dex */
public abstract class PluginApp extends android.app.Application {
    protected android.content.Context mContext;

    public abstract com.tencent.mm.toolkit.frontia.core.a getBehavior();

    public void setAppContext(android.content.Context context) {
        this.mContext = context;
    }
}
