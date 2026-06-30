package lx;

/* loaded from: classes10.dex */
public final class t1 implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.MiniAppInfo f321948d;

    public t1(com.tencent.mm.protocal.protobuf.MiniAppInfo miniAppInfo) {
        this.f321948d = miniAppInfo;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.Object extra_data = this.f321948d.getExtra_data();
        if (extra_data == null) {
            extra_data = "";
        }
        jSONObject.put("personalCenterWxaDataKey", extra_data);
        return jSONObject.toString();
    }
}
