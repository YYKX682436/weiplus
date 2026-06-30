package e1;

/* loaded from: classes14.dex */
public final class i0 extends e1.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f246267d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f246268e;

    /* renamed from: f, reason: collision with root package name */
    public final long f246269f;

    /* renamed from: g, reason: collision with root package name */
    public final long f246270g;

    /* renamed from: h, reason: collision with root package name */
    public final int f246271h;

    public i0(java.util.List list, java.util.List list2, long j17, long j18, int i17, kotlin.jvm.internal.i iVar) {
        this.f246267d = list;
        this.f246268e = list2;
        this.f246269f = j17;
        this.f246270g = j18;
        this.f246271h = i17;
    }

    @Override // e1.y0
    public android.graphics.Shader b(long j17) {
        int i17;
        int[] iArr;
        int i18;
        char c17;
        float f17;
        float[] fArr;
        long j18 = this.f246269f;
        float d17 = (d1.e.c(j18) > Float.POSITIVE_INFINITY ? 1 : (d1.e.c(j18) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? d1.k.d(j17) : d1.e.c(j18);
        float b17 = (d1.e.d(j18) > Float.POSITIVE_INFINITY ? 1 : (d1.e.d(j18) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? d1.k.b(j17) : d1.e.d(j18);
        long j19 = this.f246270g;
        float d18 = (d1.e.c(j19) > Float.POSITIVE_INFINITY ? 1 : (d1.e.c(j19) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? d1.k.d(j17) : d1.e.c(j19);
        float b18 = (d1.e.d(j19) > Float.POSITIVE_INFINITY ? 1 : (d1.e.d(j19) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? d1.k.b(j17) : d1.e.d(j19);
        long a17 = d1.f.a(d17, b17);
        long a18 = d1.f.a(d18, b18);
        java.util.List colors = this.f246267d;
        kotlin.jvm.internal.o.g(colors, "colors");
        java.util.List list = this.f246268e;
        if (list == null) {
            if (colors.size() < 2) {
                throw new java.lang.IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (colors.size() != list.size()) {
            throw new java.lang.IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
        float f18 = 0.0f;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            i17 = 0;
        } else {
            int h17 = kz5.c0.h(colors);
            i17 = 0;
            for (int i19 = 1; i19 < h17; i19++) {
                if (e1.y.d(((e1.y) colors.get(i19)).f246322a) == 0.0f) {
                    i17++;
                }
            }
        }
        float c18 = d1.e.c(a17);
        float d19 = d1.e.d(a17);
        float c19 = d1.e.c(a18);
        float d27 = d1.e.d(a18);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            int size = colors.size();
            int[] iArr2 = new int[size];
            for (int i27 = 0; i27 < size; i27++) {
                iArr2[i27] = e1.a0.h(((e1.y) colors.get(i27)).f246322a);
            }
            iArr = iArr2;
        } else {
            int[] iArr3 = new int[colors.size() + i17];
            int h18 = kz5.c0.h(colors);
            int size2 = colors.size();
            int i28 = 0;
            int i29 = 0;
            while (i28 < size2) {
                long j27 = ((e1.y) colors.get(i28)).f246322a;
                if (!(e1.y.d(j27) == f18)) {
                    iArr3[i29] = e1.a0.h(j27);
                    i18 = i29 + 1;
                } else if (i28 == 0) {
                    i18 = i29 + 1;
                    iArr3[i29] = e1.a0.h(e1.y.b(((e1.y) colors.get(1)).f246322a, 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i28 == h18) {
                    i18 = i29 + 1;
                    iArr3[i29] = e1.a0.h(e1.y.b(((e1.y) colors.get(i28 - 1)).f246322a, 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i37 = i29 + 1;
                    iArr3[i29] = e1.a0.h(e1.y.b(((e1.y) colors.get(i28 - 1)).f246322a, 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i29 = i37 + 1;
                    iArr3[i37] = e1.a0.h(e1.y.b(((e1.y) colors.get(i28 + 1)).f246322a, 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i28++;
                    f18 = 0.0f;
                }
                i29 = i18;
                i28++;
                f18 = 0.0f;
            }
            iArr = iArr3;
        }
        if (i17 == 0) {
            fArr = list != null ? kz5.n0.P0(list) : null;
            c17 = 0;
        } else {
            float[] fArr2 = new float[colors.size() + i17];
            if (list != null) {
                c17 = 0;
                f17 = ((java.lang.Number) list.get(0)).floatValue();
            } else {
                c17 = 0;
                f17 = 0.0f;
            }
            fArr2[c17] = f17;
            int h19 = kz5.c0.h(colors);
            int i38 = 1;
            for (int i39 = 1; i39 < h19; i39++) {
                long j28 = ((e1.y) colors.get(i39)).f246322a;
                float floatValue = list != null ? ((java.lang.Number) list.get(i39)).floatValue() : i39 / kz5.c0.h(colors);
                int i47 = i38 + 1;
                fArr2[i38] = floatValue;
                if ((e1.y.d(j28) == 0.0f ? (char) 1 : c17) != 0) {
                    i38 = i47 + 1;
                    fArr2[i47] = floatValue;
                } else {
                    i38 = i47;
                }
            }
            fArr2[i38] = list != null ? ((java.lang.Number) list.get(kz5.c0.h(colors))).floatValue() : 1.0f;
            fArr = fArr2;
        }
        int i48 = this.f246271h;
        return new android.graphics.LinearGradient(c18, d19, c19, d27, iArr, fArr, (i48 == 0 ? (char) 1 : c17) != 0 ? android.graphics.Shader.TileMode.CLAMP : (i48 == 1 ? (char) 1 : c17) != 0 ? android.graphics.Shader.TileMode.REPEAT : (i48 == 2 ? (char) 1 : c17) != 0 ? android.graphics.Shader.TileMode.MIRROR : (i48 != 3 ? c17 : (char) 1) != 0 ? android.os.Build.VERSION.SDK_INT >= 31 ? e1.h1.f246262a.b() : android.graphics.Shader.TileMode.CLAMP : android.graphics.Shader.TileMode.CLAMP);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1.i0)) {
            return false;
        }
        e1.i0 i0Var = (e1.i0) obj;
        if (kotlin.jvm.internal.o.b(this.f246267d, i0Var.f246267d) && kotlin.jvm.internal.o.b(this.f246268e, i0Var.f246268e) && d1.e.a(this.f246269f, i0Var.f246269f) && d1.e.a(this.f246270g, i0Var.f246270g)) {
            return this.f246271h == i0Var.f246271h;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f246267d.hashCode() * 31;
        java.util.List list = this.f246268e;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        int i17 = d1.e.f225626e;
        return ((((hashCode2 + java.lang.Long.hashCode(this.f246269f)) * 31) + java.lang.Long.hashCode(this.f246270g)) * 31) + java.lang.Integer.hashCode(this.f246271h);
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        long j17 = this.f246269f;
        java.lang.String str3 = "";
        if (d1.f.b(j17)) {
            str = "start=" + ((java.lang.Object) d1.e.h(j17)) + ", ";
        } else {
            str = "";
        }
        long j18 = this.f246270g;
        if (d1.f.b(j18)) {
            str3 = "end=" + ((java.lang.Object) d1.e.h(j18)) + ", ";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LinearGradient(colors=");
        sb6.append(this.f246267d);
        sb6.append(", stops=");
        sb6.append(this.f246268e);
        sb6.append(", ");
        sb6.append(str);
        sb6.append(str3);
        sb6.append("tileMode=");
        int i17 = this.f246271h;
        if (i17 == 0) {
            str2 = "Clamp";
        } else {
            if (i17 == 1) {
                str2 = "Repeated";
            } else {
                if (i17 == 2) {
                    str2 = "Mirror";
                } else {
                    str2 = i17 == 3 ? "Decal" : "Unknown";
                }
            }
        }
        sb6.append((java.lang.Object) str2);
        sb6.append(')');
        return sb6.toString();
    }
}
