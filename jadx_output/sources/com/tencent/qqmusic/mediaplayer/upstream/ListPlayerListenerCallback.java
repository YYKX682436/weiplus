package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: classes13.dex */
public class ListPlayerListenerCallback implements com.tencent.qqmusic.mediaplayer.PlayerListenerCallback {
    private final java.util.concurrent.CopyOnWriteArrayList<com.tencent.qqmusic.mediaplayer.PlayerListenerCallback> mCallbacks = new java.util.concurrent.CopyOnWriteArrayList<>();

    public synchronized void add(com.tencent.qqmusic.mediaplayer.PlayerListenerCallback playerListenerCallback) {
        this.mCallbacks.add(playerListenerCallback);
    }

    public synchronized void addAll(java.util.List<com.tencent.qqmusic.mediaplayer.PlayerListenerCallback> list) {
        this.mCallbacks.addAll(list);
    }

    public synchronized void clear() {
        this.mCallbacks.clear();
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onBufferingUpdate(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer, int i17) {
        java.util.Iterator<com.tencent.qqmusic.mediaplayer.PlayerListenerCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onBufferingUpdate(baseMediaPlayer, i17);
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onCompletion(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer) {
        java.util.Iterator<com.tencent.qqmusic.mediaplayer.PlayerListenerCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onCompletion(baseMediaPlayer);
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onError(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer, int i17, int i18, int i19) {
        java.util.Iterator<com.tencent.qqmusic.mediaplayer.PlayerListenerCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onError(baseMediaPlayer, i17, i18, i19);
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onPrepared(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer) {
        java.util.Iterator<com.tencent.qqmusic.mediaplayer.PlayerListenerCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onPrepared(baseMediaPlayer);
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onSeekComplete(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer, int i17) {
        java.util.Iterator<com.tencent.qqmusic.mediaplayer.PlayerListenerCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onSeekComplete(baseMediaPlayer, i17);
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onStarted(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer) {
        java.util.Iterator<com.tencent.qqmusic.mediaplayer.PlayerListenerCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onStarted(baseMediaPlayer);
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onStateChanged(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer, int i17) {
        java.util.Iterator<com.tencent.qqmusic.mediaplayer.PlayerListenerCallback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(baseMediaPlayer, i17);
        }
    }

    public synchronized void remove(com.tencent.qqmusic.mediaplayer.PlayerListenerCallback playerListenerCallback) {
        this.mCallbacks.remove(playerListenerCallback);
    }

    public synchronized java.util.List<com.tencent.qqmusic.mediaplayer.PlayerListenerCallback> toCollection() {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        arrayList.addAll(this.mCallbacks);
        return arrayList;
    }

    public synchronized void add(com.tencent.qqmusic.mediaplayer.upstream.ListPlayerListenerCallback listPlayerListenerCallback) {
        this.mCallbacks.addAll(listPlayerListenerCallback.toCollection());
    }
}
