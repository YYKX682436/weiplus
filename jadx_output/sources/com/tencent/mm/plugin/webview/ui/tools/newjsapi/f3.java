package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes4.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f186079e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(nw4.k kVar, float f17) {
        super(0);
        this.f186078d = kVar;
        this.f186079e = f17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f186078d.f340860a;
        float f17 = this.f186079e;
        oe1.x1.e(context, f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleDeviceInfo", "setScreenBrightness, brightness:" + f17);
        return jz5.f0.f302826a;
    }
}
