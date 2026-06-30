package z81;

/* loaded from: classes13.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f470710a = new java.util.HashMap();

    public h() {
        a(new a91.g0());
        a(new a91.s());
        a(new a91.h0());
        a(new a91.x());
        a(new a91.m());
        a(new a91.a());
        a(new a91.j());
        a(new a91.e());
        a(new a91.n());
        a(new a91.k());
        a(new a91.h());
        a(new a91.f0());
        a(new a91.l());
        a(new a91.i());
        a(new a91.c());
        a(new a91.b());
        a(new a91.i0());
        a(new a91.j0());
        a(new a91.z());
        a(new a91.c0());
        a(new a91.d0());
        a(new a91.e0());
        a(new a91.u());
        a(new a91.a0());
        a(new a91.v());
        a(new a91.w());
        a(new a91.t());
        a(new a91.b0());
        a(new a91.k0());
        a(new a91.y());
        a(new a91.r());
        a(new a91.p());
        a(new a91.m0());
        a(new a91.q());
        a(new a91.o());
        a(new a91.l0());
    }

    public final void a(a91.d dVar) {
        if (dVar == null) {
            return;
        }
        this.f470710a.put(dVar.getMethod(), dVar);
    }

    public boolean b(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString(ya.b.METHOD);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        a91.d dVar = (a91.d) ((java.util.HashMap) this.f470710a).get(optString);
        if (dVar == null) {
            return false;
        }
        return dVar.a(iVar, canvas, optJSONArray);
    }
}
