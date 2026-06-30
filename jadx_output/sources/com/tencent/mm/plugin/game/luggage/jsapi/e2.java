package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class e2 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f139625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139626e;

    public e2(com.tencent.mm.plugin.game.luggage.jsapi.f2 f2Var, android.content.Context context, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f139625d = context;
        this.f139626e = q5Var;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 3345) {
            ((com.tencent.mm.ui.MMActivity) this.f139625d).mmSetOnActivityResultCallback(null);
            this.f139626e.a(null, null);
        }
    }
}
