package com.tencent.thumbplayer.tplayer.plugins;

/* loaded from: classes15.dex */
public interface ITPPluginManager extends com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase {
    void addPlugin(com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase iTPPluginBase);

    void release();

    void removePlugin(com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase iTPPluginBase);
}
