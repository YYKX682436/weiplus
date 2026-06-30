package e95;

/* loaded from: classes12.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f250462a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f250463b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f250464c;

    public u(java.util.List list, java.lang.String[] columnNames, java.lang.String sql) {
        kotlin.jvm.internal.o.g(columnNames, "columnNames");
        kotlin.jvm.internal.o.g(sql, "sql");
        this.f250462a = list;
        this.f250463b = columnNames;
        this.f250464c = sql;
    }

    public java.lang.String toString() {
        return "WCDBNewQuery: " + this.f250464c;
    }
}
