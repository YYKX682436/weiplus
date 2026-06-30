package ra3;

/* loaded from: classes9.dex */
public final class v implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f393538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f393539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f393540f;

    public v(org.json.JSONArray jSONArray, android.content.Context context, yz5.l lVar) {
        this.f393538d = jSONArray;
        this.f393539e = context;
        this.f393540f = lVar;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String stringExtra;
        if (i18 == -1 && i17 == 1001 && intent != null && (stringExtra = intent.getStringExtra("Select_Conv_User")) != null) {
            java.util.List f07 = r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null);
            org.json.JSONArray jSONArray = this.f393538d;
            android.content.Context context = this.f393539e;
            yz5.l lVar = this.f393540f;
            try {
                boolean has = jSONArray.getJSONObject(0).has("fileId");
                ra3.b0 b0Var = ra3.b0.f393489a;
                if (has) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
                    int length = jSONArray.length();
                    for (int i19 = 0; i19 < length; i19++) {
                        java.lang.Object obj = jSONArray.get(i19);
                        kotlin.jvm.internal.o.f(obj, "get(...)");
                        arrayList.add(ra3.u.f393531g.a((org.json.JSONObject) obj));
                    }
                    ra3.b0.b(b0Var, f07, arrayList);
                }
                if (jSONArray.getJSONObject(0).has(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH)) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(jSONArray.length());
                    int length2 = jSONArray.length();
                    for (int i27 = 0; i27 < length2; i27++) {
                        java.lang.Object obj2 = jSONArray.get(i27);
                        kotlin.jvm.internal.o.f(obj2, "get(...)");
                        org.json.JSONObject jSONObject = (org.json.JSONObject) obj2;
                        java.lang.String string = jSONObject.getString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        java.lang.String string2 = jSONObject.getString("fileExt");
                        kotlin.jvm.internal.o.f(string2, "getString(...)");
                        java.lang.String string3 = jSONObject.getString(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME);
                        kotlin.jvm.internal.o.f(string3, "getString(...)");
                        ra3.s sVar = new ra3.s(string, string2, string3);
                        java.lang.String str = (java.lang.String) lVar.invoke(sVar.f393529a);
                        kotlin.jvm.internal.o.g(str, "<set-?>");
                        sVar.f393529a = str;
                        arrayList2.add(sVar);
                    }
                    ra3.b0.a(b0Var, f07, arrayList2);
                }
                int i28 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.d(com.tencent.mm.R.string.fw6);
                e4Var.b(com.tencent.mm.R.raw.icons_filled_check_mark);
                e4Var.c();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("LiteAppSendFileMessageUtil", e17.getMessage() + ": " + jz5.a.b(e17));
            }
        }
    }
}
