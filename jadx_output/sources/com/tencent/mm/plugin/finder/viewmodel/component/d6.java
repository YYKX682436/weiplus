package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes5.dex */
public final class d6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC f134081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC) {
        super(0);
        this.f134081d = finderBulletUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC = this.f134081d;
        com.tencent.mm.api.SmileyPanel c17 = qk.w9.c(finderBulletUIC.getContext(), false);
        int i17 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
        c17.setEntranceScene(0);
        c17.setSearchSource(4);
        c17.c();
        c17.d(true);
        c17.e(false, false);
        c17.setVisibility(4);
        c17.setShowSend(true);
        c17.i();
        c17.setOnTextOperationListener(new com.tencent.mm.plugin.finder.viewmodel.component.a6(finderBulletUIC));
        return c17;
    }
}
