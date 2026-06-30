package kd1;

/* loaded from: classes7.dex */
public class d implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f306698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f306699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.b f306700f;

    public d(com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.b bVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f306700f = bVar;
        this.f306698d = lVar;
        this.f306699e = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null) {
            java.lang.String string = bundle.getString("IPCResultInfo");
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.JsApiSetCurrentPaySpeech", "onCallback() IPCResultInfo：%s", string);
            this.f306698d.a(this.f306699e, this.f306700f.o(string));
        }
    }
}
