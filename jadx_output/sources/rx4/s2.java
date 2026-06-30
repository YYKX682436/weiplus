package rx4;

/* loaded from: classes8.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public final vu4.a f401272a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f401273b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f401274c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f401275d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f401276e;

    public s2(vu4.a actionId, java.lang.String itemInfo, java.lang.String docInfo, boolean z17, java.util.Map extInfo) {
        kotlin.jvm.internal.o.g(actionId, "actionId");
        kotlin.jvm.internal.o.g(itemInfo, "itemInfo");
        kotlin.jvm.internal.o.g(docInfo, "docInfo");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        this.f401272a = actionId;
        this.f401273b = itemInfo;
        this.f401274c = docInfo;
        this.f401275d = z17;
        this.f401276e = extInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx4.s2)) {
            return false;
        }
        rx4.s2 s2Var = (rx4.s2) obj;
        return this.f401272a == s2Var.f401272a && kotlin.jvm.internal.o.b(this.f401273b, s2Var.f401273b) && kotlin.jvm.internal.o.b(this.f401274c, s2Var.f401274c) && this.f401275d == s2Var.f401275d && kotlin.jvm.internal.o.b(this.f401276e, s2Var.f401276e);
    }

    public int hashCode() {
        return (((((((this.f401272a.hashCode() * 31) + this.f401273b.hashCode()) * 31) + this.f401274c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f401275d)) * 31) + this.f401276e.hashCode();
    }

    public java.lang.String toString() {
        return "Report26897Item(actionId=" + this.f401272a + ", itemInfo=" + this.f401273b + ", docInfo=" + this.f401274c + ", isCache=" + this.f401275d + ", extInfo=" + this.f401276e + ')';
    }

    public /* synthetic */ s2(vu4.a aVar, java.lang.String str, java.lang.String str2, boolean z17, java.util.Map map, int i17, kotlin.jvm.internal.i iVar) {
        this(aVar, str, str2, z17, (i17 & 16) != 0 ? kz5.q0.f314001d : map);
    }
}
