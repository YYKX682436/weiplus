package tr5;

/* loaded from: classes13.dex */
public class z implements java.io.Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final tr5.z f421508g;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f421509d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String[] f421510e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String[] f421511f;

    static {
        java.lang.String[] strArr = tr5.c.f421455a;
        f421508g = new tr5.z(strArr, strArr);
    }

    public z(java.lang.String[] strArr, java.lang.String[] strArr2) {
        if (strArr == null) {
            throw new java.lang.IllegalArgumentException("v4Ips".concat(" can not be null"));
        }
        if (strArr2 != null) {
            this.f421509d = strArr;
            this.f421510e = strArr2;
            this.f421511f = null;
            return;
        }
        throw new java.lang.IllegalArgumentException("v6Ips".concat(" can not be null"));
    }

    public java.lang.String toString() {
        return "IpSet{v4Ips=" + java.util.Arrays.toString(this.f421509d) + ", v6Ips=" + java.util.Arrays.toString(this.f421510e) + ", ips=" + java.util.Arrays.toString(this.f421511f) + '}';
    }

    public z(java.lang.String[] strArr) {
        if (strArr != null) {
            this.f421511f = strArr;
            this.f421509d = null;
            this.f421510e = null;
            return;
        }
        throw new java.lang.IllegalArgumentException("ips".concat(" can not be null"));
    }
}
