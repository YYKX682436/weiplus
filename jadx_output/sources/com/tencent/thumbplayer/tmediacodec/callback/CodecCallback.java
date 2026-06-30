package com.tencent.thumbplayer.tmediacodec.callback;

/* loaded from: classes14.dex */
public interface CodecCallback {
    void onCreate(java.lang.Boolean bool);

    void onRealRelease();

    void onReuseCodecAPIException(java.lang.String str, java.lang.Throwable th6);

    void onStarted(java.lang.Boolean bool, java.lang.String str);

    void onTransToKeepPool();

    void onTransToRunningPool();
}
