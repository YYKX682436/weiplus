package m32;

/* loaded from: classes.dex */
public class a0 extends com.tencent.mm.sdk.event.n {
    public a0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RtosWatchSaveQuickReplyEvent rtosWatchSaveQuickReplyEvent = (com.tencent.mm.autogen.events.RtosWatchSaveQuickReplyEvent) iEvent;
        try {
            org.json.JSONArray jSONArray = new org.json.JSONObject(rtosWatchSaveQuickReplyEvent.f54717g.f6787a).getJSONArray("replyList");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                ny3.a aVar = new ny3.a();
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                aVar.field_orderIndex = jSONObject.getInt(ya.b.INDEX);
                aVar.field_quickMsg = jSONObject.getString("msg");
                arrayList.add(aVar);
            }
            boolean isEmpty = arrayList.isEmpty();
            am.hs hsVar = rtosWatchSaveQuickReplyEvent.f54718h;
            if (isEmpty) {
                com.tencent.mm.plugin.exdevice.model.l3.ij().y0();
                hsVar.f6865a = "ok";
            } else {
                com.tencent.mm.plugin.exdevice.model.l3.ij().y0();
                com.tencent.mm.plugin.exdevice.model.l3.ij().D0(arrayList);
                hsVar.f6865a = "ok";
            }
            ((my3.q) ((fy3.e) i95.n0.c(fy3.e.class))).mj();
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("RtosOnSaveQuickReplyListener", e17, e17.toString(), new java.lang.Object[0]);
            rtosWatchSaveQuickReplyEvent.f54718h.f6865a = "fail";
            return true;
        }
    }
}
