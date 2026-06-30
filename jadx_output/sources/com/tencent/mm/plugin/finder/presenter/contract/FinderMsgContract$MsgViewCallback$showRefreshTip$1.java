package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class FinderMsgContract$MsgViewCallback$showRefreshTip$1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback f122904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f122905f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f122906g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMsgContract$MsgViewCallback$showRefreshTip$1(java.lang.String str, com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback, boolean z17, int i17) {
        super(0);
        this.f122903d = str;
        this.f122904e = msgViewCallback;
        this.f122905f = z17;
        this.f122906g = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f122903d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback = this.f122904e;
        if (K0) {
            android.widget.TextView textView = msgViewCallback.f122866p;
            if (textView == null) {
                kotlin.jvm.internal.o.o("refreshTip");
                throw null;
            }
            textView.setVisibility(8);
        } else {
            android.widget.TextView textView2 = msgViewCallback.f122866p;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("refreshTip");
                throw null;
            }
            textView2.setVisibility(0);
            android.widget.TextView textView3 = msgViewCallback.f122866p;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("refreshTip");
                throw null;
            }
            textView3.setText(str);
            android.widget.TextView textView4 = msgViewCallback.f122866p;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("refreshTip");
                throw null;
            }
            textView4.setClickable(this.f122905f);
            android.widget.TextView textView5 = msgViewCallback.f122866p;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("refreshTip");
                throw null;
            }
            textView5.setTextColor(this.f122906g);
        }
        return jz5.f0.f302826a;
    }
}
