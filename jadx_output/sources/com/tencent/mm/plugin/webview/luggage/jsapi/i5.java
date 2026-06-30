package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class i5 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f182344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f182345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.j5 f182346f;

    public i5(com.tencent.mm.plugin.webview.luggage.jsapi.j5 j5Var, sd.b bVar, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f182346f = j5Var;
        this.f182344d = bVar;
        this.f182345e = mMActivity;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == (this.f182346f.hashCode() & 65535)) {
            sd.b bVar = this.f182344d;
            if (i18 == -1) {
                bVar.a();
            } else {
                bVar.c("cancel", null);
            }
            this.f182345e.mmSetOnActivityResultCallback(null);
        }
    }
}
