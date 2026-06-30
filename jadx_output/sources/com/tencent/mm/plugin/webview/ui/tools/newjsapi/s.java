package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class s implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f186504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186506c;

    public s(java.util.HashMap hashMap, nw4.k kVar, nw4.y2 y2Var) {
        this.f186504a = hashMap;
        this.f186505b = kVar;
        this.f186506c = y2Var;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        byte[] byteArrayExtra;
        int i18 = i17 == -1 ? 0 : -1;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.util.HashMap hashMap = this.f186504a;
        hashMap.put("errCode", valueOf);
        hashMap.put("action", java.lang.Integer.valueOf(i18));
        r45.ha5 ha5Var = new r45.ha5();
        if (intent != null && (byteArrayExtra = intent.getByteArrayExtra("KSelectUserList")) != null) {
            try {
                ha5Var.parseFrom(byteArrayExtra);
            } catch (java.lang.Throwable unused) {
            }
        }
        org.json.JSONObject json = ha5Var.toJSON();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseChatRoomMember", "contactListJson: " + json);
        org.json.JSONArray optJSONArray = json.optJSONArray("dataList");
        if (optJSONArray == null) {
            optJSONArray = new org.json.JSONArray();
        }
        hashMap.put("dataList", optJSONArray);
        nw4.k kVar = this.f186505b;
        nw4.y2 y2Var = this.f186506c;
        if (i18 == 0) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
            return;
        }
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", hashMap);
    }
}
