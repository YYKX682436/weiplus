package com.tencent.thumbplayer.core.connection;

/* loaded from: classes15.dex */
public class TPNativePlayerConnectionNode {
    private java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.Integer, java.lang.Long>> mLongMap;

    public TPNativePlayerConnectionNode() {
        this.mLongMap = null;
        this.mLongMap = new java.util.HashMap<>();
    }

    public boolean addAction(int i17) {
        if (this.mLongMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return false;
        }
        this.mLongMap.put(java.lang.Integer.valueOf(i17), new java.util.HashMap<>());
        return true;
    }

    public void removeAction(int i17) {
        if (this.mLongMap.containsKey(java.lang.Integer.valueOf(i17))) {
            this.mLongMap.remove(java.lang.Integer.valueOf(i17));
        }
    }

    public boolean setLongActionConfig(int i17, int i18, long j17) {
        if (!this.mLongMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return false;
        }
        this.mLongMap.get(java.lang.Integer.valueOf(i17)).put(java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17));
        return true;
    }
}
