package v01;

/* loaded from: classes10.dex */
public final class j implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.MiniAppInfo f432208d;

    public j(com.tencent.mm.protocal.protobuf.MiniAppInfo miniAppInfo) {
        this.f432208d = miniAppInfo;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.Object extra_data = this.f432208d.getExtra_data();
        if (extra_data == null) {
            extra_data = "";
        }
        jSONObject.put("personalCenterWxaDataKey", extra_data);
        return jSONObject.toString();
    }
}
