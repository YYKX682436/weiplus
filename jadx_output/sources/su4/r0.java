package su4;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f413055a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f413056b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f413057c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f413058d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f413059e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f413060f;

    public r0(java.lang.String userName, java.lang.String matchWord, java.lang.String nickName, java.lang.String remark, java.lang.String alias, java.lang.String desc) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(matchWord, "matchWord");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        kotlin.jvm.internal.o.g(remark, "remark");
        kotlin.jvm.internal.o.g(alias, "alias");
        kotlin.jvm.internal.o.g(desc, "desc");
        this.f413055a = userName;
        this.f413056b = matchWord;
        this.f413057c = nickName;
        this.f413058d = remark;
        this.f413059e = alias;
        this.f413060f = desc;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("userName", this.f413055a);
        jSONObject.put("matchWord", this.f413056b);
        jSONObject.put("nickName", this.f413057c);
        jSONObject.put("remark", this.f413058d);
        jSONObject.put("alias", this.f413059e);
        jSONObject.put("desc", this.f413060f);
        return jSONObject;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su4.r0)) {
            return false;
        }
        su4.r0 r0Var = (su4.r0) obj;
        return kotlin.jvm.internal.o.b(this.f413055a, r0Var.f413055a) && kotlin.jvm.internal.o.b(this.f413056b, r0Var.f413056b) && kotlin.jvm.internal.o.b(this.f413057c, r0Var.f413057c) && kotlin.jvm.internal.o.b(this.f413058d, r0Var.f413058d) && kotlin.jvm.internal.o.b(this.f413059e, r0Var.f413059e) && kotlin.jvm.internal.o.b(this.f413060f, r0Var.f413060f);
    }

    public int hashCode() {
        return (((((((((this.f413055a.hashCode() * 31) + this.f413056b.hashCode()) * 31) + this.f413057c.hashCode()) * 31) + this.f413058d.hashCode()) * 31) + this.f413059e.hashCode()) * 31) + this.f413060f.hashCode();
    }

    public java.lang.String toString() {
        return "FTSMatchUserItem(userName=" + this.f413055a + ", matchWord=" + this.f413056b + ", nickName=" + this.f413057c + ", remark=" + this.f413058d + ", alias=" + this.f413059e + ", desc=" + this.f413060f + ')';
    }
}
