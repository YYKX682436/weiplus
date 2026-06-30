package ft3;

/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f266555a;

    /* renamed from: b, reason: collision with root package name */
    public final long f266556b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f266557c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f266558d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f266559e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f266560f;

    /* renamed from: g, reason: collision with root package name */
    public final long f266561g;

    /* renamed from: h, reason: collision with root package name */
    public final int f266562h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.gp0 f266563i;

    /* renamed from: j, reason: collision with root package name */
    public final long f266564j;

    public h(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j18, int i17, r45.gp0 dataItem, long j19) {
        kotlin.jvm.internal.o.g(dataItem, "dataItem");
        this.f266555a = str;
        this.f266556b = j17;
        this.f266557c = str2;
        this.f266558d = str3;
        this.f266559e = str4;
        this.f266560f = str5;
        this.f266561g = j18;
        this.f266562h = i17;
        this.f266563i = dataItem;
        this.f266564j = j19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft3.h)) {
            return false;
        }
        ft3.h hVar = (ft3.h) obj;
        return kotlin.jvm.internal.o.b(this.f266555a, hVar.f266555a) && this.f266556b == hVar.f266556b && kotlin.jvm.internal.o.b(this.f266557c, hVar.f266557c) && kotlin.jvm.internal.o.b(this.f266558d, hVar.f266558d) && kotlin.jvm.internal.o.b(this.f266559e, hVar.f266559e) && kotlin.jvm.internal.o.b(this.f266560f, hVar.f266560f) && this.f266561g == hVar.f266561g && this.f266562h == hVar.f266562h && kotlin.jvm.internal.o.b(this.f266563i, hVar.f266563i) && this.f266564j == hVar.f266564j;
    }

    public int hashCode() {
        java.lang.String str = this.f266555a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + java.lang.Long.hashCode(this.f266556b)) * 31;
        java.lang.String str2 = this.f266557c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f266558d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f266559e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f266560f;
        return ((((((((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.f266561g)) * 31) + java.lang.Integer.hashCode(this.f266562h)) * 31) + this.f266563i.hashCode()) * 31) + java.lang.Long.hashCode(this.f266564j);
    }

    public java.lang.String toString() {
        return "ThumbInfo{dataId: " + this.f266555a + "hostMsgId: " + this.f266556b + "hostMsgTalker: " + this.f266557c + "url: " + this.f266558d + "aesKey: " + this.f266559e + "md5: " + this.f266560f + "imageSize: " + this.f266561g + '}';
    }
}
