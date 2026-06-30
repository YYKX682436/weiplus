package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f212796a;

    /* renamed from: b, reason: collision with root package name */
    public final int f212797b;

    /* renamed from: c, reason: collision with root package name */
    public final int f212798c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f212799d;

    /* renamed from: e, reason: collision with root package name */
    public long f212800e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f212801f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f212802g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f212803h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f212804i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f212805j = 0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f212806k = false;

    public b1(java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f212796a = str;
        this.f212797b = i17;
        this.f212798c = i18;
        this.f212799d = str2;
    }

    public abstract boolean a(com.tencent.mm.vfs.a1 a1Var);

    public com.tencent.mm.vfs.a1 b() {
        if (this.f212806k) {
            return new com.tencent.mm.vfs.a1(this.f212796a, this.f212797b, this.f212798c, this.f212799d, this.f212800e, this.f212801f, this.f212802g, this.f212803h, this.f212804i, this.f212805j, 0L, 0L);
        }
        return null;
    }

    public boolean c(com.tencent.mm.vfs.a1 a1Var) {
        if (!a(a1Var)) {
            return false;
        }
        int i17 = this.f212801f;
        if (i17 == 0) {
            this.f212805j = a1Var.f212774j;
        } else {
            this.f212805j = (((this.f212805j * i17) + a1Var.f212774j) + a1Var.f212770f) / (r3 + i17);
        }
        this.f212800e += a1Var.f212769e;
        this.f212801f = i17 + a1Var.f212770f;
        this.f212802g += a1Var.f212771g;
        int i18 = this.f212803h;
        int i19 = a1Var.f212772h;
        if (i19 > i18) {
            this.f212803h = i19;
        }
        long j17 = this.f212804i;
        long j18 = a1Var.f212773i;
        if (j18 > j17) {
            this.f212804i = j18;
        }
        this.f212806k = true;
        return true;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.vfs.b1)) {
            return false;
        }
        com.tencent.mm.vfs.b1 b1Var = (com.tencent.mm.vfs.b1) obj;
        return java.util.Objects.equals(this.f212796a, b1Var.f212796a) && java.util.Objects.equals(this.f212799d, b1Var.f212799d) && this.f212797b == b1Var.f212797b && this.f212798c == b1Var.f212798c;
    }

    public int hashCode() {
        return ((this.f212796a.hashCode() ^ this.f212799d.hashCode()) ^ (this.f212797b << 16)) ^ this.f212798c;
    }
}
