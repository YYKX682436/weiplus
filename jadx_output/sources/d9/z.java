package d9;

/* loaded from: classes15.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f227427a;

    /* renamed from: b, reason: collision with root package name */
    public final int f227428b;

    /* renamed from: c, reason: collision with root package name */
    public final int f227429c;

    public z(int i17, int i18, int i19) {
        this.f227427a = i17;
        this.f227428b = i18;
        this.f227429c = i19;
    }

    public boolean a() {
        return this.f227428b != -1;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d9.z.class != obj.getClass()) {
            return false;
        }
        d9.z zVar = (d9.z) obj;
        return this.f227427a == zVar.f227427a && this.f227428b == zVar.f227428b && this.f227429c == zVar.f227429c;
    }

    public int hashCode() {
        return ((((com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX + this.f227427a) * 31) + this.f227428b) * 31) + this.f227429c;
    }
}
