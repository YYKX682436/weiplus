package rs0;

/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f399312a;

    /* renamed from: b, reason: collision with root package name */
    public final int f399313b;

    /* renamed from: c, reason: collision with root package name */
    public final int f399314c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f399315d;

    public q(int i17, int i18, int i19, java.lang.Integer num) {
        this.f399312a = i17;
        this.f399313b = i18;
        this.f399314c = i19;
        this.f399315d = num;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs0.q)) {
            return false;
        }
        rs0.q qVar = (rs0.q) obj;
        return this.f399312a == qVar.f399312a && this.f399313b == qVar.f399313b && this.f399314c == qVar.f399314c && kotlin.jvm.internal.o.b(this.f399315d, qVar.f399315d);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f399312a) * 31) + java.lang.Integer.hashCode(this.f399313b)) * 31) + java.lang.Integer.hashCode(this.f399314c)) * 31;
        java.lang.Integer num = this.f399315d;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public java.lang.String toString() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("colorRange", this.f399312a);
        jSONObject.put("colorStandard", this.f399313b);
        jSONObject.put("colorTransfer", this.f399314c);
        java.lang.Integer num = this.f399315d;
        if (num != null) {
            jSONObject.put("ffmpegColorPrimaries", num.intValue());
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }
}
