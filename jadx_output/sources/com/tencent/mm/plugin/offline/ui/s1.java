package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f152705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f152706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f152707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f152708g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f152709h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152710i;

    public s1(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28) {
        this.f152710i = walletOfflineCoinPurseUI;
        this.f152705d = z17;
        this.f152706e = z18;
        this.f152707f = z19;
        this.f152708g = z27;
        this.f152709h = z28;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152710i;
        android.widget.ScrollView scrollView = walletOfflineCoinPurseUI.f152538v;
        if (scrollView == null) {
            return;
        }
        int[] iArr = new int[2];
        scrollView.getLocationInWindow(iArr);
        int i17 = com.tencent.mm.ui.bk.h(walletOfflineCoinPurseUI.getContext()).y;
        if (com.tencent.mm.ui.bk.k(walletOfflineCoinPurseUI.getContext())) {
            i17 -= com.tencent.mm.ui.bk.j(walletOfflineCoinPurseUI.getContext());
        }
        int bottom = this.f152705d ? iArr[1] + walletOfflineCoinPurseUI.U.getBottom() : 0;
        if (this.f152706e) {
            bottom = iArr[1] + walletOfflineCoinPurseUI.X.getBottom();
        }
        if (this.f152707f) {
            bottom = iArr[1] + walletOfflineCoinPurseUI.V.getBottom();
        }
        if (this.f152708g) {
            bottom = iArr[1] + walletOfflineCoinPurseUI.W.getBottom();
        }
        if (this.f152709h) {
            bottom = walletOfflineCoinPurseUI.Y.getBottom() + iArr[1];
        }
        int i18 = bottom - i17;
        if (i18 > 0) {
            walletOfflineCoinPurseUI.f152538v.scrollBy(0, i18);
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_PAY_OR_RECV_HAS_SHOW_RED_DOT_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
    }
}
