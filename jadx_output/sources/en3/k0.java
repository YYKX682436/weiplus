package en3;

/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f255306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f255307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f255308f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255309g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255310h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255311i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f255312m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(en3.l0 l0Var, int i17, int i18, int i19, java.lang.String str, java.lang.String str2, java.lang.String str3, yz5.l lVar) {
        super(1);
        this.f255306d = i17;
        this.f255307e = i18;
        this.f255308f = i19;
        this.f255309g = str;
        this.f255310h = str2;
        this.f255311i = str3;
        this.f255312m = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        yz5.l lVar = this.f255312m;
        if (finderObject != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("bizuin", this.f255306d);
            jSONObject.put("mid", this.f255307e);
            jSONObject.put("idx", this.f255308f);
            jSONObject.put(dm.i4.COL_ID, this.f255309g);
            jSONObject.put("fid", this.f255310h);
            jSONObject.put("action", this.f255311i);
            nv2.o oVar = nv2.o.f340558e;
            jSONObject.put("praiseStatus", oVar.c(finderObject) ? 1 : 0);
            jSONObject.put("praiseNum", oVar.b(finderObject));
            lVar.invoke(jSONObject.toString());
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            lVar.invoke(null);
        }
        return f0Var2;
    }
}
