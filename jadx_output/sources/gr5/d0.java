package gr5;

/* loaded from: classes8.dex */
public final class d0 implements gr5.c0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f274913b;

    /* renamed from: c, reason: collision with root package name */
    public final float f274914c;

    public d0(float f17, float f18, int i17, kotlin.jvm.internal.i iVar) {
        f17 = (i17 & 1) != 0 ? 2.5f : f17;
        f18 = (i17 & 2) != 0 ? 5.0f : f18;
        this.f274913b = f17;
        this.f274914c = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gr5.d0.class != obj.getClass()) {
            return false;
        }
        gr5.d0 d0Var = (gr5.d0) obj;
        if (this.f274913b == d0Var.f274913b) {
            return (this.f274914c > d0Var.f274914c ? 1 : (this.f274914c == d0Var.f274914c ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f274913b) * 31) + java.lang.Float.hashCode(this.f274914c);
    }

    public java.lang.String toString() {
        return "LongImageDecider(" + this.f274913b + ':' + this.f274914c + ')';
    }
}
