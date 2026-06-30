package we2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f445218a;

    /* renamed from: b, reason: collision with root package name */
    public int f445219b;

    /* renamed from: c, reason: collision with root package name */
    public we2.b f445220c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f445221d = "";

    public java.lang.String toString() {
        java.lang.Object obj;
        r45.r71 r71Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderGetLiveMsgRespWrapper: errCode:");
        sb6.append(this.f445218a);
        sb6.append(",errType:");
        sb6.append(this.f445219b);
        sb6.append(",resp:");
        we2.b bVar = this.f445220c;
        if (bVar == null || (r71Var = bVar.f445214a) == null || (obj = pm0.b0.g(r71Var)) == null) {
            obj = "";
        }
        sb6.append(obj);
        sb6.append(",reqVisitorRoleType:");
        we2.b bVar2 = this.f445220c;
        sb6.append(bVar2 != null ? java.lang.Integer.valueOf(bVar2.f445215b) : null);
        sb6.append(",uniqueId:");
        sb6.append(this.f445221d);
        sb6.append(',');
        return sb6.toString();
    }
}
