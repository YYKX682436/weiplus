package fh1;

/* loaded from: classes7.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh1.z f262582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f262583e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262584f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f262585g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f262586h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(fh1.z zVar, int i17, java.lang.String str, int i18, int i19) {
        super(0);
        this.f262582d = zVar;
        this.f262583e = i17;
        this.f262584f = str;
        this.f262585g = i18;
        this.f262586h = i19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fh1.z zVar = this.f262582d;
        java.lang.String str = zVar.f262631e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onInsertFrame frameId:");
        int i17 = this.f262583e;
        sb6.append(i17);
        sb6.append(" extraData:");
        java.lang.String str2 = this.f262584f;
        sb6.append(str2);
        sb6.append(" width:");
        sb6.append(this.f262585g);
        sb6.append(" height:");
        sb6.append(this.f262586h);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        fh1.x0 a17 = zVar.a();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("frameId", i17);
        jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, str2);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        a17.G1("onInsertFrame", jSONObject2);
        return jz5.f0.f302826a;
    }
}
