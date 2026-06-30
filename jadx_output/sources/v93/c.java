package v93;

/* loaded from: classes9.dex */
public final class c implements qg0.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v93.d f434161a;

    public c(v93.d dVar) {
        this.f434161a = dVar;
    }

    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsapiOpenYuanbaoGenImage", "open failed, errorMsg: " + str);
        com.tencent.mm.plugin.lite.api.o oVar = this.f434161a.f143443f;
        if (str == null) {
            str = "open failed";
        }
        oVar.a(str);
    }
}
