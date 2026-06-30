package f56;

/* loaded from: classes7.dex */
public class g implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final int f259798d;

    /* renamed from: e, reason: collision with root package name */
    public final int f259799e;

    /* renamed from: f, reason: collision with root package name */
    public final int f259800f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f259801g;

    public g() {
        this.f259798d = 512;
        this.f259799e = 8192;
        this.f259800f = 8192;
        this.f259801g = true;
    }

    public java.lang.Object clone() {
        return new f56.g(this);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof f56.g)) {
            return false;
        }
        f56.g gVar = (f56.g) obj;
        return this.f259798d == gVar.f259798d && this.f259799e == gVar.f259799e && this.f259800f == gVar.f259800f && this.f259801g == gVar.f259801g;
    }

    public int hashCode() {
        return (((((this.f259798d * 31) + this.f259799e) * 31) + this.f259800f) * 31) + (this.f259801g ? 1 : 0);
    }

    public g(f56.g gVar) {
        this.f259798d = 512;
        this.f259799e = 8192;
        this.f259800f = 8192;
        this.f259801g = true;
        this.f259798d = gVar.f259798d;
        this.f259799e = gVar.f259799e;
        this.f259800f = gVar.f259800f;
        this.f259801g = gVar.f259801g;
    }
}
