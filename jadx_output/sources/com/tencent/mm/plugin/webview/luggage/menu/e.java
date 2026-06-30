package com.tencent.mm.plugin.webview.luggage.menu;

/* loaded from: classes8.dex */
public class e implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.e0 f182563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182564e;

    public e(com.tencent.mm.plugin.webview.luggage.menu.h hVar, com.tencent.mm.plugin.webview.luggage.e0 e0Var, android.content.Context context) {
        this.f182563d = e0Var;
        this.f182564e = context;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        boolean z17 = ((android.os.Bundle) obj).getBoolean(ya.b.SUCCESS);
        this.f182563d.f406655i.c(new com.tencent.mm.plugin.webview.luggage.menu.b(this, z17));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.luggage.menu.d(this, z17));
    }
}
