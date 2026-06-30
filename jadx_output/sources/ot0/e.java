package ot0;

/* loaded from: classes9.dex */
public class e extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f348442b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f348443c;

    /* renamed from: d, reason: collision with root package name */
    public long f348444d;

    /* renamed from: e, reason: collision with root package name */
    public long f348445e;

    /* renamed from: f, reason: collision with root package name */
    public int f348446f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f348447g;

    @Override // ot0.h
    public ot0.h a() {
        return new ot0.e();
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        if (qVar.f348666i == 2001) {
            sb6.append("<voice>");
            sb6.append("<voiceurl>");
            sb6.append(ot0.q.g(this.f348442b));
            sb6.append("</voiceurl>");
            sb6.append("<aeskey>");
            sb6.append(ot0.q.g(this.f348443c));
            sb6.append("</aeskey>");
            sb6.append("<length>");
            sb6.append(this.f348444d);
            sb6.append("</length>");
            sb6.append("<playtime>");
            sb6.append(this.f348445e);
            sb6.append("</playtime>");
            sb6.append("<format>");
            sb6.append(this.f348446f);
            sb6.append("</format>");
            sb6.append("<key_words>");
            sb6.append(ot0.q.g(this.f348447g));
            sb6.append("</key_words>");
            sb6.append("</voice>");
        }
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        if (qVar.f348666i == 2001) {
            java.lang.String str = (java.lang.String) map.get(".msg.appmsg.voice.voiceurl");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            this.f348442b = str;
            java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.voice.aeskey");
            if (str2 == null) {
                str2 = "";
            }
            this.f348443c = str2;
            this.f348444d = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(".msg.appmsg.voice.length"), 0L);
            this.f348445e = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(".msg.appmsg.voice.playtime"), 0L);
            this.f348446f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.voice.format"), 0);
            java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.voice.key_words");
            if (str3 == null) {
                str3 = "";
            }
            this.f348447g = str3;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppContentLuckyMoneyVoicePiece", "voiceUrl:%s asekey:%s keywords:%s", this.f348442b, this.f348443c, str3);
            java.lang.String str4 = qVar.f348678l;
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f348442b) || com.tencent.mm.sdk.platformtools.t8.K0(this.f348443c) || com.tencent.mm.sdk.platformtools.t8.K0(this.f348447g)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppContentLuckyMoneyVoicePiece", "need parse lowUrl:%s", str4);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                    return;
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(android.util.Base64.decode(str4, 0)));
                    this.f348442b = jSONObject.optString("voice_url");
                    this.f348443c = jSONObject.optString("voice_aeskey");
                    this.f348444d = jSONObject.optLong("voice_file_length");
                    this.f348445e = jSONObject.optLong("voice_playtime");
                    this.f348446f = jSONObject.optInt("voice_format");
                    this.f348447g = jSONObject.optString("voice_key_words");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppContentLuckyMoneyVoicePiece", e17, "", new java.lang.Object[0]);
                }
            }
        }
    }
}
