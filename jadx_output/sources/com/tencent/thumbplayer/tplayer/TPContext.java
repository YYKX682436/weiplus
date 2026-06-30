package com.tencent.thumbplayer.tplayer;

/* loaded from: classes16.dex */
public class TPContext {
    private android.content.Context mAppContext;
    private com.tencent.thumbplayer.event.TPPlayerEventPublisher mPlayerEventPublisher = new com.tencent.thumbplayer.event.TPPlayerEventPublisher();

    public TPContext(android.content.Context context) {
        this.mAppContext = context;
    }

    public android.content.Context getAppContext() {
        return this.mAppContext;
    }

    public com.tencent.thumbplayer.event.TPPlayerEventPublisher getPlayerEventPublisher() {
        return this.mPlayerEventPublisher;
    }
}
