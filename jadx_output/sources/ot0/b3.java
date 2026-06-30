package ot0;

/* loaded from: classes5.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f348404a;

    /* renamed from: b, reason: collision with root package name */
    public final int f348405b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f348406c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f348407d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f348408e;

    public b3(boolean z17, int i17, java.util.List columnNames, java.util.List columnTypes, java.util.List columnValues) {
        kotlin.jvm.internal.o.g(columnNames, "columnNames");
        kotlin.jvm.internal.o.g(columnTypes, "columnTypes");
        kotlin.jvm.internal.o.g(columnValues, "columnValues");
        this.f348404a = z17;
        this.f348405b = i17;
        this.f348406c = columnNames;
        this.f348407d = columnTypes;
        this.f348408e = columnValues;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot0.b3)) {
            return false;
        }
        ot0.b3 b3Var = (ot0.b3) obj;
        return this.f348404a == b3Var.f348404a && this.f348405b == b3Var.f348405b && kotlin.jvm.internal.o.b(this.f348406c, b3Var.f348406c) && kotlin.jvm.internal.o.b(this.f348407d, b3Var.f348407d) && kotlin.jvm.internal.o.b(this.f348408e, b3Var.f348408e);
    }

    public int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.f348404a) * 31) + java.lang.Integer.hashCode(this.f348405b)) * 31) + this.f348406c.hashCode()) * 31) + this.f348407d.hashCode()) * 31) + this.f348408e.hashCode();
    }

    public java.lang.String toString() {
        return "CursorFirstRowData(hasData=" + this.f348404a + ", columnCount=" + this.f348405b + ", columnNames=" + this.f348406c + ", columnTypes=" + this.f348407d + ", columnValues=" + this.f348408e + ')';
    }
}
