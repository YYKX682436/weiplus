package rd3;

/* loaded from: classes3.dex */
public final class a implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc3.a0 f394236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rd3.e f394237e;

    public a(lc3.a0 a0Var, rd3.e eVar) {
        this.f394236d = a0Var;
        this.f394237e = eVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        org.json.JSONArray optJSONArray = this.f394236d.optJSONArray("itemList");
        if (optJSONArray != null) {
            if (!(optJSONArray.length() > 0)) {
                optJSONArray = null;
            }
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                    if (optJSONObject != null) {
                        int optInt = optJSONObject.optInt("idx", 0);
                        java.lang.String str = "";
                        java.lang.String optString = optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
                        java.lang.String optString2 = optJSONObject.optString("lightColor", "");
                        java.lang.String optString3 = optJSONObject.optString("darkColor", "");
                        this.f394237e.getClass();
                        if (com.tencent.mm.ui.bk.C()) {
                            if (optString3 != null) {
                                str = optString3;
                            }
                        } else if (optString2 != null) {
                            str = optString2;
                        }
                        int parseColor = android.graphics.Color.parseColor(str);
                        int argb = android.graphics.Color.argb(android.graphics.Color.alpha(parseColor), android.graphics.Color.red(parseColor), android.graphics.Color.green(parseColor), android.graphics.Color.blue(parseColor));
                        g4Var.d(optInt, argb, optString);
                        com.tencent.mars.xlog.Log.i("MBJsApiShowActionSheet", "itemIdx: " + optInt + ", itemTitle: " + optString + ", itemlightColor: " + optString2 + ", itemdarkColor: " + optString3 + ", itemColor: " + argb + ", isDarkMode: " + com.tencent.mm.ui.bk.C());
                    }
                }
            }
        }
    }
}
