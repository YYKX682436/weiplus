package qt2;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt2.u f366610d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(qt2.u uVar) {
        super(0);
        this.f366610d = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final qt2.u uVar = this.f366610d;
        return new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent>(uVar.getActivity()) { // from class: com.tencent.mm.plugin.finder.share.FinderShareGuideManageUIC$videoFinishListener$2$1
            {
                this.__eventId = -1291074182;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent feedMegaVideoAnimPlayEvent) {
                in5.s0 O6;
                com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent event = feedMegaVideoAnimPlayEvent;
                kotlin.jvm.internal.o.g(event, "event");
                qt2.u uVar2 = qt2.u.this;
                if (!uVar2.f366620p && (O6 = uVar2.O6()) != null) {
                    java.lang.Object obj = O6.f293125i;
                    so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
                    if (u1Var != null && u1Var.getFeedObject().isPostFinish()) {
                        long expectId = u1Var.getFeedObject().getExpectId();
                        am.fa faVar = event.f54249g;
                        if ((expectId == faVar.f6658a || (faVar.f6659b && u1Var.getFeedObject().getLocalId() == faVar.f6658a)) && (faVar.f6662e || faVar.f6661d)) {
                            com.tencent.mars.xlog.Log.i("FinderShareGuideManageUIC", "share video is completed: isVideoComplete:" + faVar.f6661d + " isEnd:" + faVar.f6662e);
                            uVar2.f366620p = true;
                            uVar2.R6("videoFinish");
                        }
                    }
                }
                return true;
            }
        };
    }
}
