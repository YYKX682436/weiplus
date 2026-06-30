package tp0;

/* loaded from: classes7.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tp0.c f421010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f421011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jc3.m f421012f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(tp0.c cVar, org.json.JSONObject jSONObject, jc3.m mVar) {
        super(1);
        this.f421010d = cVar;
        this.f421011e = jSONObject;
        this.f421012f = mVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        lc3.r rVar;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        tp0.c cVar = this.f421010d;
        if (obj != null) {
            lc3.s sVar = (lc3.s) cVar.f317890a;
            org.json.JSONObject jSONObject = this.f421011e;
            if (sVar != null && (rVar = sVar.f317919d) != null) {
                rVar.a(cVar.v(jSONObject), obj);
            }
            jc3.m mVar = this.f421012f;
            mVar.e(obj, mVar.a(jSONObject), new tp0.a(cVar, obj, jSONObject, mVar));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseCoverViewInsert", "hy: failed to create view!");
            cVar.u(lc3.v.f317932d);
        }
        return f0Var2;
    }
}
