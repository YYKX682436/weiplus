package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/assist/i4;", "actionMenuInfo", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/finder/assist/i4;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
final class FinderLikedFeedContract$LikedTimelinePresenter$getCreateMoreMenuListener$1$actionMenuInfo$2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f122668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f122669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f122670f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLikedFeedContract$LikedTimelinePresenter$getCreateMoreMenuListener$1$actionMenuInfo$2(db5.g4 g4Var, com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.ui.MMActivity mMActivity) {
        super(1);
        this.f122668d = g4Var;
        this.f122669e = k0Var;
        this.f122670f = mMActivity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.assist.i4 actionMenuInfo = (com.tencent.mm.plugin.finder.assist.i4) obj;
        kotlin.jvm.internal.o.g(actionMenuInfo, "actionMenuInfo");
        if (!actionMenuInfo.f102262l && this.f122668d.findItem(208) == null) {
            this.f122668d.j(208, actionMenuInfo.f102258h, com.tencent.mm.R.raw.bottomsheet_icon_wework, 0, actionMenuInfo.f102254d);
            hc2.f1.C(this.f122669e, this.f122670f);
        }
        return jz5.f0.f302826a;
    }
}
