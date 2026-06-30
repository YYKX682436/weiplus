package vh0;

/* loaded from: classes8.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh0.f2 f436849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f436850e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(vh0.f2 f2Var, java.util.Map map) {
        super(2);
        this.f436849d = f2Var;
        this.f436850e = map;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        if (obj2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatBotAgreementService", "[-] the element " + intValue + " is null in agreement info list.");
            return null;
        }
        try {
            org.json.JSONObject jSONObject = (org.json.JSONObject) obj2;
            int optInt = jSONObject.optInt(dm.i4.COL_ID, intValue);
            java.lang.String string = jSONObject.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            java.lang.String string2 = ((org.json.JSONObject) obj2).getString("url");
            this.f436849d.getClass();
            int optInt2 = ((org.json.JSONObject) obj2).optInt("version", 0);
            java.lang.Integer num = (java.lang.Integer) this.f436850e.get(java.lang.Integer.valueOf(optInt));
            int intValue2 = num != null ? num.intValue() : 0;
            return new com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo(optInt, string, string2, optInt2, optInt2 <= intValue2, intValue2 == 0);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChatBotAgreementService", th6, "[-] malformed agreement info " + intValue + " in list.", new java.lang.Object[0]);
            return null;
        }
    }
}
