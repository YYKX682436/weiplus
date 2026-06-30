package p75;

/* loaded from: classes3.dex */
public abstract class t extends p75.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f352690a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f352691b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f352692c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f352693d;

    public t(java.lang.String column, boolean z17, java.util.List values) {
        kotlin.jvm.internal.o.g(column, "column");
        kotlin.jvm.internal.o.g(values, "values");
        this.f352690a = column;
        this.f352691b = z17;
        this.f352692c = values;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(values, 10));
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add("?");
        }
        this.f352693d = arrayList;
    }

    @Override // p75.r
    public java.lang.String b() {
        java.lang.String g07 = kz5.n0.g0(this.f352693d, ",", null, null, 0, null, null, 62, null);
        boolean z17 = this.f352691b;
        java.lang.String str = this.f352690a;
        if (z17) {
            return str + " NOT IN (" + g07 + ')';
        }
        return str + " IN (" + g07 + ')';
    }

    @Override // p75.r
    public java.lang.String[] e() {
        return (java.lang.String[]) this.f352692c.toArray(new java.lang.String[0]);
    }
}
