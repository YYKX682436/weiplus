package cr0;

/* loaded from: classes12.dex */
public final class d1 {

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f221606e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f221607f;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f221608a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f221609b;

    /* renamed from: c, reason: collision with root package name */
    public long f221610c;

    /* renamed from: d, reason: collision with root package name */
    public int f221611d;

    static {
        new cr0.c1(null);
        jz5.i iVar = jz5.i.f302829d;
        f221606e = jz5.h.a(iVar, cr0.b1.f221593d);
        f221607f = jz5.h.a(iVar, cr0.a1.f221581d);
    }

    public d1(java.lang.String str, java.lang.String str2, long j17, int i17, kotlin.jvm.internal.i iVar) {
        str = (i17 & 1) != 0 ? "" : str;
        str2 = (i17 & 2) != 0 ? "" : str2;
        j17 = (i17 & 4) != 0 ? 0L : j17;
        this.f221608a = str;
        this.f221609b = str2;
        this.f221610c = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(cr0.d1.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.matrix.battery.BinderTracker.PendingTimer");
        cr0.d1 d1Var = (cr0.d1) obj;
        return kotlin.jvm.internal.o.b(this.f221608a, d1Var.f221608a) && kotlin.jvm.internal.o.b(this.f221609b, d1Var.f221609b) && this.f221610c == d1Var.f221610c && this.f221611d == d1Var.f221611d;
    }

    public int hashCode() {
        return this.f221611d;
    }
}
