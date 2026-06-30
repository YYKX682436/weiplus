package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class FinderNotifyContractNew$NotifyViewCallback$dismissRefreshViewOnError$1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback f123206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderNotifyContractNew$NotifyViewCallback$dismissRefreshViewOnError$1(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback) {
        super(0);
        this.f123206d = notifyViewCallback;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Runnable runnable = this.f123206d.f123197h;
        if (runnable != null) {
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            com.tencent.mm.sdk.platformtools.u3.l(runnable);
        }
        android.widget.TextView textView = this.f123206d.f123201o;
        if (textView != null) {
            textView.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
