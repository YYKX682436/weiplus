package zc1;

/* loaded from: classes7.dex */
public class d extends yc1.b {
    public static final int CTRL_INDEX = 269;
    public static final java.lang.String NAME = "createDownloadTask";

    /* renamed from: h, reason: collision with root package name */
    public final zc1.c f471402h;

    public d(uh1.e eVar) {
        this.f471402h = C(eVar);
    }

    public zc1.c C(uh1.e eVar) {
        return new zc1.c(eVar, this.f460761g);
    }

    @Override // gb1.m
    public java.lang.String a() {
        this.f471402h.getClass();
        return "downloadTaskId";
    }

    @Override // gb1.m
    public void d(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, java.lang.String str) {
        this.f471402h.d(lVar, jSONObject, str);
    }

    @Override // gb1.m
    public java.lang.String getTaskId() {
        return this.f471402h.getTaskId();
    }
}
