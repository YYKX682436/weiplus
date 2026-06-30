package wc2;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f444502a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f444503b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f444504c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f444505d = -1;

    public java.lang.Object clone() {
        wc2.b bVar = new wc2.b();
        bVar.f444502a = this.f444502a;
        bVar.f444503b = this.f444503b;
        bVar.f444504c = this.f444504c;
        bVar.f444505d = this.f444505d;
        return bVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wc2.b.class != obj.getClass()) {
            return false;
        }
        wc2.b bVar = (wc2.b) obj;
        return this.f444502a == bVar.f444502a && this.f444503b == bVar.f444503b && this.f444504c == bVar.f444504c && this.f444505d == bVar.f444505d;
    }

    public int hashCode() {
        return (((((this.f444502a * 31) + this.f444503b) * 31) + this.f444504c) * 31) + this.f444505d;
    }

    public java.lang.String toString() {
        return "Line{itemCount=" + this.f444502a + ", totalWidth=" + this.f444503b + ", maxHeight=" + this.f444504c + ", maxHeightIndex=" + this.f444505d + '}';
    }
}
