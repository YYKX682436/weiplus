package jd3;

/* loaded from: classes7.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jd3.g f299172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lc3.h0 f299173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f299174f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f299175g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(jd3.g gVar, lc3.h0 h0Var, org.json.JSONArray jSONArray, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f299172d = gVar;
        this.f299173e = h0Var;
        this.f299174f = jSONArray;
        this.f299175g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jd3.c(this.f299172d, this.f299173e, this.f299174f, this.f299175g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jd3.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        jd3.g gVar = this.f299172d;
        lc3.h0 h0Var = this.f299173e;
        org.json.JSONObject jSONObject = this.f299174f.getJSONObject(this.f299175g);
        kotlin.jvm.internal.o.f(jSONObject, "getJSONObject(...)");
        gVar.getClass();
        java.lang.String optString = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        java.lang.String optString2 = jSONObject.optString("entry");
        java.lang.String optString3 = jSONObject.optString("customName");
        java.lang.String optString4 = jSONObject.optString("prefix");
        java.lang.String optString5 = jSONObject.optString("context");
        try {
            com.tencent.mm.plugin.magicbrush.d4 d4Var = (com.tencent.mm.plugin.magicbrush.d4) i95.n0.c(com.tencent.mm.plugin.magicbrush.d4.class);
            java.lang.String str = gVar.e().f344331a;
            kotlin.jvm.internal.o.d(optString);
            java.lang.String Bi = ((com.tencent.mm.plugin.magicbrush.m5) d4Var).Bi(str, optString);
            com.tencent.mars.xlog.Log.i("MBJsApiInjectJsFiles", "injectFiles path:[" + optString + "] context:[" + optString5 + "] entry[" + optString2 + "] wxaPhysical:[" + Bi + ']');
            if (Bi.length() == 0) {
                return jd3.a.f299160f;
            }
            com.tencent.mm.plugin.magicbrush.d4 d4Var2 = (com.tencent.mm.plugin.magicbrush.d4) i95.n0.c(com.tencent.mm.plugin.magicbrush.d4.class);
            java.lang.String str2 = gVar.e().f344331a;
            kotlin.jvm.internal.o.d(optString3);
            com.tencent.mm.plugin.appbrand.appstorage.u1 Ai = ((com.tencent.mm.plugin.magicbrush.m5) d4Var2).Ai(str2, Bi, optString3, optString4);
            ik1.b0 b0Var = new ik1.b0();
            com.tencent.mm.plugin.appbrand.appstorage.j1 readFile = Ai != null ? ((com.tencent.mm.plugin.magicbrush.fs.l) Ai).readFile(optString2, b0Var) : null;
            com.tencent.mars.xlog.Log.i("MBJsApiInjectJsFiles", "readFile result is:" + readFile);
            if (readFile != com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
                return jd3.a.f299161g;
            }
            ae3.b bVar = ae3.b.f4349a;
            java.lang.Object value = b0Var.f291824a;
            kotlin.jvm.internal.o.f(value, "value");
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) value;
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            h0Var.E0(new java.lang.String(bArr, r26.c.f368865a), jd3.d.f299176a);
            return jd3.a.f299159e;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("MBJsApiInjectJsFiles", "injectFiles error fileSystem nil wxaPath:" + optString + " entry:" + optString2);
            return jd3.a.f299162h;
        }
    }
}
