package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes4.dex */
public final class g3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f186101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f186102e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186103f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186104g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(android.app.Activity activity, float f17, nw4.k kVar, nw4.y2 y2Var) {
        super(0);
        this.f186101d = activity;
        this.f186102e = f17;
        this.f186103f = kVar;
        this.f186104g = y2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = this.f186101d.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f17 = this.f186102e;
        to.a.c(audioManager, 3, (int) (streamMaxVolume * f17), 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleDeviceInfo", "setVolume, maxVolume=" + streamMaxVolume + ", volume=" + f17);
        nw4.g gVar = this.f186103f.f340863d;
        nw4.y2 y2Var = this.f186104g;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
        return jz5.f0.f302826a;
    }
}
