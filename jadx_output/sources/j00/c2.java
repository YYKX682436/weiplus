package j00;

/* loaded from: classes9.dex */
public final class c2 implements mh0.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c00.k3 f296737a;

    public c2(c00.k3 k3Var) {
        this.f296737a = k3Var;
    }

    @Override // mh0.o
    public final void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "handleJsApiGiveGift midasDirectPay onCallBack resultCode:" + i17 + ", resultMsg:" + str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("payResultCode", i17);
        jSONObject.put("payResultMsg", str);
        this.f296737a.b(jSONObject);
    }
}
