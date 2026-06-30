package sd;

/* loaded from: classes8.dex */
public class j0 implements td.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.e f406608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sd.l0 f406609b;

    public j0(sd.l0 l0Var, sd.e eVar) {
        this.f406609b = l0Var;
        this.f406608a = eVar;
    }

    @Override // td.e
    public void a(td.d dVar) {
        sd.e eVar = this.f406608a;
        if (eVar == null) {
            com.tencent.mars.xlog.Log.e("Luggage.LuggageRuntime", "Null Event, Ignore");
            return;
        }
        if (dVar == td.d.PASS) {
            od.l d17 = this.f406609b.d();
            java.lang.String b17 = eVar.b();
            org.json.JSONObject a17 = eVar.a();
            d17.getClass();
            d17.f344518c.a(new od.d(b17, a17));
        }
    }
}
