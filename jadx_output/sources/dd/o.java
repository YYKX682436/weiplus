package dd;

/* loaded from: classes9.dex */
public final class o extends com.tencent.kinda.gen.VoidCallback {

    /* renamed from: a, reason: collision with root package name */
    public final bd.e f228886a;

    public o(bd.e eVar) {
        this.f228886a = eVar;
    }

    @Override // com.tencent.kinda.gen.VoidCallback
    public void call() {
        bd.e eVar = this.f228886a;
        if (eVar != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.putOpt("type", "shake");
            eVar.a(dd.c.j(dd.d.f228871a, jSONObject, null, 2, null), true, false);
        }
    }
}
