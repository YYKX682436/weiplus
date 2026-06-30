package z43;

/* loaded from: classes8.dex */
public class n0 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String appId = jSONObject.optString("appId");
        java.lang.String optString = jSONObject.optString("actId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(appId) || com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            this.f143443f.a("appId or actId is null");
            return;
        }
        ((vz.x1) i95.n0.c(vz.x1.class)).getClass();
        android.content.Context context = c();
        z43.m0 m0Var = new z43.m0(this);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        c02.l lVar2 = new c02.l();
        lVar2.f37605d = appId;
        lVar.f70664a = lVar2;
        lVar.f70665b = new c02.m();
        lVar.f70666c = "/cgi-bin/mmgame-bin/getcloudgamedownloadinfo";
        lVar.f70667d = 4786;
        com.tencent.mm.ipcinvoker.wx_extension.h0.a(lVar.a(), new k02.q(m0Var, context, optString, appId, 1));
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
