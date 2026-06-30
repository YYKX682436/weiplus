package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class r extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMVerticalTextView f214219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.w f214220f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.wallet_core.ui.w wVar, android.view.View view, com.tencent.mm.ui.base.MMVerticalTextView mMVerticalTextView) {
        super(false);
        this.f214220f = wVar;
        this.f214218d = view;
        this.f214219e = mMVerticalTextView;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        this.f214220f.f214258n.setVisibility(8);
        com.tencent.mm.autogen.events.DoOfflineShowCodeEventEvent doOfflineShowCodeEventEvent = new com.tencent.mm.autogen.events.DoOfflineShowCodeEventEvent();
        doOfflineShowCodeEventEvent.f54092g.f6536a = 1;
        doOfflineShowCodeEventEvent.e();
        this.f214218d.setImportantForAccessibility(0);
        this.f214219e.sendAccessibilityEvent(8);
    }
}
