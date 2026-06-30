package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class s implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.t f179067d;

    public s(com.tencent.mm.plugin.wallet.pwd.ui.t tVar) {
        this.f179067d = tVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.wallet_core.model.p1.c().getClass();
        this.f179067d.f179071d.doSceneProgress(new com.tencent.mm.wallet_core.model.r0(com.tencent.mm.wallet_core.model.p1.b()));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13731, 10);
    }
}
