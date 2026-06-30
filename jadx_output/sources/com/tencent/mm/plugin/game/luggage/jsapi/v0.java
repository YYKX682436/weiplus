package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes12.dex */
public final class v0 implements dr.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.w0 f139754b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f139755c;

    public v0(com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, com.tencent.mm.plugin.game.luggage.jsapi.w0 w0Var, android.content.Context context) {
        this.f139753a = q5Var;
        this.f139754b = w0Var;
        this.f139755c = context;
    }

    @Override // dr.r
    public void a(int i17, com.tencent.mm.api.IEmojiInfo emojiInfo, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f139753a;
        if (i17 == -1) {
            q5Var.a("emoji load failed", null);
            return;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.game.luggage.jsapi.w0 w0Var = this.f139754b;
            w0Var.getClass();
            com.tencent.mars.xlog.Log.i("getStoreEmoticonImage", "EmojiLoader.loadCover StateSuccess cover path = " + emojiInfo.h0());
            if (o35.a.b(emojiInfo.h0())) {
                w0Var.f(emojiInfo, q5Var);
            } else {
                emojiInfo.W(this.f139755c);
                w0Var.f(emojiInfo, q5Var);
            }
        }
    }
}
