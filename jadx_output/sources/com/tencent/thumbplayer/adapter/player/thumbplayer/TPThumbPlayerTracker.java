package com.tencent.thumbplayer.adapter.player.thumbplayer;

/* loaded from: classes12.dex */
public final class TPThumbPlayerTracker {
    static final java.util.concurrent.ConcurrentSkipListMap<java.lang.Integer, com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerTracker> stackMap = new java.util.concurrent.ConcurrentSkipListMap<>();

    /* renamed from: id, reason: collision with root package name */
    public final int f215540id;
    public final java.lang.ref.WeakReference<com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer> playerRef;
    public final java.lang.String scene;
    public final java.lang.String stack;
    public final long trackMs = java.lang.System.currentTimeMillis();

    public TPThumbPlayerTracker(int i17, com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer tPThumbPlayer, java.lang.String str, java.lang.String str2) {
        this.f215540id = i17;
        this.playerRef = new java.lang.ref.WeakReference<>(tPThumbPlayer);
        this.scene = str;
        this.stack = str2;
    }

    public static java.util.Map<java.lang.Integer, com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerTracker> getTrackingMap() {
        return stackMap;
    }
}
