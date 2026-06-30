package dd;

/* loaded from: classes9.dex */
public final class b extends com.tencent.kinda.gen.VoidCallback {

    /* renamed from: a, reason: collision with root package name */
    public final bd.e f228870a;

    public b(bd.e eVar) {
        this.f228870a = eVar;
    }

    @Override // com.tencent.kinda.gen.VoidCallback
    public void call() {
        bd.e eVar = this.f228870a;
        if (eVar != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.putOpt("type", "delay");
            eVar.a(dd.c.j(dd.d.f228871a, jSONObject, null, 2, null), true, false);
        }
    }
}
