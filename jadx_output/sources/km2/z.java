package km2;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public int f309229a;

    /* renamed from: b, reason: collision with root package name */
    public int f309230b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f309231c;

    /* renamed from: d, reason: collision with root package name */
    public r45.cz1 f309232d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f309233e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f309234f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f309235g;

    public z(int i17, int i18, boolean z17, r45.cz1 cz1Var, boolean z18, boolean z19, boolean z27, int i19, kotlin.jvm.internal.i iVar) {
        i17 = (i19 & 1) != 0 ? 0 : i17;
        i18 = (i19 & 2) != 0 ? -1 : i18;
        z17 = (i19 & 4) != 0 ? false : z17;
        cz1Var = (i19 & 8) != 0 ? null : cz1Var;
        z18 = (i19 & 16) != 0 ? false : z18;
        z19 = (i19 & 32) != 0 ? false : z19;
        z27 = (i19 & 64) != 0 ? false : z27;
        this.f309229a = i17;
        this.f309230b = i18;
        this.f309231c = z17;
        this.f309232d = cz1Var;
        this.f309233e = z18;
        this.f309234f = z19;
        this.f309235g = z27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.z)) {
            return false;
        }
        km2.z zVar = (km2.z) obj;
        return this.f309229a == zVar.f309229a && this.f309230b == zVar.f309230b && this.f309231c == zVar.f309231c && kotlin.jvm.internal.o.b(this.f309232d, zVar.f309232d) && this.f309233e == zVar.f309233e && this.f309234f == zVar.f309234f && this.f309235g == zVar.f309235g;
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f309229a) * 31) + java.lang.Integer.hashCode(this.f309230b)) * 31) + java.lang.Boolean.hashCode(this.f309231c)) * 31;
        r45.cz1 cz1Var = this.f309232d;
        return ((((((hashCode + (cz1Var == null ? 0 : cz1Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f309233e)) * 31) + java.lang.Boolean.hashCode(this.f309234f)) * 31) + java.lang.Boolean.hashCode(this.f309235g);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("localStatus:");
        sb6.append(this.f309229a);
        sb6.append(",localRemainTime:");
        sb6.append(this.f309230b);
        sb6.append(",haveLottering:");
        sb6.append(this.f309231c);
        sb6.append(", lotteryInfo:");
        java.lang.Object obj = this.f309232d;
        if (obj == null) {
            obj = "";
        }
        sb6.append(pm0.b0.g(obj));
        sb6.append(",lastDoneLottery:");
        sb6.append(this.f309233e);
        sb6.append(",cardShowing:");
        sb6.append(this.f309234f);
        sb6.append(",bubbleFinsh:");
        sb6.append(this.f309235g);
        return sb6.toString();
    }
}
