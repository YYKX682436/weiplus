package com.tencent.thumbplayer.connection;

/* loaded from: classes16.dex */
public class TPPlayerConnectionMgr implements com.tencent.thumbplayer.api.connection.ITPPlayerConnection {
    private com.tencent.thumbplayer.core.connection.TPNativePlayerConnectionMgr mNativeConnection = new com.tencent.thumbplayer.core.connection.TPNativePlayerConnectionMgr();

    @Override // com.tencent.thumbplayer.api.connection.ITPPlayerConnection
    public int activeAllConnections() {
        return this.mNativeConnection.activeAllConnections();
    }

    @Override // com.tencent.thumbplayer.api.connection.ITPPlayerConnection
    public int activeConnection(int i17) {
        return this.mNativeConnection.activeConnection(i17);
    }

    @Override // com.tencent.thumbplayer.api.connection.ITPPlayerConnection
    public int addConnection(long j17, com.tencent.thumbplayer.api.connection.TPPlayerConnectionNode tPPlayerConnectionNode, long j18, com.tencent.thumbplayer.api.connection.TPPlayerConnectionNode tPPlayerConnectionNode2) {
        return this.mNativeConnection.addConnection(j17, tPPlayerConnectionNode.getNativeNode(), j18, tPPlayerConnectionNode2.getNativeNode());
    }

    @Override // com.tencent.thumbplayer.api.connection.ITPPlayerConnection
    public void deactiveAllConnections() {
        this.mNativeConnection.deactiveAllConnections();
    }

    @Override // com.tencent.thumbplayer.api.connection.ITPPlayerConnection
    public void deactiveConnection(int i17) {
        this.mNativeConnection.deactiveConnection(i17);
    }

    @Override // com.tencent.thumbplayer.api.connection.ITPPlayerConnection
    public void init() {
        this.mNativeConnection.init();
    }

    @Override // com.tencent.thumbplayer.api.connection.ITPPlayerConnection
    public void removeConnection(int i17) {
        this.mNativeConnection.removeConnection(i17);
    }

    @Override // com.tencent.thumbplayer.api.connection.ITPPlayerConnection
    public void uninit() {
        this.mNativeConnection.unInit();
    }
}
