package kh;

/* loaded from: classes12.dex */
public final class g1 {

    /* renamed from: f, reason: collision with root package name */
    public static final kh.f1 f307805f = new kh.f1(null);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f307806g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f307807h;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f307808a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f307809b;

    /* renamed from: c, reason: collision with root package name */
    public int f307810c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f307811d;

    /* renamed from: e, reason: collision with root package name */
    public int f307812e;

    static {
        jz5.i iVar = jz5.i.f302829d;
        f307806g = jz5.h.a(iVar, kh.e1.f307786d);
        f307807h = jz5.h.a(iVar, kh.d1.f307777d);
    }

    public g1(java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj, int i18, kotlin.jvm.internal.i iVar) {
        str = (i18 & 1) != 0 ? "" : str;
        str2 = (i18 & 2) != 0 ? "" : str2;
        i17 = (i18 & 4) != 0 ? 0 : i17;
        obj = (i18 & 8) != 0 ? null : obj;
        this.f307808a = str;
        this.f307809b = str2;
        this.f307810c = i17;
        this.f307811d = obj;
    }

    public final java.lang.String a() {
        if (!(this.f307809b.length() == 0) && !kotlin.jvm.internal.o.b(this.f307809b, "null")) {
            return this.f307809b;
        }
        return this.f307808a + '-' + this.f307810c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(kh.g1.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.matrix.battery.LooperTaskMonitorFeatureKt.PendingTimer");
        kh.g1 g1Var = (kh.g1) obj;
        return kotlin.jvm.internal.o.b(this.f307808a, g1Var.f307808a) && kotlin.jvm.internal.o.b(this.f307809b, g1Var.f307809b) && this.f307810c == g1Var.f307810c && kotlin.jvm.internal.o.b(this.f307811d, g1Var.f307811d) && this.f307812e == g1Var.f307812e;
    }

    public int hashCode() {
        return this.f307812e;
    }
}
