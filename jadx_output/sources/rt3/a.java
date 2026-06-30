package rt3;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f399508a;

    /* renamed from: b, reason: collision with root package name */
    public final int f399509b;

    /* renamed from: c, reason: collision with root package name */
    public final int f399510c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f399511d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f399512e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.s46 f399513f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f399514g;

    public a(java.util.ArrayList templateList, int i17, int i18, com.tencent.mm.protobuf.g gVar, java.util.List list, r45.s46 s46Var, boolean z17) {
        kotlin.jvm.internal.o.g(templateList, "templateList");
        this.f399508a = templateList;
        this.f399509b = i17;
        this.f399510c = i18;
        this.f399511d = gVar;
        this.f399512e = list;
        this.f399513f = s46Var;
        this.f399514g = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt3.a)) {
            return false;
        }
        rt3.a aVar = (rt3.a) obj;
        return kotlin.jvm.internal.o.b(this.f399508a, aVar.f399508a) && this.f399509b == aVar.f399509b && this.f399510c == aVar.f399510c && kotlin.jvm.internal.o.b(this.f399511d, aVar.f399511d) && kotlin.jvm.internal.o.b(this.f399512e, aVar.f399512e) && kotlin.jvm.internal.o.b(this.f399513f, aVar.f399513f) && this.f399514g == aVar.f399514g;
    }

    public int hashCode() {
        int hashCode = ((((this.f399508a.hashCode() * 31) + java.lang.Integer.hashCode(this.f399509b)) * 31) + java.lang.Integer.hashCode(this.f399510c)) * 31;
        com.tencent.mm.protobuf.g gVar = this.f399511d;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        java.util.List list = this.f399512e;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        r45.s46 s46Var = this.f399513f;
        return ((hashCode3 + (s46Var != null ? s46Var.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f399514g);
    }

    public java.lang.String toString() {
        return "FinderTemplateDataRep(templateList=" + this.f399508a + ", maxAge=" + this.f399509b + ", continue_flag=" + this.f399510c + ", pageBuffer=" + this.f399511d + ", tabs=" + this.f399512e + ", curTab=" + this.f399513f + ", useFirstTemplate=" + this.f399514g + ')';
    }
}
