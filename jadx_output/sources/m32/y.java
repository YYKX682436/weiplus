package m32;

/* loaded from: classes.dex */
public class y extends com.tencent.mm.sdk.event.n {
    public y() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RtosWatchGetQuickReplyEvent rtosWatchGetQuickReplyEvent = (com.tencent.mm.autogen.events.RtosWatchGetQuickReplyEvent) iEvent;
        java.util.ArrayList z07 = com.tencent.mm.plugin.exdevice.model.l3.ij().z0();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i17 = 0; i17 < z07.size(); i17++) {
            try {
                ny3.a aVar = (ny3.a) z07.get(i17);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.putOpt(ya.b.INDEX, java.lang.Integer.valueOf(aVar.field_orderIndex));
                jSONObject.putOpt("msg", aVar.field_quickMsg);
                jSONArray.put(jSONObject);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("RtosOnGetQuickReplyListener", e17, e17.toString(), new java.lang.Object[0]);
            }
        }
        if (jSONArray.length() > 0) {
            rtosWatchGetQuickReplyEvent.f54716g.f6704a = ya.b.SUCCESS;
        } else {
            rtosWatchGetQuickReplyEvent.f54716g.f6704a = "fail";
        }
        rtosWatchGetQuickReplyEvent.f54716g.f6705b = jSONArray.toString();
        return true;
    }
}
