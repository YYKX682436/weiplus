package to5;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f420991j = new java.util.concurrent.atomic.AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final int f420992a;

    /* renamed from: b, reason: collision with root package name */
    public final cp5.a f420993b;

    /* renamed from: c, reason: collision with root package name */
    public final int f420994c;

    /* renamed from: d, reason: collision with root package name */
    public final int f420995d;

    /* renamed from: e, reason: collision with root package name */
    public final int f420996e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f420997f;

    /* renamed from: g, reason: collision with root package name */
    public final int f420998g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f420999h;

    /* renamed from: i, reason: collision with root package name */
    public final long f421000i;

    public a(int i17, cp5.a dataBuffer, int i18, int i19, int i27, boolean z17, int i28, boolean z18) {
        kotlin.jvm.internal.o.g(dataBuffer, "dataBuffer");
        this.f420992a = i17;
        this.f420993b = dataBuffer;
        this.f420994c = i18;
        this.f420995d = i19;
        this.f420996e = i27;
        this.f420997f = z17;
        this.f420998g = i28;
        this.f420999h = z18;
        this.f421000i = f420991j.incrementAndGet();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to5.a)) {
            return false;
        }
        to5.a aVar = (to5.a) obj;
        return this.f420992a == aVar.f420992a && kotlin.jvm.internal.o.b(this.f420993b, aVar.f420993b) && this.f420994c == aVar.f420994c && this.f420995d == aVar.f420995d && this.f420996e == aVar.f420996e && this.f420997f == aVar.f420997f && this.f420998g == aVar.f420998g && this.f420999h == aVar.f420999h;
    }

    public int hashCode() {
        return (((((((((((((java.lang.Integer.hashCode(this.f420992a) * 31) + this.f420993b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f420994c)) * 31) + java.lang.Integer.hashCode(this.f420995d)) * 31) + java.lang.Integer.hashCode(this.f420996e)) * 31) + java.lang.Boolean.hashCode(this.f420997f)) * 31) + java.lang.Integer.hashCode(this.f420998g)) * 31) + java.lang.Boolean.hashCode(this.f420999h);
    }

    public java.lang.String toString() {
        return "DecodeResult(memberId=" + this.f420992a + ", dataBuffer=" + this.f420993b + ", w=" + this.f420994c + ", h=" + this.f420995d + ", format=" + this.f420996e + ", screenFrame=" + this.f420997f + ", ori=" + this.f420998g + ", landscapeMode=" + this.f420999h + ')';
    }
}
