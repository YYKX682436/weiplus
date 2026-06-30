package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes4.dex */
public final class c3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f185999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186001f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(android.app.Activity activity, nw4.k kVar, nw4.y2 y2Var) {
        super(0);
        this.f185999d = activity;
        this.f186000e = kVar;
        this.f186001f = y2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = this.f185999d.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, java.lang.Float.valueOf(streamVolume / streamMaxVolume));
        nw4.g gVar = this.f186000e.f340863d;
        nw4.y2 y2Var = this.f186001f;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleDeviceInfo", "getVolume, maxVolume=" + streamMaxVolume + ", volume=" + streamVolume);
        return jz5.f0.f302826a;
    }
}
