package com.tencent.thumbplayer.core.connection;

/* loaded from: classes16.dex */
public class TPNativePlayerConnectionMgr {
    private boolean mIsLibLoaded;
    private boolean mInited = false;
    private long mNativeContext = 0;

    public TPNativePlayerConnectionMgr() {
        this.mIsLibLoaded = false;
        try {
            com.tencent.thumbplayer.core.common.TPNativeLibraryLoader.loadLibIfNeeded(null);
            this.mIsLibLoaded = true;
        } catch (java.lang.UnsupportedOperationException unused) {
            this.mIsLibLoaded = false;
        }
    }

    private native int _activeAllConnections();

    private native int _activeConnection(int i17);

    private native int _addConnection(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4);

    private native int _addConnectionWithAddr(long j17, java.lang.Object obj, long j18, java.lang.Object obj2);

    private native void _deactiveAllConnections();

    private native void _deactiveConnection(int i17);

    private native void _init();

    private native void _removeConnection(int i17);

    private native void _unInit();

    public int activeAllConnections() {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            return _activeAllConnections();
        }
        throw new java.lang.IllegalStateException("Failed to addConnection due to invalid state.");
    }

    public int activeConnection(int i17) {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            return _activeConnection(i17);
        }
        throw new java.lang.IllegalStateException("Failed to addConnection due to invalid state.");
    }

    public int addConnection(com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer, com.tencent.thumbplayer.core.connection.TPNativePlayerConnectionNode tPNativePlayerConnectionNode, com.tencent.thumbplayer.core.player.TPNativePlayer tPNativePlayer2, com.tencent.thumbplayer.core.connection.TPNativePlayerConnectionNode tPNativePlayerConnectionNode2) {
        if (this.mIsLibLoaded) {
            if (this.mInited) {
                return _addConnection(tPNativePlayer, tPNativePlayerConnectionNode, tPNativePlayer2, tPNativePlayerConnectionNode2);
            }
            throw new java.lang.IllegalStateException("Failed to addConnection due to invalid state.");
        }
        throw new java.lang.UnsupportedOperationException("Failed to load native library");
    }

    public void deactiveAllConnections() {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new java.lang.IllegalStateException("Failed to addConnection due to invalid state.");
        }
        _deactiveAllConnections();
    }

    public void deactiveConnection(int i17) {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new java.lang.IllegalStateException("Failed to addConnection due to invalid state.");
        }
        _deactiveConnection(i17);
    }

    public void init() {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            throw new java.lang.IllegalStateException("Failed to init due to invalid state.");
        }
        this.mInited = true;
        _init();
    }

    public void removeConnection(int i17) {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (!this.mInited) {
            throw new java.lang.IllegalStateException("Failed to addConnection due to invalid state.");
        }
        _removeConnection(i17);
    }

    public void unInit() {
        if (!this.mIsLibLoaded) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.mInited) {
            this.mInited = false;
            _unInit();
        }
    }

    public int addConnection(long j17, com.tencent.thumbplayer.core.connection.TPNativePlayerConnectionNode tPNativePlayerConnectionNode, long j18, com.tencent.thumbplayer.core.connection.TPNativePlayerConnectionNode tPNativePlayerConnectionNode2) {
        if (this.mIsLibLoaded) {
            if (this.mInited) {
                return _addConnectionWithAddr(j17, tPNativePlayerConnectionNode, j18, tPNativePlayerConnectionNode2);
            }
            throw new java.lang.IllegalStateException("Failed to addConnection due to invalid state.");
        }
        throw new java.lang.UnsupportedOperationException("Failed to load native library");
    }
}
