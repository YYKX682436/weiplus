package dk2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f233159a;

    /* renamed from: b, reason: collision with root package name */
    public final int f233160b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f233161c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f233162d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.vy1 f233163e;

    public a(int i17, int i18, boolean z17, byte[] bArr, r45.vy1 vy1Var) {
        this.f233159a = i17;
        this.f233160b = i18;
        this.f233161c = z17;
        this.f233162d = bArr;
        this.f233163e = vy1Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.a)) {
            return false;
        }
        dk2.a aVar = (dk2.a) obj;
        return this.f233159a == aVar.f233159a && this.f233160b == aVar.f233160b && this.f233161c == aVar.f233161c && kotlin.jvm.internal.o.b(this.f233162d, aVar.f233162d) && kotlin.jvm.internal.o.b(this.f233163e, aVar.f233163e);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f233159a) * 31) + java.lang.Integer.hashCode(this.f233160b)) * 31) + java.lang.Boolean.hashCode(this.f233161c)) * 31;
        byte[] bArr = this.f233162d;
        int hashCode2 = (hashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31;
        r45.vy1 vy1Var = this.f233163e;
        return hashCode2 + (vy1Var != null ? vy1Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ApplyLinkRequestParams(micType=" + this.f233159a + ", seatPos=" + this.f233160b + ", canAutoLink=" + this.f233161c + ", buffer=" + java.util.Arrays.toString(this.f233162d) + ", lbsLocation=" + this.f233163e + ')';
    }
}
