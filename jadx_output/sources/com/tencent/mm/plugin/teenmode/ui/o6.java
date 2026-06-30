package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class o6 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI f173098a;

    public o6(com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI) {
        this.f173098a = teenModePrivatePwdUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        uh4.c0 c0Var = (uh4.c0) i95.n0.c(uh4.c0.class);
        com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI = this.f173098a;
        c0Var.u6(teenModePrivatePwdUI.getContext(), 7, "" + java.lang.System.currentTimeMillis(), teenModePrivatePwdUI.getString(com.tencent.mm.R.string.jtt), null, null, null, new com.tencent.mm.plugin.teenmode.ui.n6(teenModePrivatePwdUI));
    }
}
