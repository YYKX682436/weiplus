package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class a4 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f182145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.b4 f182146b;

    public a4(com.tencent.mm.plugin.webview.luggage.b4 b4Var, android.app.Activity activity) {
        this.f182146b = b4Var;
        this.f182145a = activity;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        return this.f182146b.f182153k.a(this.f182145a, i17, i18, intent);
    }
}
