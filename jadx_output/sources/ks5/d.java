package ks5;

/* loaded from: classes15.dex */
public class d implements ks5.b {

    /* renamed from: x, reason: collision with root package name */
    public static final android.text.TextPaint f311831x = new android.text.TextPaint(1);

    /* renamed from: d, reason: collision with root package name */
    public final ks5.c f311832d;

    /* renamed from: e, reason: collision with root package name */
    public final char[] f311833e;

    /* renamed from: f, reason: collision with root package name */
    public final int f311834f;

    /* renamed from: g, reason: collision with root package name */
    public final int f311835g;

    /* renamed from: h, reason: collision with root package name */
    public final int f311836h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f311837i;

    /* renamed from: m, reason: collision with root package name */
    public final float f311838m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f311839n;

    /* renamed from: o, reason: collision with root package name */
    public final float f311840o;

    /* renamed from: p, reason: collision with root package name */
    public final float f311841p;

    /* renamed from: q, reason: collision with root package name */
    public float f311842q = -1.0f;

    /* renamed from: r, reason: collision with root package name */
    public final float f311843r;

    /* renamed from: s, reason: collision with root package name */
    public final float f311844s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.RectF f311845t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.RectF f311846u;

    /* renamed from: v, reason: collision with root package name */
    public final int f311847v;

    /* renamed from: w, reason: collision with root package name */
    public final float f311848w;

    public d(ks5.c cVar, char[] cArr, int i17, int i18, float f17, float f18, float[] fArr, float f19, float f27, float f28, android.text.TextPaint textPaint, boolean z17, float f29, int i19, int i27, float f37) {
        this.f311843r = 0.0f;
        this.f311844s = 0.0f;
        android.graphics.RectF rectF = new android.graphics.RectF();
        this.f311845t = rectF;
        android.graphics.RectF rectF2 = new android.graphics.RectF();
        this.f311846u = rectF2;
        this.f311832d = cVar;
        this.f311833e = cArr;
        this.f311834f = i17;
        this.f311835g = i18;
        this.f311836h = i19;
        this.f311837i = fArr;
        this.f311838m = f28;
        this.f311843r = f29;
        this.f311839n = z17;
        this.f311840o = f27;
        this.f311841p = f19;
        this.f311844s = f37;
        this.f311847v = i27;
        android.graphics.Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f38 = fontMetrics.leading;
        float f39 = fontMetrics.top;
        float f47 = f38 - f39;
        float f48 = fontMetrics.bottom;
        float f49 = f48 - f38;
        float f57 = (f18 + (((f27 - f48) + f39) / 2.0f)) - f39;
        this.f311848w = f57;
        rectF.set(f17, f57 - f47, f19 + f17, f49 + f57);
        rectF2.set(f17, f57 - f47, f17 + f37, rectF.top + f27);
    }

    public float a() {
        float f17;
        float f18 = this.f311842q;
        if (f18 != -1.0f) {
            return f18;
        }
        int i17 = this.f311847v & 7;
        int i18 = this.f311834f;
        if (i17 == 1) {
            int i19 = i18;
            int i27 = i19;
            float f19 = 0.0f;
            while (true) {
                int i28 = this.f311835g;
                if (i19 >= i28) {
                    break;
                }
                i19++;
                float[] fArr = this.f311837i;
                if (i19 >= i28 || fArr[i19] != 0.0f) {
                    f19 += fArr[i27] + this.f311838m;
                    i27 = i19;
                }
            }
            f17 = (this.f311844s - f19) / 2.0f;
        } else {
            f17 = 0.0f;
        }
        float max = java.lang.Math.max(0.0f, f17);
        ks5.c cVar = this.f311832d;
        if (cVar.f311826v.a(i18, i18 + 1) == null) {
            java.util.HashMap hashMap = cVar.f311813i;
            char[] cArr = this.f311833e;
            if (hashMap.containsKey(java.lang.Character.valueOf(cArr[i18]))) {
                float floatValue = max - ((java.lang.Float) cVar.f311813i.get(java.lang.Character.valueOf(cArr[i18]))).floatValue();
                this.f311842q = floatValue;
                return floatValue;
            }
        }
        this.f311842q = max;
        return max;
    }

    public int b(int i17, int i18) {
        int i19;
        float f17;
        float[] fArr;
        android.graphics.RectF rectF = this.f311845t;
        float a17 = rectF.left + a();
        int i27 = this.f311834f;
        int i28 = i27;
        int i29 = i28;
        int i37 = i29;
        while (true) {
            boolean z17 = false;
            while (true) {
                i19 = this.f311835g;
                if (i28 >= i19) {
                    return i19;
                }
                i28++;
                f17 = this.f311843r;
                fArr = this.f311837i;
                if (i28 >= i19) {
                    break;
                }
                float f18 = fArr[i28];
                if (f18 != 0.0f) {
                    if (!z17) {
                        z17 = this.f311839n && f18 == f17;
                        if (!z17) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i29++;
            }
            if (z17) {
                a17 += f17;
            }
            float f19 = fArr[i37] + this.f311838m + a17;
            float f27 = i17;
            if (a17 <= f27 && f27 < f19) {
                return i29;
            }
            if (a17 > f27) {
                return i27;
            }
            if (f27 > rectF.right) {
                return i19 == this.f311833e.length ? i19 : i19 - 1;
            }
            i29++;
            i37 = i28;
            a17 = f19;
        }
    }

    public float c(int i17) {
        float f17;
        float[] fArr;
        float a17 = this.f311845t.left + a();
        int i18 = this.f311834f;
        loop0: while (true) {
            int i19 = i18;
            boolean z17 = false;
            while (true) {
                int i27 = this.f311835g;
                if (i18 < i27 && i18 < i17) {
                    i18++;
                    f17 = this.f311843r;
                    fArr = this.f311837i;
                    if (i18 >= i27) {
                        break;
                    }
                    float f18 = fArr[i18];
                    if (f18 != 0.0f) {
                        if (!z17) {
                            z17 = this.f311839n && f18 == f17;
                            if (!z17) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    break loop0;
                }
            }
            if (z17) {
                a17 += f17;
            }
            a17 += fArr[i19] + this.f311838m;
        }
        return a17;
    }

    public android.graphics.RectF d(int i17, int i18) {
        float f17;
        float[] fArr;
        android.graphics.RectF rectF = new android.graphics.RectF();
        if (i17 >= i18) {
            return rectF;
        }
        float a17 = a();
        int i19 = this.f311834f;
        while (true) {
            f17 = this.f311838m;
            fArr = this.f311837i;
            if (i19 >= i17) {
                break;
            }
            a17 += fArr[i19] + f17;
            i19++;
        }
        float f18 = a17;
        while (i17 < i18) {
            f18 += fArr[i17] + f17;
            i17++;
        }
        android.graphics.RectF rectF2 = this.f311845t;
        rectF.set(a17, rectF2.top, f18, rectF2.bottom);
        return rectF;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof ks5.b)) {
            ks5.b bVar = (ks5.b) obj;
            int i17 = ((ks5.d) bVar).f311834f;
            int i18 = this.f311834f;
            if (i17 == i18) {
                ks5.d dVar = (ks5.d) bVar;
                int i19 = this.f311835g;
                if (dVar.f311835g == i19 && dVar.f311845t.equals(this.f311845t)) {
                    if (dVar.f311839n == this.f311839n) {
                        if (dVar.f311838m == this.f311838m && dVar.a() == this.f311842q) {
                            while (i18 < i19) {
                                if (this.f311837i[i18] != dVar.f311837i[i18]) {
                                    return false;
                                }
                                i18++;
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f311834f + this.f311835g + ((int) this.f311840o) + ((int) this.f311841p) + ((int) this.f311842q) + this.f311845t.hashCode();
    }

    public java.lang.String toString() {
        return "MeasuredLine{mStart=" + this.f311834f + ", mEnd=" + this.f311835g + ", mLetter=" + this.f311838m + ", isSmartLetter=" + this.f311839n + ", mHeight=" + this.f311840o + ", mWidth=" + this.f311841p + ", mLeftOffset=" + this.f311842q + ", mLineRect=" + this.f311845t + ", mLineRect=" + this.f311846u + '}';
    }
}
