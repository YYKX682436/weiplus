package zt5;

/* loaded from: classes15.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public int f475605a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f475606b;

    public k(int i17, java.lang.String str) {
        this(i17);
        if (zt5.l.b(str)) {
            return;
        }
        this.f475606b = str;
    }

    public boolean a() {
        return this.f475605a == 0;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof zt5.k) && ((zt5.k) obj).f475605a == this.f475605a;
    }

    public java.lang.String toString() {
        return "SoterCoreResult{errCode=" + this.f475605a + ", errMsg='" + this.f475606b + "'}";
    }

    public k(int i17) {
        this.f475605a = i17;
        if (i17 == 0) {
            this.f475606b = "ok";
        } else if (i17 != 2) {
            this.f475606b = "errmsg not specified";
        } else {
            this.f475606b = "device not support soter";
        }
    }
}
