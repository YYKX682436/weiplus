package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class k7 implements ft.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f174031a;

    public k7(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f174031a = textStatusDoWhatActivityV2;
    }

    @Override // ft.p4
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.textstatus.ui.h6 h6Var = com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2.C1;
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f174031a;
        textStatusDoWhatActivityV2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "handleAppBrandEmojiPanelDataCallBack: data:%s", str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        try {
            org.json.JSONObject optJSONObject = new org.json.JSONObject(str2).optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            java.lang.String optString = optJSONObject != null ? optJSONObject.optString("iconId") : null;
            if (optString == null) {
                optString = "";
            }
            int optInt = optJSONObject != null ? optJSONObject.optInt("isfred") : 0;
            textStatusDoWhatActivityV2.S = 1 == (optJSONObject != null ? optJSONObject.optInt("is_rcmd") : 0);
            textStatusDoWhatActivityV2.N = optString;
            textStatusDoWhatActivityV2.runOnUiThread(new com.tencent.mm.plugin.textstatus.ui.r6(textStatusDoWhatActivityV2, optString));
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "handleAppBrandEmojiPanelDataCallBack() called :" + textStatusDoWhatActivityV2.N + ", recentUse=" + optInt + ", isRecommend=" + textStatusDoWhatActivityV2.S);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "handleAppBrandEmojiPanelDataCallBack: e:%s data:%s", e17, str2);
        }
    }
}
