package uo4;

/* loaded from: classes10.dex */
public final class c extends uo4.b {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f429680c = "";

    @Override // uo4.b, t85.a
    public org.json.JSONObject b() {
        org.json.JSONObject b17 = super.b();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f429680c)) {
            b17.put("font", this.f429680c);
        }
        return b17;
    }
}
