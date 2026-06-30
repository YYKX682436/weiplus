package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class c0 implements com.tencent.mm.ui.widget.dialog.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.AuthorizationRequestUI f172943a;

    public c0(com.tencent.mm.plugin.teenmode.ui.AuthorizationRequestUI authorizationRequestUI) {
        this.f172943a = authorizationRequestUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.k
    public final void a(boolean z17) {
        if (z17) {
            pm0.v.V(200L, new com.tencent.mm.plugin.teenmode.ui.b0(this.f172943a));
        }
    }
}
