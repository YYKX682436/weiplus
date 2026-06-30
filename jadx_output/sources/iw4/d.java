package iw4;

/* loaded from: classes.dex */
public final class d implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f295244d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.search.data.SimilarEmojiQueryModel f295245e;

    /* renamed from: f, reason: collision with root package name */
    public int f295246f;

    /* renamed from: g, reason: collision with root package name */
    public int f295247g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f295248h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f295249i = "Similar" + java.lang.System.currentTimeMillis();

    /* renamed from: m, reason: collision with root package name */
    public boolean f295250m = true;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f295251n = new java.util.LinkedList();

    public final com.tencent.mm.api.IEmojiInfo a() {
        com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel = this.f295245e;
        if (similarEmojiQueryModel == null) {
            return null;
        }
        boolean c17 = c();
        java.util.LinkedList linkedList = this.f295251n;
        if (!c17) {
            ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).getClass();
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
            if (linkedList.isEmpty()) {
                linkedList.add(new ir.g(emojiInfo, 107, null, 0, 12, null));
            }
            return emojiInfo;
        }
        com.tencent.mm.api.IEmojiInfo Ni = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ni(similarEmojiQueryModel.f193150e);
        if (Ni == null) {
            return null;
        }
        ((com.tencent.mm.storage.emotion.EmojiInfo) Ni).field_catalog = 65;
        if (linkedList.isEmpty()) {
            linkedList.add(new ir.g(Ni, 100, null, 0, 12, null));
        }
        return Ni;
    }

    public final void b(com.tencent.mm.modelbase.u0 callback) {
        com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel;
        java.lang.String str;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.SimilarEmoji", "do net request:[" + this.f295245e + ']');
        this.f295244d = callback;
        if (this.f295250m && (similarEmojiQueryModel = this.f295245e) != null) {
            if (c()) {
                com.tencent.mm.api.IEmojiInfo Ni = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ni(similarEmojiQueryModel.f193150e);
                tg0.w1 w1Var = (tg0.w1) i95.n0.c(tg0.w1.class);
                java.lang.String str2 = similarEmojiQueryModel.f193150e;
                int i17 = this.f295246f;
                java.lang.String str3 = this.f295249i;
                com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) Ni;
                java.lang.String str4 = emojiInfo.field_cdnUrl;
                java.lang.String str5 = emojiInfo.field_aeskey;
                ((sg0.u3) w1Var).getClass();
                gm0.j1.d().g(new su4.q1(str2, i17, str3, str3, 0, str3, 59, str4, str5));
                return;
            }
            su4.r1 r1Var = new su4.r1();
            r1Var.f413066f = 78;
            com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel2 = this.f295245e;
            if (similarEmojiQueryModel2 == null || (str = similarEmojiQueryModel2.f193149d) == null) {
                str = "";
            }
            r1Var.f413062b = str;
            r1Var.f413064d = 256;
            r1Var.f413068h = 1;
            r1Var.f413063c = this.f295246f;
            r1Var.f413082v = this.f295248h;
            java.lang.String str6 = this.f295249i;
            r1Var.f413067g = str6;
            r1Var.f413085y = str6;
            ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
            gm0.j1.d().g(new su4.n1(r1Var));
        }
    }

    public final boolean c() {
        com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel = this.f295245e;
        if (similarEmojiQueryModel != null) {
            return similarEmojiQueryModel.a();
        }
        return false;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
            boolean z17 = m1Var instanceof su4.q1;
            java.util.LinkedList linkedList = this.f295251n;
            if (z17) {
                ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
                java.lang.String str2 = ((su4.q1) m1Var).f413049o.f374929d;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str2 == null) {
                    str2 = "";
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                    this.f295246f = jSONObject.optInt("offset", 0);
                    jSONObject.optInt("totalCount", 0);
                    this.f295250m = jSONObject.optBoolean("continueFlag", false);
                    java.lang.String optString = jSONObject.optString("searchID");
                    kotlin.jvm.internal.o.f(optString, "optString(...)");
                    this.f295249i = optString;
                    org.json.JSONArray optJSONArray = jSONObject.optJSONArray("items");
                    if ((!linkedList.isEmpty()) && ((ir.g) kz5.n0.i0(linkedList)).f293837c == 104) {
                        linkedList.remove(kz5.n0.i0(linkedList));
                    }
                    if (optJSONArray == null) {
                        optJSONArray = new org.json.JSONArray();
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.SimilarEmoji", "similar get more emoji size:" + optJSONArray.length());
                    int length = optJSONArray.length();
                    for (int i19 = 0; i19 < length; i19++) {
                        org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i19);
                        ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).getClass();
                        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
                        ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).wi("MicroMsg.SimilarEmoji", jSONObject2, emojiInfo);
                        linkedList.add(new ir.g(emojiInfo, 103, null, 0, 12, null));
                    }
                    if (this.f295250m) {
                        ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).getClass();
                        linkedList.add(new ir.g(new com.tencent.mm.storage.emotion.EmojiInfo(), 104, null, 0, 12, null));
                    }
                } catch (java.lang.Exception unused) {
                }
            } else {
                ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
                if (m1Var instanceof su4.n1) {
                    this.f295247g++;
                    ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
                    try {
                        java.lang.String str3 = ((su4.n1) m1Var).f413014f.f369877f;
                        if (str3 == null) {
                            str3 = "{}";
                        }
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject(str3);
                        this.f295246f = jSONObject3.optInt("offset", 0);
                        this.f295250m = jSONObject3.optInt("continueFlag", 0) == 1;
                        java.lang.String optString2 = jSONObject3.optString("searchID", "");
                        kotlin.jvm.internal.o.f(optString2, "optString(...)");
                        this.f295249i = optString2;
                        org.json.JSONObject optJSONObject = jSONObject3.optJSONArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA).optJSONObject(0);
                        optJSONObject.optInt("totalCount", 0);
                        org.json.JSONArray optJSONArray2 = optJSONObject.optJSONArray("items");
                        if ((!linkedList.isEmpty()) && ((ir.g) kz5.n0.i0(linkedList)).f293837c == 104) {
                            linkedList.removeLast();
                        }
                        if (optJSONArray2 == null) {
                            optJSONArray2 = new org.json.JSONArray();
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.SimilarEmoji", "websearch get more emoji size:" + optJSONArray2.length());
                        int length2 = optJSONArray2.length();
                        for (int i27 = 0; i27 < length2; i27++) {
                            org.json.JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i27);
                            if (optJSONObject2 != null) {
                                ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).getClass();
                                com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = new com.tencent.mm.storage.emotion.EmojiInfo();
                                ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).wi("MicroMsg.SimilarEmoji", optJSONObject2, emojiInfo2);
                                java.lang.String optString3 = optJSONObject2.optString("docID", "");
                                kotlin.jvm.internal.o.f(optString3, "optString(...)");
                                linkedList.add(new ir.g(emojiInfo2, 103, optString3, this.f295247g));
                            }
                        }
                        if (this.f295250m) {
                            ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).getClass();
                            linkedList.add(new ir.g(new com.tencent.mm.storage.emotion.EmojiInfo(), 104, null, 0, 12, null));
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SimilarEmoji", e17, "resultObj", new java.lang.Object[0]);
                    }
                }
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f295244d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i17, i18, str, m1Var);
        }
    }
}
