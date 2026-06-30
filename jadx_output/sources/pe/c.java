package pe;

/* loaded from: classes7.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe.e f353590d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(pe.e eVar) {
        super(1);
        this.f353590d = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        java.lang.String str = (java.lang.String) obj;
        if (!(str == null || str.length() == 0)) {
            java.util.HashMap hashMap = this.f353590d.f353591a;
            if (pe.a.f353588a != null) {
                com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
                com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
                java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj(str, "");
                boolean b17 = j62.e.g().b(str, pInt, pInt2);
                jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str);
                    jSONObject.put("value", aj6);
                    jSONObject.put("exptid", b17 ? pInt.value : -1);
                    jSONObject.put("groupid", b17 ? pInt2.value : -1);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WxaCommLibRuntimeReader", e17.getMessage());
                }
            } else {
                jSONObject = new org.json.JSONObject();
            }
            hashMap.put(str, jSONObject);
        }
        return jz5.f0.f302826a;
    }
}
