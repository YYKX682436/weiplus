package com.tencent.thumbplayer.tplayer.plugins;

/* loaded from: classes15.dex */
public class TPPluginManager implements com.tencent.thumbplayer.tplayer.plugins.ITPPluginManager {
    private java.util.concurrent.CopyOnWriteArrayList<com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase> mPluginList = new java.util.concurrent.CopyOnWriteArrayList<>();

    @Override // com.tencent.thumbplayer.tplayer.plugins.ITPPluginManager
    public void addPlugin(com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase iTPPluginBase) {
        java.util.concurrent.CopyOnWriteArrayList<com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase> copyOnWriteArrayList = this.mPluginList;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.contains(iTPPluginBase)) {
            return;
        }
        iTPPluginBase.onAttach();
        this.mPluginList.add(iTPPluginBase);
    }

    @Override // com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase
    public void onAttach() {
    }

    @Override // com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase
    public void onDetach() {
    }

    @Override // com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase
    public void onEvent(int i17, int i18, int i19, java.lang.String str, java.lang.Object obj) {
        java.util.concurrent.CopyOnWriteArrayList<com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase> copyOnWriteArrayList = this.mPluginList;
        if (copyOnWriteArrayList != null) {
            java.util.Iterator<com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase next = it.next();
                if (next != null) {
                    next.onEvent(i17, i18, i19, str, obj);
                }
            }
        }
    }

    @Override // com.tencent.thumbplayer.tplayer.plugins.ITPPluginManager
    public void release() {
        java.util.concurrent.CopyOnWriteArrayList<com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase> copyOnWriteArrayList = this.mPluginList;
        if (copyOnWriteArrayList != null) {
            java.util.Iterator<com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase next = it.next();
                if (next != null) {
                    next.onDetach();
                }
            }
            this.mPluginList.clear();
        }
        this.mPluginList = null;
    }

    @Override // com.tencent.thumbplayer.tplayer.plugins.ITPPluginManager
    public void removePlugin(com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase iTPPluginBase) {
        if (this.mPluginList != null) {
            iTPPluginBase.onDetach();
            this.mPluginList.remove(iTPPluginBase);
        }
    }
}
