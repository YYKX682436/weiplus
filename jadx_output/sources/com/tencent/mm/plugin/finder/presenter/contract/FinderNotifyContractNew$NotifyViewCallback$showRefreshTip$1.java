package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class FinderNotifyContractNew$NotifyViewCallback$showRefreshTip$1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback f123246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f123247f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f123248g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderNotifyContractNew$NotifyViewCallback$showRefreshTip$1(java.lang.String str, com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback, boolean z17, int i17) {
        super(0);
        this.f123245d = str;
        this.f123246e = notifyViewCallback;
        this.f123247f = z17;
        this.f123248g = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f123245d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = this.f123246e;
        if (K0) {
            android.widget.TextView textView = notifyViewCallback.f123201o;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            android.widget.TextView textView2 = notifyViewCallback.f123201o;
            if (textView2 != null) {
                textView2.setVisibility(0);
                textView2.setText(str);
                textView2.setClickable(this.f123247f);
                textView2.setTextColor(this.f123248g);
            }
        }
        return jz5.f0.f302826a;
    }
}
