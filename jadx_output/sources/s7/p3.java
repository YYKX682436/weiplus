package s7;

/* loaded from: classes16.dex */
public class p3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f403770a;

    /* renamed from: c, reason: collision with root package name */
    public final int f403772c;

    /* renamed from: b, reason: collision with root package name */
    public int f403771b = 0;

    /* renamed from: d, reason: collision with root package name */
    public final s7.z f403773d = new s7.z();

    public p3(java.lang.String str) {
        this.f403772c = 0;
        java.lang.String trim = str.trim();
        this.f403770a = trim;
        this.f403772c = trim.length();
    }

    public int a() {
        int i17 = this.f403771b;
        int i18 = this.f403772c;
        if (i17 == i18) {
            return -1;
        }
        int i19 = i17 + 1;
        this.f403771b = i19;
        if (i19 < i18) {
            return this.f403770a.charAt(i19);
        }
        return -1;
    }

    public java.lang.Boolean b(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        p();
        int i17 = this.f403771b;
        if (i17 == this.f403772c) {
            return null;
        }
        char charAt = this.f403770a.charAt(i17);
        if (charAt != '0' && charAt != '1') {
            return null;
        }
        this.f403771b++;
        return java.lang.Boolean.valueOf(charAt == '1');
    }

    public float c(float f17) {
        if (java.lang.Float.isNaN(f17)) {
            return Float.NaN;
        }
        p();
        return i();
    }

    public boolean d(char c17) {
        int i17 = this.f403771b;
        boolean z17 = i17 < this.f403772c && this.f403770a.charAt(i17) == c17;
        if (z17) {
            this.f403771b++;
        }
        return z17;
    }

    public boolean e(java.lang.String str) {
        int length = str.length();
        int i17 = this.f403771b;
        boolean z17 = i17 <= this.f403772c - length && this.f403770a.substring(i17, i17 + length).equals(str);
        if (z17) {
            this.f403771b += length;
        }
        return z17;
    }

    public boolean f() {
        return this.f403771b == this.f403772c;
    }

    public boolean g(int i17) {
        return i17 == 32 || i17 == 10 || i17 == 13 || i17 == 9;
    }

    public java.lang.Integer h() {
        int i17 = this.f403771b;
        if (i17 == this.f403772c) {
            return null;
        }
        this.f403771b = i17 + 1;
        return java.lang.Integer.valueOf(this.f403770a.charAt(i17));
    }

    public float i() {
        int i17 = this.f403771b;
        int i18 = this.f403772c;
        s7.z zVar = this.f403773d;
        float a17 = zVar.a(this.f403770a, i17, i18);
        if (!java.lang.Float.isNaN(a17)) {
            this.f403771b = zVar.f403907a;
        }
        return a17;
    }

    public s7.t0 j() {
        float i17 = i();
        if (java.lang.Float.isNaN(i17)) {
            return null;
        }
        s7.q2 n17 = n();
        return n17 == null ? new s7.t0(i17, s7.q2.px) : new s7.t0(i17, n17);
    }

    public java.lang.String k() {
        if (f()) {
            return null;
        }
        int i17 = this.f403771b;
        java.lang.String str = this.f403770a;
        char charAt = str.charAt(i17);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        int a17 = a();
        while (a17 != -1 && a17 != charAt) {
            a17 = a();
        }
        if (a17 == -1) {
            this.f403771b = i17;
            return null;
        }
        int i18 = this.f403771b + 1;
        this.f403771b = i18;
        return str.substring(i17 + 1, i18 - 1);
    }

    public java.lang.String l() {
        return m(' ', false);
    }

    public java.lang.String m(char c17, boolean z17) {
        if (f()) {
            return null;
        }
        int i17 = this.f403771b;
        java.lang.String str = this.f403770a;
        char charAt = str.charAt(i17);
        if ((!z17 && g(charAt)) || charAt == c17) {
            return null;
        }
        int i18 = this.f403771b;
        int a17 = a();
        while (a17 != -1 && a17 != c17 && (z17 || !g(a17))) {
            a17 = a();
        }
        return str.substring(i18, this.f403771b);
    }

    public s7.q2 n() {
        if (f()) {
            return null;
        }
        int i17 = this.f403771b;
        java.lang.String str = this.f403770a;
        if (str.charAt(i17) == '%') {
            this.f403771b++;
            return s7.q2.percent;
        }
        int i18 = this.f403771b;
        if (i18 > this.f403772c - 2) {
            return null;
        }
        try {
            s7.q2 valueOf = s7.q2.valueOf(str.substring(i18, i18 + 2).toLowerCase(java.util.Locale.US));
            this.f403771b += 2;
            return valueOf;
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    public float o() {
        p();
        int i17 = this.f403771b;
        int i18 = this.f403772c;
        s7.z zVar = this.f403773d;
        float a17 = zVar.a(this.f403770a, i17, i18);
        if (!java.lang.Float.isNaN(a17)) {
            this.f403771b = zVar.f403907a;
        }
        return a17;
    }

    public boolean p() {
        q();
        int i17 = this.f403771b;
        if (i17 == this.f403772c || this.f403770a.charAt(i17) != ',') {
            return false;
        }
        this.f403771b++;
        q();
        return true;
    }

    public void q() {
        while (true) {
            int i17 = this.f403771b;
            if (i17 >= this.f403772c || !g(this.f403770a.charAt(i17))) {
                return;
            } else {
                this.f403771b++;
            }
        }
    }
}
