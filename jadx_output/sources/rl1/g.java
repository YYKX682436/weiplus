package rl1;

/* loaded from: classes13.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final double f397178a;

    /* renamed from: b, reason: collision with root package name */
    public final double f397179b;

    public g(double d17, double d18) {
        this.f397178a = d17;
        this.f397179b = d18;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof rl1.g)) {
            return false;
        }
        rl1.g gVar = (rl1.g) obj;
        return this.f397178a == gVar.f397178a && this.f397179b == gVar.f397179b;
    }

    public java.lang.String toString() {
        return "Point{x=" + this.f397178a + ", y=" + this.f397179b + '}';
    }
}
