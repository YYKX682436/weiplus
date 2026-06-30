package sd;

/* loaded from: classes8.dex */
public class k0 implements td.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f406615b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sd.l0 f406616c;

    public k0(sd.l0 l0Var, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f406616c = l0Var;
        this.f406614a = str;
        this.f406615b = jSONObject;
    }

    @Override // td.e
    public void a(td.d dVar) {
        if (dVar == td.d.PASS) {
            od.l d17 = this.f406616c.d();
            d17.getClass();
            d17.f344518c.a(new od.d(this.f406614a, this.f406615b));
        }
    }
}
