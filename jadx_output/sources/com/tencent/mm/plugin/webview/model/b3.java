package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public final class b3 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.f3 f182791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.e3 f182792b;

    public b3(com.tencent.mm.plugin.webview.model.f3 f3Var, com.tencent.mm.plugin.webview.model.e3 e3Var) {
        this.f182791a = f3Var;
        this.f182792b = e3Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.model.a3(i17, i18, oVar, this.f182791a, this.f182792b, str));
    }
}
