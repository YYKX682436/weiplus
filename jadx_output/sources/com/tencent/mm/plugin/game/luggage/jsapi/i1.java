package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes5.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f139665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f139666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.j1 f139667f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139668g;

    public i1(android.content.Context context, double d17, com.tencent.mm.plugin.game.luggage.jsapi.j1 j1Var, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f139665d = context;
        this.f139666e = d17;
        this.f139667f = j1Var;
        this.f139668g = q5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object systemService = this.f139665d.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        double d17 = this.f139666e;
        to.a.c(audioManager, 3, (int) (streamMaxVolume * d17), 0);
        this.f139667f.getClass();
        com.tencent.mars.xlog.Log.i("handleDeviceInfo", "setVolume, maxVolume=" + streamMaxVolume + ", volume=" + d17);
        this.f139668g.a(null, null);
    }
}
