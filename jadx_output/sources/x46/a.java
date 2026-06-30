package x46;

/* loaded from: classes7.dex */
public class a implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public char[] f451939d;

    /* renamed from: e, reason: collision with root package name */
    public int f451940e;

    public a() {
        this(32);
    }

    public x46.a a(char c17) {
        d(this.f451940e + 1);
        char[] cArr = this.f451939d;
        int i17 = this.f451940e;
        this.f451940e = i17 + 1;
        cArr[i17] = c17;
        return this;
    }

    public x46.a b(java.lang.Object obj) {
        return obj == null ? this : c(obj.toString());
    }

    public x46.a c(java.lang.String str) {
        int length;
        if (str != null && (length = str.length()) > 0) {
            int i17 = this.f451940e;
            d(i17 + length);
            str.getChars(0, length, this.f451939d, i17);
            this.f451940e += length;
        }
        return this;
    }

    public java.lang.Object clone() {
        x46.a aVar = (x46.a) super.clone();
        char[] cArr = new char[this.f451939d.length];
        aVar.f451939d = cArr;
        char[] cArr2 = this.f451939d;
        java.lang.System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        return aVar;
    }

    public x46.a d(int i17) {
        char[] cArr = this.f451939d;
        if (i17 > cArr.length) {
            char[] cArr2 = new char[i17 * 2];
            this.f451939d = cArr2;
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, this.f451940e);
        }
        return this;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof x46.a)) {
            return false;
        }
        x46.a aVar = (x46.a) obj;
        if (this != aVar) {
            int i17 = this.f451940e;
            if (i17 != aVar.f451940e) {
                return false;
            }
            char[] cArr = this.f451939d;
            char[] cArr2 = aVar.f451939d;
            for (int i18 = i17 - 1; i18 >= 0; i18--) {
                if (cArr[i18] != cArr2[i18]) {
                    return false;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        char[] cArr = this.f451939d;
        int i17 = 0;
        for (int i18 = this.f451940e - 1; i18 >= 0; i18--) {
            i17 = (i17 * 31) + cArr[i18];
        }
        return i17;
    }

    public java.lang.String toString() {
        return new java.lang.String(this.f451939d, 0, this.f451940e);
    }

    public a(int i17) {
        this.f451939d = new char[i17 <= 0 ? 32 : i17];
    }
}
