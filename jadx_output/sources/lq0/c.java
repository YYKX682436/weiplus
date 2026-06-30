package lq0;

/* loaded from: classes7.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lq0.d f320451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f320452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f320453f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(lq0.d dVar, org.json.JSONObject jSONObject, yz5.l lVar) {
        super(0);
        this.f320451d = dVar;
        this.f320452e = jSONObject;
        this.f320453f = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lq0.d dVar = this.f320451d;
        lc3.s sVar = (lc3.s) dVar.f317890a;
        if (sVar != null) {
            yz5.l lVar = this.f320453f;
            org.json.JSONObject jSONObject = this.f320452e;
            sVar.E0(jSONObject, new lq0.b(lVar, dVar, jSONObject));
        }
        return jz5.f0.f302826a;
    }
}
