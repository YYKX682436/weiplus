package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public final class ue implements com.tencent.mm.ui.chatting.u9 {

    /* renamed from: c, reason: collision with root package name */
    public static final l75.v0 f202744c = new com.tencent.mm.ui.chatting.re();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f202745a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f202746b = new java.util.HashMap();

    public ue(android.content.Context context) {
        this.f202745a = context;
    }

    @Override // com.tencent.mm.ui.chatting.u9
    public void a(android.os.Bundle bundle) {
        android.net.Uri.parse(bundle.getString(com.tencent.mm.opensdk.constants.ConstantsAPI.CONTENT)).getQueryParameter("appid");
        com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Resp resp = new com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Resp(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.WXAppMessageShower", "handleResp, errCode = " + resp.errCode + ", type = " + resp.getType());
        java.util.Map map = this.f202746b;
        if (((com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req) ((java.util.HashMap) map).get(resp.transaction)) != null) {
            ((java.util.HashMap) map).remove(resp.transaction);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXAppMessageShower", "invalid resp, check transaction failed, transaction=" + resp.transaction);
        }
    }
}
