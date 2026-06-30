package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public final class v2 implements fl1.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.y2 f183139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.jv5 f183140b;

    public v2(com.tencent.mm.plugin.webview.model.y2 y2Var, r45.jv5 jv5Var) {
        this.f183139a = y2Var;
        this.f183140b = jv5Var;
    }

    @Override // fl1.j1
    public void a(android.view.View v17, fl1.h1 item, int i17) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        rl5.r rVar = new rl5.r(v17.getContext());
        if (i17 == 0) {
            return;
        }
        com.tencent.mm.plugin.webview.model.y2 y2Var = this.f183139a;
        com.tencent.mm.plugin.webview.model.r2 r2Var = new com.tencent.mm.plugin.webview.model.r2(y2Var);
        com.tencent.mm.plugin.webview.model.u2 u2Var = new com.tencent.mm.plugin.webview.model.u2(y2Var, i17, this.f183140b, item);
        int i18 = com.tencent.mm.view.TouchableLayout.f213511d;
        rVar.g(v17, i17, 0L, r2Var, u2Var, com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
    }
}
