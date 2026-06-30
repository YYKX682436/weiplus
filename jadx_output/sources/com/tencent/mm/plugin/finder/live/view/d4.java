package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes.dex */
public final class d4 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveFansClubAnchorContactSettingView f116244a;

    public d4(com.tencent.mm.plugin.finder.live.view.FinderLiveFansClubAnchorContactSettingView finderLiveFansClubAnchorContactSettingView) {
        this.f116244a = finderLiveFansClubAnchorContactSettingView;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        yg2.b viewScope;
        int i17 = com.tencent.mm.plugin.finder.live.view.FinderLiveFansClubAnchorContactSettingView.f115849f;
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        com.tencent.mm.plugin.finder.live.view.FinderLiveFansClubAnchorContactSettingView finderLiveFansClubAnchorContactSettingView = this.f116244a;
        h0Var.f310123d = com.tencent.mm.ui.widget.dialog.u3.f(finderLiveFansClubAnchorContactSettingView.getContext(), finderLiveFansClubAnchorContactSettingView.getContext().getString(com.tencent.mm.R.string.ggd), true, 3, null);
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var == null || (viewScope = k0Var.getViewScope()) == null) {
            return;
        }
        kotlinx.coroutines.l.d(viewScope, null, null, new com.tencent.mm.plugin.finder.live.view.f4(finderLiveFansClubAnchorContactSettingView, z17, c0Var, h0Var, null), 3, null);
    }
}
