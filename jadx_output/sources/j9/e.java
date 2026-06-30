package j9;

/* loaded from: classes15.dex */
public final class e {
    public static final int[] A;
    public static final boolean[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;

    /* renamed from: w, reason: collision with root package name */
    public static final int f298292w = c(2, 2, 2, 0);

    /* renamed from: x, reason: collision with root package name */
    public static final int f298293x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f298294y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f298295z;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f298296a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final android.text.SpannableStringBuilder f298297b = new android.text.SpannableStringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public boolean f298298c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f298299d;

    /* renamed from: e, reason: collision with root package name */
    public int f298300e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f298301f;

    /* renamed from: g, reason: collision with root package name */
    public int f298302g;

    /* renamed from: h, reason: collision with root package name */
    public int f298303h;

    /* renamed from: i, reason: collision with root package name */
    public int f298304i;

    /* renamed from: j, reason: collision with root package name */
    public int f298305j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f298306k;

    /* renamed from: l, reason: collision with root package name */
    public int f298307l;

    /* renamed from: m, reason: collision with root package name */
    public int f298308m;

    /* renamed from: n, reason: collision with root package name */
    public int f298309n;

    /* renamed from: o, reason: collision with root package name */
    public int f298310o;

    /* renamed from: p, reason: collision with root package name */
    public int f298311p;

    /* renamed from: q, reason: collision with root package name */
    public int f298312q;

    /* renamed from: r, reason: collision with root package name */
    public int f298313r;

    /* renamed from: s, reason: collision with root package name */
    public int f298314s;

    /* renamed from: t, reason: collision with root package name */
    public int f298315t;

    /* renamed from: u, reason: collision with root package name */
    public int f298316u;

    /* renamed from: v, reason: collision with root package name */
    public int f298317v;

    static {
        int c17 = c(0, 0, 0, 0);
        f298293x = c17;
        int c18 = c(0, 0, 0, 3);
        f298294y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f298295z = new int[]{0, 0, 0, 0, 0, 0, 2};
        A = new int[]{3, 3, 3, 3, 3, 3, 1};
        B = new boolean[]{false, false, false, true, true, true, false};
        C = new int[]{c17, c18, c17, c17, c18, c17, c17};
        D = new int[]{0, 1, 2, 3, 4, 3, 4};
        E = new int[]{0, 0, 0, 0, 0, 3, 3};
        F = new int[]{c17, c17, c17, c17, c17, c18, c18};
    }

    public e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 0
            r1 = 4
            t9.a.c(r4, r0, r1)
            t9.a.c(r5, r0, r1)
            t9.a.c(r6, r0, r1)
            t9.a.c(r7, r0, r1)
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L21
            if (r7 == r1) goto L21
            r3 = 2
            if (r7 == r3) goto L1e
            r3 = 3
            if (r7 == r3) goto L1c
            goto L21
        L1c:
            r7 = r0
            goto L22
        L1e:
            r7 = 127(0x7f, float:1.78E-43)
            goto L22
        L21:
            r7 = r2
        L22:
            if (r4 <= r1) goto L26
            r4 = r2
            goto L27
        L26:
            r4 = r0
        L27:
            if (r5 <= r1) goto L2b
            r5 = r2
            goto L2c
        L2b:
            r5 = r0
        L2c:
            if (r6 <= r1) goto L2f
            r0 = r2
        L2f:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.e.c(int, int, int, int):int");
    }

    public void a(char c17) {
        android.text.SpannableStringBuilder spannableStringBuilder = this.f298297b;
        if (c17 != '\n') {
            spannableStringBuilder.append(c17);
            return;
        }
        java.util.List list = this.f298296a;
        ((java.util.LinkedList) list).add(b());
        spannableStringBuilder.clear();
        if (this.f298311p != -1) {
            this.f298311p = 0;
        }
        if (this.f298312q != -1) {
            this.f298312q = 0;
        }
        if (this.f298313r != -1) {
            this.f298313r = 0;
        }
        if (this.f298315t != -1) {
            this.f298315t = 0;
        }
        while (true) {
            if ((!this.f298306k || ((java.util.LinkedList) list).size() < this.f298305j) && ((java.util.LinkedList) list).size() < 15) {
                return;
            } else {
                ((java.util.LinkedList) list).remove(0);
            }
        }
    }

    public android.text.SpannableString b() {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(this.f298297b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f298311p != -1) {
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), this.f298311p, length, 33);
            }
            if (this.f298312q != -1) {
                spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), this.f298312q, length, 33);
            }
            if (this.f298313r != -1) {
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(this.f298314s), this.f298313r, length, 33);
            }
            if (this.f298315t != -1) {
                spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(this.f298316u), this.f298315t, length, 33);
            }
        }
        return new android.text.SpannableString(spannableStringBuilder);
    }

    public void d() {
        ((java.util.LinkedList) this.f298296a).clear();
        this.f298297b.clear();
        this.f298311p = -1;
        this.f298312q = -1;
        this.f298313r = -1;
        this.f298315t = -1;
        this.f298317v = 0;
        this.f298298c = false;
        this.f298299d = false;
        this.f298300e = 4;
        this.f298301f = false;
        this.f298302g = 0;
        this.f298303h = 0;
        this.f298304i = 0;
        this.f298305j = 15;
        this.f298306k = true;
        this.f298307l = 0;
        this.f298308m = 0;
        this.f298309n = 0;
        int i17 = f298293x;
        this.f298310o = i17;
        this.f298314s = f298292w;
        this.f298316u = i17;
    }

    public void e(int i17, int i18, int i19, boolean z17, boolean z18, int i27, int i28) {
        int i29 = this.f298311p;
        android.text.SpannableStringBuilder spannableStringBuilder = this.f298297b;
        if (i29 != -1) {
            if (!z17) {
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), this.f298311p, spannableStringBuilder.length(), 33);
                this.f298311p = -1;
            }
        } else if (z17) {
            this.f298311p = spannableStringBuilder.length();
        }
        if (this.f298312q == -1) {
            if (z18) {
                this.f298312q = spannableStringBuilder.length();
            }
        } else {
            if (z18) {
                return;
            }
            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), this.f298312q, spannableStringBuilder.length(), 33);
            this.f298312q = -1;
        }
    }

    public void f(int i17, int i18, int i19) {
        int i27 = this.f298313r;
        android.text.SpannableStringBuilder spannableStringBuilder = this.f298297b;
        if (i27 != -1 && this.f298314s != i17) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(this.f298314s), this.f298313r, spannableStringBuilder.length(), 33);
        }
        if (i17 != f298292w) {
            this.f298313r = spannableStringBuilder.length();
            this.f298314s = i17;
        }
        if (this.f298315t != -1 && this.f298316u != i18) {
            spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(this.f298316u), this.f298315t, spannableStringBuilder.length(), 33);
        }
        if (i18 != f298293x) {
            this.f298315t = spannableStringBuilder.length();
            this.f298316u = i18;
        }
    }
}
