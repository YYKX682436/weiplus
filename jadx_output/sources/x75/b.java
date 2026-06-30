package x75;

/* loaded from: classes.dex */
public final class b implements com.tencent.mm.modelbase.u0, x75.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f452458d;

    /* renamed from: e, reason: collision with root package name */
    public long f452459e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f452460f;

    /* renamed from: g, reason: collision with root package name */
    public int f452461g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452462h = "Similar" + java.lang.System.currentTimeMillis();

    /* renamed from: i, reason: collision with root package name */
    public boolean f452463i = true;

    public void a(com.tencent.mm.search.data.SimilarEmojiQueryModel model, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.SimilarEmoji", "do net request:[" + model + ']');
        this.f452458d = callback;
        com.tencent.mm.api.IEmojiInfo Ni = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ni(model.f193150e);
        tg0.w1 w1Var = (tg0.w1) i95.n0.c(tg0.w1.class);
        java.lang.String str = model.f193150e;
        int i17 = this.f452461g;
        java.lang.String str2 = this.f452462h;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) Ni;
        java.lang.String str3 = emojiInfo.field_cdnUrl;
        java.lang.String str4 = emojiInfo.field_aeskey;
        ((sg0.u3) w1Var).getClass();
        gm0.j1.d().g(new su4.q1(str, i17, str2, str2, 0, str2, 59, str3, str4));
        this.f452459e = java.lang.System.currentTimeMillis();
        this.f452460f = true;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (java.lang.System.currentTimeMillis() - this.f452459e <= com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            int iOSNetType = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
            if (iOSNetType == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1257L, 109L);
            } else if (iOSNetType == 2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1257L, 100L);
            } else if (iOSNetType == 3) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1257L, 103L);
            } else if (iOSNetType == 4) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1257L, 106L);
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f452459e;
            int iOSNetType2 = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
            if (iOSNetType2 == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1257L, 110L, currentTimeMillis);
            } else if (iOSNetType2 == 2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1257L, 101L, currentTimeMillis);
            } else if (iOSNetType2 == 3) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1257L, 104L, currentTimeMillis);
            } else if (iOSNetType2 == 4) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1257L, 107L, currentTimeMillis);
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f452458d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i17, i18, str, m1Var);
        }
        if (i17 == 0 && i18 == 0) {
            ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
            if (m1Var instanceof su4.q1) {
                ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
                java.lang.String str2 = ((su4.q1) m1Var).f413049o.f374929d;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str2 == null) {
                    str2 = "";
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                    this.f452461g = jSONObject.optInt("offset", 0);
                    this.f452463i = jSONObject.optBoolean("continueFlag", false);
                    java.lang.String optString = jSONObject.optString("searchID");
                    kotlin.jvm.internal.o.f(optString, "optString(...)");
                    this.f452462h = optString;
                } catch (java.lang.Exception unused) {
                }
            }
        }
        this.f452460f = false;
    }
}
