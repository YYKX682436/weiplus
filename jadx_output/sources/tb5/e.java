package tb5;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f417044a;

    /* renamed from: b, reason: collision with root package name */
    public final long f417045b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f417046c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f417047d;

    /* renamed from: e, reason: collision with root package name */
    public final int f417048e;

    public e(int i17, long j17, java.lang.String itemClass, boolean z17, int i18) {
        kotlin.jvm.internal.o.g(itemClass, "itemClass");
        this.f417044a = i17;
        this.f417045b = j17;
        this.f417046c = itemClass;
        this.f417047d = z17;
        this.f417048e = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb5.e)) {
            return false;
        }
        tb5.e eVar = (tb5.e) obj;
        return this.f417044a == eVar.f417044a && this.f417045b == eVar.f417045b && kotlin.jvm.internal.o.b(this.f417046c, eVar.f417046c) && this.f417047d == eVar.f417047d && this.f417048e == eVar.f417048e;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f417044a) * 31) + java.lang.Long.hashCode(this.f417045b)) * 31) + this.f417046c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f417047d)) * 31) + java.lang.Integer.hashCode(this.f417048e);
    }

    public java.lang.String toString() {
        return "ItemCostInfo(msgType=" + this.f417044a + ", cost=" + this.f417045b + ", itemClass=" + this.f417046c + ", isInChat=" + this.f417047d + ", count=" + this.f417048e + ')';
    }

    public /* synthetic */ e(int i17, long j17, java.lang.String str, boolean z17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        this(i17, j17, str, z17, (i19 & 16) != 0 ? 0 : i18);
    }
}
