package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class e4 implements r53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f139631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f139632b;

    public e4(com.tencent.mm.plugin.game.luggage.jsapi.g4 g4Var, android.os.Bundle bundle, com.tencent.mm.ipcinvoker.r rVar) {
        this.f139631a = bundle;
        this.f139632b = rVar;
    }

    @Override // r53.x
    public void a(android.view.View view, android.graphics.Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            com.tencent.mm.plugin.game.luggage.jsapi.x3.i("", "", bitmap, com.tencent.mm.sdk.platformtools.x2.f193071a, new com.tencent.mm.plugin.game.luggage.jsapi.d4(this));
            return;
        }
        android.os.Bundle bundle = this.f139631a;
        bundle.putBoolean(ya.b.SUCCESS, false);
        bundle.putString(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG, "download fail");
        this.f139632b.a(bundle);
    }

    @Override // r53.x
    public void b(java.lang.String str, android.view.View view) {
    }
}
