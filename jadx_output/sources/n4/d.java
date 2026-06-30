package n4;

/* loaded from: classes8.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f334863a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f334864b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f334865c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f334866d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f334867e;

    public d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, java.util.List list2) {
        this.f334863a = str;
        this.f334864b = str2;
        this.f334865c = str3;
        this.f334866d = java.util.Collections.unmodifiableList(list);
        this.f334867e = java.util.Collections.unmodifiableList(list2);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n4.d.class != obj.getClass()) {
            return false;
        }
        n4.d dVar = (n4.d) obj;
        if (this.f334863a.equals(dVar.f334863a) && this.f334864b.equals(dVar.f334864b) && this.f334865c.equals(dVar.f334865c) && this.f334866d.equals(dVar.f334866d)) {
            return this.f334867e.equals(dVar.f334867e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f334863a.hashCode() * 31) + this.f334864b.hashCode()) * 31) + this.f334865c.hashCode()) * 31) + this.f334866d.hashCode()) * 31) + this.f334867e.hashCode();
    }

    public java.lang.String toString() {
        return "ForeignKey{referenceTable='" + this.f334863a + "', onDelete='" + this.f334864b + "', onUpdate='" + this.f334865c + "', columnNames=" + this.f334866d + ", referenceColumnNames=" + this.f334867e + '}';
    }
}
