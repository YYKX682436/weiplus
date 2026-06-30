package nw4;

/* loaded from: classes.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f340931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340933f;

    public o(nw4.n nVar, android.os.Bundle bundle, java.lang.String str) {
        this.f340933f = nVar;
        this.f340931d = bundle;
        this.f340932e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.y2 y2Var = new nw4.y2();
        java.util.HashMap hashMap = new java.util.HashMap();
        y2Var.f340790a = hashMap;
        android.os.Bundle bundle = this.f340931d;
        hashMap.put("link", bundle.getString("link"));
        y2Var.f340790a.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, bundle.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE));
        y2Var.f340790a.put("desc", bundle.getString("desc"));
        y2Var.f340790a.put("appid", bundle.getString("appid"));
        y2Var.f341014d = new org.json.JSONObject();
        y2Var.f340790a.put("img_url", bundle.getString("img_url"));
        y2Var.f340790a.put("use_update_jsapi_data", java.lang.Boolean.valueOf(bundle.getBoolean("use_update_jsapi_data")));
        y2Var.f341012b = "call";
        y2Var.f341013c = "";
        y2Var.f341019i = this.f340932e;
        nw4.n nVar = this.f340933f;
        nVar.f340891e.add(y2Var);
        nVar.l();
    }
}
