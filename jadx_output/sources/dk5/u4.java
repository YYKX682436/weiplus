package dk5;

/* loaded from: classes9.dex */
public class u4 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f234936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SendAppMessageWrapperUI f234937b;

    public u4(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI, java.util.List list) {
        this.f234937b = sendAppMessageWrapperUI;
        this.f234936a = list;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        org.json.JSONArray optJSONArray;
        if (!z17) {
            com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.U6(this.f234937b);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(this.f234936a)) {
            return;
        }
        ik5.a aVar = ik5.b.f291972a;
        int size = this.f234936a.size();
        if (size <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReceiveFromWeWorkUtil", "initHelper: size <= 0");
        } else {
            ik5.b.f291972a = ik5.a.f291969e;
            ik5.b.f291973b = size;
        }
        com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f234937b;
        dk5.u4$$a u4__a = new dk5.u4$$a(this, this.f234936a, str);
        int i18 = com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.B;
        sendAppMessageWrapperUI.getClass();
        c01.l2 c17 = c01.n2.d().c("kWXEntryActivity_data_center_session_id", true);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SendAppMessageWrapperUI", "dealFileInfo fail values is null");
            return;
        }
        java.lang.String str2 = (java.lang.String) c17.b("kWXEntryActivity_data_center_wework_msg_file_file_info");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMessageWrapperUI", "dealFileInfo: fileInfoString isNullOrNil");
            u4__a.a(null);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            if (jSONObject.has("file_info") && (optJSONArray = jSONObject.optJSONArray("file_info")) != null) {
                for (int i19 = 0; i19 < optJSONArray.length(); i19++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i19);
                    if (optJSONObject != null) {
                        linkedList.add(new dk5.p5(sendAppMessageWrapperUI, optJSONObject.optString("msgId"), optJSONObject.optString("uri")));
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("dealFileInfo", "Error  json: " + e17.getMessage());
        }
        ((ku5.t0) ku5.t0.f312615d).g(new dk5.g5(sendAppMessageWrapperUI, linkedList, u4__a));
    }
}
