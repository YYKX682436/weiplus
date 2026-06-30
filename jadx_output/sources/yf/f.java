package yf;

/* loaded from: classes11.dex */
public final class f implements yf.k {

    /* renamed from: a, reason: collision with root package name */
    public final float f461342a;

    /* renamed from: b, reason: collision with root package name */
    public final yf.b f461343b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f461344c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f461345d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f461346e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f461347f;

    public f(float f17, yf.b blendMode, java.lang.String path, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.o.g(blendMode, "blendMode");
        kotlin.jvm.internal.o.g(path, "path");
        this.f461342a = f17;
        this.f461343b = blendMode;
        this.f461344c = path;
        this.f461345d = str;
        this.f461346e = str2;
        this.f461347f = str3;
        if (str2 == null || str2.length() == 0) {
            yf.e[] eVarArr = yf.e.f461336d;
        } else {
            yf.e[] eVarArr2 = yf.e.f461336d;
        }
    }

    @Override // yf.k
    public java.lang.String a() {
        return "EyeShadowInfoV1(path='" + this.f461344c + "', pathMd5='" + this.f461345d + "', shimmerPosPath=" + this.f461346e + ", shimmerPosPathMd5='" + this.f461347f + "')";
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf.f)) {
            return false;
        }
        yf.f fVar = (yf.f) obj;
        return java.lang.Float.compare(this.f461342a, fVar.f461342a) == 0 && this.f461343b == fVar.f461343b && kotlin.jvm.internal.o.b(this.f461344c, fVar.f461344c) && kotlin.jvm.internal.o.b(this.f461345d, fVar.f461345d) && kotlin.jvm.internal.o.b(this.f461346e, fVar.f461346e) && kotlin.jvm.internal.o.b(this.f461347f, fVar.f461347f);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Float.hashCode(this.f461342a) * 31) + this.f461343b.hashCode()) * 31) + this.f461344c.hashCode()) * 31;
        java.lang.String str = this.f461345d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f461346e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f461347f;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "EyeShadowInfoV2(alpha=" + this.f461342a + ", blendMode=" + this.f461343b + ", path=" + this.f461344c + ", pathMd5=" + this.f461345d + ", shimmerPosPath=" + this.f461346e + ", shimmerPosPathMd5=" + this.f461347f + ')';
    }
}
