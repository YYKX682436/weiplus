package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lso2/v1;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "", "invoke", "(Lso2/v1;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
final class FinderFollowListContract$FollowListPresent$onSceneEnd$1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFollowListContract$FollowListPresent$onSceneEnd$1(java.lang.String str) {
        super(1);
        this.f122619d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        so2.v1 data = (so2.v1) obj;
        kotlin.jvm.internal.o.g(data, "data");
        return java.lang.Boolean.valueOf(data.f410645d.D0().equals(this.f122619d));
    }
}
