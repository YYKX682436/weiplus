package u93;

/* loaded from: classes5.dex */
public class a extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiChatRoomAtMember", "Invoke chatRoomAtMember");
        if (jSONObject == null) {
            this.f143443f.a("fail: data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("chatRoomName");
        java.lang.String optString2 = jSONObject.optString("userName");
        java.lang.String optString3 = jSONObject.optString("nickName");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || com.tencent.mm.sdk.platformtools.t8.K0(optString2) || com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            this.f143443f.a("invalid_params");
            return;
        }
        s33.j0 j0Var = (s33.j0) ((t33.f) i95.n0.c(t33.f.class));
        j0Var.getClass();
        ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).wi(optString2, new s33.i0(j0Var, optString2, optString));
        this.f143443f.d(false);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
