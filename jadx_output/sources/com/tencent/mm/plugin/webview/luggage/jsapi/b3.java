package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class b3 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f182267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f182268e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.c3 f182269f;

    public b3(com.tencent.mm.plugin.webview.luggage.jsapi.c3 c3Var, sd.b bVar, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f182269f = c3Var;
        this.f182267d = bVar;
        this.f182268e = mMActivity;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == (this.f182269f.hashCode() & 65535)) {
            sd.b bVar = this.f182267d;
            if (i18 == -1) {
                bVar.a();
            } else if (i18 != 0) {
                bVar.c("fail", null);
            } else {
                bVar.c("cancel", null);
            }
            this.f182268e.mmSetOnActivityResultCallback(null);
        }
    }
}
