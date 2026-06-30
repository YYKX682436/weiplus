package com.tencent.mm.plugin.finder.presenter.contract;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", dm.i4.COL_USERNAME, "Ljz5/f0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveWeCoinHotConstract$ViewCallback$initView$4$1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.ViewCallback f122818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.hp f122819e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveWeCoinHotConstract$ViewCallback$initView$4$1(com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.ViewCallback viewCallback, com.tencent.mm.plugin.finder.live.widget.hp hpVar) {
        super(1);
        this.f122818d = viewCallback;
        this.f122819e = hpVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String finderUsername = (java.lang.String) obj;
        if (finderUsername == null || finderUsername.length() == 0) {
            com.tencent.mars.xlog.Log.e(this.f122819e.I, "gotoProfileCallback username:" + finderUsername);
        } else {
            com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract.ViewCallback viewCallback = this.f122818d;
            if (viewCallback.f122804e != null) {
                com.tencent.mm.ui.MMActivity context = viewCallback.f122803d;
                kotlin.jvm.internal.o.g(context, "context");
                kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("report_scene", 0);
                intent.putExtra("finder_username", finderUsername);
                intent.putExtra("key_enter_profile_type", 11);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.e1.f460472a.w(context, intent);
            }
        }
        return jz5.f0.f302826a;
    }
}
