package d22;

/* loaded from: classes15.dex */
public final class l0 implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.lite.s f225857a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f225858b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f225859c;

    /* renamed from: d, reason: collision with root package name */
    public int f225860d;

    /* renamed from: e, reason: collision with root package name */
    public int f225861e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f225862f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f225863g;

    /* renamed from: h, reason: collision with root package name */
    public int f225864h;

    public l0(com.tencent.mm.plugin.lite.s store, java.lang.String pid) {
        kotlin.jvm.internal.o.g(store, "store");
        kotlin.jvm.internal.o.g(pid, "pid");
        this.f225857a = store;
        this.f225858b = "MicroMsg.emoji.MMEmotionStoreDetailLiteAppLogic";
        this.f225859c = "";
        this.f225862f = "";
        this.f225863g = "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.tencent.mm.plugin.lite.r
    public boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        java.lang.String str2;
        if (str != null) {
            str2 = str.substring(12);
            kotlin.jvm.internal.o.f(str2, "substring(...)");
        } else {
            str2 = null;
        }
        java.lang.String str3 = this.f225858b;
        com.tencent.mars.xlog.Log.i(str3, "store action: " + str2 + " with data: " + obj);
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -2053980658:
                    if (str2.equals("installFinish")) {
                        com.tencent.mars.xlog.Log.i(str3, "installFinish: " + obj);
                        return true;
                    }
                    break;
                case -1914266481:
                    if (str2.equals("reportEmoticonStoreActionIfNeeded")) {
                        com.tencent.mars.xlog.Log.i(str3, "reportEmoticonStoreActionIfNeeded: " + obj);
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
                        com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct b17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.b();
                        b17.u(this.f225859c);
                        b17.f56072f = ((org.json.JSONObject) obj).getInt("action");
                        b17.f56071e = this.f225864h;
                        b17.f56077k = this.f225860d;
                        b17.f56078l = this.f225861e;
                        b17.s(this.f225862f);
                        b17.v(this.f225863g);
                        b17.k();
                        return true;
                    }
                    break;
                case -1540952043:
                    if (str2.equals("uninstallFinish")) {
                        com.tencent.mars.xlog.Log.i(str3, "uninstallFinish: " + obj);
                        return true;
                    }
                    break;
                case -537567105:
                    if (str2.equals("isRewardClose")) {
                        com.tencent.mars.xlog.Log.i(str3, "isRewardClose: " + obj);
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("isClose", ((((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EmotionRewardOption", 0) & 1) != 1 ? 1 : 0) ^ 1);
                        this.f225857a.c(j17, i17, jSONObject.toString());
                        return true;
                    }
                    break;
                case 1906768663:
                    if (str2.equals("updateAlbumDetail")) {
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
                        org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj;
                        java.lang.String string = jSONObject2.getString("pid");
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        this.f225859c = string;
                        this.f225860d = jSONObject2.getInt("thirdPartyLinkId");
                        this.f225861e = jSONObject2.getInt("thirdPartyLinkStatus");
                        java.lang.String string2 = jSONObject2.getString("thirdPartyLinkReportInfo");
                        kotlin.jvm.internal.o.f(string2, "getString(...)");
                        this.f225862f = string2;
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
