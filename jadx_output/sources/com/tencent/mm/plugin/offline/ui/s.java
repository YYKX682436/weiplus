package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class s extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f152702d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView, android.view.View.OnClickListener onClickListener) {
        super(false);
        this.f152702d = onClickListener;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        android.view.View.OnClickListener onClickListener = this.f152702d;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
