package com.tencent.mm.plugin.finder.live.controller;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/finder/live/controller/LiveAnchorShopMsgDataController$initReceiveMsgListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderLiveShopMsgEvent;", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LiveAnchorShopMsgDataController$initReceiveMsgListener$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveShopMsgEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.bd f111567d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveAnchorShopMsgDataController$initReceiveMsgListener$1(df2.bd bdVar, com.tencent.mm.plugin.finder.live.view.ub ubVar) {
        super((com.tencent.mm.plugin.finder.live.view.k0) ubVar);
        this.f111567d = bdVar;
        kotlin.jvm.internal.o.e(ubVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        this.__eventId = 633350705;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.FinderLiveShopMsgEvent finderLiveShopMsgEvent) {
        java.util.ArrayList<so0.c> arrayList;
        com.tencent.mm.autogen.events.FinderLiveShopMsgEvent event = finderLiveShopMsgEvent;
        kotlin.jvm.internal.o.g(event, "event");
        zl2.r4 r4Var = zl2.r4.f473950a;
        df2.bd bdVar = this.f111567d;
        if (!r4Var.y1(bdVar.getStore().getLiveRoomData())) {
            return false;
        }
        java.util.List list = event.f54291g.f8186a;
        if (list != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                so0.c cVar = (so0.c) obj;
                java.lang.Long l17 = cVar.f410208e;
                if (l17 != null && l17.longValue() == ((mm2.e1) bdVar.business(mm2.e1.class)).f328988r.getLong(0) && kotlin.jvm.internal.o.b(cVar.f410206c, ((mm2.c1) bdVar.business(mm2.c1.class)).f328852o)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive msg size = ");
        sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
        com.tencent.mars.xlog.Log.i(bdVar.f229796m, sb6.toString());
        if (!(arrayList == null || arrayList.isEmpty())) {
            if (arrayList != null) {
                for (so0.c cVar2 : arrayList) {
                    qo2.e Zj = ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Zj();
                    java.lang.String clientMsgId = cVar2.f410214k;
                    kotlin.jvm.internal.o.f(clientMsgId, "clientMsgId");
                    Zj.f(clientMsgId);
                }
            }
            r45.t12 t12Var = new r45.t12();
            t12Var.set(3, java.lang.Integer.valueOf(com.tencent.thumbplayer.utils.TPGlobalEventNofication.EVENT_ID_UPC_CHANGED));
            t12Var.set(15, java.lang.Boolean.TRUE);
            t12Var.set(16, 1000);
            ((mm2.x4) bdVar.business(mm2.x4.class)).f329534o.add(new dk2.mf(t12Var));
        }
        return true;
    }
}
