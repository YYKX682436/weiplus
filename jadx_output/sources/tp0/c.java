package tp0;

/* loaded from: classes7.dex */
public abstract class c extends tp0.e {
    @Override // tp0.e
    public void w(org.json.JSONObject data, jc3.m coverViewDelegate) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(coverViewDelegate, "coverViewDelegate");
        super.w(data, coverViewDelegate);
        z(data, coverViewDelegate, new tp0.b(this, data, coverViewDelegate));
    }

    public abstract void z(org.json.JSONObject jSONObject, jc3.m mVar, yz5.l lVar);
}
