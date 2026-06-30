package nf4;

/* loaded from: classes4.dex */
public final class h extends dm.y7 {

    /* renamed from: q, reason: collision with root package name */
    public static final l75.e0 f336853q = dm.y7.initAutoDBInfo(nf4.j.class);

    /* renamed from: p, reason: collision with root package name */
    public nf4.j f336854p = new nf4.j();

    @Override // dm.y7, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 info = f336853q;
        kotlin.jvm.internal.o.f(info, "info");
        return info;
    }

    public final java.lang.String t0() {
        java.lang.String field_date = this.field_date;
        kotlin.jvm.internal.o.f(field_date, "field_date");
        return field_date;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("StoryHistoryInfo[localId:");
        nf4.j jVar = this.f336854p;
        sb6.append(jVar != null ? java.lang.Integer.valueOf((int) jVar.systemRowid) : null);
        sb6.append(" date:");
        sb6.append(t0());
        sb6.append(" count:");
        sb6.append(this.field_count);
        sb6.append(']');
        return sb6.toString();
    }
}
