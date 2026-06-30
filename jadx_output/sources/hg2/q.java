package hg2;

/* loaded from: classes3.dex */
public final class q implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.vf f281386d;

    public q(dk2.vf vfVar) {
        this.f281386d = vfVar;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        com.tencent.mm.protobuf.g byteString;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        r45.lq1 lq1Var = this.f281386d.f234250a;
        jSONObject.put("product_info", android.util.Base64.encodeToString((lq1Var == null || (byteString = lq1Var.getByteString(2)) == null) ? null : byteString.g(), 0));
        return jSONObject.toString();
    }
}
