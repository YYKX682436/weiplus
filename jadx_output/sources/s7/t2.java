package s7;

/* loaded from: classes16.dex */
public class t2 {

    /* renamed from: a, reason: collision with root package name */
    public s7.s1 f403836a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f403837b = 96.0f;

    /* renamed from: c, reason: collision with root package name */
    public final s7.t f403838c = new s7.t();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f403839d = new java.util.HashMap();

    public final s7.f0 a(float f17) {
        s7.q2 q2Var;
        s7.q2 q2Var2;
        s7.q2 q2Var3;
        s7.q2 q2Var4;
        float f18;
        s7.q2 q2Var5;
        s7.s1 s1Var = this.f403836a;
        s7.t0 t0Var = s1Var.f403831r;
        s7.t0 t0Var2 = s1Var.f403832s;
        if (t0Var == null || t0Var.g() || (q2Var2 = t0Var.f403835e) == (q2Var = s7.q2.percent) || q2Var2 == (q2Var3 = s7.q2.em) || q2Var2 == (q2Var4 = s7.q2.ex)) {
            return new s7.f0(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float a17 = t0Var.a(f17);
        if (t0Var2 == null) {
            s7.f0 f0Var = this.f403836a.f403640o;
            f18 = f0Var != null ? (f0Var.f403646d * a17) / f0Var.f403645c : a17;
        } else {
            if (t0Var2.g() || (q2Var5 = t0Var2.f403835e) == q2Var || q2Var5 == q2Var3 || q2Var5 == q2Var4) {
                return new s7.f0(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            f18 = t0Var2.a(f17);
        }
        return new s7.f0(0.0f, 0.0f, a17, f18);
    }

    public float b() {
        if (this.f403836a != null) {
            return a(this.f403837b).f403646d;
        }
        throw new java.lang.IllegalArgumentException("SVG document is empty");
    }

    public float c() {
        if (this.f403836a != null) {
            return a(this.f403837b).f403645c;
        }
        throw new java.lang.IllegalArgumentException("SVG document is empty");
    }

    public s7.y1 d(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f403836a.f403898c)) {
            return this.f403836a;
        }
        java.util.Map map = this.f403839d;
        if (((java.util.HashMap) map).containsKey(str)) {
            return (s7.y1) ((java.util.HashMap) map).get(str);
        }
        s7.y1 e17 = e(this.f403836a, str);
        ((java.util.HashMap) map).put(str, e17);
        return e17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s7.y1 e(s7.w1 w1Var, java.lang.String str) {
        s7.y1 e17;
        s7.y1 y1Var = (s7.y1) w1Var;
        if (str.equals(y1Var.f403898c)) {
            return y1Var;
        }
        for (java.lang.Object obj : w1Var.c()) {
            if (obj instanceof s7.y1) {
                s7.y1 y1Var2 = (s7.y1) obj;
                if (str.equals(y1Var2.f403898c)) {
                    return y1Var2;
                }
                if ((obj instanceof s7.w1) && (e17 = e((s7.w1) obj, str)) != null) {
                    return e17;
                }
            }
        }
        return null;
    }

    public void f(android.graphics.Canvas canvas) {
        s7.d0 d0Var = new s7.d0();
        if (!(d0Var.f403631e != null)) {
            d0Var.f403631e = new s7.f0(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new s7.f3(canvas, this.f403837b).J(this, d0Var);
    }

    public android.graphics.Picture g(int i17, int i18, s7.d0 d0Var) {
        android.graphics.Picture picture = new android.graphics.Picture();
        android.graphics.Canvas beginRecording = picture.beginRecording(i17, i18);
        if (d0Var == null || d0Var.f403631e == null) {
            d0Var = d0Var == null ? new s7.d0() : new s7.d0(d0Var);
            d0Var.f403631e = new s7.f0(0.0f, 0.0f, i17, i18);
        }
        new s7.f3(beginRecording, this.f403837b).J(this, d0Var);
        picture.endRecording();
        return picture;
    }

    public s7.a2 h(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        java.lang.String replace = str.replace("\\\n", "").replace("\\A", "\n");
        if (replace.length() <= 1 || !replace.startsWith("#")) {
            return null;
        }
        return d(replace.substring(1));
    }

    public void i(float f17) {
        s7.s1 s1Var = this.f403836a;
        if (s1Var == null) {
            throw new java.lang.IllegalArgumentException("SVG document is empty");
        }
        s1Var.f403832s = new s7.t0(f17);
    }

    public void j(float f17) {
        s7.s1 s1Var = this.f403836a;
        if (s1Var == null) {
            throw new java.lang.IllegalArgumentException("SVG document is empty");
        }
        s1Var.f403831r = new s7.t0(f17);
    }
}
