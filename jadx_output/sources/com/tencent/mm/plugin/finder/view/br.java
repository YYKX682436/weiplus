package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class br {
    public br(kotlin.jvm.internal.i iVar) {
    }

    public final java.util.Map a(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        r45.nw1 liveInfo;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("feed_id", pm0.v.u(baseFinderFeed.getFeedObject().getFeedObject().getId()));
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject3 = baseFinderFeed.getFeedObject();
        linkedHashMap.put("live_id", (feedObject3 == null || (feedObject2 = feedObject3.getFeedObject()) == null || (liveInfo = feedObject2.getLiveInfo()) == null) ? "0" : java.lang.Long.valueOf(liveInfo.getLong(0)));
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject4 = baseFinderFeed.getFeedObject();
        linkedHashMap.put("finder_username", (feedObject4 == null || (feedObject = feedObject4.getFeedObject()) == null) ? null : feedObject.getUsername());
        ml2.v1 v1Var = ml2.v1.f328140e;
        linkedHashMap.put("live_enter_status", 1L);
        linkedHashMap.put("share_username", "");
        return linkedHashMap;
    }

    public final void b(android.view.View view, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, java.lang.String eventId) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        com.tencent.mm.plugin.finder.report.d2.f(com.tencent.mm.plugin.finder.report.d2.f124994a, view, "living_label", eventId, 26236, a(item), null, 32, null);
    }
}
