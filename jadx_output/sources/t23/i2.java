package t23;

/* loaded from: classes10.dex */
public class i2 extends t23.m2 {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f415184b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f415185c;

    public i2(java.lang.String str, java.lang.String str2) {
        this.f415206a = 0;
        this.f415184b = str;
        this.f415185c = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof t23.i2) {
            t23.i2 i2Var = (t23.i2) obj;
            if (this.f415185c.equals(i2Var.f415185c) && this.f415184b.equals(i2Var.f415184b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((629 + this.f415184b.hashCode()) * 37) + this.f415185c.hashCode();
    }
}
