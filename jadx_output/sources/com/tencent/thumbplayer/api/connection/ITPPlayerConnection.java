package com.tencent.thumbplayer.api.connection;

/* loaded from: classes16.dex */
public interface ITPPlayerConnection {
    int activeAllConnections();

    int activeConnection(int i17);

    int addConnection(long j17, com.tencent.thumbplayer.api.connection.TPPlayerConnectionNode tPPlayerConnectionNode, long j18, com.tencent.thumbplayer.api.connection.TPPlayerConnectionNode tPPlayerConnectionNode2);

    void deactiveAllConnections();

    void deactiveConnection(int i17);

    void init();

    void removeConnection(int i17);

    void uninit();
}
