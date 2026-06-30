package mr3;

/* loaded from: classes10.dex */
public final class l extends xm3.a {

    /* renamed from: n, reason: collision with root package name */
    public static final mr3.k f330874n = new mr3.k(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f330875d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f330876e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f330877f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f330878g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f330879h;

    /* renamed from: i, reason: collision with root package name */
    public int f330880i;

    /* renamed from: m, reason: collision with root package name */
    public final int f330881m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ l(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, int r12, int r13, kotlin.jvm.internal.i r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            java.lang.String r0 = ""
            if (r14 == 0) goto L8
            r14 = r0
            goto L9
        L8:
            r14 = r6
        L9:
            r6 = r13 & 2
            if (r6 == 0) goto Le
            goto Lf
        Le:
            r0 = r7
        Lf:
            r6 = r13 & 4
            r7 = 0
            if (r6 == 0) goto L16
            r1 = r7
            goto L17
        L16:
            r1 = r8
        L17:
            r6 = r13 & 8
            if (r6 == 0) goto L1d
            r2 = r7
            goto L1e
        L1d:
            r2 = r9
        L1e:
            r6 = r13 & 16
            if (r6 == 0) goto L2a
            i21.q r6 = i21.q.h()
            java.lang.String r10 = r6.d(r0, r1)
        L2a:
            r3 = r10
            r6 = r13 & 32
            r7 = 0
            if (r6 == 0) goto L32
            r4 = r7
            goto L33
        L32:
            r4 = r11
        L33:
            r6 = r13 & 64
            if (r6 == 0) goto L39
            r13 = r7
            goto L3a
        L39:
            r13 = r12
        L3a:
            r6 = r5
            r7 = r14
            r8 = r0
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mr3.l.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, kotlin.jvm.internal.i):void");
    }

    public static mr3.l n(mr3.l lVar, java.lang.String fileName, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            fileName = lVar.f330875d;
        }
        if ((i19 & 2) != 0) {
            str = lVar.f330876e;
        }
        java.lang.String username = str;
        if ((i19 & 4) != 0) {
            str2 = lVar.f330877f;
        }
        java.lang.String str5 = str2;
        if ((i19 & 8) != 0) {
            str3 = lVar.f330878g;
        }
        java.lang.String str6 = str3;
        if ((i19 & 16) != 0) {
            str4 = lVar.f330879h;
        }
        java.lang.String str7 = str4;
        if ((i19 & 32) != 0) {
            i17 = lVar.f330880i;
        }
        int i27 = i17;
        if ((i19 & 64) != 0) {
            i18 = lVar.f330881m;
        }
        lVar.getClass();
        kotlin.jvm.internal.o.g(fileName, "fileName");
        kotlin.jvm.internal.o.g(username, "username");
        return new mr3.l(fileName, username, str5, str6, str7, i27, i18);
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        mr3.l other = (mr3.l) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.b(this, other) && o() == other.o();
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        mr3.l other = (mr3.l) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.i(this.f330880i, other.f330880i);
    }

    @Override // xm3.a
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr3.l)) {
            return false;
        }
        mr3.l lVar = (mr3.l) obj;
        return kotlin.jvm.internal.o.b(this.f330875d, lVar.f330875d) && kotlin.jvm.internal.o.b(this.f330876e, lVar.f330876e) && kotlin.jvm.internal.o.b(this.f330877f, lVar.f330877f) && kotlin.jvm.internal.o.b(this.f330878g, lVar.f330878g) && kotlin.jvm.internal.o.b(this.f330879h, lVar.f330879h) && this.f330880i == lVar.f330880i && this.f330881m == lVar.f330881m;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f330880i;
    }

    @Override // xm3.a
    public int hashCode() {
        int hashCode = ((this.f330875d.hashCode() * 31) + this.f330876e.hashCode()) * 31;
        java.lang.String str = this.f330877f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f330878g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f330879h;
        return ((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f330880i)) * 31) + java.lang.Integer.hashCode(this.f330881m);
    }

    public final boolean o() {
        java.lang.String str = this.f330879h;
        if (str == null) {
            return false;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a()) {
            return m17.f213266a.F(m17.f213267b);
        }
        return false;
    }

    public java.lang.String toString() {
        return "DescImageData(fileName=" + this.f330875d + ", username=" + this.f330876e + ", url=" + this.f330877f + ", aesKey=" + this.f330878g + ", fullPath=" + this.f330879h + ", type=" + this.f330880i + ", addSource=" + this.f330881m + ')';
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f330875d;
    }

    public l(java.lang.String fileName, java.lang.String username, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        kotlin.jvm.internal.o.g(username, "username");
        this.f330875d = fileName;
        this.f330876e = username;
        this.f330877f = str;
        this.f330878g = str2;
        this.f330879h = str3;
        this.f330880i = i17;
        this.f330881m = i18;
    }
}
