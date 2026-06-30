package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes5.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f139654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.j1 f139656f;

    public h1(android.content.Context context, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, com.tencent.mm.plugin.game.luggage.jsapi.j1 j1Var) {
        this.f139654d = context;
        this.f139655e = q5Var;
        this.f139656f = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object systemService = this.f139654d.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, java.lang.Float.valueOf(streamVolume / streamMaxVolume));
        this.f139655e.a(null, jSONObject);
        this.f139656f.getClass();
        com.tencent.mars.xlog.Log.i("handleDeviceInfo", "getVolume, maxVolume=" + streamMaxVolume + ", volume=" + streamVolume);
    }
}
