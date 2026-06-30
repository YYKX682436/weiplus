package zv;

/* loaded from: classes.dex */
public final class c4 implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin f475926a;

    public c4(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin) {
        this.f475926a = flutterBrandEcsPlugin;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(err_msg, "err_msg");
        com.tencent.mars.xlog.Log.i(this.f475926a.f65189d, "openPublishPage success: " + z17 + ", err_msg: " + err_msg + ", extraInfo: " + jSONObject);
    }
}
