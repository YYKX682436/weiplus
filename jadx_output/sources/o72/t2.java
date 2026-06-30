package o72;

/* loaded from: classes12.dex */
public class t2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f343463a;

    /* renamed from: b, reason: collision with root package name */
    public final long f343464b;

    /* renamed from: c, reason: collision with root package name */
    public final int f343465c;

    /* renamed from: d, reason: collision with root package name */
    public int f343466d;

    /* renamed from: e, reason: collision with root package name */
    public int f343467e;

    /* renamed from: f, reason: collision with root package name */
    public final long f343468f;

    /* renamed from: g, reason: collision with root package name */
    public int f343469g;

    /* renamed from: h, reason: collision with root package name */
    public int f343470h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f343471i = -1;

    public t2(dm.n3 n3Var) {
        r45.jq0 jq0Var;
        int i17 = n3Var.field_type;
        this.f343463a = i17;
        this.f343464b = n3Var.field_id;
        r45.bq0 bq0Var = n3Var.field_favProto;
        if (bq0Var != null && (jq0Var = bq0Var.f370962d) != null) {
            this.f343465c = jq0Var.f378034d;
        }
        this.f343468f = n3Var.field_updateTime;
        java.util.Map map = o72.v2.f343502a;
        this.f343467e = i17 == 8 ? 1 : i17 == 5 ? (bq0Var == null || bq0Var.K == null) ? 3 : 2 : 0;
    }

    public java.lang.String toString() {
        return java.lang.String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", java.lang.Integer.valueOf(this.f343463a), 0, java.lang.Long.valueOf(this.f343464b), "", java.lang.Integer.valueOf(this.f343465c), 0, java.lang.Integer.valueOf(this.f343466d), 0, 0, 0, java.lang.Integer.valueOf(this.f343467e), java.lang.Long.valueOf(this.f343468f), java.lang.Integer.valueOf(this.f343469g), java.lang.Integer.valueOf(this.f343470h), java.lang.Integer.valueOf(this.f343471i));
    }
}
