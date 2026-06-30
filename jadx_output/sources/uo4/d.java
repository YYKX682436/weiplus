package uo4;

/* loaded from: classes10.dex */
public final class d extends t85.a {

    /* renamed from: a, reason: collision with root package name */
    public int f429681a;

    /* renamed from: b, reason: collision with root package name */
    public int f429682b;

    /* renamed from: c, reason: collision with root package name */
    public int f429683c;

    @Override // t85.a
    public org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f429681a);
        sb6.append('K');
        jSONObject.put("pss", sb6.toString());
        jSONObject.put("thumbCount", this.f429682b);
        jSONObject.put("thumbMem", com.tencent.mm.sdk.platformtools.t8.h0(this.f429683c));
        return jSONObject;
    }
}
