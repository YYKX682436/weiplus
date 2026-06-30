package fe0;

/* loaded from: classes4.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f261404a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f261405b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f261406c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f261407d;

    /* renamed from: e, reason: collision with root package name */
    public int f261408e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f261409f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f261410g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f261411h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f261412i;

    public j4() {
        this(false, false, false, false, 0, null, false, false, null, 511, null);
    }

    public final void a(boolean z17) {
        this.f261404a = z17;
    }

    public final void b(boolean z17) {
        this.f261405b = z17;
    }

    public final void c(boolean z17) {
        this.f261411h = z17;
    }

    public final void d(boolean z17) {
        this.f261410g = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe0.j4)) {
            return false;
        }
        fe0.j4 j4Var = (fe0.j4) obj;
        return this.f261404a == j4Var.f261404a && this.f261405b == j4Var.f261405b && this.f261406c == j4Var.f261406c && this.f261407d == j4Var.f261407d && this.f261408e == j4Var.f261408e && kotlin.jvm.internal.o.b(this.f261409f, j4Var.f261409f) && this.f261410g == j4Var.f261410g && this.f261411h == j4Var.f261411h && kotlin.jvm.internal.o.b(this.f261412i, j4Var.f261412i);
    }

    public int hashCode() {
        int hashCode = ((((((((java.lang.Boolean.hashCode(this.f261404a) * 31) + java.lang.Boolean.hashCode(this.f261405b)) * 31) + java.lang.Boolean.hashCode(this.f261406c)) * 31) + java.lang.Boolean.hashCode(this.f261407d)) * 31) + java.lang.Integer.hashCode(this.f261408e)) * 31;
        java.lang.String str = this.f261409f;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f261410g)) * 31) + java.lang.Boolean.hashCode(this.f261411h)) * 31) + this.f261412i.hashCode();
    }

    public java.lang.String toString() {
        return "SnsJumpData(clearTopActivity=" + this.f261404a + ", loadInit=" + this.f261405b + ", enterByRed=" + this.f261406c + ", notifyOpen=" + this.f261407d + ", unreadCount=" + this.f261408e + ", newFeedId=" + this.f261409f + ", isResume=" + this.f261410g + ", needResendAllFailSns=" + this.f261411h + ", redDotInfo=" + this.f261412i + ')';
    }

    public j4(boolean z17, boolean z18, boolean z19, boolean z27, int i17, java.lang.String str, boolean z28, boolean z29, java.lang.String redDotInfo, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 1) != 0 ? false : z17;
        z18 = (i18 & 2) != 0 ? true : z18;
        z19 = (i18 & 4) != 0 ? false : z19;
        z27 = (i18 & 8) != 0 ? false : z27;
        i17 = (i18 & 16) != 0 ? 0 : i17;
        str = (i18 & 32) != 0 ? null : str;
        z28 = (i18 & 64) != 0 ? true : z28;
        z29 = (i18 & 128) != 0 ? false : z29;
        redDotInfo = (i18 & 256) != 0 ? "" : redDotInfo;
        kotlin.jvm.internal.o.g(redDotInfo, "redDotInfo");
        this.f261404a = z17;
        this.f261405b = z18;
        this.f261406c = z19;
        this.f261407d = z27;
        this.f261408e = i17;
        this.f261409f = str;
        this.f261410g = z28;
        this.f261411h = z29;
        this.f261412i = redDotInfo;
    }
}
