package im2;

/* loaded from: classes3.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC f292435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC) {
        super(0);
        this.f292435d = finderLiveExitAnimateOpUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC finderLiveExitAnimateOpUIC = this.f292435d;
        com.tencent.mars.xlog.Log.i(finderLiveExitAnimateOpUIC.f116981d, "toggleExitAnimation end");
        com.tencent.mm.autogen.events.FinderLiveFinishEvent finderLiveFinishEvent = new com.tencent.mm.autogen.events.FinderLiveFinishEvent();
        int hashCode = finderLiveExitAnimateOpUIC.getActivity().hashCode();
        am.qb qbVar = finderLiveFinishEvent.f54286g;
        qbVar.f7703a = hashCode;
        qbVar.f7704b = java.lang.Boolean.FALSE;
        finderLiveFinishEvent.e();
        finderLiveExitAnimateOpUIC.f116982e = true;
        new com.tencent.mm.autogen.events.FinderLiveCloseEvent().e();
        return jz5.f0.f302826a;
    }
}
