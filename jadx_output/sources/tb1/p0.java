package tb1;

/* loaded from: classes7.dex */
public class p0 extends gb1.i {
    private static final int CTRL_INDEX = 332;
    public static final java.lang.String NAME = "operateCamera";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f416919g;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            lVar.a(i17, o("fail:data is null or nil"));
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new tb1.q0(this, jSONObject, lVar, i17));
        }
    }
}
