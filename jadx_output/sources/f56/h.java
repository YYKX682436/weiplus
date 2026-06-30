package f56;

/* loaded from: classes7.dex */
public class h implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f259802d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f259803e;

    /* renamed from: f, reason: collision with root package name */
    public final java.nio.charset.CodingErrorAction f259804f;

    /* renamed from: g, reason: collision with root package name */
    public final java.nio.charset.CodingErrorAction f259805g;

    /* renamed from: h, reason: collision with root package name */
    public final int f259806h;

    /* renamed from: i, reason: collision with root package name */
    public final int f259807i;

    /* renamed from: m, reason: collision with root package name */
    public final int f259808m;

    public h() {
        this.f259802d = true;
        this.f259803e = true;
        java.nio.charset.CodingErrorAction codingErrorAction = java.nio.charset.CodingErrorAction.REPLACE;
        this.f259804f = codingErrorAction;
        this.f259805g = codingErrorAction;
        this.f259806h = Integer.MAX_VALUE;
        this.f259807i = 8192;
        this.f259808m = 8192;
    }

    public java.lang.Object clone() {
        return new f56.h(this);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof f56.h)) {
            return false;
        }
        f56.h hVar = (f56.h) obj;
        return this.f259802d == hVar.f259802d && this.f259803e == hVar.f259803e && this.f259804f == hVar.f259804f && this.f259805g == hVar.f259805g && this.f259806h == hVar.f259806h && this.f259808m == hVar.f259808m && this.f259807i == hVar.f259807i;
    }

    public int hashCode() {
        int i17 = (((this.f259802d ? 1 : 0) * 31) + (this.f259803e ? 1 : 0)) * 31;
        java.nio.charset.CodingErrorAction codingErrorAction = this.f259804f;
        int hashCode = (i17 + (codingErrorAction != null ? codingErrorAction.hashCode() : 0)) * 31;
        java.nio.charset.CodingErrorAction codingErrorAction2 = this.f259805g;
        return ((((((hashCode + (codingErrorAction2 != null ? codingErrorAction2.hashCode() : 0)) * 31) + this.f259806h) * 31) + this.f259807i) * 31) + this.f259808m;
    }

    public h(f56.h hVar) {
        this.f259802d = true;
        this.f259803e = true;
        java.nio.charset.CodingErrorAction codingErrorAction = java.nio.charset.CodingErrorAction.REPLACE;
        this.f259804f = codingErrorAction;
        this.f259805g = codingErrorAction;
        this.f259806h = Integer.MAX_VALUE;
        this.f259807i = 8192;
        this.f259808m = 8192;
        this.f259802d = hVar.f259802d;
        this.f259803e = hVar.f259803e;
        this.f259804f = hVar.f259804f;
        this.f259805g = hVar.f259805g;
        this.f259806h = hVar.f259806h;
        this.f259807i = hVar.f259807i;
    }
}
